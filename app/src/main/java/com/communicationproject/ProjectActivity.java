package com.communicationproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.communicationproject.model.Card;

import java.util.ArrayList;

/**
 * Created by florianmalapel on 11/01/2017.
 */

public class ProjectActivity extends AppCompatActivity {

    private ViewPager viewPager = null;
    private ArrayList<Card> listCards = new ArrayList<>();
    private CustomAdapter customAdapter = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platine);
        findViewById();
        initialize();
    }

    private void initialize_array_projects(){
        listCards.add(new Card("Platine Zoo", "Réalisation d'une application mobile pour le Zoo de Lille",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-08-12-02-17.png?w=636&h=582",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-04-10-28-16.png?w=1400&h=&crop=1",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-04-10-28-21.png?w=1400&h=&crop=1",
                "https://www.youtube.com/watch?v=kw3_otUQWcA"
        ));
        listCards.add(new Card("Beer Hunter", "Avec cette application vous pourrez localiser précisément quel bar propose votre bière !",
                "https://2.bp.blogspot.com/-wII2uIxrI_Q/VrksWC-D3NI/AAAAAAAAAKo/fBdDzpGkNsA/s1600/1-1_Ecran_de_connexion.PNG",
                "https://1.bp.blogspot.com/-y0ZegCGRwps/VrksX_N9OsI/AAAAAAAAAK8/Dki1wUwLdu8/s1600/4-1_Map.PNG",
                "https://4.bp.blogspot.com/-TUEn2ACGRQk/VrksVLyOVYI/AAAAAAAAAKg/OQVDLOYcOXo/s1600/0_Side_Menu.PNG",
                "https://www.youtube.com/watch?v=kw3_otUQWcA"
        ));
        listCards.add(new Card("Beer Hunter", "Avec cette application vous pourrez localiser précisément quel bar propose votre bière !",
                "https://2.bp.blogspot.com/-wII2uIxrI_Q/VrksWC-D3NI/AAAAAAAAAKo/fBdDzpGkNsA/s1600/1-1_Ecran_de_connexion.PNG",
                "https://1.bp.blogspot.com/-y0ZegCGRwps/VrksX_N9OsI/AAAAAAAAAK8/Dki1wUwLdu8/s1600/4-1_Map.PNG",
                "https://4.bp.blogspot.com/-TUEn2ACGRQk/VrksVLyOVYI/AAAAAAAAAKg/OQVDLOYcOXo/s1600/0_Side_Menu.PNG",
                "https://youtu.be/c1I9bow_4pQ"
        ));
    }

    private void findViewById(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    private void initialize(){
        initialize_array_projects();
        customAdapter = new CustomAdapter(getSupportFragmentManager());
        viewPager.setAdapter(customAdapter);
    }

    public class CustomAdapter extends FragmentStatePagerAdapter {

        public CustomAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            ProjectFragment fragment = new ProjectFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(ProjectFragment.BUNDLE_ARGS_ID, listCards.get(position));
            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return listCards.size();
        }
    }
}
