package com.example.dagger2demo.page2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dagger2demo.R;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = BaseActivity.class.getSimpleName();
    private Button mBtnGetData;
    private Button mBtnGetNetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        mBtnGetData = (Button) findViewById(R.id.bt_get_data);
        mBtnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataRepository repository = new DataRepository();
                String data = repository.getDependencyData();
                Toast.makeText(BaseActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnGetNetData = (Button) findViewById(R.id.bt_get_net_data);
        mBtnGetNetData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SubRepository repository = new SubRepository();
                String data = repository.getLocalData();
                Toast.makeText(BaseActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}