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
        tView.setText("I am about to commit on me new bronch mon.");
        tView.setText("First change after merge.");
    }
}
