package fr.hygram.user;

import fr.hygram.frame.FrameBuffer;
import fr.hygram.frame.FrameDataContainer;
import fr.hygram.window.Window;

import java.util.Set;

public interface Client {

    boolean isLocal();

    void println(String text);

    Set<Window> getOpenWindows();

    FrameDataContainer getAttachedFrameDataContainer();

    void attachFrameDataContainer(FrameDataContainer frameDataContainer);

    FrameBuffer getLastFrameBuffer();

}
