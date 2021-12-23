package com.example.map.data.api;

import android.content.Context;

import com.yandex.mapkit.MapKitFactory;

public class MapApi {

    public MapApi(Context context) {

        MapKitFactory.setApiKey("52ff5c15-57b0-4dd0-b00d-5a6c50a6429b");
        MapKitFactory.initialize(context);
    }
}
