package fr.hygram.user;

import fr.hygram.window.Window;

import java.util.Set;

public interface Client {

    boolean isLocal();

    void println(String text);

    Set<Window> getOpenWindows();

}
