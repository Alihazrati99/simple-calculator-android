package com.app.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
            btnNine, btnZero, btnAdd, btnSub, btnMul, btnDiv, btnClear, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);

        CalculatorBrain cb = new CalculatorBrain();
        final StringBuilder[] s = {new StringBuilder()};

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("1");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("2");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("3");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("4");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("5");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("6");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("7");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("8");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("9");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0].append("0");
                if(txtResult.getText()!=null && !Character.isDigit(txtResult.getText().charAt(0))){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText()+"0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.a.size()>1){
                    txtResult.setText("Error!! Invalid Input");
                    cb.a = new ArrayList<>();
                    return;
                }
                cb.push(s[0].toString());
                s[0] = new StringBuilder();
                cb.push("+");
                txtResult.setText(txtResult.getText()+" + ");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.a.size()>1){
                    txtResult.setText("Error!! Invalid Input");
                    cb.a = new ArrayList<>();
                    return;
                }
                cb.push(s[0].toString());
                s[0] = new StringBuilder();
                cb.push("-");
                txtResult.setText(txtResult.getText()+" - ");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.a.size()>1){
                    txtResult.setText("Error!! Invalid Input");
                    cb.a = new ArrayList<>();
                    return;
                }
                cb.push(s[0].toString());
                s[0] = new StringBuilder();
                cb.push("*");
                txtResult.setText(txtResult.getText()+" * ");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.a.size()>1){
                    txtResult.setText("Error!! Invalid Input");
                    cb.a = new ArrayList<>();
                    return;
                }
                cb.push(s[0].toString());
                s[0] = new StringBuilder();
                cb.push("/");
                txtResult.setText(txtResult.getText()+" / ");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb.a = new ArrayList<>();
                s[0] = new StringBuilder();
                txtResult.setText("Enter Something...");
            }
        });
        try{
            btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cb.push(s[0].toString());
                    System.out.println(cb.a);
                    s[0] = new StringBuilder();
                    if(cb.a.size()!=3){
                        txtResult.setText("Error!! Invalid Input");
                        cb.a = new ArrayList<>();
                        return;
                    }
                    int res = cb.calculate();
                    txtResult.setText(cb.a.get(0)+" "+cb.a.get(1)+" "+cb.a.get(2)+" = "+res);
                    cb.a = new ArrayList<>();
                }
            });
        }
        catch (Exception e){
            txtResult.setText("Error!! Invalid Input");
        }
    }
}