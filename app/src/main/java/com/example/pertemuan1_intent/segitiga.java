package com.example.pertemuan1_intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        EditText alas = (EditText)findViewById(R.id.input_alas);
        EditText tinggi = (EditText)findViewById(R.id.input_tinggi);
        Button tampil = (Button)findViewById(R.id.btn_hitung_luas);
        EditText hasil = (EditText)findViewById(R.id.luas_segitiga);

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double alas1 = Double.valueOf(alas.getText().toString());
                double tinggi1 = Double.valueOf(tinggi.getText().toString());
                double hitungluas = 0.5 * (alas1 * tinggi1);
                hasil.setText(String.valueOf(hitungluas));
            }
        });
    }
}
