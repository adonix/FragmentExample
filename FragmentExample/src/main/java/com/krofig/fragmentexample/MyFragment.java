package com.krofig.fragmentexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by enrique figueroa on 10/10/13.
 */
public class MyFragment extends Fragment {
    private float mValue;

    public MyFragment(){}

    public MyFragment(float v) {
        this.mValue = v;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context = getActivity().getApplicationContext();
        LinearLayout layout = new LinearLayout(context);
        TextView text = new TextView(context);
        text.setText("Size " + (mValue * 10));
        text.setTextSize(mValue * 10);
        layout.addView(text);
        return layout;
    }
}
