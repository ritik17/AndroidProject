package com.example.ritik.boundservice1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyService extends Service {
   private final IBinder binder1=new MyLocalBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
return binder1;
    }
    public String getCurrentTime(){
        SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss", Locale.UK);
        return (df.format(new Date()));
    }

    public class MyLocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
}
