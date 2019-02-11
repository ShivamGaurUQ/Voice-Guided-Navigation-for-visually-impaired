package com.example.shivam_gaur.voice_guided_navigation;

/**
 * Created by Shivam_Gaur on 12-03-2017.
 */
public interface AccelerometerListener {
    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);
}
