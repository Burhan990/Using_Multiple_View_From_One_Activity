package com.example.multiplelayoutfromoneactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button a,b,c;


    private int AAAA=11,BBBB=22,CCCC=33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(Button)findViewById(R.id.a);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
    }

    public void a(View view) {

        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("a1","buttona1");
        i.putExtra("a2","buttona2");
        i.putExtra("a3","buttona3");

        i.putExtra("forA",AAAA);
        startActivity(i);
    }

    public void b(View view) {

        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("b1","buttonb1");
        i.putExtra("b2","buttonb2");
        i.putExtra("b3","buttonb3");


        i.putExtra("forB",BBBB);

        startActivity(i);
    }

    public void c(View view) {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("c1","buttonc1");
        i.putExtra("c2","buttonc2");
        i.putExtra("c3","buttonc3");

        i.putExtra("forC",CCCC);
        startActivity(i);
    }
}
