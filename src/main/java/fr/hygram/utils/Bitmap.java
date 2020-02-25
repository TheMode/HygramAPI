package fr.hygram.utils;

public class Bitmap {

    private int width, height;

    private int[] textureData;

    public Bitmap(int width, int height) {
        this.width = width;
        this.height = height;
        this.textureData = new int[width * height * 4];
    }

    public Bitmap(int width, int height, int[] textureData) {
        this.width = width;
        this.height = height;
        this.textureData = textureData;
    }

    public void setPixel(int x, int y, int r, int g, int b, int a) {
        int location = (x + (y * width)) * 4;

        int rgba = (r << 24) + (g << 16) + (b << 8) + (a);

        textureData[location] = rgba;
    }

    public void setPixel(int x, int y, Color color) {
        setPixel(x, y, color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
