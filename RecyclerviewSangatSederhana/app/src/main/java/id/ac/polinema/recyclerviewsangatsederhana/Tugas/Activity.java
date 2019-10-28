package id.ac.polinema.recyclerviewsangatsederhana.Tugas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.Tugas.Adapter.AdapterTugas;
import id.ac.polinema.recyclerviewsangatsederhana.Tugas.Model.ModelTugas;

public class Activity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<ModelTugas> listSuperHero = new ArrayList<>();
    AdapterTugas superHeroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
        rvSuperHero = findViewById(R.id.recyler);
        String status = getIntent().getExtras().getString("status");
        if(status.equals("1")){
            tugas1();
        }else if(status.equals("2")){
            tugas2();
        }else{
            tugas3();
        }

    }

    public void tugas1(){
        for(int i= 0 ; i<15;i++){
            listSuperHero.add(new ModelTugas("-","XL"));
        }
        superHeroAdapter = new AdapterTugas(getApplication(),listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }

    public void tugas2(){
        for(int i= 0 ; i<15;i++){
            listSuperHero.add(new ModelTugas("-","Scroll Ke samping"));
        }
        superHeroAdapter = new AdapterTugas(getApplication(),listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvSuperHero.setLayoutManager(layoutManager);
    }

    public void tugas3(){
        for(int i= 0 ; i<15;i++){
            listSuperHero.add(new ModelTugas("-","XL"));
        }
        superHeroAdapter = new AdapterTugas(getApplication(),listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        rvSuperHero.setLayoutManager(manager);
    }
}
