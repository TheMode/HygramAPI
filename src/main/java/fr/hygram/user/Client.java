package fr.hygram.user;

import fr.hygram.window.Window;

import java.util.Set;
import java.util.UUID;

public interface Client {

    boolean isGuest();

    void println(String text);

    Set<Window> getOpenWindows();

    UUID getUniqueId();

}
