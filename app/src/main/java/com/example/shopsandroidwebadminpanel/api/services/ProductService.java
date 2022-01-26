package com.example.shopsandroidwebadminpanel.api.services;

import com.example.shopsandroidwebadminpanel.api.ProductAPI;
import com.example.shopsandroidwebadminpanel.constans.Urls;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductService {
    private static ProductService mInstance;
    private static final String BASE_URL = Urls.BASE;
    private Retrofit mRetrofit;

    private ProductService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ProductService getInstance() {
        if (mInstance == null) {
            mInstance = new ProductService();
        }
        return mInstance;
    }

    public ProductAPI getProductsApi() {
        return mRetrofit.create(ProductAPI.class);
    }
}