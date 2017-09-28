package com.example.dami.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;
import android.os.Handler;

/**
 * Created by dami on 30.08.2017.
 */

public class MyService extends IntentService {
    private int i;
    private Handler handler = new Handler();

    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while(i<10){
            try {
                handler.post(new Runnable() {
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Running..."+String.valueOf(i), Toast.LENGTH_SHORT).show();
                    }
                });
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
    }
}
