package com.sp.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.tallerapi.apiManager.RetrofitClient;
import com.sp.tallerapi.modelos.Whiskey;
import com.sp.tallerapi.modelos.WhiskeyAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Whiskey extends AppCompatActivity {

    ListView listvWhiskey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__whiskey);

        listvWhiskey = findViewById(R.id.listWhiskey);
        getFromInternetWhiskey();

    }

    public void getFromInternetWhiskey(){
        Call<List<Whiskey>> call = RetrofitClient.getInstance().getMyApi().getWhiskeys();
        call.enqueue(new Callback<List<Whiskey>>(){


            @Override
            public void onResponse(Call<List<Whiskey>> call, Response<List<Whiskey>> response) {
                List<Whiskey> myWhiskey = response.body();
                String message = "";
                WhiskeyAdapter adapter = new WhiskeyAdapter(list_Whiskey.this,myWhiskey);
                listvWhiskey.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Whiskey>> call, Throwable t) {
                Toast.makeText(list_Whiskey.this,"Falló",Toast.LENGTH_SHORT).show();

            }
        });

    }

}
