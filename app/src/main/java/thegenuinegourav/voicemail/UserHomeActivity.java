package thegenuinegourav.voicemail;

import android.content.Intent;
import android.media.MediaPlayer;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class UserHomeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView inboxView, composeView, userView, sentView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        inboxView = (CardView) findViewById(R.id.inboxViewId);
        composeView = (CardView) findViewById(R.id.composeViewId);
        sentView = (CardView) findViewById(R.id.sentViewId);
        userView = (CardView) findViewById(R.id.userViewId);

        inboxView.setOnClickListener(this);
        composeView.setOnClickListener(this);
        sentView.setOnClickListener(this);
        userView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent;
        switch (v.getId())
        {
            case R.id.inboxViewId:
            {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.urininbox);
                intent=new Intent(this,InboxActivity.class);
                startActivity(intent);
                mp.start();
                break;
            }
            case R.id.composeViewId:
            {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.urincompose);
                intent=new Intent(this,MainActivity.class);
               startActivity(intent);
                mp.start();
                break;
            }
            case R.id.sentViewId:
            {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.urinsent);
                intent=new Intent(this,SendMail.class);
                startActivity(intent);
                mp.start();
                break;
            }
            case R.id.userViewId:
            {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.urinuser);
                intent=new Intent(this,UserActivity.class);
                startActivity(intent);
                mp.start();
                break;
            }

        }
    }
}