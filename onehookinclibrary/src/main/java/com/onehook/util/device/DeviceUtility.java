package com.onehook.util.device;

import android.os.Build;

import java.util.UUID;

/**
 * Created by EagleDiao on 2016-06-15.
 */

public class DeviceUtility {

    private static DeviceUtility sInstance;

    public static DeviceUtility getInstance() {
        if (sInstance == null) {
            sInstance = new DeviceUtility();
        }
        return sInstance;
    }

    private DeviceUtility() {

    }

    public String generateDeviceID() {
        return UUID.randomUUID().toString();
    }

    public String getDeviceName() {
        return Build.MODEL;
    }

    public String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getDevicePlatformVersion() {
        return String.format("%s (%d)", Build.VERSION.CODENAME, Build.VERSION.SDK_INT);
    }
}
