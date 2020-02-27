package fr.hygram.demo;

import fr.hygram.Server;
import fr.hygram.application.HygramWindowApplication;
import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.FrameDataContainer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.listener.GuestJoinListener;
import fr.hygram.screen.UserDevice;
import fr.hygram.user.User;
import fr.hygram.user.guest.Guest;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public class WindowApplicationDemo extends HygramWindowApplication {

    private Server server = getServer();
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
        getGuestManager().createJoinCode("join_demo");

        getListenerManager().setEventListener(GuestJoinListener.class, (guest, code) -> {
            System.out.println("A new guest joined using the code: " + code);
        });
    }

    @Override
    public void initialization(User user, WindowInitializer windowInitializer) {
        UserDevice userDevice = user.getUserDevice();
        int width = userDevice.getScreenWidth();
        int height = userDevice.getScreenHeight();

        windowInitializer.setSize(width, height);
        windowInitializer.setResizable(true);
    }

    @Override
    public void frame(User user, Set<Guest> guests) {

        frameBuffer.drawQuadSprite("player_sprite", 0.5f, 0, 0.5f);

        // Users will all have the same screen content
        // setNextFrame can be ignored or set to null to do not refresh target window
        user.setNextFrame(frameBuffer);
        guests.forEach(guest -> guest.setNextFrame(frameBuffer));

        // Clear all registered call for next rendering phase
        frameBuffer.clearCalls();
    }
}
