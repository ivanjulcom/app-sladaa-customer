package com.sladaa.customer.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.sladaa.customer.R;
import com.sladaa.customer.fragment.Info1Fragment;
import com.sladaa.customer.fragment.Info2Fragment;
import com.sladaa.customer.fragment.Info3Fragment;
import com.sladaa.customer.model.User;
import com.sladaa.customer.utiles.SessionManager;
import com.merhold.extensiblepageindicator.ExtensiblePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class IntroActivity extends RootActivity {

    @BindView(R.id.flexibleIndicator)
    ExtensiblePageIndicator flexibleIndicator;
    int selectPage = 0;
    SessionManager sessionManager;
    public static ViewPager vpPager;
    MyPagerAdapter adapterViewPager;
    public static TextView btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);
        btnNext = findViewById(R.id.btn_next);
        vpPager = findViewById(R.id.vpPager);
        sessionManager = new SessionManager(IntroActivity.this);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        if(sessionManager.getBooleanData(SessionManager.login) ||sessionManager.getBooleanData(SessionManager.intro)){
            startActivity(new Intent(IntroActivity.this, HomeActivity.class));
            finish();
        }
        vpPager.setAdapter(adapterViewPager);
        ExtensiblePageIndicator extensiblePageIndicator = (ExtensiblePageIndicator) findViewById(R.id.flexibleIndicator);
        extensiblePageIndicator.initViewPager(vpPager);
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("data","jsadlj");
            }

            @Override
            public void onPageSelected(int position) {
                selectPage = position;

                if (position == 0 || position == 1) {

                    btnNext.setText("Lanjut");
                } else if (position == 2) {

                    btnNext.setText("Selesai");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("ivan","ivan");
            }
        });
    }

    @OnClick({R.id.btn_next})
    public void onClick(View view) {
        if (view.getId() == R.id.btn_next) {
            if (selectPage == 0) {
                vpPager.setCurrentItem(1);
            } else if (selectPage == 1) {
                vpPager.setCurrentItem(2);
            } else if (selectPage == 2) {
                User user=new User();
                user.setId("0");
                user.setFname("Test");
                user.setLname("TestLast");
                user.setEmail("test@gmail.com");
                user.setMobile("1020304050");

                sessionManager.setUserDetails("", user);
                sessionManager.setBooleanData(SessionManager.intro,true);
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                finish();
            }
        }
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {
        private int numItems = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return numItems;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return Info1Fragment.newInstance();
                case 1:
                    return Info2Fragment.newInstance();
                case 2:
                    return Info3Fragment.newInstance();
                default:
                    return null;
            }

        }

        @Override
        public CharSequence getPageTitle(int position) {
            Log.e("page", "" + position);
            return "Page " + position;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            Fragment fragment = (Fragment) super.instantiateItem(container, position);
            return fragment;
        }

    }
}
