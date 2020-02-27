package fr.hygram.user;

import fr.hygram.frame.FrameBuffer;
import fr.hygram.screen.UserDevice;
import fr.hygram.window.Window;

import java.util.Set;

public interface User {

    boolean isLocal();

    void println(String text);

    Set<Window> getOpenWindows();

    UserDevice getUserDevice();

    void setNextFrame(FrameBuffer frameBuffer);

}
