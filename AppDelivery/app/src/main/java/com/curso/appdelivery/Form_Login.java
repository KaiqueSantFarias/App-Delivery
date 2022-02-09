package com.curso.appdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Form_Login extends AppCompatActivity {

    private TextView txt_criar_conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        txt_criar_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Form_Login.this,Form_Cadastro.class);
                startActivity(intent);
            }
        });

    }
    public void IniciarComponentes(){
        txt_criar_conta = findViewById(R.id.txt_criar_conta);
    }
}