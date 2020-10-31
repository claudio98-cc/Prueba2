package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "admin@mail.com";
    String clave = "admin123";
    EditText edtMain_email;
    EditText edtMain_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
        edtMain_email = (EditText) findViewById(R.id.edtMain_email);
        edtMain_pass = findViewById(R.id.edtMain_pass);
    }
    public void goToHomePage(View view){

        if (correo.equals(edtMain_email.getText().toString()) && clave.equals((edtMain_pass.getText().toString()))){
            /*Enviar a otra vista*/
            Intent activity = new Intent(this,homeActivity.class);
            startActivity(activity);
        }
        else{
            Toast.makeText(this,"Credenciales incorrectas",Toast.LENGTH_SHORT).show();
        }
        /*
        Controlar los campos de textos a String
        String getCorreo = edtMain_email.getText().toString();
        String getClave = edtMain_pass.getText().toString();
        Toast.makeText(this,"El correo es: "+ getCorreo, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "La pass es: "+ getClave, Toast.LENGTH_SHORT).show();
        */
        String getCorreo = edtMain_email.getText().toString();
    }
    public void goToCrearCuenta (View view){
        Intent activity = new Intent(this,CrearCuenta.class);
        startActivity(activity);
    }
    public void goToMain (View view){
        Intent activity = new Intent(this,MainActivity.class);
        startActivity(activity);
    }

}