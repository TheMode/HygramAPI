package fr.hygram.frame;

import fr.hygram.utils.Bitmap;

public interface FrameDataContainer {

    void loadTexture(String identifier, String texturePath);

    void loadBitmap(String identifier, Bitmap bitmap);

    FrameBuffer createFrameBuffer(float x, float y, float width, float height);

    void generateQuadSprite(String identifier, String textureIdentifier, float width, float height);

}
