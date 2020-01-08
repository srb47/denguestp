package com.topjal.denguestp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.jgabrielfreitas.core.BlurImageView;

public class LabTestActivity extends AppCompatActivity {

    BlurImageView blurImageView;
    private AdView mAdView;
    private RadioGroup rTemparature, rBadFirstDay, rVomiting, rLiquid, rBellyPain, rDiariah, redCircle, rWeekness;
    private String temparature, badFirstDay, vomiting, liquid, bellyPain, diariah, circle, weekness;
    private Button btnClear, btnSubmit;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        blurImageView=(BlurImageView)findViewById(R.id.blur);
        blurImageView.setBlur(2);

        getSupportActionBar().setTitle("ল্যাব টেস্ট");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(String.valueOf(R.string.banner_id));

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        rTemparature = findViewById(R.id.radioGrouptemperature);
        rBadFirstDay = findViewById(R.id.radioGroupBad);
        rVomiting = findViewById(R.id.radioGroupVomiting);
        rLiquid = findViewById(R.id.radioGroupliquidfood);
        rBellyPain = findViewById(R.id.radioGroupBellyPain);
        rDiariah = findViewById(R.id.radioGroupDiapiah);
        redCircle = findViewById(R.id.radioGroupRedCircle);
        rWeekness = findViewById(R.id.radioGroupWeek);

        btnClear = findViewById(R.id.btnLabTestClear);
        btnSubmit = findViewById(R.id.btnLabTestSubmit);
        result = findViewById(R.id.labtestResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temparature = ((RadioButton) findViewById(rTemparature.getCheckedRadioButtonId())).getText().toString().trim();
                badFirstDay = ((RadioButton) findViewById(rBadFirstDay.getCheckedRadioButtonId())).getText().toString().trim();
                vomiting = ((RadioButton) findViewById(rVomiting.getCheckedRadioButtonId())).getText().toString().trim();
                liquid = ((RadioButton) findViewById(rLiquid.getCheckedRadioButtonId())).getText().toString().trim();
                bellyPain = ((RadioButton) findViewById(rBellyPain.getCheckedRadioButtonId())).getText().toString().trim();
                diariah = ((RadioButton) findViewById(rDiariah.getCheckedRadioButtonId())).getText().toString().trim();
                circle = ((RadioButton) findViewById(redCircle.getCheckedRadioButtonId())).getText().toString().trim();
                weekness = ((RadioButton) findViewById(rWeekness.getCheckedRadioButtonId())).getText().toString().trim();
                double points = 0.0;
                if(temparature.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(badFirstDay.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(vomiting.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(liquid.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(bellyPain.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(diariah.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(circle.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                if(weekness.equalsIgnoreCase("হ্যা")){
                    points += 12.50;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("বেশি করে তরল খাবার গ্রহণ ও বিশুদ্ধ পানি পান করুন। \n");
                sb.append("দ্রুত হাসপাতালে যান। \n");
                sb.append("ডাক্তার ও বিশেষজ্ঞর পরামর্শ নিন। \n");
                sb.append("ব্যথানাশক ঔষধ গ্রহণ করা থেকে বিরত থাকুন। \n");

                StringBuilder sb2 = new StringBuilder();
                sb2.append("বেশি করে তরল খাবার গ্রহণ ও বিশুদ্ধ পানি পান করুন। \n");
                sb2.append("ডাক্তার ও বিশেষজ্ঞর পরামর্শ নিন। \n");
                sb2.append("যত তাড়াতাড়ি সম্ভব। \n");
                sb2.append("ব্যথানাশক ঔষধ গ্রহণ করা থেকে বিরত থাকুন। \n");


                StringBuilder sb3 = new StringBuilder();
                sb3.append("বেশি করে তরল খাবার গ্রহণ ও বিশুদ্ধ পানি পান করুন। \n");
                sb3.append("যদি স্বাস্থ্যের আরো অবনতি হয়, \n");
                sb3.append("ডাক্তার ও বিশেষজ্ঞর পরামর্শ নিন। \n");
                sb3.append("ব্যথানাশক ঔষধ গ্রহণ করা থেকে বিরত থাকুন। \n");

                if(points >= 50 ){
                    result.setText(sb.toString());
                    result.setTextColor(Color.RED);
                }else  if((points == 12.5 || points == 25) && !(diariah.equalsIgnoreCase("হ্যা") || weekness.equalsIgnoreCase("হ্যা"))){
                    result.setText(sb2.toString());
                    result.setTextColor(Color.BLUE);
                }else if(points >= 12.5 && !(diariah.equalsIgnoreCase("হ্যা") || weekness.equalsIgnoreCase("হ্যা"))){
                    result.setText(sb2.toString());
                    result.setTextColor(Color.BLACK);
                }else if(points >= 12.5 && (diariah.equalsIgnoreCase("হ্যা") || weekness.equalsIgnoreCase("হ্যা"))){
                    result.setText(sb3.toString());
                    result.setTextColor(Color.MAGENTA);
                }else if(weekness.equalsIgnoreCase("হ্যা")){
                    result.setText(sb3.toString());
                    result.setTextColor(Color.MAGENTA);
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton temNo = findViewById(R.id.radiotemperatureNo);
                temNo.setChecked(true);
                RadioButton badNo = findViewById(R.id.radioBadNo);
                badNo.setChecked(true);
                RadioButton vomiNo = findViewById(R.id.radioVomitingNo);
                vomiNo.setChecked(true);
                RadioButton ligNo = findViewById(R.id.radioLiquidFoodNo);
                ligNo.setChecked(true);
                RadioButton belloNo = findViewById(R.id.radioBellyPainNo);
                belloNo.setChecked(true);
                RadioButton diaNo = findViewById(R.id.radioDiariaNo);
                diaNo.setChecked(true);
                RadioButton redNo = findViewById(R.id.radioredCircleNo);
                redNo.setChecked(true);
                RadioButton weekNo = findViewById(R.id.radioWeekNo);
                weekNo.setChecked(true);

                result.setText("বেশি করে তরল খাবার গ্রহণ ও বিশুদ্ধ পানি পান করুন।");
            }
        });

    }
}
