package com.example.shivam_gaur.voice_guided_navigation;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity implements AccelerometerListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onAccelerationChanged(float x, float y, float z) {
// TODO Auto-generated method stub

    }

    public void onShake(float force) {
// Do your stuff here

// Called when Motion Detected
        //   startService(new Intent(getApplicationContext(), MyService.class));
        Toast.makeText(getBaseContext(), "Motion detected ",
                Toast.LENGTH_SHORT).show();


        NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notify = new Notification.Builder
                (getApplicationContext()).setContentTitle("New Notification").setContentText("Now open app by Double Tap on the Home Screen").
                setContentTitle("Open app").setSmallIcon(R.mipmap.ic_launcher).build();

        notify.flags |= Notification.FLAG_AUTO_CANCEL;
        //notify.defaults |= Notification.DEFAULT_SOUND;
        notify.sound = Uri.parse("android.resource://"
                + this.getPackageName() + "/" + R.raw.begin);
        notify.defaults |= Notification.DEFAULT_VIBRATE;
        notif.notify(0, notify);





        Intent i=new Intent(getApplicationContext(),GestureDetect.class);
        startActivity(i);


    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "onResume Accelerometer Started",
                Toast.LENGTH_SHORT).show();
//Check device supported Accelerometer senssor or not
        if (AccelerometerManager.isSupported(this)) {

//Start Accelerometer Listening
            AccelerometerManager.startListening(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        //Check device supported Accelerometer senssor or not
        if (AccelerometerManager.isListening()) {

            //Start Accelerometer Listening
            AccelerometerManager.stopListening();




            Toast.makeText(getBaseContext(), "onStop Accelerometer Stoped",

                    Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i("Sensor", "Service  distroy");

        //Check device supported Accelerometer senssor or not
        if (AccelerometerManager.isListening()) {

            //Start Accelerometer Listening
            AccelerometerManager.stopListening();


            Toast.makeText(getBaseContext(), "onDestroy Accelerometer Stoped",

                    Toast.LENGTH_SHORT).show();
        }




    }













}
