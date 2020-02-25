package fr.hygram.demo;

import fr.hygram.application.HygramWindowManagerApplication;
import fr.hygram.window.Window;
import fr.hygram.window.WindowManager;

public class WindowManagerApplicationDemo extends HygramWindowManagerApplication {

    private WindowManager windowManager = getWindowManager();

    @Override
    public void onLaunch(Object... args) {

    }

    @Override
    public void init() {
        // We can here launch the desktop environment
        // getServer().launchApplication("desktop_env");
        removeFocus();
    }

    @Override
    public void onWindowOpen(Window window) {
        removeFocus();
        window.setFocus(true);
        window.setDepth(1);
    }

    @Override
    public void onWindowClose(Window window) {

    }

    private void removeFocus() {
        for (Window window : windowManager.getLoadedWindows()) {
            window.setFocus(false);
            window.setDepth(0);
        }
    }
}
