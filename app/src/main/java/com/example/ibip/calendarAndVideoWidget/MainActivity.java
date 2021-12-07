package com.example.ibip.calendarAndVideoWidget;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {
    private static final String VIDEO = "video";
    private static final String VIDEO_INTERNET ="https://player.vimeo.com/external/592772975.sd.mp4?s=" +
            "1ace120228a4ecb52f623fb714b52ffb1339fac8&profile_id=165&oauth2_token_id=57447761";
    VideoView vv;
    TextView tf;
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendarandvideo_widget_activity);
        vv = (VideoView) findViewById(R.id.videoView);
        calendar = (CalendarView) findViewById(R.id.calendarView);
        tf = (TextView) findViewById(R.id.textFecha);
        CalendarView.OnDateChangeListener odcl = new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                String chosenDate = dayOfMonth + "-" + (month + 1) + "-" + year;
                tf.setText(chosenDate);
            }
        };
        calendar.setOnDateChangeListener(odcl);
    }

    public void inicializarVideo(View view) {
        MediaController control = new MediaController(this);
        control.setMediaPlayer(vv);
        vv.setMediaController(control);
        Uri videoUri = getMedia(VIDEO);
        vv.setVideoURI(videoUri);

        vv.start();
    }

    private Uri getMediaUrl(String mediaName){
        return Uri.parse(mediaName);
    }
    public void inicializarInternetVideo(View view) {
        MediaController control = new MediaController(this);
        control.setMediaPlayer(vv);
        vv.setMediaController(control);
        Uri videoUri = getMediaUrl(VIDEO_INTERNET);
        vv.setVideoURI(videoUri);
        vv.start();
    }



    public Uri getMedia(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() + "/raw/" + mediaName);
    }

    public void dejarVideo() {
        vv.stopPlayback();
    }

    @Override

    protected void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            vv.pause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        dejarVideo();
    }
}