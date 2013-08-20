package be.maartendecat.gunterd;

import java.util.ArrayList;
import java.util.Collection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/audiowide/Audiowide-Regular.ttf");
        Collection<Button> btns = new ArrayList<Button>();
        btns.add((Button) findViewById(R.id.ButtonAnichaa));
        btns.add((Button) findViewById(R.id.ButtonBanaan));
        btns.add((Button) findViewById(R.id.ButtonBotsen));
        btns.add((Button) findViewById(R.id.ButtonAlert));
        btns.add((Button) findViewById(R.id.ButtonPatiently));
        btns.add((Button) findViewById(R.id.ButtonJaaaaa));
        btns.add((Button) findViewById(R.id.ButtonMoving));
        btns.add((Button) findViewById(R.id.ButtonStart));
        btns.add((Button) findViewById(R.id.ButtonWinnaar));
        btns.add((Button) findViewById(R.id.ButtonEquanimous));
        for(Button btn: btns) {
            btn.setTypeface(tf);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_info:
                Intent i = new Intent(this, InfoActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void playStart(View view) {
        play(R.raw.start);
    }

    public void playEquanimous(View view) {
        play(R.raw.equanimous);
    }

    public void playAnichaa(View view) {
        play(R.raw.anichaa);
    }

    public void playPatiently(View view) {
        play(R.raw.patiently);
    }

    public void playMoving(View view) {
        play(R.raw.keepmoving);
    }

    public void playAlert(View view) {
        play(R.raw.veryalert);
    }

    public void playAlweerEenWinnaar(View view) {
        play(R.raw.alweereenwinnaar);
    }

    public void playGaanMetDieBanaan(View view) {
        play(R.raw.banaan);
    }

    public void playJa(View view) {
        play(R.raw.jaaaa);
    }

    public void playEensBotsen(View view) {
        play(R.raw.schatje);
    }

    protected void play(int resid) {
        //		if (mp != null) {
        //			if (mp.isPlaying()) {
        //				mp.stop();
        //			}
        //			mp.reset();
        //			mp.release();
        //		}
        mp = MediaPlayer.create(this, resid);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }

        });
        mp.start();
    }

}
