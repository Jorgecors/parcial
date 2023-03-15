import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculadora.R;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnFibonacci, btnMultiplicacion, btnPotencia;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnFibonacci = findViewById(R.id.btnFibonacci);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnPotencia = findViewById(R.id.btnPotencia);
        resultado = findViewById(R.id.resultado);

        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(num1.getText().toString());
                int fib = fibonacci(n);
                resultado.setText("El número de Fibonacci de " + n + " es " + fib);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int mult = multiplicacion(a, b);
                resultado.setText(a + " x " + b + " = " + mult);
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                double pot = potencia(a, b);
                resultado.setText(a + " elevado a " + b + " es " + pot);
            }
        });
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double potencia(int a, int b) {
        return Math.pow(a, b);
    }
}
