package com.mobaires.imagesload;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mobaires.imagesload.transformations.CircleTransform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView targetImageView = (ImageView) findViewById(R.id.imageView);
        String internetUrl = "http://i.imgur.com/DvpvklR.png";
        Glide.with(this)
             .load(internetUrl)
             .into(targetImageView);

    }

    public void goToList(View v) {
        startActivity(new Intent(this, ImagesListActivity.class));
    }

}
