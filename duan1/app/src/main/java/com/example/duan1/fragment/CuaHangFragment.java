package com.example.duan1.fragment;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.DrawableRes;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.example.duan1.DiaChiQuan;
import com.example.duan1.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CuaHangFragment extends Fragment {
    MapView mMapView;
    private GoogleMap googleMap;
    Spinner spn;
    ArrayAdapter<String> adapter;
    ArrayList<String> list = new ArrayList<>();
    int PERMISSION_ALL = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cua_hang, container, false);
        // Cấp quyền
        String[] PERMISSIONS = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.READ_CALL_LOG,
        };
        if (!hasPermissions(getContext(), PERMISSIONS)) {

            ActivityCompat.requestPermissions(getActivity(), PERMISSIONS, PERMISSION_ALL);

        }
        spn = view.findViewById(R.id.spn);
        list.clear();
        list.add("Quận 1");
        list.add("Quận 2");
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list);
        spn.setAdapter(adapter);
        mMapView = (MapView) view.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume();
        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(mMap -> {
            googleMap = mMap;
            googleMap.resetMinMaxZoomPreference();
//             Hiển thị nút vị trí của tôi
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return ;
            }
            googleMap.setMyLocationEnabled(true);
            // Đánh dấu một điểm trên bản đồ
            List<LatLng> locations = new ArrayList<>();
            locations.add(new LatLng(10.768345,106.698828));
            locations.add(new LatLng(10.803691,106.733104));
            locations.add(new LatLng(10.783696,106.694513));
            locations.add(new LatLng(10.758672,106.700743));
            locations.add(new LatLng(10.754692,106.678184));
            locations.add(new LatLng(10.743525,106.630320));
            locations.add(new LatLng(10.758229,106.743626));
            locations.add(new LatLng(10.820911,106.772414));
            locations.add(new LatLng(10.766085,106.664049));
            locations.add(new LatLng(10.767479,106.653151));
            locations.add(new LatLng(10.876358,106.647659));
            locations.add(new LatLng(10.947462,106.830116));
            locations.add(new LatLng(10.958118,106.833539));
            for (LatLng latLng : locations){
                googleMap.addMarker(new MarkerOptions()
                        .position(latLng)
                        .title("The Coffee House")
                        .icon(BitmapDescriptorFactory.fromBitmap(createMaker(getContext(),R.drawable.logo_map))));
            }
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.include(locations.get(0)); // Điểm A
//            builder.include(locations.get(locations.size()-1)); // Điểm B
            LatLngBounds bounds = builder.build();
            CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds,100);
            googleMap.moveCamera(cu);
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(13),2000,null);
            spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    switch (parent.getSelectedItemPosition()){
                        case 0:
                            LatLng sydney = new LatLng(10.768345, 106.698828);
                            googleMap.addMarker(new MarkerOptions().position(sydney)
                                    .title("141 Nguyễn Thái Bình").snippet("141 Nguyễn Thái Bình")
                                    .icon(BitmapDescriptorFactory.fromBitmap(createMaker(getContext(),R.drawable.logo_map))));
                            CameraPosition cameraPosition = new CameraPosition.Builder().target(sydney).zoom(15).build();
                            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                            googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                                @Override
                                public void onMapClick(LatLng latLng) {
                                    Intent i = new Intent(getContext(), DiaChiQuan.class);
                                    startActivity(i);
                                }
                            });
                            break;
                        case 1:
                            sydney = new LatLng(10.803691, 106.733104);
                            googleMap.addMarker(new MarkerOptions().position(sydney)
                                    .title("57 Xuân Thủy").snippet("57 Xuân Thủy")
                                    .icon(BitmapDescriptorFactory.fromBitmap(createMaker(getContext(),R.drawable.logo_map))));
                            cameraPosition = new CameraPosition.Builder().target(sydney).zoom(15).build();
                            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
//            LatLng sydney = new LatLng(10.947462, 106.830116);
//            googleMap.addMarker(new MarkerOptions().position(sydney).title("R132 Võ Thị Sáu").snippet("R132 Võ Thị Sáu")
//                    .icon(BitmapDescriptorFactory.fromBitmap(createMaker(getContext(),R.drawable.logo_map))));
//            // Tự động phóng to đến vị trí đã đánh dấu
//            CameraPosition cameraPosition = new CameraPosition.Builder().target(sydney).zoom(15).build();
//            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        });
        return view;
    }

    public static Bitmap createMaker(Context context, @DrawableRes int resource) {

        View marker = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.custom_marker_layout, null);

        CircleImageView markerImage = (CircleImageView) marker.findViewById(R.id.user_dp);
        markerImage.setImageResource(resource);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        marker.setLayoutParams(new ViewGroup.LayoutParams(52, ViewGroup.LayoutParams.WRAP_CONTENT));
        marker.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        marker.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        marker.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(marker.getMeasuredWidth(), marker.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        marker.draw(canvas);

        return bitmap;
    }
    // Cấp quyền
    public static boolean hasPermissions(Context context, String... permissions) {
        if (context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}