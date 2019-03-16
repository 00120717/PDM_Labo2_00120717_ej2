package com.mramirez.ejercicio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            img1.findViewById(R.id.img1);
            img2.findViewById(R.id.img2);
            img3.findViewById(R.id.img3);
            img4.findViewById(R.id.img4);
            img5.findViewById(R.id.img5);
            img6.findViewById(R.id.img6);
            img7.findViewById(R.id.img7);
            img8.findViewById(R.id.img8);
            img9.findViewById(R.id.img9);

            img1.setOnClickListener(this);
            img2.setOnClickListener(this);
            img3.setOnClickListener(this);
            img4.setOnClickListener(this);
            img5.setOnClickListener(this);
            img6.setOnClickListener(this);
            img7.setOnClickListener(this);
            img8.setOnClickListener(this);
            img9.setOnClickListener(this);

        }

        @Override
        public void onClick(View v){
            int IdView = v.getId();
            int[] imgs = {R.id.img1,R.id.img2,R.id.img3,R.id.img4,R.id.img5,R.id.img6,R.id.img7,R.id.img8,R.id.img9};

            switch (IdView){
                case R.id.img1:
                    img1.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img2:
                    img2.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img3:
                    img3.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img4:
                    img4.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img5:
                    img5.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img6:
                    img6.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img7:
                    img7.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img8:
                    img8.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;
                case R.id.img9:
                    img9.setImageResource(imgs[(int) Math.floor(Math.random()*9)]);
                    break;

            }
        }

    }






