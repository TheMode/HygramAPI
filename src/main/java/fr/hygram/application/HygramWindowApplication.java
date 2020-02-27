package fr.hygram.application;

import fr.hygram.frame.RenderingManager;
import fr.hygram.user.User;
import fr.hygram.user.guest.Guest;
import fr.hygram.user.guest.GuestManager;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public abstract class HygramWindowApplication extends HygramApplication {

    private RenderingManager renderingManager;
    private GuestManager guestManager;

    abstract public void initialization(User user, WindowInitializer windowInitializer);

    abstract public void frame(User user, Set<Guest> guests);

    public RenderingManager getRenderingManager() {
        return renderingManager;
    }

    public GuestManager getGuestManager() {
        return guestManager;
    }

    protected void setRenderingManager(RenderingManager renderingManager) {
        this.renderingManager = renderingManager;
    }

    protected void setGuestManager(GuestManager guestManager) {
        this.guestManager = guestManager;
    }
}
