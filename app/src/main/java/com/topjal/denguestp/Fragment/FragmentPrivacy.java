package com.topjal.denguestp.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jgabrielfreitas.core.BlurImageView;
import com.topjal.denguestp.MainActivity;
import com.topjal.denguestp.R;

public class FragmentPrivacy extends Fragment {

    BlurImageView blurImageView;


    public FragmentPrivacy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("প্রাইভেসি");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.privacy_fragment, container, false);

        blurImageView=(BlurImageView)v.findViewById(R.id.blur);
        blurImageView.setBlur(2);

        return v;
    }

}
