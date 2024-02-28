package com.example.allsensors;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private SensorManager mgr;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mgr=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        t1=findViewById(R.id.t1);
        List<Sensor> sensorlist=mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder str=new StringBuilder();
        str.append("Sensors Of Phone:\n");
        for (Sensor s: sensorlist)
        {
            str.append(s.getName()+"\n");
        }
        t1.setVisibility(View.VISIBLE);
        t1.setText(str);
    }
}