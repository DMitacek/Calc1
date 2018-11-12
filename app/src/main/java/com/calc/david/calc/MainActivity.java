package com.calc.david.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String number1 ="";
    public String number2 ="";
    public int choice =0;
    public String sign ="+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void AddNumber(View view){
        int button = 0;
        switch (view.getId()) {

            case R.id.button0:
                button = 0;
                break;

            case R.id.button1:
                button = 1;
                break;

            case R.id.button2:
                button = 2;
                break;

            case R.id.button3:
                button = 3;
                break;

            case R.id.button4:
                button = 4;
                break;

            case R.id.button5:
                button = 5;
                break;

            case R.id.button6:
                button = 6;
                break;

            case R.id.button7:
                button = 7;
                break;

            case R.id.button8:
                button = 8;
                break;

            case R.id.button9:
                button = 9;
                break;

            default:
                break;
        }
        if (choice==0){
            number1 = new StringBuilder(number1).append(button).toString();
            TextView textView = findViewById(R.id.textView);
            textView.setText(number1);
        }
        else{
            number2 = new StringBuilder(number2).append(button).toString();
            TextView textView = findViewById(R.id.textView);
            textView.setText(number1+sign+number2);
        }
    }
    public void deleteNumber(View view){

        if (choice==0){
            number1 = new StringBuilder(number1).deleteCharAt(number1.length()-1).toString();
            TextView textView = findViewById(R.id.textView);
            textView.setText(number1);
        }
        else{
            number2 = new StringBuilder(number2).deleteCharAt(number2.length()-1).toString();
            TextView textView = findViewById(R.id.textView);
            textView.setText(number1+sign+number2);
        }
    }
    public void getOperation(View view){
        switch (view.getId()) {

            case R.id.buttonP:
                sign = "+";
                break;

            case R.id.buttonK:
                sign = "*";
                break;

            case R.id.buttonM:
                sign = "-";
                break;

            case R.id.buttonD:
                sign = "/";
                break;

            default:
                break;
        }
        choice = 1;
        TextView textView = findViewById(R.id.textView);
        textView.setText(number1+sign+number2);
    }
    public void CalcResult(View view){
        long result=0;
        switch (sign){
            case "+":
                result = Integer.parseInt(number1) + Integer.parseInt(number2);
                break;
            case "-":
                result = Integer.parseInt(number1) - Integer.parseInt(number2);
                break;
            case "*":
                result = Integer.parseInt(number1) * Integer.parseInt(number2);
                break;
            case "/":
                result = Integer.parseInt(number1) / Integer.parseInt(number2);
                break;
            default:
                break;
        }
        choice = 0;
        TextView textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(result));

        number1="";
        number2="";
    }
}
