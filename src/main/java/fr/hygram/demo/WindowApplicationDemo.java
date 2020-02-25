package fr.hygram.demo;

import fr.hygram.Server;
import fr.hygram.application.HygramWindowApplication;
import fr.hygram.client.Client;
import fr.hygram.client.Guest;
import fr.hygram.client.User;
import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.FrameDataContainer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.screen.ClientDevice;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public class WindowApplicationDemo extends HygramWindowApplication {

    private Server server = getServer();
    private RenderingManager renderingManager = getRenderingManager();

    // use dataContainer for storing textures/shaders/etc...
    private FrameDataContainer frameDataContainer = renderingManager.createFrameDataContainer();

    {
        frameDataContainer.loadTexture("player", "player.png");
    }

    @Override
    public void onLaunch(Object... args) {

    }

    @Override
    public void initialization(Client client, WindowInitializer windowInitializer) {
        ClientDevice clientDevice = client.getClientDevice();
        int width = clientDevice.getScreenWidth();
        int height = clientDevice.getScreenHeight();

        windowInitializer.setSize(width, height);
        windowInitializer.setResizable(true);
    }

    @Override
    public void frame(User user, Set<Guest> guests) {
        FrameBuffer frameBuffer = renderingManager.createFrameBuffer(frameDataContainer);

        // TODO graphics api

        // Client and guests will all have the same screen content
        // setNextFrame can be ignored or set to null to do not refresh target window
        user.setNextFrame(frameBuffer);
        guests.forEach(guest -> guest.setNextFrame(frameBuffer));
    }

    @Override
    public String getName() {
        return "My application";
    }
}
