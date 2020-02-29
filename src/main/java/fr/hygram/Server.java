package fr.hygram;

import fr.hygram.application.HygramApplication;
import fr.hygram.user.User;

import java.util.Set;

public interface Server {

    Set<User> getUsers();

    HygramApplication launchApplication(String applicationName, Object... args);

}
