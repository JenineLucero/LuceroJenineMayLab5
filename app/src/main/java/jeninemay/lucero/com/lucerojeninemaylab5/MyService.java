package jeninemay.lucero.com.lucerojeninemaylab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends IntentService {

    public MyService(){
        super("myService");
    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITG", "SERVICE IS RUNNING....");
    }
}
