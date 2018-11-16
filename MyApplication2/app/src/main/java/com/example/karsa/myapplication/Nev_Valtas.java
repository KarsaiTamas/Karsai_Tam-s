package com.example.karsa.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nev_Valtas extends AppCompatActivity {
    private TextView Nev_Valtas_Neved_TextView;
    private EditText Nev_Valtas_Kert_Adat_Edit_Text;
    private Button Nev_Kuldo_Nev_Valtas_Button;

    public void Valtozok(){
        Nev_Valtas_Neved_TextView=(TextView)findViewById(R.id.Nev_Valtas_Neved_TextView);
        Nev_Valtas_Kert_Adat_Edit_Text=(EditText)findViewById(R.id.Nev_Valtas_Kert_Adat_Edit_Text);
        Nev_Kuldo_Nev_Valtas_Button=(Button)findViewById(R.id.Nev_Kuldo_Nev_Valtas_Button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nev__valtas);
        Valtozok();
        Nev_Kuldo_Nev_Valtas_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adat=Nev_Valtas_Kert_Adat_Edit_Text.getText().toString();
                SharedPreferences sharedPreferences=getSharedPreferences("adatok", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit=sharedPreferences.edit();
                edit.putString("adat",adat);
                edit.commit();
                Intent next_menu2=new Intent(Nev_Valtas.this,Menu.class);
                startActivity(next_menu2);
                finish();
            }
        });

    }
}
