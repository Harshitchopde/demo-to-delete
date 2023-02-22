package com.example.api;

import android.os.AsyncTask;
import android.util.Log;

public
class BgAsyncTask extends AsyncTask<String,Void,String> {
    private static final String TAG = "fdf";

    @Override
    protected
    void onPreExecute() {
        super.onPreExecute();
        Log.e(TAG, "onPreExecute: running task");
    }

    @Override
    protected
    String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected
    void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
