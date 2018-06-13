package com.example.chenyang.nttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        DataAnalyzer dataAnalyzer = new DataAnalyzer(this);
        ArrayList<ApplicationInfo> package_name = (ArrayList<ApplicationInfo>) dataAnalyzer.getApplicationMeta();
        for (ApplicationInfo name:package_name) {
            System.out.println("name"+dataAnalyzer.getAppName(name));
            System.out.println("data received"+dataAnalyzer.getReceivedData(name));
            System.out.println("data transmitted"+dataAnalyzer.getDataTransmitted(name));
            System.out.println("package received"+dataAnalyzer.getPacketsReceived(name));
            System.out.println("packets transmitted"+dataAnalyzer.getPacketsTransmitted(name));
        }

    }
}
