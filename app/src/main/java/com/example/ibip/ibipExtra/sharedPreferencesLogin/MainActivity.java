package com.example.ibip.ibipExtra.sharedPreferencesLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ibip.R;
import com.example.ibip.ibipExtra.ascreen.Main;

import asMainMenu.MainMenu;

public class MainActivity extends AppCompatActivity {
    Button btnIniciarSesion;
    CheckBox checkSesion;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String llave = "sesion";
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharedpreferences_login_activity);
        iniciarElementos();
        if (revisarSesion()){
            startActivity(new Intent(this, MainMenu.class));
        }else {
            String mensaje= "Iniciar sesión";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        }


        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainMenu.class);
                username = (EditText) findViewById(R.id.email);
                password = (EditText)  findViewById(R.id.pass);
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    guardarSesion(checkSesion.isChecked());
                    startActivity(i);
                    username.setText("");
                    password.setText("");
                    checkSesion.setChecked(false);

                }else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private boolean revisarSesion() {
        return this.preferences.getBoolean(llave, false);
    }

    private void guardarSesion(boolean checked){
        editor.putBoolean(llave,checked);
        editor.apply();
    }

    private void iniciarElementos(){
        preferences = this.getSharedPreferences("sesiones",Context.MODE_PRIVATE);
        editor = preferences.edit();
        btnIniciarSesion = findViewById(R.id.iniciar_sesion);
        checkSesion = findViewById(R.id.guardar_sesion);

    }
}