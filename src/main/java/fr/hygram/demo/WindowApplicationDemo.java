package fr.hygram.demo;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.frame.FrameContainer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.listener.GuestJoinListener;
import fr.hygram.listener.ListenerManager;
import fr.hygram.listener.MousePositionListener;
import fr.hygram.screen.ClientDevice;
import fr.hygram.screen.DeviceType;
import fr.hygram.timer.TaskRunnable;
import fr.hygram.user.Client;
import fr.hygram.user.RenderingClient;
import fr.hygram.window.WindowInitializer;

public class WindowApplicationDemo extends HygramWindowApplication {

    private RenderingManager renderingManager = getRenderingManager();
    private FrameContainer generalDataContainer = renderingManager.createFrameDataContainer();

    {
        generalDataContainer.loadTexture("player_texture", "player.png");
    }

    @Override
    public void onApplicationLaunch(Object... args) {
        getGuestManager().createJoinCode(this, "join_demo");

        ListenerManager listenerManager = getListenerManager();

        listenerManager.setEventListener(GuestJoinListener.class, (guest, window, code) -> {
            System.out.println("A new guest joined using the code: " + code);
        });

        listenerManager.setEventListener(MousePositionListener.class, (client, newX, newY) -> {
            String identifier = getPlayerIdentifier(client);
            generalDataContainer.refreshQuadSpriteTransformation(identifier, newX, newY, 0);
        });

        getTimerManager().addRepeatingTask(new TaskRunnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        }, 50);
    }

    @Override
    public void initialization(RenderingClient client, ClientDevice clientDevice, WindowInitializer windowInitializer) {
        int width = clientDevice.getScreenWidth();
        int height = clientDevice.getScreenHeight();

        windowInitializer.setSize(width, height);
        windowInitializer.setResizable(true);

        FrameContainer frameContainer = renderingManager.createFrameDataContainer();
        frameContainer.addExternalContainer(generalDataContainer);

        // RenderingClient#attachFrameDataContainer does send all needed files to the client
        // They are dynamically updated
        client.attachFrameDataContainer(frameContainer);

        String identifier = getPlayerIdentifier(client);

        generalDataContainer.loadQuadSprite(identifier, "player_texture", 0.1f);

        generalDataContainer.showQuadSprite(identifier);
    }

    @Override
    public boolean isDeviceSupported(ClientDevice clientDevice) {
        return clientDevice.getDeviceType().equals(DeviceType.DESKTOP);
    }

    private String getPlayerIdentifier(Client client) {
        return "player_" + client.getUniqueId();
    }
}
