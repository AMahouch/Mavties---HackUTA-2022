package com.example.mavtieshome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mavtieshome.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    boolean missionClicked = false;
    boolean visionClicked = false;
    boolean valuesClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_contact_us);
        setTitle("Mavties Home");
//
//        BottomNavigationView btnNav = findViewById((R.id.bottomNavigationView));
//        btnNav.setOnNavigationItemSelectedListener(navListener);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            switch(item.getItemId()) {
//                case R.id.home:
//                    replaceFragment(new HomeFragment());
//                    break;
//
//                case R.id.findMavties:
//                    replaceFragment(new FindMavtiesFragment());
//                    break;
//
//                case R.id.contactUs:
//                    replaceFragment(new ContactUsFragment());
//                    break;
//            }
//
//
//            return true;
//        });


    }

//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.commit();
//    }


    public void openMission(View v) {

        View myView = findViewById(R.id.MissionButton);

        if(missionClicked == false) { //show textview

            missionClicked = true;

            Button button = (Button) myView;
            button.setText(getString((R.string.empty)));

            TextView text = findViewById(R.id.missionTextView);
            text.setVisibility(View.VISIBLE);



        } else {  //redact textview

            missionClicked = false;

            Button button = (Button) myView;
            String s = getString(R.string.button1);
            button.setText(s);

            TextView text = findViewById(R.id.missionTextView);
            text.setVisibility(View.INVISIBLE);


        }




    }
    public void openVision(View v) {
        View myView = findViewById(R.id.VisionButton);

        if(visionClicked == false) { //show textview

            visionClicked = true;

            Button button = (Button) myView;
            button.setText(getString((R.string.empty)));

            TextView text = findViewById(R.id.visionTextView);
            text.setVisibility(View.VISIBLE);

        } else {  //redact textview

            visionClicked = false;

            Button button = (Button) myView;
            String s = getString(R.string.button2);
            button.setText(s);

            TextView text = findViewById(R.id.visionTextView);
            text.setVisibility(View.INVISIBLE);


        }

    }
    public void openValues(View v) {
        View myView = findViewById(R.id.ValuesButton);

        if(valuesClicked == false) { //show textview

            valuesClicked = true;

            Button button = (Button) myView;
            button.setText(getString((R.string.empty)));

            TextView text = findViewById(R.id.valuesTextView);
            text.setVisibility(View.VISIBLE);

        } else {  //redact textview

            valuesClicked = false;

            Button button = (Button) myView;
            String s = getString(R.string.button3);
            button.setText(s);

            TextView text = findViewById(R.id.valuesTextView);
            text.setVisibility(View.INVISIBLE);


        }

    }

//    public void handleText(View v) {
//        TextView t = findViewById(R.id.source);
//        String s = t.getText().toString();
//
//        Log.d("info", s);
//        ((TextView)findViewById(R.id.textToChange)).setText(s);
//
//    }

//    public void launchSettings(View v) {
//        Intent i = new Intent(this, SettingsActivity.class);
//        startActivity(i);
//    }

//    public void disable(View v) {
//        View myView = findViewById(R.id.button3);
//        myView.setEnabled(false);
//
//        Button button = (Button) myView;
//        button.setText("New disabled");


//        v.setEnabled(false);
//        Button b = (Button) v;
//
//        b.setText("Clicked!");
//        b.setBackgroundColor(Color.RED);
//        Log.d("success", "Button disabled");

    }
