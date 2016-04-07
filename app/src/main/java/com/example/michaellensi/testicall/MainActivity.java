package com.example.michaellensi.testicall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tView = (TextView) this.findViewById(R.id.txtvw_HelloWorld);
        tView.setText("HELLOOOOOOO WORLD I AM IN YOU! (v1.0.3)");
        tView.setText("We should be branchin', yeah!");
        tView.setText("We ARE branching!");
        tView.setText("This is an uncommitted change");
        tView.setText("Just kidding it is committed now.  This one too.");
    }
}
