package com.example.spinnnnner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Main3Activity extends AppCompatActivity {
ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        int images []={R.drawable.ba,R.drawable.baby,R.drawable.banota};
        viewFlipper=findViewById(R.id.V_flipper);

       /*for (int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }*/
        for (int image:images){
            flipperImages(image);
        }
    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
viewFlipper.addView(imageView);
viewFlipper.setFlipInterval(4000);
viewFlipper.setAutoStart(true);

viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
