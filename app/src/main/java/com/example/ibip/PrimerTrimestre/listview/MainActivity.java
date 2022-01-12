package com.example.ibip.PrimerTrimestre.listview;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.ibip.R;


public class MainActivity extends Activity implements ListView.OnItemClickListener{

    public void onItemClick(AdapterView<?> a, View view, int position, long id){
        TextView t=(TextView)findViewById(R.id.textView);
        ListView l=(ListView)findViewById(R.id.listViewPais);
        String seleccionado=new String();
        SparseBooleanArray checked = l.getCheckedItemPositions();

        for(int i=0;i<checked.size();i++)
            if(checked.valueAt(i)){
                seleccionado=seleccionado+
                        a.getItemAtPosition(checked.keyAt(i)).toString()
                        +";";
            }
        t.setText(seleccionado);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String [] elementos={"Toledo","Ciudad Real","Cuenca","Guadalajara","Albacete"};

        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);

        ListView l=(ListView)findViewById(R.id.listViewPais);

        l.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,elementos);
        l.setAdapter(adaptador);
        l.setOnItemClickListener(this);
    }


}