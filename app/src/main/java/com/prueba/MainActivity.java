package com.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView usu,cont;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = (TextView) findViewById(R.id.cjn_usu);
        cont = (TextView) findViewById(R.id.cjn_cont);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cont.equals("adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),part2.class);
                    startActivity(I);
                }else{
                    Toast.makeText(getApplicationContext(),"usuario-contraseña incorrecta",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}