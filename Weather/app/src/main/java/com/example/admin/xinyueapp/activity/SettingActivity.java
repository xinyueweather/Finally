package com.example.admin.xinyueapp.activity;

import com.example.admin.xinyueapp.R;
import com.example.admin.xinyueapp.adapter.SettingFragment;

import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.example.admin.xinyueapp.entity.NightModeHelper;
import android.support.v7.widget.Toolbar;

public class SettingActivity extends AppCompatActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        toolbar = (android.support.v7.widget.Toolbar) findViewById (R.id.toolbar_preference);
        FrameLayout mlinearLayout = (FrameLayout) findViewById(R.id.content_frame);
        initToolbar();
        getFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new SettingFragment()).commit();

    }

    public void initToolbar(){

        toolbar.setTitle("设置");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_left_back);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return false;
    }

}
