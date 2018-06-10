package com.anurag.appphrases;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void french(View view) {

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.anurag.appphrases");

        MediaPlayer mediaplayer = MediaPlayer.create(this, resourceId);
        mediaplayer.start();

        Log.i("button tapped", String.valueOf(resourceId));

    }
}
