package com.communicationproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.communicationproject.views.FlipLayout;

public class MainActivity extends AppCompatActivity {

    private FlipLayout flipLayout_TopCard = null;
    private FlipLayout flipLayout_SecondLineLeftCard = null;
    private FlipLayout flipLayout_SecondLineCenterCard = null;
    private FlipLayout flipLayout_SecondLineRightCard = null;
    private FlipLayout flipLayout_ThirdLineLeftCard = null;
    private FlipLayout flipLayout_ThirdLineRightCard = null;

    private TextView textView_titleTopCardFront = null;
    private TextView textView_titleTopCardBack = null;
//    private TextView textView_titleSecondLineLeftCardFront = null;
    private TextView textView_titleSecondLineLeftCardBack = null;
//    private TextView textView_titleSecondLineCenterCardFront = null;
    private TextView textView_titleSecondLineCenterCardBack = null;
//    private TextView textView_titleSecondLineRightCardFront = null;
    private TextView textView_titleSecondLineRightCardBack = null;
//    private TextView textView_titleThirdLineLeftCardFront = null;
    private TextView textView_titleThirdLineLeftCardBack = null;
//    private TextView textView_titleThirdLineRightCardFront = null;
    private TextView textView_titleThirdLineRightCardBack = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        findViewById();
        initViews();
    }

    private void findViewById(){
        flipLayout_TopCard = (FlipLayout) findViewById(R.id.flipLayout_top);
        flipLayout_SecondLineLeftCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineLeftCard);
        flipLayout_SecondLineRightCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineRightCard);
        flipLayout_SecondLineCenterCard = (FlipLayout) findViewById(R.id.flipLayout_SecondLineCenterCard);
        flipLayout_ThirdLineLeftCard = (FlipLayout) findViewById(R.id.flipLayout_ThirdLineLeftCard);
        flipLayout_ThirdLineRightCard = (FlipLayout) findViewById(R.id.flipLayout_ThirdLineRightCard);

        textView_titleTopCardFront = (TextView) findViewById(R.id.textView_titleTopCardFront);
        textView_titleTopCardBack = (TextView) findViewById(R.id.textView_titleTopCardBack);
//        textView_titleSecondLineLeftCardFront = (TextView) findViewById(R.id.textView_titleSecondLineLeftCardFront);
        textView_titleSecondLineLeftCardBack = (TextView) findViewById(R.id.textView_titleSecondLineLeftCardBack);
//        textView_titleSecondLineCenterCardFront = (TextView) findViewById(R.id.textView_titleSecondLineCenterCardFront);
        textView_titleSecondLineCenterCardBack = (TextView) findViewById(R.id.textView_titleSecondLineCenterCardBack);
//        textView_titleSecondLineRightCardFront = (TextView) findViewById(R.id.textView_titleSecondLineRightCardFront);
        textView_titleSecondLineRightCardBack = (TextView) findViewById(R.id.textView_titleSecondLineRightCardBack);
//        textView_titleThirdLineLeftCardFront = (TextView) findViewById(R.id.textView_titleThirdLineLeftCardFront);
        textView_titleThirdLineLeftCardBack = (TextView) findViewById(R.id.textView_titleThirdLineLeftCardBack);
//        textView_titleThirdLineRightCardFront = (TextView) findViewById(R.id.textView_titleThirdLineRightCardFront);
        textView_titleThirdLineRightCardBack = (TextView) findViewById(R.id.textView_titleThirdLineRightCardBack);
    }

    private void initViews(){
        setTextToTextView(textView_titleTopCardFront, getString(R.string.top_card_front));
        setTextToTextView(textView_titleTopCardBack, getString(R.string.top_card_back));
//        setTextToTextView(textView_titleSecondLineLeftCardFront, getString(R.string.second_line_left_card_front));
        setTextToTextView(textView_titleSecondLineLeftCardBack, getString(R.string.second_line_left_card_back));
//        setTextToTextView(textView_titleSecondLineCenterCardFront, getString(R.string.second_line_center_card_front));
        setTextToTextView(textView_titleSecondLineCenterCardBack, getString(R.string.second_line_center_card_back));
//        setTextToTextView(textView_titleSecondLineRightCardFront, getString(R.string.second_line_right_card_front));
        setTextToTextView(textView_titleSecondLineRightCardBack, getString(R.string.second_line_right_card_back));
//        setTextToTextView(textView_titleThirdLineLeftCardFront, getString(R.string.third_line_left_card_front));
        setTextToTextView(textView_titleThirdLineLeftCardBack, getString(R.string.third_line_left_card_back));
//        setTextToTextView(textView_titleThirdLineRightCardFront, getString(R.string.third_line_right_card_front));
        setTextToTextView(textView_titleThirdLineRightCardBack, getString(R.string.third_line_right_card_back));
    }

    private void setTextToTextView(TextView textView, String text){
        textView.setText(text);
    }
}
