package adivinha.ccomp.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogar);
        textoresultado = (TextView) findViewById(R.id.textoResultado);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rndm = new Random();

                int nmr = rndm.nextInt(10);
                String mensagem = getResources().getString(R.string.numero_escolhido);

                textoresultado.setText(mensagem + nmr);

            }
        });
    }
}
