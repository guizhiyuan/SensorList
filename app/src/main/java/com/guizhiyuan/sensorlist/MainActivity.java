package com.guizhiyuan.sensorlist;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tv_showSensors;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_showSensors = (TextView) findViewById(R.id.tv_showSensors);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    public void Click(View view) {

        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : sensors) {
            tv_showSensors.append(sensor.getName()+"\n");
        }
    }
}
