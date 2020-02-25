package fr.hygram.window;

public interface WindowModifier {

    void setPosition(int x, int y);

    void setDepth(int depth);

    void setSize(int width, int height);

    void setResizable(boolean resizable);

    void setFullScreen(boolean fullScreen);

    void setVisible(boolean visible);

    void setFocus(boolean focus);

    void pushOnTop();

}
