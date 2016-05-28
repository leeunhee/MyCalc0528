package com.example.user.mycalc0528;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btPlus, btMinus, btMuti, btDevide, btMod;
    EditText etNum1, etNum2;
    TextView Resultvalue1;
    String resS1;
    int num1, num2, res1, res2, res3, res4, res5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("간단계산 EHLEE");
        etNum1 = (EditText) findViewById(R.id.Input1);
        etNum2 = (EditText) findViewById(R.id.Input2);
//        resS1 = etNum1.getText().toString();
//        resS2 = etNum2.getText().toString();
        num1 = Integer.parseInt(etNum1.getText().toString());
//        System.out.println(etNum1.getText().toString());
        num2 = Integer.parseInt(etNum2.getText().toString());

        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMuti = (Button) findViewById(R.id.btMuti);
        btDevide = (Button) findViewById(R.id.btDivide);
        btMod = (Button) findViewById(R.id.btMod);
        Resultvalue1 = (TextView) findViewById(R.id.resultValue);

//        res1 = Integer.parseInt(etNum1.toString())+Integer.parseInt(etNum2.toString());

        res1 = num1+num2;
        res2 = num1-num2;
        res3 = num1*num2;
        res4 = num1/num2;
        res5 = num1%num2;

        btPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Resultvalue1.setText("계산결과 >> " + res1);
                return false;
            }
        });

    }
}
