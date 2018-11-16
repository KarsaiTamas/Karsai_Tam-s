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

public class Elso extends AppCompatActivity {

    private TextView Elso_Neved_TextView;
    private EditText Elso_Kert_Adat_Edit_Text;
    private Button Nev_Kuldo_Elso_Activity_Button;

    public void Valtozok(){
        Elso_Neved_TextView=(TextView)findViewById(R.id.Elso_Neved_TextView);
        Elso_Kert_Adat_Edit_Text=(EditText)findViewById(R.id.Elso_Kert_Adat_Edit_Text);
        Nev_Kuldo_Elso_Activity_Button=(Button)findViewById(R.id.Nev_Kuldo_Elso_Activity_Button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elso);
        Valtozok();

        Nev_Kuldo_Elso_Activity_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adat=Elso_Kert_Adat_Edit_Text.getText().toString();
                SharedPreferences sharedPreferences=getSharedPreferences("adatok", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit=sharedPreferences.edit();
                edit.putString("adat",adat);
                edit.commit();
                Intent next_menu=new Intent(Elso.this,Menu.class);
                startActivity(next_menu);
                finish();
            }
        });

    }
}
