package fr.hygram;

import fr.hygram.frame.RenderingManager;
import fr.hygram.user.guest.GuestManager;
import fr.hygram.window.WindowManager;

public class Hygram {

    private static Server server;
    private static WindowManager windowManager;
    private static RenderingManager renderingManager;
    private static GuestManager guestManager;

    public static Server getServer() {
        return server;
    }

    protected static void setServer(Server server) {
        Hygram.server = server;
    }

    public static WindowManager getWindowManager() {
        return windowManager;
    }

    protected static void setWindowManager(WindowManager windowManager) {
        Hygram.windowManager = windowManager;
    }

    public static RenderingManager getRenderingManager() {
        return renderingManager;
    }

    protected static void setRenderingManager(RenderingManager renderingManager) {
        Hygram.renderingManager = renderingManager;
    }

    public static GuestManager getGuestManager() {
        return guestManager;
    }

    protected static void setGuestManager(GuestManager guestManager) {
        Hygram.guestManager = guestManager;
    }
}
