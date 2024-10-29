package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageButton btn0;
    TextView resultText;
    int result = 0;
    String num  = "";
    String sign = "+";
    @SuppressLint({"ClickableViewAccessibility", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn0 = findViewById(R.id.imageButton);
        resultText = findViewById(R.id.textView);

    }


    public void number0(View view) {
        if(!num.equals("0")){
            num+="0";
            resultText.setText(num);
        }
    }

    public void number1(View view) {
        if(num.equals("0"))
            num="1";
        else {
            num+="1";
        }
        resultText.setText(num);
    }

    public void number2(View view) {
        if(num.equals("0"))
            num="2";
        else {
            num+="2";
        }
        resultText.setText(num);
    }

    public void number3(View view) {
        if(num.equals("0"))
            num="3";
        else {
            num+="3";
        }
        resultText.setText(num);
    }

    public void number4(View view) {
        if(num.equals("0"))
            num="4";
        else {
            num+="4";
        }
        resultText.setText(num);
    }

    public void number5(View view) {
        if(num.equals("0"))
            num="5";
        else {
            num+="5";
        }
        resultText.setText(num);
    }

    public void number6(View view) {
        if(num.equals("0"))
            num="6";
        else {
            num+="6";
        }
        resultText.setText(num);
    }

    public void number7(View view) {
        if(num.equals("0"))
            num="7";
        else {
            num+="7";
        }
        resultText.setText(num);
    }

    public void number8(View view) {
        if(num.equals("0"))
            num="8";
        else {
            num+="8";
        }
        resultText.setText(num);
    }

    public void number9(View view) {
        if(num.equals("0"))
            num="9";
        else {
            num+="9";
        }
        resultText.setText(num);
    }

    public void plusSign(View view) {
        if (sign.equals("+")) {
            result += Integer.parseInt(num);
        }
        sign = "+";
        num = "";

        }

    public void minusSign(View view) {
    }

    public void multiplySign(View view) {
    }

    public void divideSign(View view) {
    }

    public void equalSign(View view) {
        result += Integer.parseInt(num);
        resultText.setText(String.valueOf(result));
        num=String.valueOf(result);


    }

    public void clearSign(View view) {
    }
}

