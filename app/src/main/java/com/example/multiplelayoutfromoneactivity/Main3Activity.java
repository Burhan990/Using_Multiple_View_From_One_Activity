package com.example.multiplelayoutfromoneactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {


    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img=(ImageView)findViewById(R.id.image);


        final Intent intent=getIntent();

        int aa1=intent.getExtras().getInt("ABA1");
        int aa2=intent.getExtras().getInt("ABA2");
        int aa3=intent.getExtras().getInt("ABA3");
        int bb1=intent.getExtras().getInt("ABB1");
        int bb2=intent.getExtras().getInt("ABB2");
        int bb3=intent.getExtras().getInt("ABB3");
        int cc1=intent.getExtras().getInt("ABC1");
        int cc2=intent.getExtras().getInt("ABC2");
        int cc3=intent.getExtras().getInt("ABC3");


        if (aa1==1){
            img.setBackgroundResource(R.drawable.black);
        }else if (aa2==2){
            img.setBackgroundResource(R.drawable.burrr);
        }else if (aa3==3){
            img.setBackgroundResource(R.drawable.dfwegf);
        }else if (bb1==4){
            img.setBackgroundResource(R.drawable.hhhhhhhhhh);
        }else if (bb2==5){
            img.setBackgroundResource(R.drawable.homepage);
        }else if (cc1==7){
            img.setBackgroundResource(R.drawable.tic);
        }else if (cc2==8){
            img.setBackgroundResource(R.drawable.ttttttttttttttt);
        }else if (cc3==9){
            img.setBackgroundResource(R.drawable.unnamed);
        }


    }
}
