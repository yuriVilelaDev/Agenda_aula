package br.eti.yurivilela.agenda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context: FormularioActivity.this, text="Dados Salvos", Toast.LENGTH_SHORT).show();
                Intent vaiPramain = new Intent(packageContext= FormularioActivity.this, MainActivity.class);
                finish();
            }
        });
    }
}