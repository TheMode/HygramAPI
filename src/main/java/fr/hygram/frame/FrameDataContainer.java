package fr.hygram.frame;

import fr.hygram.utils.Bitmap;

public interface FrameDataContainer {

    void loadTexture(String textureIdentifier, String texturePath);

    void loadBitmap(String bitmapIdentifier, Bitmap bitmap);

}
