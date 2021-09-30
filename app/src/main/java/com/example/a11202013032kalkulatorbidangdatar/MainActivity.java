package com.example.a11202013032kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText angka1, angka2;
    Button persegi, segitiga, lingkaran;
    TextView keliling, luas;
    double num1, num2, resultL, resultK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol = (Button) findViewById(R.id.Toast);
        tombol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Create By Muhammad Ilham Ghufroni(A11.2020.13032) ",Toast.LENGTH_LONG).show();
            }
        });

        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        persegi = (Button) findViewById(R.id.persegi);
        segitiga = (Button) findViewById(R.id.segitiga);
        lingkaran = (Button) findViewById(R.id.lingkaran);
        luas = (TextView)findViewById(R.id.luas);
        keliling = (TextView)findViewById(R.id.keliling);

    }

    @SuppressLint("DefaultLocale")
    public void persegi(View V){
        num1 = Double.parseDouble(angka1.getText().toString());
        num2 = Double.parseDouble(angka2.getText().toString());
        resultL = num1 * num2;
        resultK = (num1 * 2) + (num2 * 2);
        luas.setText(String.format("%.2f", resultL));
        keliling.setText(String.format("%.2f", resultK));
    }

    @SuppressLint("DefaultLocale")
    public void segitiga(View V){
        double sisi;
        num1 = Double.parseDouble(angka1.getText().toString());
        num2 = Double.parseDouble(angka2.getText().toString());
        resultL = (num1 * num2) / 2;
        sisi = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
        resultK = (num1 + num2 + sisi);
        luas.setText(String.format("%.2f", resultL));
        keliling.setText(String.format("%.2f", resultK));
    }

    @SuppressLint("DefaultLocale")
    public void lingkaran(View V){
        num1 = Double.parseDouble(angka1.getText().toString());
        num2 = num1 / 2; //turn in to half circle
        resultL = Math.PI * Math.pow(num2,2);
        resultK = 2 * Math.PI * num2;
        luas.setText(String.format("%.2f", resultL));
        keliling.setText(String.format("%.2f", resultK));

    }
}