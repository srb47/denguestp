package com.topjal.denguestp.Fragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;

import com.topjal.denguestp.CardFragmentPagerAdapter;
import com.topjal.denguestp.CardItem;

import com.topjal.denguestp.CardPagerAdapter;
import com.topjal.denguestp.MainActivity;
import com.topjal.denguestp.R;
import com.topjal.denguestp.ShadowTransformer;

public class FragmentQa extends Fragment implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener {

    private Button mButton;
    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;
    private CardFragmentPagerAdapter mFragmentCardAdapter;
    private ShadowTransformer mFragmentCardShadowTransformer;

    private boolean mShowingFragments = false;


    public FragmentQa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("প্রশ্ন উত্তর");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.qa_fragment, container, false);

        mViewPager = (ViewPager) v.findViewById(R.id.viewPager);


        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title, R.string.ans_details));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title1, R.string.ans_details1));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title2, R.string.ans_details2));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title3, R.string.ans_details3));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title4, R.string.ans_details4));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title5, R.string.ans_details5));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title6, R.string.ans_details6));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title7, R.string.ans_details7));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title8, R.string.ans_details8));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title9, R.string.ans_details9));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title10, R.string.ans_details10));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title11, R.string.ans_details11));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title12, R.string.ans_details12));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title13, R.string.ans_details13));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title14, R.string.ans_details14));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title15, R.string.ans_details15));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title16, R.string.ans_details16));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title17, R.string.ans_details17));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title18, R.string.ans_details18));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title19, R.string.ans_details19));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title20, R.string.ans_details20));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title21, R.string.ans_details21));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title22, R.string.ans_details22));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title23, R.string.ans_details23));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title24, R.string.ans_details24));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title25, R.string.ans_details25));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title26, R.string.ans_details26));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title27, R.string.ans_details27));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title28, R.string.ans_details28));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title29, R.string.ans_details29));
        mCardAdapter.addCardItem(new CardItem(R.string.qus_title30, R.string.ans_details30));
        mFragmentCardAdapter = new CardFragmentPagerAdapter(getFragmentManager(),
                dpToPixels(2, this));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);


        return v;
    }

    @Override
    public void onClick(View v) {

        if (!mShowingFragments) {
            mButton.setText("Views");
            mViewPager.setAdapter(mFragmentCardAdapter);
            mViewPager.setPageTransformer(false, mFragmentCardShadowTransformer);
        } else {
            mButton.setText("Fragments");
            mViewPager.setAdapter(mCardAdapter);
            mViewPager.setPageTransformer(false, mCardShadowTransformer);
        }

        mShowingFragments = !mShowingFragments;

    }

    public static float dpToPixels(int dp, FragmentQa context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        mCardShadowTransformer.enableScaling(b);
        mFragmentCardShadowTransformer.enableScaling(b);
    }
}
