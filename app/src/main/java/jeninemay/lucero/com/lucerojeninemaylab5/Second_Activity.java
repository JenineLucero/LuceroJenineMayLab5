package jeninemay.lucero.com.lucerojeninemaylab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId()== R.id.act2btn) {
            i = new Intent(this,MainActivity.class);
            startActivity(i);

        }else if(v.getId()== R.id.map2btn){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.632532, 120.9824703"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }


}
