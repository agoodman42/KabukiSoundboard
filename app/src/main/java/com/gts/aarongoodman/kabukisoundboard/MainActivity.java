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

import static com.gts.aarongoodman.kabukisoundboard.R.attr.colorAccent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AudioPlayer AudioPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TitleText = (TextView) findViewById(R.id.titleTextView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Shojumaru_Regular.ttf");


        TitleText.setTypeface(custom_font);
        TitleText.setTextColor(Color.RED);

        final MediaPlayer mp = new MediaPlayer();

        Button yo = (Button) findViewById(R.id.yoooButton);
        yo.setOnClickListener(this);
        Button taiko = (Button) findViewById(R.id.taikoButton);
        taiko.setOnClickListener(this);
        Button flute = (Button) findViewById(R.id.fluteButton);
        flute.setOnClickListener(this);
        Button pylons = (Button) findViewById(R.id.clearButton);
        pylons.setOnClickListener(this);
        Button tsuzumi = (Button) findViewById(R.id.tsuzumiButton);
        tsuzumi.setOnClickListener(this);
        ImageButton kabuki = (ImageButton) findViewById(R.id.kabukiImageButton);
        kabuki.setOnClickListener(this);
        Button stop = (Button) findViewById(R.id.stopButton);
        stop.setOnClickListener(this);
        AudioPlayer = new AudioPlayer();
    }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.yoooButton:
                    AudioPlayer.playAudio("yooo.wav",getApplicationContext());
                    break;
                case R.id.taikoButton:
                    AudioPlayer.playAudio("taiko.mp3",getApplicationContext());
                    break;
                case R.id.fluteButton:
                    AudioPlayer.playAudio("fluteSong.wav",getApplicationContext());
                    break;
                case R.id.kabukiImageButton:
                    AudioPlayer.playAudio("kabuki.wav",getApplicationContext());
                    break;
                case R.id.tsuzumiButton:
                    AudioPlayer.playAudio("tsuzumi.wav",getApplicationContext());
                    break;
                case R.id.clearButton:
                    AudioPlayer.playAudio("pylons.mp3",getApplicationContext());
                    break;
                case R.id.stopButton:
                    AudioPlayer.stopAudio();
                    break;
                default:
                    break;

            }
        }
}
