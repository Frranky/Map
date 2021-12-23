package com.example.map.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.map.R;
import com.example.map.data.api.MapApi;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.search.SearchManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MapApi mapApi;
    private MapView mapview;
    private SearchManager searchManager;
    private PanoramaService.SearchSession searchSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mapApi = new MapApi(this);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        mapview = (MapView)findViewById(R.id.mapview);
        mapview.getMap().move(
                new CameraPosition(new Point(56.5, 85), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
    }

    @Override
    protected void onStop() {

        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {

        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();
    }

    public void profileButtonClick(View view) {

        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void searchButtonClick(View view) {

        //В процессе разбора поиска
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
    }

}