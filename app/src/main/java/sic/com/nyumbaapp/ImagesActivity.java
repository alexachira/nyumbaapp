package sic.com.nyumbaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImagesActivity extends AppCompatActivity {

    @BindView(R.id.listProperties)
    ListView listProperties;

    ListAdapter adapter;

    ArrayList<Item> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        ButterKnife.bind(this);

        arrayList = new ArrayList<>();

        adapter = new ListAdapter(this, arrayList);

        listProperties.setAdapter(adapter);
        //int image, int cost, String name, String location, String description, String services
        Item item1 = new Item(R.drawable.img1, 15000, "Spring Valley Apartments", "Spring Valley", "2 Bedroom apartments", "Water, Wifi, Swimming pool,full meals");
        Item item2 = new Item(R.drawable.img2, 25000, "loresho white apartments", "loresho", "3 Bedroom apartments", "Water, Wifi, Swimming pool,full meals");
        Item item3 = new Item(R.drawable.img30, 40000, "karen apartments", "karen", " 4 Bedroom apartments", "Water, Wifi, Swimming pool,chillspot,full meals");
        Item item4 = new Item(R.drawable.img6, 65000, "lavington  apartments", "lavington", "4 Bedroom apartments", "Water, Wifi, Swimming pool,full meals,golf playground");

        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(item4);


        adapter.notifyDataSetChanged();

        listProperties.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent x=new Intent(ImagesActivity.this,DetailsActivity.class);
                Item clicked= arrayList.get(position);
                x.putExtra("image", clicked.getImage());
                x.putExtra("cost", clicked.getCost());
                x.putExtra("name", clicked.getName());
                x.putExtra("location", clicked.getLocation());
                x.putExtra("desc", clicked.getDescription());
                x.putExtra("services", clicked.getServices());
                startActivity(x);
            }
        });


    }
}


