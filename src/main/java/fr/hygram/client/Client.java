package fr.hygram.client;

import fr.hygram.frame.FrameBuffer;
import fr.hygram.window.ClientDevice;

public interface Client {

    void println(String text);

    void sendNotification(String message);

    ClientDevice getClientDevice();

    void setNextFrame(FrameBuffer frameBuffer);

}
