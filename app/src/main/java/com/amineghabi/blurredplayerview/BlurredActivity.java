package com.amineghabi.blurredplayerview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.amineghabi.library.BlurredPlayerView;
import com.amineghabi.library.OnActionClickedListener;

/**
 * Created by Amin Ghabi on 10/08/15.
 */
public class BlurredActivity extends Activity implements OnActionClickedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final BlurredPlayerView ipv = (BlurredPlayerView) findViewById(R.id.ipv);
        ipv.setMax(123);
        ipv.setProgress(78);
        ipv.setOnActionClickedListener(this);


        final ImageView control = (ImageView) findViewById(R.id.control);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ipv.isPlaying()){
                    ipv.start();
                    control.setBackgroundResource(R.drawable.pause);
                }
                else{
                    ipv.stop();
                    control.setBackgroundResource(R.drawable.play);
                }
            }
        });
    }

    @Override
    public void onActionClicked(int id) {
        switch (id){
            case 1:
                //Called when 1. action is clicked.
                break;
            case 2:
                //Called when 2. action is clicked.
                break;
            case 3:
                //Called when 3. action is clicked.
                break;
            default:
                break;
        }
    }
}
