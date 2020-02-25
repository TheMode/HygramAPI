package fr.hygram.window;

public interface WindowInitializer {

    void setPosition(int x, int y);

    void setSize(int width, int height);

    void setResizable(boolean resizable);

    void setFullScreen(boolean fullScreen);

}
