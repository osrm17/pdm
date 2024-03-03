package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        TextView dibujo = findViewById(R.id.dibujo);
        String tux =
                "        .--.\n" +
                "       |o_o |\n" +
                "       |:_/ |\n" +
                "      //   \\ \\\n" +
                "     (|     | )\n" +
                "    /'\\_   _/`\\\n" +
                "    \\___)=(___/\n";
        dibujo.setText(tux);*/
    }
}