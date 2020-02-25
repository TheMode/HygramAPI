package fr.hygram.application;

import fr.hygram.client.Client;
import fr.hygram.client.Guest;
import fr.hygram.client.User;
import fr.hygram.frame.RenderingManager;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public abstract class HygramWindowApplication extends HygramApplication {

    private RenderingManager renderingManager;

    abstract public void initialization(Client client, WindowInitializer windowInitializer);

    abstract public void frame(User user, Set<Guest> guests);

    abstract public String getName();

    public RenderingManager getRenderingManager() {
        return renderingManager;
    }

    protected void setRenderingManager(RenderingManager renderingManager) {
        this.renderingManager = renderingManager;
    }
}
