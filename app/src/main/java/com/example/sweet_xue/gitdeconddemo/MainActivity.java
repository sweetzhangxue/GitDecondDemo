package com.example.sweet_xue.gitdeconddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int type = WindowManager.LayoutParams.TYPE_BASE_APPLICATION;


        tv = findViewById(R.id.tv_main);
        tv.setText("this is textview");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                tv.setText("45444444444");

            }
        });
    }
}
