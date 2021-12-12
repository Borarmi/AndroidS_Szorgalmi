package com.example.pictureanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView= findViewById(R.id.imageView);

        findViewById(R.id.buttonZoomIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in
                ));
            }
        });
        findViewById(R.id.buttonCLose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {imageView.startAnimation(AnimationUtils.loadAnimation(
                    getApplicationContext(),
                    R.anim.fade_out
            ));

            }
        });

    }
}