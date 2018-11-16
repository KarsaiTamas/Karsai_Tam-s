package com.example.karsa.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private TextView Menu_Neved_TextView;
    private Button Menu_Kovetkezo_Activitibe_Button;
    private Button Menu_Nev_Valto_Activitibe_Button;
    private Button Menu_Informacio_Button;
    private Button Menu_Kilep_Button;

    public void Valtozok(){
        Menu_Neved_TextView=(TextView)findViewById(R.id.Menu_Neved_TextView);
        Menu_Kovetkezo_Activitibe_Button=(Button)findViewById(R.id.Menu_Kovetkezo_Activitibe_Button);
        Menu_Nev_Valto_Activitibe_Button=(Button)findViewById(R.id.Menu_Nev_Valto_Activitibe_Button);
        Menu_Informacio_Button=(Button)findViewById(R.id.Menu_Informacio_Button);
        Menu_Kilep_Button=(Button)findViewById(R.id.Menu_Kilep_Button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Valtozok();

        SharedPreferences sharedPreferences=getSharedPreferences("adatok",Context.MODE_PRIVATE);
        String alapertelmezett="nincs adat";
        String adat =sharedPreferences.getString("adat",alapertelmezett);
        Menu_Neved_TextView.setText(adat);
        Menu_Kovetkezo_Activitibe_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_harmadik=new Intent(Menu.this,Harmadik.class);
                startActivity(next_harmadik);
                finish();
            }
        });
        Menu_Nev_Valto_Activitibe_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_nev_valto=new Intent(Menu.this,Nev_Valtas.class);
                startActivity(next_nev_valto);
                finish();
            }
        });
        Menu_Informacio_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Menu.this, "A neved:"+Menu_Neved_TextView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        Menu_Kilep_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
