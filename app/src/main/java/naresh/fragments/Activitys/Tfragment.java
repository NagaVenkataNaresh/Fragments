package naresh.fragments.Activitys;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import naresh.fragments.R;

public class Tfragment extends Fragment implements View.OnClickListener
{
    Button b1,b2,b3,b4,b5;
    MainActivity ma;


    public void onAttach(Context con)
    {
        super.onAttach(con);
        ma = (MainActivity)con;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.activity_tfragment,container,false);

        b1 = (Button)v.findViewById(R.id.bone);
        b2 = (Button)v.findViewById(R.id.btwo);
        b3 = (Button)v.findViewById(R.id.bthree);
        b4= (Button)v.findViewById(R.id.bfore);
        b5 = (Button)v.findViewById(R.id.bfive);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        Log.d("Title ","return v exicuted");
        return v;
    }

    @Override
    public void onClick(View view)
    {
        int i= view.getId();
        int j = R.id.bone;
        int k = R.color.one;
        Log.d("On get ID","get id converted to int"+i+"   "+j+"color   ="+k);
        switch(i){
            case R.id.bone:
            {
//                ma.colorchange("One");
                Log.d("In switch  dddddddddddd","case exicuteddddddddddd");
                ma.colorchange(R.color.one);
                break;
            }
            case R.id.btwo:
            {
//                ma.colorchange("Two");
                ma.colorchange(R.color.two);
                break;
            }
            case R.id.bthree:
            {
//                ma.colorchange("Three");
                ma.colorchange(R.color.three);
                break;
            }
            case R.id.bfore:
            {
//                ma.colorchange("Fore");
                ma.colorchange(R.color.fore);
                break;
            }
            case R.id.bfive:
            {
//                ma.colorchange("Five");
                ma.colorchange(R.color.five);
                break;
            }
        }
    }
}
