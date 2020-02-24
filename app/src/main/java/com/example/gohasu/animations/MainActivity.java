package com.example.gohasu.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //boolean bartIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Imageview tapped");

        ImageView imageViewBart = (ImageView) findViewById(R.id.imageViewbart);

        ImageView imageViewHomer = (ImageView) findViewById(R.id.imageViewhomer);

//        if (bartIsShowing) {
//
//            bartIsShowing = false;
//            imageViewBart.animate().alpha(0).setDuration(2000);  // 2000 miliseconds
//            imageViewHomer.animate().alpha(1).setDuration(2000);
//        } else {
//            bartIsShowing = true;
//            imageViewHomer.animate().alpha(0).setDuration(2000);
//            imageViewBart.animate().alpha(1).setDuration(2000);
//        }

//        imageViewBart.animate().translationYBy(1000).setDuration(2000);
            imageViewBart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
        //imageViewBart.animate().translationXBy(1000).rotation(1800).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewBart = (ImageView) findViewById(R.id.imageViewbart);

        imageViewBart.setX(-1000);
        imageViewBart.animate().translationXBy(1000).rotation(1800).setDuration(2000);


    }
}
