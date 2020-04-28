package com.example.mymaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");

        if (value.equalsIgnoreCase("spbu")){

            LatLng spbu1 = new LatLng(-7.983166, 112.614609);
            mMap.addMarker(new MarkerOptions().position(spbu1).title("SPBU Mergan"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu1));

            LatLng spbu2 = new LatLng(-7.995420, 112.619780);
            mMap.addMarker(new MarkerOptions().position(spbu2).title("SPBU Sukun"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu2));

            LatLng spbu3 = new LatLng(-7.978953, 112.63480);
            mMap.addMarker(new MarkerOptions().position(spbu3).title("SPBU Trunojoyo"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu3));

            LatLng spbu4 = new LatLng(-7.985073, 112.626594);
            mMap.addMarker(new MarkerOptions().position(spbu4).title("SPBU Kasin"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu4));

            LatLng latLng = new LatLng(-7.985073, 112.626594);
            float zoomLevel = 14.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

        } else if (value.equalsIgnoreCase("universitas")){


            LatLng univ1 = new LatLng(-7.952615, 112.613907);
            mMap.addMarker(new MarkerOptions().position(univ1).title("Universitas Brawijaya"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(univ1));

            LatLng univ2 = new LatLng(-7.972467, 112.609535);
            mMap.addMarker(new MarkerOptions().position(univ2).title("Universitas Merdeka"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(univ2));

            LatLng univ3 = new LatLng(-7.961273, 112.617393);
            mMap.addMarker(new MarkerOptions().position(univ3).title("Universitas Negri Malang"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(univ3));


            LatLng latLng = new LatLng(-7.961273, 112.617393);
            float zoomLevel = 14.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

        }

    }
}
