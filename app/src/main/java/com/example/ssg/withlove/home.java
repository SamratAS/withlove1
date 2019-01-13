package com.example.ssg.withlove;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity {
String pass;
    ViewFlipper v_flipper;
    Editable HoldPass;
    EditText ThroughPass;
    Button GetPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView tv = this.findViewById(R.id.scroll);
        tv.setSelected(true);
        int images[] = {R.drawable.ima1,R.drawable.imag2,R.drawable.imga4,R.drawable.imgaa6,R.drawable.imgaa7};
        v_flipper = findViewById(R.id.v_flipper);
        for (int image : images) {
            flipperimages(image);
        }
        ThroughPass = (EditText)findViewById(R.id.HoldPassword);
        GetPass = (Button)findViewById(R.id.GetPassword);

        GetPass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                pass = ThroughPass.getText().toString();
                if (pass.isEmpty()) {
                    Toast.makeText(home.this, "Please enter the password", Toast.LENGTH_SHORT).show();
                }
                 else{
                     if (pass.toLowerCase().equals("143")) {
                         Intent homeintent1 = new Intent(home.this, secound.class);
                         startActivity(homeintent1);
                         finish();
                    } else {
                        Toast.makeText(home.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }





    public void flipperimages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(1500);
        v_flipper.setAutoStart(true);


        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
