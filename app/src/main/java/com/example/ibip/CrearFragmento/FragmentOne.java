package com.example.ibip.CrearFragmento;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ibip.R;

public class FragmentOne extends Fragment {
    Button gotoFragment2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        gotoFragment2 = view.findViewById(R.id.fragment_fragment1_gotofragment2);
        gotoFragment2.setOnClickListener((View.OnClickListener) this);

        return view;
    }

    public void pasarDos(View view){
       // Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTwo);

    }



}