package com.example.shopsandroidwebadminpanel.api;

import com.example.shopsandroidwebadminpanel.dto.ProductDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ProductAPI {
    @GET("/api/products/all")
    public Call<List<ProductDTO>> all();

    @POST("/api/Products/post")
    public Call<Void> post(@Body ProductDTO productDTO);

    @DELETE("/api/products/delete")
    public Call<ProductDTO> delete(@Body ProductDTO productDTO);
}