package fr.hygram.screen;

public interface ClientDevice {

    int getScreenWidth();

    int getScreenHeight();

    int getPhysicalScreenWidth();

    int getPhysicalScreenHeight();

    DeviceType getDeviceType();

    DeviceOrientation getDeviceOrientation();

}
