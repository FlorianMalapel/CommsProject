package com.communicationproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.communicationproject.model.Card;
import com.rd.PageIndicatorView;

import java.util.ArrayList;

/**
 * Created by florianmalapel on 11/01/2017.
 */

public class ProjectActivity extends AppCompatActivity {

    private ViewPager viewPager = null;
    private ArrayList<Card> listCards = new ArrayList<>();
    private CustomAdapter customAdapter = null;
    private PageIndicatorView pageIndicatorView = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platine);
        findViewById();
        initialize();
    }

    private void initialize_array_projects(){
        listCards.add(new Card("Platine Zoo", "Réalisation d'une application mobile pour le Zoo de Lille",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-04-10-28-16.png?w=1400&h=&crop=1",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-04-10-28-16.png?w=1400&h=&crop=1",
                "https://platinezoo.files.wordpress.com/2016/02/screenshot_2016-02-04-10-28-21.png?w=1400&h=&crop=1",
                "https://www.youtube.com/watch?v=kw3_otUQWcA"
        ));
        listCards.add(new Card("Where is my pet", "Une application web communautaire baptisée Wimp (Where is my pet ?) permettant aux personnes de signaler plus facilement un animal disparu ou découvert.",
                "https://1.bp.blogspot.com/-dY9J8uN5yOs/VryI3dbTmOI/AAAAAAAABC0/Q6WHRudkzmU/s1600/unnamed.png",
                "https://2.bp.blogspot.com/-G89LSTmI5oc/VryHT_0smOI/AAAAAAAABCg/vf05noKlGNg/s1600/02%2B-%2BFormulaire%2Bavis%2Bde%2Brecherche%2Bvide.png",
                "https://4.bp.blogspot.com/-_gg2aKxUTXM/VryHT2u5XKI/AAAAAAAABCo/KToGJp-X928/s1600/01%2B-%2BAccueil.png",
                "https://www.youtube.com/watch?v=9pglX6EAIRc"
        ));
        listCards.add(new Card("Nanny's Diary", "un projet qui va permettre aux nourrices de s'organiser plus facilement d'une part (surtout lorsqu'il y a beaucoup d'enfants à garder et à suivre) et aux parents de suivre les journées de leurs enfants sous une autre dimension grâce à toutes sortes de médias et de plus en temps réel ! ",
                "https://2.bp.blogspot.com/-ehCZUQVEcOs/VunGV6Ls4RI/AAAAAAAAAGw/hj_ao3f6dBAPG92DtZbf15y3MahJ-yV9Q/s1600/rythmes_mobile.jpg",
                "https://1.bp.blogspot.com/-vllalqUWIu4/VunGTTAfXgI/AAAAAAAAAGo/124OLtDa0p8ZMMXWCI8XFUY8Ew3zGMq3Q/s1600/infos_mobile.jpg",
                "https://2.bp.blogspot.com/-ehCZUQVEcOs/VunGV6Ls4RI/AAAAAAAAAGw/hj_ao3f6dBAPG92DtZbf15y3MahJ-yV9Q/s1600/rythmes_mobile.jpg",
                null
        ));
        listCards.add(new Card("OutGuess", "L'application reposera principalement sur un mode de jeu 2 joueurs, en différé. La partie se déroule en plusieurs manches. Chaque joueur a la main durant l'une des manches et choisit un thème. Chaque joueur doit trouver le mot correspondant et gagne un nombre de points suivant le temps qu'il a mis pour trouver. ",
                "http://1.bp.blogspot.com/-V6tKJNFc6Zc/Vp4IRPEjiCI/AAAAAAAAAHQ/fIFehmVOLu8/s1600/Screenshot_2016-01-19-10-48-46.png",
                "http://3.bp.blogspot.com/-mXsGPuMgVYI/Vp4IWn1KVkI/AAAAAAAAAHY/ynmfu-Y6CoM/s1600/Screenshot_2016-01-19-10-48-54.png",
                "http://1.bp.blogspot.com/-vZSMs3UiQYE/Vp4IeO7llFI/AAAAAAAAAHg/pLhUxMcnzS4/s1600/Screenshot_2016-01-19-10-49-11.png",
                null
        ));
    }

    private void findViewById(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        pageIndicatorView = (PageIndicatorView) findViewById(R.id.pageIndicatorView);
    }

    private void initialize(){
        initialize_array_projects();
        customAdapter = new CustomAdapter(getSupportFragmentManager());
        viewPager.setAdapter(customAdapter);
        pageIndicatorView.setViewPager(viewPager);
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
