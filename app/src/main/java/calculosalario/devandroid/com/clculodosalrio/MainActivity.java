package calculosalario.devandroid.com.clculodosalrio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoCalc;
    private TextView resultado;
    private EditText salario;
    private RadioButton porc40;
    private RadioButton porc45;
    private RadioButton porc50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        botaoCalc = (Button) findViewById(R.id.botaoCalcId);
        resultado = (TextView) findViewById(R.id.idResultado);
        salario = (EditText) findViewById(R.id.id_salario);
        porc40 = (RadioButton) findViewById(R.id.id_40);
        porc45 = (RadioButton) findViewById(R.id.id_45);
        porc50 = (RadioButton) findViewById(R.id.id_50);

        final String txtPorc40 = porc40.getText().toString();
        final int v_Porc40  = Integer.parseInt(txtPorc40);

        String txtPorc45 = porc40.getText().toString();
        final int v_Porc45  = Integer.parseInt(txtPorc45);

        String txtPorc50 = porc40.getText().toString();
        final int v_Porc50  = Integer.parseInt(txtPorc50);

        String txtSalario = salario.getText().toString();
        final double v_Salario  = Double.parseDouble(txtSalario);
        

        botaoCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

                String teste = radioButtonEscolhido.getText().toString();


                if ( == txtPorc40){
                    resultado.setText("OK");
                }

            }
        });


    }
}
