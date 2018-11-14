package com.example.digital.proyectointegrador;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity  {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.DrawerLayout);

        IndexFragment indexFragment = new IndexFragment();

        pegarFragment(new IndexFragment());




navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();


        switch (item.getItemId()){
            case R.id.itemRecetas:

                pegarFragment(new RecetasFragment());

                break;

            case R.id.itemRecetasAboutUss:
          pegarFragment(new AboutUsFragment());




        }
        drawerLayout.closeDrawers();




        return true;
    }
});
    }


    public void pegarFragment(Fragment fragment) {

        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.contenedor,fragment);

        transaction.addToBackStack(null);

        transaction.commit();


    }



    };



