package fr.hygram;

import fr.hygram.application.HygramApplication;
import fr.hygram.user.Client;

import java.util.Set;

public interface Server {

    Set<Client> getLocalClients();

    HygramApplication launchApplication(String applicationName, Object... args);

}
