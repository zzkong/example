package lico.example.activity;

import android.app.Activity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;

import lico.example.R;

/**
 * Created by zwl on 15/5/22.
 */
@EActivity
public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
