package cal.Dandrois.calculadora1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de Botones
    private Button btnSuma;
    private Button btnResta;
    private Button btnMultiplicacion;
    private Button btnDivision;
    //Texto de respuesta
    private TextView textRespuesta;
    //Entradas
    private EditText editUno;
    private EditText editDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Botones
        btnSuma = findViewById(R.id.buttonSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText(suma(Integer.parseInt(editUno.getText().toString()) , Integer.parseInt(editDos.getText().toString()))+"");
            }
        });
        btnResta = findViewById(R.id.buttonResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText(resta(Integer.parseInt(editUno.getText().toString()) , Integer.parseInt(editDos.getText().toString()))+"");
            }
        });
        btnMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText(multiplicacion(Integer.parseInt(editUno.getText().toString()) , Integer.parseInt(editDos.getText().toString()))+"");
            }
        });
        btnDivision = findViewById(R.id.buttonDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText(division(Integer.parseInt(editUno.getText().toString()) , Integer.parseInt(editDos.getText().toString()))+"");
            }
        });
        //Texto de respuesta
        textRespuesta = findViewById(R.id.textView);
        //Entradas
        editUno = findViewById(R.id.editText);
        editDos = findViewById(R.id.editText2);

    }
    //Metodo suma
    public int suma(int a, int b){
        return a + b;
    }
    //Metodo resta
    public int resta(int a, int b){
        return a - b;
    }
    //Metodo multiplicacion
    public int multiplicacion(int a, int b){
        return a * b;
    }
    //Metodo division
    public int division(int a, int b){
        return a / b;
    }
}