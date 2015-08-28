package com.amineghabi.blurredplayerview;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.amineghabi.library.BlurredPlayerView;
import com.amineghabi.library.OnActionClickedListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Amin Ghabi on 10/08/15.
 */
public class BlurredActivity extends Activity implements OnActionClickedListener {

    private MediaPlayer mediaPlayer;
    @Bind(R.id.bpv)
    BlurredPlayerView bpv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);

        mediaPlayer = MediaPlayer.create(this, R.raw.in_your_eyes);

        bpv.setMax(123);
        bpv.setProgress(12);
        bpv.setOnActionClickedListener(this);


        final ImageView control = (ImageView) findViewById(R.id.control);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bpv.isPlaying()) {
                    bpv.start();
                    mediaPlayer.start();
                    control.setBackgroundResource(R.drawable.pause);
                } else {
                    bpv.stop();
                    mediaPlayer.pause();
                    control.setBackgroundResource(R.drawable.play);
                }
            }
        });
    }

    @Override
    public void onActionClicked(int id) {
        switch (id) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
