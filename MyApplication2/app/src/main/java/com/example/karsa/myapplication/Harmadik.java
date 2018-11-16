package com.example.karsa.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Harmadik extends AppCompatActivity {

    private TextView Harmadik_Kiir_TextView;
    private Button Harmadik_Vissza_Button;
    public void Valtozok(){
        Harmadik_Kiir_TextView=(TextView)findViewById(R.id.Harmadik_Kiir_TextView);
        Harmadik_Vissza_Button=(Button)findViewById(R.id.Harmadik_Vissza_Button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harmadik);
        Valtozok();
        Harmadik_Vissza_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_menu=new Intent(Harmadik.this,Menu.class);
                startActivity(next_menu);
                finish();
            }
        });
    }
}
