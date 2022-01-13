package ascreenDOS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ibip.R;
import com.example.ibip.ibipExtra.ascreen.Main;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainDOS extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ascreen_dos_activity);
        FloatingActionButton fab = findViewById(R.id.floatingbutton);
        preferences = this.getSharedPreferences("sesiones", Context.MODE_PRIVATE);
        editor = preferences.edit();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("sesion", false);
                editor.apply();
                Toast.makeText(MainDOS.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }


    public void fragmentsecond(View view){
        Intent i = new Intent(this, com.example.ibip.CrearFragmento.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void fragmaster(View view){
        Intent i = new Intent(this, com.example.ibip.FragmentMaster.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}