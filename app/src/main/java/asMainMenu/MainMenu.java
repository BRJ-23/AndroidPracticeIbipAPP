package asMainMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ibip.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ascreenDOS.MainDOS;

public class MainMenu extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aasmainmenu_menu);
        FloatingActionButton fab = findViewById(R.id.floatingbutton);
        preferences = this.getSharedPreferences("sesiones", Context.MODE_PRIVATE);
        editor = preferences.edit();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("sesion", false);
                editor.apply();
                Toast.makeText(MainMenu.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
                finish();

            }
        });
    }


    public void primer(View view){
        Intent i = new Intent(this, com.example.ibip.ibipExtra.ascreen.Main.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);


    }


    public void segundo(View view){
        Intent i = new Intent(this, MainDOS.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


}