package appescola.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class actLogin extends AppCompatActivity {

    EditText edtLogin, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_login);
        edtLogin=findViewById(R.id.edtLogin);
        edtSenha=findViewById(R.id.edtSenha);
        edtLogin.requestFocus();
    }

    public void VerificaLogin(View view) {
        if(edtLogin.getText().toString().trim().equals("etec")
           && edtSenha.getText().toString().trim().equals("1234")) {
            Intent itMenu = new Intent(this,actMenu.class);
            startActivity(itMenu);
            finish();
        }
        else {
            Toast.makeText(this, "Login Inválido", Toast.LENGTH_LONG).show();
            edtLogin.setText("");
            edtSenha.setText("");
            edtLogin.requestFocus();
        }
    }

}