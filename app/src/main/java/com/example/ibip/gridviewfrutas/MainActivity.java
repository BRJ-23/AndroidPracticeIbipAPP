package com.example.ibip.gridviewfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] fruitNames = {"Apple", "Orange", "strawberry", "Melon", "Kiwi", "Banana"};
    int[] fruitImages = {R.drawable.apple, R.drawable.oranges, R.drawable.strawberry, R.drawable.watermelon, R.drawable.kiwi, R.drawable.banana};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_frutas_activity);

        gridView = findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
                intent.putExtra("name", fruitNames[i]);
                intent.putExtra("image", fruitImages[i]);
                startActivity(intent);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.gridview_rowdata, null);
            TextView name = v.findViewById(R.id.fruits);
            ImageView image = v.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return v;
        }

    }
}