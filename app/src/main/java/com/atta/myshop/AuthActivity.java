package com.atta.myshop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        String[] titles = {"Login", "Register"};

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 pager = findViewById(R.id.viewPager);

        FragmentAdapter adapter = new FragmentAdapter(this);

        pager.setAdapter(adapter);

        TabLayoutMediator.TabConfigurationStrategy tabConfig =
                (tab, position) -> {
                    tab.setText(titles[position]);
                };

        new TabLayoutMediator(tabLayout, pager, tabConfig).attach();

    }
}