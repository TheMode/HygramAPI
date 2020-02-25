package fr.hygram;

import fr.hygram.client.Guest;
import fr.hygram.client.User;
import fr.hygram.frame.RenderingManager;

import java.util.Set;
import java.util.function.Consumer;

public abstract class Server {

    private RenderingManager renderingManager;

    protected Server(RenderingManager renderingManager) {
        this.renderingManager = renderingManager;
    }

    public abstract void serverRequest(Consumer<Object> callback, String requestId, Object... args);

    public abstract User getUser();

    public abstract Set<Guest> getGuests();

    public RenderingManager getRenderingManager() {
        return renderingManager;
    }
}
