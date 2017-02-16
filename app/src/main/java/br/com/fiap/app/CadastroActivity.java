package br.com.fiap.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import static br.com.fiap.app.R.id.edtEmail;
import static br.com.fiap.app.R.id.edtNome;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //edtNome = (EditText) findViewById(R.id.edtNome);
        //edtEmail = (EditText) findViewById(R.id.edtEmail);

    }//OnCreate

}//Activit