package egaakakom.gmail.com.akakomstmik;

import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class JurusanActivity extends AppCompatActivity implements TiFragment.OnFragmentInteractionListener,SiFragment.OnFragmentInteractionListener, MiFragment.OnFragmentInteractionListener, TkFragment.OnFragmentInteractionListener, KaFragment.OnFragmentInteractionListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurusan);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("TI"));
        tabLayout.addTab(tabLayout.newTab().setText("SI"));
        tabLayout.addTab(tabLayout.newTab().setText("MI"));
        tabLayout.addTab(tabLayout.newTab().setText("TK"));
        tabLayout.addTab(tabLayout.newTab().setText("KA"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter2 adapter2 = new PagerAdapter2(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter2);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
