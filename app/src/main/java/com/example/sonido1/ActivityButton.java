package com.example.sonido1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.*;

public class ActivityButton extends AppCompatActivity {
    ImageButton curi,pren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        curi=(ImageButton)findViewById(R.id.curioso);
        pren=(ImageButton)findViewById(R.id.prende);

        curi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityButton.this, R.raw.curio);
                mp.start();

            }
        });

        pren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityButton.this, R.raw.pren);
                mp.start();
            }
        });
    }

    public void curioso(View view) {
        Toast.makeText(this,"No les parece eso curioso", LENGTH_LONG).show();
    }

    public void prende(View view) {

        Toast.makeText(this,"Eso me prende", LENGTH_LONG).show();
    }
}
