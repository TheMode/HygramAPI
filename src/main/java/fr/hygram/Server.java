package fr.hygram;

import fr.hygram.application.HygramApplication;
import fr.hygram.client.Guest;
import fr.hygram.client.User;

import java.util.Set;

public abstract class Server {

    public abstract User getUser();

    public abstract Set<Guest> getGuests();

    public abstract HygramApplication launchApplication(String applicationName, Object... args);

}
