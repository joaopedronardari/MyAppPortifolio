package com.jpnardari.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }

    @OnClick(R.id.btn_popular_movies)
    public void btnPopularMoviesClick() {
        showToastAppMessage("Popular Movies");
    }

    @OnClick(R.id.btn_stock_hawk)
    public void btnStockHawkClick() {
        showToastAppMessage("Stock Hawk");
    }

    @OnClick(R.id.btn_build_it_big)
    public void btnBuildItBigClick() {
        showToastAppMessage("Build It Bigger");
    }

    @OnClick(R.id.btn_make_your_app)
    public void btnMakeYourAppClick() {
        showToastAppMessage("Make your App");
    }

    @OnClick(R.id.btn_go_ubiquitous)
    public void btnGoUbiquitous() {
        showToastAppMessage("Go Ubiquitous");
    }

    @OnClick(R.id.btn_capstone)
    public void btnCapstone() {
        showToastAppMessage("Capstone");
    }

    private void showToastAppMessage(String appName) {
        Toast.makeText(MainActivity.this, getString(R.string.toast_app_message, appName), Toast.LENGTH_LONG).show();
    }

}
