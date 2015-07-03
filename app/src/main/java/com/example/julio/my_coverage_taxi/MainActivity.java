package com.example.julio.my_coverage_taxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {

    public final int MINIMUM = 1;
    public final int MAXIMUM = 3;

    public TextView valueText;
    public Integer value;

    Button btnDecrement;
    Button btnIncrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_segundo);


        btnDecrement = (Button) findViewById(R.id.button1);
        btnIncrement = (Button) findViewById(R.id.button2);
        valueText = (TextView) findViewById(R.id.textView1);

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();

            }
        });

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });


    }

    public void increment(){
        if( value < MAXIMUM ){
            value = value + 1;
            valueText.setText( value.toString() );
        }
    }

    public void decrement(){
        if( value > MINIMUM ){
            value = value - 1;
            valueText.setText( value.toString() );
        }
    }

    public int getValue(){
        value = Integer.valueOf(valueText.getText().toString());
        return value;
    }

    public void setValue( int value ){
        if( value > MAXIMUM ) value = MAXIMUM;
        if( value >= 0 ){
            this.value = value;
            valueText.setText( this.value.toString() );
        }
    }
}
