package fr.hygram.application;

import fr.hygram.window.Window;

public abstract class HygramWindowManagerApplication extends HygramApplication {

    public abstract void init();

    public abstract void onWindowOpen(Window window);

    public abstract void onWindowClose(Window window);

}
