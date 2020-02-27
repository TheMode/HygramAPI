package fr.hygram.listener;

import java.util.HashMap;
import java.util.Map;

public class ListenerManager {

    private Map<Class<Listener>, Listener> listenerMap = new HashMap<>();

    public <T extends Listener> void setEventListener(Class<T> listenerClass, T listener) {
        this.listenerMap.put((Class<Listener>) listenerClass, listener);
    }

    public Listener getEventListener(Class<Listener> listenerClass) {
        return listenerMap.getOrDefault(listenerClass, null);
    }


}
