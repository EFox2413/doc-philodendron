package be.maartendecat.gunterd;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class InfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView t = (TextView) findViewById(R.id.text_info);
        t.setText(Html
                .fromHtml("This app is created by<br/><br/>"
                        + "<a href=\"https://github.com/EFox2413\">Elliot Fox</a><br/><br/><br/>"
                        + "This app is based on "
                        + "<a href=\"http://maartendecat.be\">Maarten Decat</a>" +
                        "'s app"
                        + "<br/><br/>"
                        + "<a href=\"https://github.com/maartendecat/gunther-d-botsauto-soundboard-app\">Gunter D. Botsauto Soundboard</a><br/><br/><br/>"
                        + "This app is created for entertainment purposes only. All rights to the sounds used belong to<br/><br/>"
                        + "<a href=\"http://www.dhamma.org\">The Dharma Organization</a>"));
        t.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

}
