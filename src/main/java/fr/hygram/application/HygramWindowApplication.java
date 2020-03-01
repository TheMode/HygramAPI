package fr.hygram.application;

import fr.hygram.Hygram;
import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.RenderingManager;
import fr.hygram.screen.ClientDevice;
import fr.hygram.user.Client;
import fr.hygram.user.guest.GuestManager;
import fr.hygram.window.WindowInitializer;

public abstract class HygramWindowApplication extends HygramApplication {

    abstract public void initialization(Client client, ClientDevice clientDevice, WindowInitializer windowInitializer);

    abstract public FrameBuffer frame(Client client, ClientDevice clientDevice, FrameBuffer frameBuffer);

    public RenderingManager getRenderingManager() {
        return Hygram.getRenderingManager();
    }

    public GuestManager getGuestManager() {
        return Hygram.getGuestManager();
    }
}
