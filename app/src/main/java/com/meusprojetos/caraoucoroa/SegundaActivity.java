package com.meusprojetos.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {

    private ImageView imageMoeda;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imageMoeda = findViewById(R.id.imageMoeda);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //recuperando o número aleatório que foi gerado no MainActivity
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        //definindo qual imagem será exibida de acordo com o número que foi gerado
        if(numero == 0) {
            imageMoeda.setImageResource(R.drawable.moeda_cara);
        }
        else{
            imageMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        //implementando o botão de voltar para a tela anterior
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });

    }
}
