package fr.hygram.client;

import fr.hygram.frame.FrameBuffer;
import fr.hygram.screen.ClientDevice;
import fr.hygram.window.Window;

import java.util.Set;

public interface Client {

    void println(String text);

    Set<Window> getOpenWindows();

    void sendNotification(String message);

    ClientDevice getClientDevice();

    void setNextFrame(FrameBuffer frameBuffer);

}
