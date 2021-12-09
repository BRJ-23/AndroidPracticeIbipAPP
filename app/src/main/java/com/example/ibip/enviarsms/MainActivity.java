package com.example.ibip.enviarsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviarsms_activity);
    }
    public void lanzarIntento(View view) {
        Intent intento = new Intent(Intent.ACTION_VIEW);
        intento.setData(Uri.parse("https://www.packtpub.com/"));
        startActivity(intento);
    }

    public void enviarMensaje(View view) {
        //solo numero
        /*  String number = "12346556";  // The number on which you want to send SMS
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
        }*/

        //numero y TEXTO

        Uri uri = Uri.parse("smsto:12346556");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "Here you can set the SMS text to be sent");
        startActivity(it);
    }

    public void enviarMensaje2(View view){
        String numero = "626693565";
        String mensaje = "Esto es mi intento de mensaje";
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(numero,null,mensaje,null,null);
            Toast.makeText(getApplicationContext(), "Mensaje Enviado.", Toast.LENGTH_LONG).show();
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Mensaje no enviado, datos incorrectos.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}