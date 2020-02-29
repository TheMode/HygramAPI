package fr.hygram.demo;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.FrameDataContainer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.listener.GuestJoinListener;
import fr.hygram.screen.ClientDevice;
import fr.hygram.user.Client;
import fr.hygram.window.WindowInitializer;

public class WindowApplicationDemo extends HygramWindowApplication {

    private RenderingManager renderingManager = getRenderingManager();

    // use dataContainer for storing textures/shaders/etc...
    private FrameDataContainer frameDataContainer = renderingManager.createFrameDataContainer();
    private FrameBuffer frameBuffer = frameDataContainer.createFrameBuffer(0, 0, 1, 1);

    {
        frameDataContainer.loadTexture("player_texture", "player.png");
        frameDataContainer.generateQuadSprite("player_sprite", "player_texture", 0.1f, 0.1f);
    }

    @Override
    public void onApplicationLaunch(Object... args) {
        getGuestManager().createJoinCode(this, "join_demo");

        getListenerManager().setEventListener(GuestJoinListener.class, (guest, window, code) -> {
            System.out.println("A new guest joined using the code: " + code);
        });
    }

    @Override
    public void initialization(Client client, ClientDevice clientDevice, WindowInitializer windowInitializer) {
        int width = clientDevice.getScreenWidth();
        int height = clientDevice.getScreenHeight();

        windowInitializer.setSize(width, height);
        windowInitializer.setResizable(true);
    }

    @Override
    public FrameBuffer frame(Client client, ClientDevice clientDevice) {
        // Clear all registered call from the previous rendering phase
        frameBuffer.clearCalls();

        frameBuffer.drawQuadSprite("player_sprite", 0.5f, 0, 0.5f);

        return frameBuffer;
    }
}
