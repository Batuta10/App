package br.com.fiap.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtLogin;
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLogin = (EditText) findViewById(R.id.edtLogin);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }//OnCreate


    public void logar(View v){
        //Recupera dados da tela
        String login = edtLogin.getText().toString();
        String senha = edtSenha.getText().toString();
        //Validação Login
        if (login.toLowerCase().equals("fiap") && senha.toLowerCase().equals("fiap123")){
            Intent chamaView = new Intent(this,IndexActivity.class);
            startActivity(chamaView);

            Toast.makeText(this, getString(R.string.strSmsSusseco), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, getString(R.string.strSmsFalha), Toast.LENGTH_SHORT).show();
        }
    }//Logar
    public void cadastrar(View v){
        Intent chamaCadastro = new Intent(this, CadastroActivity.class);
        startActivity(chamaCadastro);
    }
}//Main
