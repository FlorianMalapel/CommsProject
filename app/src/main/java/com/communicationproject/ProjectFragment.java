package com.communicationproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.communicationproject.model.Card;
import com.squareup.picasso.Picasso;
import com.thefinestartist.finestwebview.FinestWebView;

/**
 * Created by florianmalapel on 12/01/2017.
 */

public class ProjectFragment extends Fragment implements View.OnClickListener {

    public static final String BUNDLE_ARGS_ID = "ProjectFragmentCard";

    private TextView textView_title = null;
    private TextView textView_desc = null;
    private ImageView imageView_1 = null;
    private ImageView imageView_2 = null;
    private ImageView imageView_3 = null;
    private Button button_moreInfo = null;

    private Card card = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Bundle bundle = getArguments();
        card = (Card) bundle.getSerializable(BUNDLE_ARGS_ID);
        View view = inflater.inflate(R.layout.content_card, container, false);
        findViewById(view);
        initialize();
        return view;
    }

    private void findViewById(View view){
        textView_title = (TextView) view.findViewById(R.id.textView_title);
        textView_desc = (TextView) view.findViewById(R.id.textView_desc);
        imageView_1 = (ImageView) view.findViewById(R.id.imageView_1);
        imageView_2 = (ImageView) view.findViewById(R.id.imageView_2);
        imageView_3 = (ImageView) view.findViewById(R.id.imageView_3);
        button_moreInfo = (Button) view.findViewById(R.id.button_moreInfo);
    }

    private void initialize(){
        textView_title.setText(card.name);
        textView_desc.setText(card.desc);
        button_moreInfo.setOnClickListener(this);
        Picasso.with(getContext()).load(card.image1_url).into(imageView_1);
        Picasso.with(getContext()).load(card.image2_url).into(imageView_2);
        Picasso.with(getContext()).load(card.image3_url).into(imageView_3);
    }

    @Override
    public void onClick(View view) {
        if(view == button_moreInfo){
            new FinestWebView.Builder(getContext()).show(card.url_video);
        }
    }
}
