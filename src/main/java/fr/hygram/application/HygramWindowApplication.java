package fr.hygram.application;

import fr.hygram.Hygram;
import fr.hygram.frame.RenderingManager;
import fr.hygram.user.Client;
import fr.hygram.user.User;
import fr.hygram.user.guest.Guest;
import fr.hygram.user.guest.GuestManager;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public abstract class HygramWindowApplication extends HygramApplication {

    abstract public void initialization(Client client, WindowInitializer windowInitializer);

    abstract public void frame(User user, Set<Guest> guests);

    public RenderingManager getRenderingManager() {
        return Hygram.getRenderingManager();
    }

    public GuestManager getGuestManager() {
        return Hygram.getGuestManager();
    }
}
