package fr.hygram;

import fr.hygram.application.HygramApplication;
import fr.hygram.user.User;

import java.util.Set;

public abstract class Server {

    public abstract Set<User> getUsers();

    public abstract HygramApplication launchApplication(String applicationName, Object... args);

}
