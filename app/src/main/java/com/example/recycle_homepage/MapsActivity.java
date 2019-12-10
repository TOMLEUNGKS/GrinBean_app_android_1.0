package com.example.recycle_homepage;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findmachine);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        mMap=googleMap;
        //Add markers
        LatLng HKU = new LatLng(22.283217,114.1366992);
        mMap.addMarker(new MarkerOptions().position(HKU).title("U Street @HKU").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HKU));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(HKU,11f));

        LatLng CUHK = new LatLng(22.4196,114.2068);
        mMap.addMarker(new MarkerOptions().position(CUHK).title("Main Library @CUHK").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CUHK));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(CUHK,11f));

        LatLng POLYU = new LatLng(22.3037479,114.1802324);
        mMap.addMarker(new MarkerOptions().position(POLYU).title("The Hong Kong Polytechnic University").snippet("G/F, Block P").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(POLYU));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(POLYU,11f));

    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
}
