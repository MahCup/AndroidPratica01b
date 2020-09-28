package com.example.pratica01b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnTimes, btnDivide, btnEqual, btnClear, btnBackSpace;
    private TextView result;
    private String line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando os widgets
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnTimes = findViewById(R.id.btnTimes);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnBackSpace = findViewById(R.id.btnBackSpace);
        result = findViewById(R.id.visor);
        line = "";

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void button0 (View view) {
        if(line.isEmpty()) line = "0";
        else line += "0";
        result.setText(line);
    }

    public void button1 (View view) {
        if(line.isEmpty()) line = "1";
        else line += "1";
        result.setText(line);
    }

    public void button2 (View view) {
        if(line.isEmpty()) line = "2";
        else line += "2";
        result.setText(line);
    }

    public void button3 (View view) {
        if(line.isEmpty()) line = "3";
        else line += "3";
        result.setText(line);
    }

    public void button4 (View view) {
        if(line.isEmpty()) line = "4";
        else line += "4";
        result.setText(line);
    }

    public void button5 (View view) {
        if(line.isEmpty()) line = "5";
        else line += "5";
        result.setText(line);
    }

    public void button6 (View view) {
        if(line.isEmpty()) line = "6";
        else line += "6";
        result.setText(line);
    }

    public void button7 (View view) {
        if(line.isEmpty()) line = "7";
        else line += "7";
        result.setText(line);
    }

    public void button8 (View view) {
        if(line.isEmpty()) line = "8";
        else line += "8";
        result.setText(line);
    }

    public void button9 (View view) {
        if(line.isEmpty()) line = "9";
        else line += "9";
        result.setText(line);
    }

    public void buttonBackSpace (View view) {
        if(!line.isEmpty()) line = line.substring(0, line.length()-1);
        result.setText(line);
    }

    public void buttonClear (View view) {
        line = "";
        result.setText(line);
    }

    public void buttonSum (View view) {
        if(!line.isEmpty()) line += " + ";
        result.setText(line);
    }

    public void buttonMinus (View view) {
        if(!line.isEmpty()) line += " - ";
        result.setText(line);
    }

    public void buttonTimes (View view) {
        if(!line.isEmpty()) line += " x ";
        result.setText(line);
    }

    public void buttonDivide (View view) {
        if(!line.isEmpty()) line += " / ";
        result.setText(line);
    }

    public void buttonDot (View view) {
        if(!line.isEmpty()) line += ".";
        result.setText(line);
    }

    public void buttonEqual (View view) {
        String[] breakedLine = line.split(" ");

        Double a = Double.parseDouble(breakedLine[0]);
        Double b = Double.parseDouble(breakedLine[2]);
        Double c;

        if(breakedLine[1].equals("+")) {
            c = a + b;
            line = c.toString();
            result.setText(line);
        } else if(breakedLine[1].equals("-")) {
            c = a - b;
            line = c.toString();
            result.setText(line);
        } else if(breakedLine[1].equals("x")) {
            c = a * b;
            line = c.toString();
            result.setText(line);
        } else if(breakedLine[1].equals("/")) {
            c = a / b;
            line = c.toString();
            result.setText(line);
        }

    }
}