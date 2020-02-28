package fr.hygram.application;

import fr.hygram.Hygram;
import fr.hygram.Server;
import fr.hygram.listener.ListenerManager;
import fr.hygram.window.WindowManager;

public abstract class HygramApplication {

    private ListenerManager listenerManager = new ListenerManager();

    public abstract void onApplicationLaunch(Object... args);

    public Server getServer() {
        return Hygram.getServer();
    }

    public WindowManager getWindowManager() {
        return Hygram.getWindowManager();
    }

    public ListenerManager getListenerManager() {
        return listenerManager;
    }
}
