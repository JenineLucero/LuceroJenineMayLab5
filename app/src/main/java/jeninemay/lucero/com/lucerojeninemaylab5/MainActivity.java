package jeninemay.lucero.com.lucerojeninemaylab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }
    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId()== R.id.act1btn) {
            i = new Intent(this,Second_Activity.class);
            startActivity(i);

        }else if(v.getId()== R.id.map1btn){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5869371, 120.9790588"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }
}
