package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public
class MainActivity extends AppCompatActivity {


    private static final String TAG = "dfjsadf";


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url="http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10";


        RequestQueue requestQueue;
        requestQueue= Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET,
                url,null, new Response.Listener<JSONObject>() {
            @Override
            public
            void onResponse(JSONObject response) {
                Log.e(TAG, "onResponse: "+response.toString() );

            }
        }, new Response.ErrorListener() {
            @Override
            public
            void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: error"+error.getMessage() );
            }
        });
        requestQueue.add(objectRequest);
    }
}