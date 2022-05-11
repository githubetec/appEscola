package appescola.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.window.SplashScreen;

public class actPrincipal extends AppCompatActivity {
    Button btnEnviar;
    ImageView imgEscola;
    Handler splashscreen = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_principal);
        btnEnviar=findViewById(R.id.btnEnviar);
        imgEscola=findViewById(R.id.imgEscola);
        imgEscola.animate().setDuration(4000);
        imgEscola.animate().alpha(0.1f).start();
        splashscreen.postDelayed(new Runnable() {
            @Override
            public void run() {
                SelecionarLayout();
            }
        },4000);
    }
    public void SelecionarLayout() {
        Intent intent = new Intent(this,actLogin.class);
        startActivity(intent);
        finish();
    }
}