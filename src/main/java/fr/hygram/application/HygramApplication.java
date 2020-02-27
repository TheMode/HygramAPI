package fr.hygram.application;

import fr.hygram.Server;
import fr.hygram.listener.ListenerManager;
import fr.hygram.window.WindowManager;

public abstract class HygramApplication {

    private Server server;
    private WindowManager windowManager;
    private ListenerManager listenerManager = new ListenerManager();

    public abstract void onApplicationLaunch(Object... args);

    public Server getServer() {
        return server;
    }

    protected void setServer(Server server) {
        this.server = server;
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }

    protected void setWindowManager(WindowManager windowManager) {
        this.windowManager = windowManager;
    }

    public ListenerManager getListenerManager() {
        return listenerManager;
    }
}
