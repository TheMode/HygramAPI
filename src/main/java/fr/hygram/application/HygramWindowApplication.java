package fr.hygram.application;

import fr.hygram.Hygram;
import fr.hygram.frame.RenderingManager;
import fr.hygram.screen.ClientDevice;
import fr.hygram.user.RenderingClient;
import fr.hygram.user.guest.GuestManager;
import fr.hygram.window.WindowInitializer;

public abstract class HygramWindowApplication extends HygramApplication {

    public abstract void initialization(RenderingClient client, ClientDevice clientDevice, WindowInitializer windowInitializer);

    public abstract boolean isDeviceSupported(ClientDevice clientDevice);

    public RenderingManager getRenderingManager() {
        return Hygram.getRenderingManager();
    }

    public GuestManager getGuestManager() {
        return Hygram.getGuestManager();
    }
}
