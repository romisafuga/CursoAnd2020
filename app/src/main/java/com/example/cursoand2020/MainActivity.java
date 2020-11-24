package com.example.cursoand2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tx1;
    EditText ed1;
    Button bot1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.textView_uno);
        tx1.setText("Hola Mundo desde el código");
        ed1 = findViewById(R.id.editTextTextPersonName);
        bot1 = findViewById(R.id.button);

        bot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // para comentariar una linea se usa esto
                /* para comentariar mas de una linea se empieza
                con esta combinacion y se termina al final del
                comentario con la combinacion de abajo
                 */
                tx1.setText(ed1.getText().toString());
                Toast.makeText(getApplicationContext(),
                        tx1.getText().toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}