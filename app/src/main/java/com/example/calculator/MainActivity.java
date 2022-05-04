package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    double num1=0;
    double num2=0;
    String operator="";
    double result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextNumber);
    }
    public void NumberBtnClicked(View view)
    {
        switch(view.getId()) {
            case R.id.button:
                button = findViewById(R.id.button);
                break;
            case R.id.button2:
                button = findViewById(R.id.button2);
                break;
            case R.id.button3:
                button = findViewById(R.id.button3);
                break;
            case R.id.button5:
                button = findViewById(R.id.button5);
                break;
            case R.id.button6:
                button = findViewById(R.id.button6);
                break;
            case R.id.button7:
                button = findViewById(R.id.button7);
                break;
            case R.id.button9:
                button = findViewById(R.id.button9);
                break;
            case R.id.button10:
                button = findViewById(R.id.button10);
                break;
            case R.id.button11:
                button = findViewById(R.id.button11);
                break;
            case R.id.button14:
                button = findViewById(R.id.button14);
                break;
        }
        String current=editText.getText().toString();
        String num=button.getText().toString();
        if(current==null)
        {
            current=num;
        }
        else
        {
            current+=num;
        }
        editText.setText(current);
    }
    public void OperatorButtonClicked(View view)
    {
        String current=editText.getText().toString();
        if(current!=null) {
            switch (view.getId()) {
                case R.id.button4:
                    operator = "/";
                    break;
                case R.id.button8:
                    operator = "*";
                    break;
                case R.id.button12:
                    operator = "+";
                    break;
                case R.id.button16:
                    operator = "-";
                    break;
            }
            num1 = Double.parseDouble(current);
            editText.setText("");
        }
    }
    public void EqualBtnClicked(View view)
    {
        String current=editText.getText().toString();
        if(current!=null)
        {
            num2=Double.parseDouble(current);
            switch(operator)
            {
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;
                case "/":
                    result=num1/num2;
                    break;


            }
            String result_str=Double.toString(result);
            editText.setText(result_str);
        }
    }
    public void ClearText(View view)
    {
        editText.setText(" ");
    }
}