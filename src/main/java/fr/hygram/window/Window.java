package fr.hygram.window;

import fr.hygram.application.HygramWindowApplication;

public interface Window extends WindowModifier {

    HygramWindowApplication getWindowApplication();

    int getX();

    int getY();

    int getDepth();

    int getWidth();

    int getHeight();

    boolean isResizable();

    boolean isFullScreen();

    boolean isVisible();

    boolean isFocused();

}
