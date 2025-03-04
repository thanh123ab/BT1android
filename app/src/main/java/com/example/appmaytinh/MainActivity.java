package com.example.appmaytinh;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB;
    Button btncong,btntru,btnnhan,btnchia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtA=findViewById(R.id.edtA);
        edtB=findViewById(R.id.edtB);
        btncong=findViewById(R.id.btncong);
        btntru=findViewById(R.id.btntru);
        btnnhan=findViewById(R.id.btnnhan);
        btnchia=findViewById(R.id.btnchia);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(edtA.getText().toString());
                int b= Integer.parseInt(edtB.getText().toString());
                int c=a+b;
                String Tong="Ket Qua: "+c;
                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);
                mydialog.setTitle("Ket Qua: ");
                mydialog.setMessage(Tong);
                mydialog.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {dialog.cancel();
                    };
                });
                mydialog.create().show();
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(edtA.getText().toString());
                int b= Integer.parseInt(edtB.getText().toString());
                int c=a-b;
                String Tong="Ket Qua: "+c;
                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);
                mydialog.setTitle("Ket Qua: ");
                mydialog.setMessage(Tong);
                mydialog.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    };
                });
                mydialog.create().show();
            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(edtA.getText().toString());
                int b= Integer.parseInt(edtB.getText().toString());
                int c=a*b;
                String Tong="Ket Qua: "+c;
                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);
                mydialog.setTitle("Ket Qua: ");
                mydialog.setMessage(Tong);
                mydialog.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    };
                });
                mydialog.create().show();
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a= Integer.parseInt(edtA.getText().toString());
                float b= Integer.parseInt(edtB.getText().toString());
                float c=a/b;
                String Tong="Ket Qua: "+c;
                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);
                mydialog.setTitle("Ket Qua: ");
                mydialog.setMessage(Tong);
                mydialog.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    };
                });
                mydialog.create().show();
            }
        });
    }
}