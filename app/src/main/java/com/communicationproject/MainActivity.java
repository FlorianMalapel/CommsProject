package com.communicationproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.communicationproject.views.FlipLayout;
import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FlipLayout flipLayout_TopCard = null;
    private FlipLayout flipLayout_SecondLineLeftCard = null;
    private FlipLayout flipLayout_SecondLineCenterCard = null;
    private FlipLayout flipLayout_SecondLineRightCard = null;
    private FlipLayout flipLayout_ThirdLineLeftCard = null;
    private FlipLayout flipLayout_ThirdLineRightCard = null;

//    private TextView textView_titleTopCardFront = null;
    private TextView textView_titleTopCardBack = null;
    private TextView textView_titleSecondLineLeftCardBack = null;
    private TextView textView_titleSecondLineCenterCardBack = null;
    private TextView textView_titleSecondLineRightCardBack = null;
    private TextView textView_titleThirdLineLeftCardBack = null;
    private TextView textView_titleThirdLineRightCardBack = null;
    private TextView textView_titleLastLineCardBack = null;

    private Button button_moreInfo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        findViewById();
        initViews();
//        loadPage("http://pod.univ-lille1.fr/video/2869-mobilit/");
    }

    private void findViewById(){
        flipLayout_TopCard = (FlipLayout) findViewById(R.id.flipLayout_top);
        flipLayout_SecondLineLeftCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineLeftCard);
        flipLayout_SecondLineRightCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineRightCard);
        flipLayout_SecondLineCenterCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineCenterCard);
        flipLayout_ThirdLineLeftCard = (FlipLayout) findViewById(R.id.flipLayout_ThirdLineLeftCard);
        flipLayout_ThirdLineRightCard = (FlipLayout) findViewById(R.id.flipLayout_ThirdLineRightCard);

//        textView_titleTopCardFront = (TextView) findViewById(R.id.textView_titleTopCardFront);
        textView_titleTopCardBack = (TextView) findViewById(R.id.textView_titleTopCardBack);
        textView_titleSecondLineLeftCardBack = (TextView) findViewById(R.id.textView_titleSecondLineLeftCardBack);
        textView_titleSecondLineCenterCardBack = (TextView) findViewById(R.id.textView_titleSecondLineCenterCardBack);
        textView_titleSecondLineRightCardBack = (TextView) findViewById(R.id.textView_titleSecondLineRightCardBack);
        textView_titleThirdLineLeftCardBack = (TextView) findViewById(R.id.textView_titleThirdLineLeftCardBack);
        textView_titleThirdLineRightCardBack = (TextView) findViewById(R.id.textView_titleThirdLineRightCardBack);
        textView_titleLastLineCardBack = (TextView) findViewById(R.id.textView_titleLastLineCardBack);

        button_moreInfo = (Button) findViewById(R.id.button_moreInfo);
    }

    private void initViews(){
//        setTextToTextView(textView_titleTopCardFront, getString(R.string.top_card_front));
        setTextToTextView(textView_titleTopCardBack, getString(R.string.top_card_back));
        setTextToTextView(textView_titleSecondLineLeftCardBack, getString(R.string.second_line_left_card_back));
        setTextToTextView(textView_titleSecondLineCenterCardBack, getString(R.string.second_line_center_card_back));
        setTextToTextView(textView_titleSecondLineRightCardBack, getString(R.string.second_line_right_card_back));
        setTextToTextView(textView_titleThirdLineLeftCardBack, getString(R.string.third_line_left_card_back));
        setTextToTextView(textView_titleThirdLineRightCardBack, getString(R.string.third_line_right_card_back));
        setTextToTextView(textView_titleLastLineCardBack, getString(R.string.last_line_card_back));

        button_moreInfo.setOnClickListener(this);
    }

    private void loadPage(String url){
        new FinestWebView.Builder(this).show(url);
    }

    private void setTextToTextView(TextView textView, String text){
        textView.setText(text);
    }

    @Override
    public void onClick(View view) {
        if(view == button_moreInfo){
            Intent intent = new Intent(this, ProjectActivity.class);
            startActivity(intent);
        }
    }
}
