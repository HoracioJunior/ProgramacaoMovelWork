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
import android.widget.Switch;
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



 /* public void abrirCategoria(MenuItem v){




      TabLayout tb = findViewById(R.id.tablayout);
      final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
      final ucm.ac.mz.sociomatico.PagerAdapter adapter = new ucm.ac.mz.sociomatico.PagerAdapter(getSupportFragmentManager(),tb.getTabCount());


      switch (""+v.getTitle()){
          case "Internacional":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(1);
              onOptionsItemSelected(item1);
              break;

          case "Sociedade":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(2);
              onOptionsItemSelected(item1);
              break;

          case "Politica":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(3);
              onOptionsItemSelected(item1);
              break;

          case "Economia":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(4);
              onOptionsItemSelected(item1);
              break;

          case "Desporto":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(5);
              onOptionsItemSelected(item1);
              break;

          case "Fama":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(6);
              onOptionsItemSelected(item1);
              break;

          case "Tecnologias":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(7);
              onOptionsItemSelected(item1);
              break;

          case "Cultura":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(8);
              onOptionsItemSelected(item1);
              break;

          case "Curiosidades":
              viewPager.setAdapter(adapter);
              viewPager.setCurrentItem(9);
              onOptionsItemSelected(item1);
              break;

          case "Definicões":
              break;
      }


  }*/





    @Override
    public void onFragmentInteraction(Uri uri) {




    }

    public void brasil(MenuItem item) {
        Intent intent= new Intent(this, brasil.class);
        startActivity(intent);
    }

    public void china(MenuItem item) {
        Intent intent= new Intent(this, china.class);
        startActivity(intent);
    }

    public void asia(MenuItem item) {
        Intent intent= new Intent(this, asia.class);
        startActivity(intent);
    }

    public void africa(MenuItem item) {
        Intent intent= new Intent(this, africa.class);
        startActivity(intent);
    }

    public void futebol(MenuItem item) {
        Intent intent= new Intent(this, futebol.class);
        startActivity(intent);
    }

    public void automotivo(MenuItem item) {
        Intent intent= new Intent(this, automotivo.class);
        startActivity(intent);
    }

    public void basquete(MenuItem item) {
        Intent intent= new Intent(this, basquete.class);
        startActivity(intent);
    }

    public void boxe(MenuItem item) {
        Intent intent= new Intent(this,boxe.class);
        startActivity(intent);
    }

    public void medecina(MenuItem item) {
        Intent intent= new Intent(this, medecina.class);
        startActivity(intent);
    }

    public void moda(MenuItem item) {
        Intent intent= new Intent(this, moda.class);
        startActivity(intent);
    }

    public void artes(MenuItem item) {
        Intent intent= new Intent(this, artes.class);
        startActivity(intent);
    }

    public void definicoes(MenuItem item) {
        Intent intent= new Intent(this, Definicoes_activity.class);
        startActivity(intent);
    }

    public void curiosidades(MenuItem item) {
        Intent intent= new Intent(this, curiosidades.class);
        startActivity(intent);
    }

    public void fama(MenuItem item) {
        Intent intent= new Intent(this, fama.class);
        startActivity(intent);
    }

    public void economia(MenuItem item) {
        Intent intent= new Intent(this, economia.class);
        startActivity(intent);
    }

    public void politica(MenuItem item) {
        Intent intent= new Intent(this, politica.class);
        startActivity(intent);
    }

    public void sociedade(MenuItem item) {
        Intent intent= new Intent(this, sociedade.class);
        startActivity(intent);
    }
}
