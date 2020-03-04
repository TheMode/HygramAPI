package fr.hygram.application;

import fr.hygram.Hygram;
import fr.hygram.Server;
import fr.hygram.listener.ListenerManager;
import fr.hygram.timer.TimerManager;
import fr.hygram.window.WindowManager;

public abstract class HygramApplication {

    private ListenerManager listenerManager = new ListenerManager();
    private TimerManager timerManager = new TimerManager();

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

    public TimerManager getTimerManager() {
        return timerManager;
    }
}
