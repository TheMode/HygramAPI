package fr.hygram.frame;

import fr.hygram.utils.Bitmap;

import java.util.Set;

public interface FrameContainer {

    void addExternalContainer(FrameContainer frameContainer);

    void loadTexture(String identifier, String texturePath);

    void loadBitmap(String identifier, Bitmap bitmap);

    Set<String> getSpriteIdentifiers();

    void createQuadSprite(String identifier, String textureIdentifier, float size);

    void deleteQuadSprite(String identifier);

    // Draw calls
    void showQuadSprite(String identifier);

    void refreshQuadSpriteTransformation(String identifier, float x, float y, float z, float angle, float scaleX, float scaleY);

    default void refreshQuadSpriteTransformation(String identifier, float x, float y, float z, float angle) {
        refreshQuadSpriteTransformation(identifier, x, y, z, angle, 1, 1);
    }

    default void refreshQuadSpriteTransformation(String identifier, float x, float y, float z) {
        refreshQuadSpriteTransformation(identifier, x, y, z, 0);
    }

    void drawInstancedQuadSprite(String identifier, int count, float[] transformations);

    void hideQuadSprite(String identifier);

}
