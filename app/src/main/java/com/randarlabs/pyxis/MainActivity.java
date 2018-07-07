package com.randarlabs.pyxis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private boolean isPaused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Checks the current status of the player to allow the status to be changed to the opposite
     * status.
     * */
    @SuppressWarnings("all")
    void pausePlaySong(View view) {
        ImageButton pausePlayButton = (ImageButton) findViewById(R.id.playPauseImageButton);
        isPaused = isPaused ? playSong(pausePlayButton) : pauseSong(pausePlayButton);
    }

    /*
     * Plays the currently loaded song and sets an ImageButton to the paused button
     *
     * @param playButton the resource id of the button that will be changed
     * @return           if the song is paused
     * */
    private boolean playSong(ImageButton playButton) {
        //TODO Play the song
        playButton.setImageResource(android.R.drawable.ic_media_pause);
        return false;
    }

    /*
     * Pauses the currently loaded song and sets an ImageButton to the play button
     *
     * @param playButton the resource id of the button that will be changed
     * @return           if the song is paused
     * */
    private boolean pauseSong(ImageButton pauseButton) {
        //TODO Pause the song
        pauseButton.setImageResource(android.R.drawable.ic_media_play);
        return true;
    }
}
