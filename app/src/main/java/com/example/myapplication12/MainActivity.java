package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button   mButton;
    EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.convert);
        mEdit   = (EditText)findViewById(R.id.input);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        final TextView textViewToChange = (TextView) findViewById(R.id.result);
                        String strDecimal =  mEdit.getText().toString();
                        int decimal = Integer.parseInt(strDecimal);
                        String converted = Integer.toBinaryString(decimal);
                        textViewToChange.setText(converted);
                    }
                });
    }
}
