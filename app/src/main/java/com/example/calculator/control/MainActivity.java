package com.example.calculator.control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.example.calculator.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   private int[] buttonIds;
   private Button[] buttons;
   private TextView textView;
   private StringBuilder result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        initClick();
    }

    public void initview(){
        buttonIds = new int[]{
                R.id.ac,
                R.id.opposite_value,
                R.id.percent_sign,
                R.id.division,
                R.id.seven,
                R.id.eight,
                R.id.night,
                R.id.multiply,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.less,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.add,
                R.id.zero,
                R.id.point,
                R.id.equal
        };
        buttons = new Button[19];
        for (int i=0;i<buttonIds.length;i++){
            buttons[i]=findViewById(buttonIds[i]);
        }
        textView = findViewById(R.id.text);
    }

    public void initClick(){
        for (int i=0;i<buttonIds.length;i++){
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.zero:
                result = result.append("0");
                break;
            case R.id.one:
                result = result.append("1");
                break;
            case R.id.two:
                result = result.append("2");
                break;
            case R.id.three:
                result = result.append("3");
                break;
            case R.id.four:
                result = result.append("4");
                break;
            case R.id.five:
                result = result.append("5");
                break;
            case R.id.six:
                result = result.append("6");
                break;
            case R.id.seven:
                result = result.append("7");
                break;
            case R.id.eight:
                result = result.append("8");
                break;
            case R.id.night:
                result = result.append("9");
                break;
            case R.id.ac:  //AC
                result.delete(0,result.length());
                break;
            case R.id.opposite_value: //+/-

            case R.id.percent_sign:   // %

            case R.id.add:            // +

            case R.id.less:           // -

            case R.id.multiply:       // x

            case R.id.division:       // ÷

            case R.id.equal:          // =

            case R.id.point:          // .
        }

    }
}
