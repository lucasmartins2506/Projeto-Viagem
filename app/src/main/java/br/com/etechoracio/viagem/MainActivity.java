package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextRendimentoVeiculo;
    EditText editTextTempoGasto;
    EditText editTextVelocidadeMedia;
    TextView lblDistancia;
    TextView lblConsumo2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRendimentoVeiculo = findViewById(R.id.editTextRendimentoVeiculo);
        editTextTempoGasto = findViewById(R.id.editTextTempoGasto);
        editTextVelocidadeMedia = findViewById(R.id.editTextVelocidadeMedia);
        lblDistancia = findViewById(R.id.lblDistancia2);
        lblConsumo2 = findViewById(R.id.lblConsumo2);


    }
    public void onCalcular(View V){
        double tg = Double.parseDouble(editTextTempoGasto.getText().toString());
        int vm = Integer.parseInt(editTextVelocidadeMedia.getText().toString());
        int rv =  Integer.parseInt(editTextRendimentoVeiculo.getText().toString());


        double Distancia = tg*vm;
        lblDistancia.setText(String.valueOf(Distancia));

        double consumo = Distancia / rv;
        lblConsumo2.setText(String.valueOf(consumo));
    }
}
