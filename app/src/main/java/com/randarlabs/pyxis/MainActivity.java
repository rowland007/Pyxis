package com.randarlabs.pyxis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    boolean isPaused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    *Plays or pauses the song depending on the current state. The image button is switched to the
    * opposite state. For example, if the song is currently playing, then the image button is set to
    * pause and if the song is currently paused, then the image button is set to play.
    * */
    @SuppressWarnings("all")
    void pausePlaySong(View view) {
        ImageButton pausePlay = (ImageButton) findViewById(R.id.playPauseImageButton);
        if (isPaused) {
            //TODO Play the song
            pausePlay.setImageResource(android.R.drawable.ic_media_pause);
            isPaused = false;
        } else {
            //TODO Pause the song
            pausePlay.setImageResource(android.R.drawable.ic_media_play);
            isPaused = true;
        }
    }
}
