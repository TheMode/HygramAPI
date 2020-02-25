package fr.hygram;

import fr.hygram.client.Client;
import fr.hygram.client.Guest;
import fr.hygram.client.User;
import fr.hygram.window.WindowInitializer;

import java.util.Set;

public abstract class HygramWindowApplication {

    private Server server;

    abstract public void initialization(Client client, WindowInitializer windowInitializer);

    abstract public void frame(User user, Set<Guest> guests);

    abstract public String getName();

    public Server getServer() {
        return server;
    }

    protected void setServer(Server server) {
        this.server = server;
    }
}
