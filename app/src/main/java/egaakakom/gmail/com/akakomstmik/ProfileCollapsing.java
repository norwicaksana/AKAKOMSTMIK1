package egaakakom.gmail.com.akakomstmik;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import static egaakakom.gmail.com.akakomstmik.R.id.collapsing_toolbar;
import static egaakakom.gmail.com.akakomstmik.R.id.toolbar_profile;

/**
 * Created by Hafizh Herdi on 8/11/2015 www.twoh.co
 */
public class ProfileCollapsing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);

        Toolbar toolbar = (Toolbar) findViewById(toolbar_profile);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Dicoding");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));

    }
}