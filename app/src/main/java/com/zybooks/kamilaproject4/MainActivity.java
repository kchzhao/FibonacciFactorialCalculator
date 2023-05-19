//Kamila Chzhao
//Sources:
//https://www.baeldung.com/java-calculate-factorial

package com.zybooks.kamilaproject4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "MainActivity";
    private EditText inputEditText;
    private TextView resultTextView;
    private View view;
    private Button calculateBtn;
    private Menu mMenu;
    BottomNavigationView bottomNavigationView;
//    FactorialFragment factorialFragment = new FactorialFragment();
//    FibonacciFragment fibonacciFragment = new FibonacciFragment();
//    HomeFragment homeFragment = new HomeFragment();
//    Fragment fragmentFib = getFragmentManager().findFragmentById(R.id.fibonacciFragment);
//    Fragment fragmentFac = getFragmentManager().findFragmentById(R.id.factorialFragment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.homeFragment, R.id.factorialFragment, R.id.fibonacciFragment)
                    .build();
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
            NavigationUI.setupWithNavController(bottomNavigationView, navController);
        }

    }

    }










