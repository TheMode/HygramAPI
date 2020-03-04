package fr.hygram.frame;

import fr.hygram.utils.Bitmap;

import java.util.Set;

public interface FrameContainer {

    void addExternalContainer(FrameContainer frameContainer);

    void loadTexture(String identifier, String texturePath);

    void loadBitmap(String identifier, Bitmap bitmap);

    void generateQuadSprite(String identifier, String textureIdentifier, float width, float height);

    Set<String> getSpriteIdentifiers();

    // Draw calls
    void showQuadSprite(String identifier, float x, float y, float z, float angle, float scaleX, float scaleY);

    default void showQuadSprite(String identifier, float x, float y, float z, float angle) {
        showQuadSprite(identifier, x, y, z, angle, 1, 1);
    }

    default void showQuadSprite(String identifier, float x, float y, float z) {
        showQuadSprite(identifier, x, y, z, 0);
    }

    void drawInstancedQuadSprite(String identifier, float[] transformation);

    void clearCalls();

}
