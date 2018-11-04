package ucm.ac.mz.sociomatico;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements cultura.OnFragmentInteractionListener, curiosidades.OnFragmentInteractionListener, tecnologia.OnFragmentInteractionListener, fama.OnFragmentInteractionListener, desporto.OnFragmentInteractionListener ,economia.OnFragmentInteractionListener, politica.OnFragmentInteractionListener, categorias.OnFragmentInteractionListener, internacional.OnFragmentInteractionListener,sociedade.OnFragmentInteractionListener {


    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    MenuItem item1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);


        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TabLayout tb = findViewById(R.id.tablayout);

        tb.addTab(tb.newTab().setText("Novidades"));
        tb.addTab(tb.newTab().setText("Internacional"));
        tb.addTab(tb.newTab().setText("Sociedade"));
        tb.addTab(tb.newTab().setText("Politica"));
        tb.addTab(tb.newTab().setText("Economia"));
        tb.addTab(tb.newTab().setText("Desporto"));
        tb.addTab(tb.newTab().setText("Fama"));
        tb.addTab(tb.newTab().setText("tecnologia"));
        tb.addTab(tb.newTab().setText("Cultura"));
        tb.addTab(tb.newTab().setText("Curiosidades"));

        tb.setTabGravity(TabLayout.GRAVITY_FILL);
        tb.setTabMode(TabLayout.MODE_SCROLLABLE);


       final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
       final ucm.ac.mz.sociomatico.PagerAdapter adapter = new ucm.ac.mz.sociomatico.PagerAdapter(getSupportFragmentManager(),tb.getTabCount());

       viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb));


        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab){
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
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)){

            item1 = item;


            return super.onOptionsItemSelected(item);





        }


        return true;
    }



  public void metodo(MenuItem v){


      Toast.makeText(this,"batata",Toast.LENGTH_LONG).show();



      TabLayout tb = findViewById(R.id.tablayout);
      final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
      final ucm.ac.mz.sociomatico.PagerAdapter adapter = new ucm.ac.mz.sociomatico.PagerAdapter(getSupportFragmentManager(),tb.getTabCount());

      viewPager.setAdapter(adapter);
      viewPager.setCurrentItem(1);
      onOptionsItemSelected(item1);


  }





    @Override
    public void onFragmentInteraction(Uri uri) {




    }
}
