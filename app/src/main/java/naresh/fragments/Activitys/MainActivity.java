package naresh.fragments.Activitys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import naresh.fragments.Callbacks.CalorCallback;
import naresh.fragments.R;

public class MainActivity extends AppCompatActivity implements CalorCallback
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Main","Main oncreate exicuted");
    }


    @Override
    public void colorchange(int i)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Bfragment bfragment = (Bfragment) fragmentManager.findFragmentById(R.id.Bfragment);
        Log.d("In color change"," in color change method exicuteddddd"+i);
        bfragment.change(i);
    }
}