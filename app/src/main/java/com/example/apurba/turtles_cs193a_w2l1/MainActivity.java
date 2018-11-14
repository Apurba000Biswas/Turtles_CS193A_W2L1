package com.example.apurba.turtles_cs193a_w2l1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class MainActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateImg(View view) {
        int id = view.getId();
        ImageView img = findViewById(R.id.turtule_img);
        if (id == R.id.leo_button){
            img.setImageResource(R.drawable.tmntleo);
        }else if(id == R.id.mike_button){
            img.setImageResource(R.drawable.tmntmike);
        }else if(id == R.id.don_button){
            img.setImageResource(R.drawable.tmntdon);
        }else if(id == R.id.raph_button){
            img.setImageResource(R.drawable.tmntraph);
        }
    }
}
