package com.topjal.denguestp.Fragment;

import android.content.Intent;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdView;
import android.widget.TextView;

import com.topjal.denguestp.ExpertActivity.ExpertActivity;
import com.topjal.denguestp.EmergencyActivity.EmInformationDetails;
import com.topjal.denguestp.EmergencyActivity.EmInformationDetails1;
import com.topjal.denguestp.EmergencyActivity.EmInformationDetails2;
import com.topjal.denguestp.EmergencyActivity.EmInformationDetails3;
import com.topjal.denguestp.ExpertActivity.ExpertActivity1;
import com.topjal.denguestp.ExpertActivity.ExpertActivity10;
import com.topjal.denguestp.ExpertActivity.ExpertActivity2;
import com.topjal.denguestp.ExpertActivity.ExpertActivity3;
import com.topjal.denguestp.ExpertActivity.ExpertActivity4;
import com.topjal.denguestp.ExpertActivity.ExpertActivity5;
import com.topjal.denguestp.ExpertActivity.ExpertActivity6;
import com.topjal.denguestp.ExpertActivity.ExpertActivity7;
import com.topjal.denguestp.ExpertActivity.ExpertActivity8;
import com.topjal.denguestp.ExpertActivity.ExpertActivity9;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails1;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails2;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails3;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails4;
import com.topjal.denguestp.GeneralActivity.GeInformationDetails5;
import com.topjal.denguestp.HotlineActivity;
import com.topjal.denguestp.ImageActivity;
import com.topjal.denguestp.MainActivity;
import com.topjal.denguestp.R;



import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class FragmentHome extends Fragment {


    TextView scrollingText;
    CardView cardView;



    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).setActionBarTitle("হোম");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.home_fragment, container, false);


        FlipperLayout flipperLayout = (FlipperLayout) v.findViewById(R.id.flipper);

        int imagesDrawable[] = {R.drawable.img_slider,R.drawable.img_slider1, R.drawable.img_slider2};
        for (int i=0; i<imagesDrawable.length; i++)
        {
            FlipperView flipperView = new FlipperView(getActivity().getBaseContext());
            flipperView.setImageDrawable(imagesDrawable[i]);
            flipperLayout.addFlipperView(flipperView);
        }


        scrollingText = (TextView)v.findViewById(R.id.scrollingtext);
        scrollingText.setSelected(true);


        cardView = (CardView)v.findViewById(R.id.expert);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity1.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity2.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity3.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity4.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity5.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity6.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity7.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity8.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.expert9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity9.class);
                startActivity(intent);
            }
        });


        cardView = (CardView)v.findViewById(R.id.expert10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ExpertActivity10.class);
                startActivity(intent);
            }
        });



        cardView = (CardView)v.findViewById(R.id.emergency);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EmInformationDetails.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.emergency1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EmInformationDetails1.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.emergency2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EmInformationDetails2.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.emergency3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EmInformationDetails3.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.clean);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ImageActivity.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.hot_line);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotlineActivity.class);
                startActivity(intent);
            }
        });


        cardView = (CardView)v.findViewById(R.id.general);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.general1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails1.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.general2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails2.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.general3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails3.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.general4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails4.class);
                startActivity(intent);
            }
        });

        cardView = (CardView)v.findViewById(R.id.general5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeInformationDetails5.class);
                startActivity(intent);
            }
        });
        return v;
    }

}
