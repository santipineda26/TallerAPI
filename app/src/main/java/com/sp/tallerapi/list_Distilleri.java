package com.sp.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.tallerapi.apiManager.RetrofitClient;
import com.sp.tallerapi.modelos.Distilleri;
import com.sp.tallerapi.modelos.DistilleriAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Distilleri extends AppCompatActivity {

    ListView listvDistilleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__distilleri);

        listvDistilleri = findViewById(R.id.listDistilleri);
        getFromInternetDisilleri();
    }

    private void getFromInternetDisilleri() {
        Call<List<Distilleri>> call = RetrofitClient.getInstance().getMyApi().getDistilleries();
        call.enqueue(new Callback<List<Distilleri>>() {

            @Override
            public void onResponse(Call<List<Distilleri>> call, Response<List<Distilleri>> response) {
                List<Distilleri> myDistilleri = response.body();
                DistilleriAdapter adapter = new DistilleriAdapter(list_Distilleri.this, myDistilleri);
                listvDistilleri.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Distilleri>> call, Throwable t) {
                Toast.makeText(list_Distilleri.this, "Falló", Toast.LENGTH_SHORT).show();
            }
        });
    }

}