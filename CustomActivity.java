package com.example.ritik.intentfilter;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by RITIK on 19-12-2017.
 */

public class CustomActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);
        TextView t2=(TextView)findViewById(R.id.textView);
        Uri url=getIntent().getData();
        t2.setText(url.toString());
    }
}
