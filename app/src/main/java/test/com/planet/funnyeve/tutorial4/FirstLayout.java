package test.com.planet.funnyeve.tutorial4;

/**
 * Created by funnyeve-e002 on 2017. 9. 5..
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstLayout extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.first_layout, container, false);
        return v;
    }

}





