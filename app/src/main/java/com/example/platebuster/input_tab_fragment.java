package com.example.platebuster;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class input_tab_fragment extends Fragment {

    EditText inp; Button btn; float v=0;
    TextView t1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.input_tab_fragment,container,false);

        inp = root.findViewById(R.id.input);
        btn = root.findViewById(R.id.enterbtn);
        t1= root.findViewById(R.id.textView);

        inp.setAlpha(v);
        btn.setAlpha(v);
        t1.setAlpha(v);

        inp.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        t1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
