package com.example.kin.learningjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapter5 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);
        Bundle bundle=getIntent().getExtras();
        name=bundle.getString("username");
        btn1=(Button)findViewById((R.id.button1));
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5a.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn2=(Button)findViewById((R.id.button2));
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5b.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn3=(Button)findViewById((R.id.button3));
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5c.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn4=(Button)findViewById((R.id.button4));
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5d.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn5=(Button)findViewById((R.id.button5));
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5e.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn6=(Button)findViewById((R.id.button6));
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5f.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn7=(Button)findViewById((R.id.button7));
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5g.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn8=(Button)findViewById((R.id.button8));
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5h.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn9=(Button)findViewById((R.id.button9));
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5i.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn10=(Button)findViewById((R.id.button10));
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5j.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn11=(Button)findViewById((R.id.button11));
        btn11.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5k.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn12=(Button)findViewById((R.id.button12));
        btn12.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5l.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn13=(Button)findViewById((R.id.button13));
        btn13.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5m.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
        btn14=(Button)findViewById((R.id.button14));
        btn14.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter5.this,Chapter5quiz.class);
                Bundle bundle = new Bundle();
                bundle.putString("username",name);
                jumpage.putExtras(bundle);
                startActivity(jumpage);
            }
        });
    }
}
