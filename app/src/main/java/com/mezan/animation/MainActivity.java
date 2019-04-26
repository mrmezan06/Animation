package com.mezan.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean tap=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img2=(ImageView)findViewById(R.id.animator2);
        img2.animate().alpha(0f).setDuration(100);
        ImageView img=(ImageView)findViewById(R.id.animator);
        img.animate().translationXBy(-1000f).translationYBy(-1000f);
    }

    public void fade(View view) {
        ImageView img=(ImageView)findViewById(R.id.animator);
        ImageView img2=(ImageView)findViewById(R.id.animator2);

        //multiple animation

        if(tap){
            img.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(3600).setDuration(2000);
            tap=false;
        }else {
            img.animate().translationXBy(-1000f).translationYBy(-1000f).rotationBy(-3600).setDuration(2000);
            tap=true;
        }
        //ScaleXY
       /* if(tap){
            img.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
            tap=false;
        }else {
            img.animate().scaleX(1f).scaleY(1f).setDuration(2000);
            tap=true;
        }
*/
        //Rotation
       /* if(tap){
            img.animate().rotation(360f).setDuration(2000);
            tap=false;

        }else{
            img.animate().rotation(-360f).setDuration(2000);
            tap=true;
        }*/
        // transition from Y axis
        /*if(tap){
            img.animate().translationYBy(2000).setDuration(2000);
            tap=false;
        }else {
            img.animate().translationYBy(-2000).setDuration(2000);
            tap=true;
        }*/
        //Transition from X axis
        //img.animate().translationYBy(200).setDuration(2000);
        /*if(tap){
            img.animate().translationXBy(600).setDuration(2000);
            //img.animate().translationYBy(2000).setDuration(2000);
            tap=false;
        }else {
            img.animate().translationXBy(-600).setDuration(2000);
            //img.animate().translationYBy(-2000).setDuration(2000);
            tap=true;
        }*/
        //Fading Transition
        /*if(tap){
            img.animate().alpha(0f).setDuration(2000);
            img2.animate().alpha(1f).setDuration(2000);
            tap=false;
        }else {
            img2.animate().alpha(0f).setDuration(2000);
            img.animate().alpha(1f).setDuration(2000);
            tap=true;
        }*/

    }
}
