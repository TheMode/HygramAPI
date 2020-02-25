package fr.hygram.demo;

import fr.hygram.HygramWindowApplication;
import fr.hygram.Server;
import fr.hygram.client.Client;
import fr.hygram.client.Guest;
import fr.hygram.client.User;
import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.FrameDataContainer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.window.ClientDevice;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public class WindowApplicationDemo extends HygramWindowApplication {

    private Server server = getServer();
    private RenderingManager renderingManager = server.getRenderingManager();

    @Override
    public void initialization(Client client, WindowInitializer windowInitializer) {
        ClientDevice clientDevice = client.getClientDevice();
        int width = clientDevice.getScreenWidth();
        int height = clientDevice.getScreenHeight();

        windowInitializer.setSize(width, height);
        windowInitializer.setResizable(true);

        server.serverRequest(o -> {
            String result = (String) o;
            System.out.println("Should be Hello World! : " + result);
        }, "test_helloworld");
    }

    @Override
    public void frame(User user, Set<Guest> guests) {
        // use dataContainer for storing textures/shaders/etc...
        FrameDataContainer frameDataContainer = renderingManager.createFrameDataContainer();
        FrameBuffer frameBuffer = renderingManager.createFrameBuffer(frameDataContainer);
        // TODO graphics api

        // Client and guests will all have the same screen content
        user.setNextFrame(frameBuffer);
        guests.forEach(guest -> guest.setNextFrame(frameBuffer));
    }

    @Override
    public String getName() {
        return "My application";
    }
}
