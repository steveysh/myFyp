package com.example.kin.learningjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapterlist extends AppCompatActivity {
    Button button1, button2,button3,button4, button5, button6;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapterlist);
        Bundle bundle=getIntent().getExtras();
        name=bundle.getString("username");
        button1=(Button)findViewById((R.id.button1));
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter1.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        button2=(Button)findViewById((R.id.button2));
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter2.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        button3=(Button)findViewById((R.id.button3));
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter3.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        button4=(Button)findViewById((R.id.button4));
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter4.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        button5=(Button)findViewById((R.id.button5));
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter5.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        button6=(Button)findViewById((R.id.button6));
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapterlist.this,Chapter6.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });

    }
}
