package com.example.ccg11.testapplication17_1127;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ControlAlarmView(View v)
    {
        EditText alarmTitle = (EditText)findViewById(R.id.Alarm_Title);
    }

    public void HourUpCount()
    {
        EditText str_Hour = (EditText)findViewById(R.id.TimeView_Hour);
        int setting_Hour = Integer.parseInt(str_Hour.getText().toString());
        setting_Hour= setting_Hour + 1;
        str_Hour.setText((getString(setting_Hour)));
    }

    public void HourDownCount()
    {
        EditText str_Hour = (EditText)findViewById(R.id.TimeView_Hour);
        int setting_Hour = Integer.parseInt(str_Hour.getText().toString());
        setting_Hour= setting_Hour - 1;
        str_Hour.setText((getString(setting_Hour)));
    }

    public void MinUpCount()
    {
        EditText str_Minute = (EditText)findViewById(R.id.timeView_Minute);
        int setting_Minute = Integer.parseInt(str_Minute.getText().toString());
        setting_Minute= setting_Minute + 1;
        str_Minute.setText((getString(setting_Minute)));
    }

    public void MinDownCount()
    {
        EditText str_Minute = (EditText)findViewById(R.id.timeView_Minute);
        int setting_Minute = Integer.parseInt(str_Minute.getText().toString());
        setting_Minute= setting_Minute - 1;
        str_Minute.setText((getString(setting_Minute)));
    }





}
