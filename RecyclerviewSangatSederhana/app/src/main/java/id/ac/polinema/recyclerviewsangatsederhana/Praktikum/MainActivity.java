package id.ac.polinema.recyclerviewsangatsederhana.Praktikum;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Praktikum.Adapter.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.Praktikum.Model.SuperHero;
import id.ac.polinema.recyclerviewsangatsederhana.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();
    SuperHeroAdapter superHeroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);
        for(int i= 0 ; i<22;i++){
            listSuperHero.add(new SuperHero("Hero"+i));
        }
        superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));

    }
}
