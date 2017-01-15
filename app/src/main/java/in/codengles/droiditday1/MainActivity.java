package in.codengles.droiditday1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity{
    TextView view = null;
    int count = 0;
    Button button1 = null;
    TextView textView = null;
    String display = "";//new StringBuilder();
    int firstNumber;
    int secondNumber;
    boolean add;
    boolean sub;
    boolean mul;
    boolean div;
    boolean eq;
    String equation="";


    private void clearDisplay(){

        display = "";
        updateScreen();
    }

    private void updateScreen(){
        textView.setText(display);
    }

    private void updateEquation(String value){
        if(eq){
            clearDisplay();
            eq=!eq;
        }
        equation =equation+value;
        display = textView.getText().toString()+value;
        updateScreen();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);
        Button buttonMul = (Button)findViewById(R.id.buttonMul);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        Button buttoneq = (Button)findViewById(R.id.buttoneq);
        Button buttonSub = (Button)findViewById(R.id.buttonsub);
        Button buttonC = (Button)findViewById(R.id.buttonC);

        textView = (TextView)findViewById(R.id.textView);
        textView.setText(display);



        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearDisplay();
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               updateEquation(((Button)v).getText().toString());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEquation(((Button)v).getText().toString());
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Integer.parseInt(equation);
                add = true;
                display = textView.getText().toString()+"+";
                updateScreen();
                 equation = "";

            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Integer.parseInt(equation);
                sub = true;
                display = textView.getText().toString()+"-";
                updateScreen();
                equation = "";
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Integer.parseInt(equation);
                div = true;
                display = textView.getText().toString()+"/";
                updateScreen();
                equation = "";

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Integer.parseInt(equation);
                mul = true;
                display = textView.getText().toString()+"*";
                updateScreen();
                equation = "";
            }
        });
        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = Integer.parseInt(equation);
                if(add){
                    display=firstNumber+secondNumber+"";
                    add=false;
                }
                if(sub){
                    display=firstNumber-secondNumber+"";
                    sub=false;
                }
                if(mul){
                    display=firstNumber*secondNumber+"";
                    mul=false;
                }
                if(div){
                    display=firstNumber/secondNumber+"";
                    div=false;
                }
                eq=true;
                equation="";
                updateScreen();
            }
        });


    }

}
