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
    private EditText salario_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        botaoCalc = (Button) findViewById(R.id.botaoCalcId);
        resultado = (TextView) findViewById(R.id.idResultado);
        salario_info = (EditText) findViewById(R.id.id_salario);

        botaoCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtSalario = salario_info.getText().toString();
                double val_Salario = Double.parseDouble(txtSalario);
                double cal_Salario = 0;

               int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

               if (R.id.id_40 == idRadioButtonEscolhido){
                   cal_Salario = val_Salario +(val_Salario * 0.40);
               }
               if (R.id.id_45 == idRadioButtonEscolhido) {
                   cal_Salario = val_Salario +(val_Salario * 0.45);               }
               if (R.id.id_50 == idRadioButtonEscolhido){
                   cal_Salario = val_Salario +(val_Salario * 0.50);
               }

               resultado.setText("Salário ajustado para: R$"+cal_Salario);
            }
        });


    }
}
