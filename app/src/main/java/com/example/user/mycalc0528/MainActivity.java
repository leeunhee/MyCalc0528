package com.example.user.mycalc0528;

import android.app.Activity;
import android.os.Bundle;
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

    Button btPlus;
    Button btMinus;
    Button btMuti;
    Button btDevide;
    Button btMod;
    TextView etNum1;
    TextView etNum2;
    TextView Resultvalue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("간단계산 EHLEE");
//        etNum1 = (EditText) findViewById(R.id.Input1);
//        etNum2 = (EditText) findViewById(R.id.Input2);
        btPlus = (Button) findViewById(R.id.btPlus);

        btPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Resultvalue1.setText("계산결과 >> " + etNum1+etNum2);
                return false;
            }
        });

    }
}
