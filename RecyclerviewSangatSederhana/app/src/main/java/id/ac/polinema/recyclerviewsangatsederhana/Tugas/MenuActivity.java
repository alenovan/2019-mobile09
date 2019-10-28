package id.ac.polinema.recyclerviewsangatsederhana.Tugas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import id.ac.polinema.recyclerviewsangatsederhana.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void tugasSatu(View view) {
        Intent tgs1 = new Intent(getApplicationContext(),Activity.class);
        tgs1.putExtra("status","1");
        startActivity(tgs1);
    }

    public void tugasTiga(View view) {
        Intent tgs1 = new Intent(getApplicationContext(),Activity.class);
        tgs1.putExtra("status","3");
        startActivity(tgs1);
    }

    public void tugasDua(View view) {
        Intent tgs1 = new Intent(getApplicationContext(),Activity.class);
        tgs1.putExtra("status","2");
        startActivity(tgs1);

    }
}
