package fr.hygram.frame;

public interface FrameBuffer {

    void drawQuadSprite(String identifier, float x, float y, float z, float angle, float scaleX, float scaleY);

    default void drawQuadSprite(String identifier, float x, float y, float z, float angle) {
        drawQuadSprite(identifier, x, y, z, angle, 1, 1);
    }

    default void drawQuadSprite(String identifier, float x, float y, float z) {
        drawQuadSprite(identifier, x, y, z, 0, 1, 1);
    }

    void drawInstancedQuadSprite(String identifier, float[] transformation);

    void clearCalls();

    FrameBuffer clone();

}
