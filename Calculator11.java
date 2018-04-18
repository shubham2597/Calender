package org.terna.calender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator11 extends AppCompatActivity {

    TextView tv;
    EditText edit;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,multiply,divide,clear,dot,equal;

    float valueone,valueto;

    boolean madd,msub,mmul,mdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator11);

        tv = (TextView) findViewById(R.id.tv);

        edit = (EditText) findViewById(R.id.edit);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.clear);


    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            edit.setText(edit.getText()+"1");
        }
    });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText(edit.getText()+".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit==null){
                    edit.setText("");
                }
                else{

                valueone=Float.parseFloat(edit.getText()+"");
                    madd=true;
                    edit.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit==null){
                    edit.setText("");
                }
                else{

                    valueone=Float.parseFloat(edit.getText()+"");
                    msub=true;
                    edit.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit==null){
                    edit.setText("");
                }
                else{

                    valueone=Float.parseFloat(edit.getText()+"");
                    mmul=true;
                    edit.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit==null){
                    edit.setText("");
                }
                else{

                    valueone=Float.parseFloat(edit.getText()+"");
                    mdiv=true;
                    edit.setText(null);
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetwo=Float.parseFloat(edit.getText()+"");

                if(madd==true){
                    edit.setText(valueone + valueto+"");
                    madd=false;
                }
                if(msub==true){
                    edit.setText(valueone - valueto+"");
                    msub=false;
                }
                if(mmul==true){
                    edit.setText(valueone * valueto+"");
                    mmul=false;
                }
                if(mdiv ==true){
                    edit.setText(valueone / valueto+"");
                    mdiv=false;
                }

            }
        });

    }
}
