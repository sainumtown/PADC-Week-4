package xz.sainumtown.week_4_execrise.acitivities;

import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import xz.sainumtown.week_4_execrise.R;
import xz.sainumtown.week_4_execrise.fragments.BookFragment;
import xz.sainumtown.week_4_execrise.fragments.JobSearchFragment;
import xz.sainumtown.week_4_execrise.fragments.LinkedInFragment;
import xz.sainumtown.week_4_execrise.fragments.MovieFragment;
import xz.sainumtown.week_4_execrise.fragments.PulseFragment;
import xz.sainumtown.week_4_execrise.utils.MMFontUtils;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        }

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvTitle.setText(getResources().getText(R.string.left_menu_linkIn));

        if (savedInstanceState == null) {
            LinkedInFragment fragment = LinkedInFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();
        tvTitle = (TextView) findViewById(R.id.tv_title);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.left_menu_linkIn:
                        LinkedInFragment linkedInFragment = LinkedInFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, linkedInFragment)
                                .commit();

                        tvTitle.setText(getResources().getText(R.string.left_menu_linkIn));
                        break;
                    case R.id.left_menu_jobSearch:
                        JobSearchFragment jobSearchFragment = JobSearchFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, jobSearchFragment)
                                .commit();
                        tvTitle.setText(getResources().getText(R.string.left_menu_jobSearch));
                        break;
                    case R.id.left_menu_pulse:
                        PulseFragment pulseFragment = PulseFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, pulseFragment)
                                .commit();
                        tvTitle.setText(getResources().getText(R.string.left_menu_pulse));
                        break;
                    case R.id.left_menu_movie:
                        MovieFragment movieFragment = MovieFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, movieFragment)
                                .commit();
                        tvTitle.setText(getResources().getText(R.string.left_menu_movie));
                        break;
                    case R.id.left_menu_book:
                        BookFragment bookFragment = BookFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, bookFragment)
                                .commit();
                        tvTitle.setText(getResources().getText(R.string.left_menu_book));
                        break;
                }
            }
        }, 100); //to close drawer smoothly.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}