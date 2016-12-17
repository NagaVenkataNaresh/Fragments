package naresh.fragments.Activitys;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import naresh.fragments.R;

public class Bfragment extends Fragment
{
//    TextView tv;
    RelativeLayout rl;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View v =inflater.inflate(R.layout.activity_bfragment,container,false);

//        tv = (TextView)v.findViewById(R.id.tv);
        rl = (RelativeLayout)v.findViewById(R.id.ab);

        Log.d("Body   ","return v exicuted");
        return v;
    }

    void change(int color)
    {
        rl.setBackgroundColor(color);
    }
}