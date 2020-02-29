package fr.hygram.screen;

public class ClientDevice {

    private int screenWidth, screenHeight;
    private int physicalScreenWidth, physicalScreenHeight;

    private DeviceType deviceType;
    private DeviceOrientation deviceOrientation;

    public ClientDevice(int screenWidth, int screenHeight,
                        int physicalScreenWidth, int physicalScreenHeight,
                        DeviceType deviceType, DeviceOrientation deviceOrientation) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.physicalScreenWidth = physicalScreenWidth;
        this.physicalScreenHeight = physicalScreenHeight;
        this.deviceType = deviceType;
        this.deviceOrientation = deviceOrientation;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public int getPhysicalScreenWidth() {
        return physicalScreenWidth;
    }

    public int getPhysicalScreenHeight() {
        return physicalScreenHeight;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public DeviceOrientation getDeviceOrientation() {
        return deviceOrientation;
    }
}
