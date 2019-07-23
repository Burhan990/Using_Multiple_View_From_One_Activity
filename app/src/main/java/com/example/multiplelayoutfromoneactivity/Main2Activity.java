package com.example.multiplelayoutfromoneactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


private Button bn1,bn2,bn3;

private int aa=1,ab=2,ac=3,ba=4,bb=5,bc=6,ca=7,cb=8,cc=9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bn1=(Button)findViewById(R.id.btna);
        bn2=(Button)findViewById(R.id.btnb);
        bn3=(Button)findViewById(R.id.btnc);


        final Intent intent=getIntent();


        int AAAA=intent.getExtras().getInt("forA");
        int BBBB=intent.getExtras().getInt("forB");
        int CCCC=intent.getExtras().getInt("forC");
        if (AAAA==11) {

            bn1.setText(intent.getExtras().getString("a1"));
            bn2.setText(intent.getExtras().getString("a2"));
            bn3.setText(intent.getExtras().getString("a3"));

            bn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    intent.putExtra("ABA1",aa);
                    startActivity(intent);
                }
            });
            bn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABA2",ab);
                    intent.putExtra("ABA3",ac);

                    startActivity(intent);
                }
            });

            bn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABA3",ac);

                    startActivity(intent);
                }
            });




        }else if (BBBB==22) {
            bn1.setText(intent.getExtras().getString("b1"));
            bn2.setText(intent.getExtras().getString("b2"));
            bn3.setText(intent.getExtras().getString("b3"));

            bn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    intent.putExtra("ABB1",ba);


                    startActivity(intent);
                }
            });

            bn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABB2",bb);


                    startActivity(intent);
                }
            });

            bn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABB3",bc);

                    startActivity(intent);
                }
            });


        }else if (CCCC==33) {
            bn1.setText(intent.getExtras().getString("c1"));
            bn2.setText(intent.getExtras().getString("c2"));
            bn3.setText(intent.getExtras().getString("c3"));


            bn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    intent.putExtra("ABC1",ca);

                    startActivity(intent);
                }
            });

            bn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABC2",cb);



                    startActivity(intent);
                }
            });

            bn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

                    intent.putExtra("ABC3",cc);


                    startActivity(intent);
                }
            });


        }




    }


}
