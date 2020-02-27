package fr.hygram.screen;

public interface UserDevice {

    int getScreenWidth();

    int getScreenHeight();

    int getPhysicalScreenWidth();

    int getPhysicalScreenHeight();

    DeviceType getDeviceType();

    DeviceOrientation getDeviceOrientation();

}
