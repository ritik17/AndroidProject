package com.example.ritik.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
private static TextView t1;
    private static TextView t2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        t1=(TextView)view.findViewById(R.id.textView);
        t2=(TextView)view.findViewById(R.id.textView2);
        return view;


    }
public void setMemeText(String top, String bottom){
    t1.setText(top);
    t2.setText(bottom);
}

}
