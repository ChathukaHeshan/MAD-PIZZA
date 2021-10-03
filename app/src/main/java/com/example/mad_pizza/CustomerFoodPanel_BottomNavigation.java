package com.example.mad_pizza;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mad_pizza.CustomerFoodPanel.CustomerCartFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerHomeFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerOrderFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerProfileFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerTrackFragment;


import com.example.mad_pizza.CustomerFoodPanel.CustomerCartFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerHomeFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerOrderFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerProfileFragment;
import com.example.mad_pizza.CustomerFoodPanel.CustomerTrackFragment;
import com.example.mad_pizza.SendNotification.Token;

import com.example.mad_pizza.SendNotification.Token;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.iid.FirebaseInstanceId;

public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

    }



    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.Home:
                fragment = new CustomerHomeFragment();
                break;


            case R.id.Cart:
                fragment = new CustomerCartFragment();
                break;

            case R.id.Order:
                fragment = new CustomerOrderFragment();
                break;

            case R.id.Track:
                fragment = new CustomerTrackFragment();
                break;

            case R.id.Profile:
                fragment = new CustomerProfileFragment();
                break;

        }
        return loadFragment(fragment);
    }
}
