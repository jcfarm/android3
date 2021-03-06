package com.bignerdranch.android.farmcamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.VideoView;

public class CameraActivity extends AppCompatActivity {

    Button playButton ;
    VideoView videoView ;
    EditText rtspUrl ;
    RadioButton radioStream;
    RadioButton radioFile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        rtspUrl = (EditText)this.findViewById(R.id.url);
        playButton = (Button)this.findViewById(R.id.start_play);
        radioStream = (RadioButton)this.findViewById(R.id.radioButtonStream);
        radioFile = (RadioButton)this.findViewById(R.id.radioButtonFile);

        playButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                if (radioStream.isChecked()) {
                    PlayRtspStream(rtspUrl.getEditableText().toString());
                }
                else if (radioFile.isChecked()){
                    PlayLocalFile(rtspUrl.getEditableText().toString());
                }
            }
        });

        videoView = (VideoView)this.findViewById(R.id.rtsp_player);

    }

    //play rtsp stream
    private void PlayRtspStream(String rtspUrl){
        videoView.setVideoURI(Uri.parse(rtspUrl));
        videoView.requestFocus();
        videoView.start();
    }

    //play rtsp stream
    private void PlayLocalFile(String filePath){
        videoView.setVideoPath(Environment.getExternalStorageDirectory() + "/" + filePath);
        videoView.requestFocus();
        videoView.start();
    }
}
