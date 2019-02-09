package id.andre.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<data> dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dataset = new ArrayList<>();
        dataset.add(new data("dawad", "djawndkjanwkd"));
        dataset.add(new data("dawad", "djawndkjanwkd"));
        dataset.add(new data("dawad", "djawndkjanwkd"));
        dataset.add(new data("dawad", "djawndkjanwkd"));
        dataset.add(new data("dawad", "djawndkjanwkd"));

        recyclerView = findViewById(R.id.rv_list);

        adapter = new RecyclerAdapter(dataset);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Main2Activity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}
