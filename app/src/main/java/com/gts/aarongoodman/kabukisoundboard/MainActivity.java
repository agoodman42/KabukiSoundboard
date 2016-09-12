package com.gts.aarongoodman.kabukisoundboard;

import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TitleText = (TextView)findViewById(R.id.titleTextView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Shojumaru_Regular.ttf");

        TitleText.setTypeface(custom_font);
        TitleText.setTextColor(Color.RED);

        final MediaPlayer mp = new MediaPlayer();

        Button yo = (Button) findViewById(R.id.yoooButton);
        Button taiko = (Button) findViewById(R.id.taikoButton);
        Button flute = (Button) findViewById(R.id.fluteButton);
        //Button pylons = (Button) findViewById(R.id.pylonButton);
        Button tsuzumi = (Button) findViewById(R.id.tsuzumiButton);
        ImageButton kabuki = (ImageButton) findViewById(R.id.kabukiImageButton);


        yo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AudioPlayer.playAudio("yooo.wav",getApplicationContext());

            }
        });
        taiko.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AudioPlayer.playAudio("taiko.mp3",getApplicationContext());

            }
        });
        flute.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AudioPlayer.playAudio("fluteSong.wav",getApplicationContext());

            }
        });
        tsuzumi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AudioPlayer.playAudio("tsuzumi.wav",getApplicationContext());

            }
        });
        kabuki.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AudioPlayer.playAudio("kabuki.wav",getApplicationContext());

            }
        });



    }
}
