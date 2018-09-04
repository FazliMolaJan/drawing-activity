package com.mrgames13.jimdo.drawingactivityexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mrgames13.jimdo.drawingactivity.DrawingActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button open_drawing_activity = findViewById(R.id.open_drawing_activity);
        open_drawing_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DrawingActivity.class));
            }
        });
    }
}
