package fr.hygram.application;

import fr.hygram.Server;
import fr.hygram.window.WindowManager;

public abstract class HygramApplication {

    private Server server;
    private WindowManager windowManager;

    public abstract void onLaunch(Object... args);

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
}
