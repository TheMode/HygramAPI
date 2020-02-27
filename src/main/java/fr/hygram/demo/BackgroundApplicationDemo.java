package fr.hygram.demo;

import fr.hygram.application.HygramBackgroundApplication;
import fr.hygram.listener.ListenerManager;
import fr.hygram.listener.MousePositionListener;

public class BackgroundApplicationDemo extends HygramBackgroundApplication {

    @Override
    public void onApplicationLaunch(Object... args) {
        ListenerManager listenerManager = getListenerManager();

        listenerManager.setEventListener(MousePositionListener.class, (user, newX, newY) -> {
            System.out.println("Mouse moved to " + newX + " : " + newY);
        });
    }
}
