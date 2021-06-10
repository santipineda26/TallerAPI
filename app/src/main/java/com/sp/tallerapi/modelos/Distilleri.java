package com.sp.tallerapi.modelos;

import com.google.gson.annotations.SerializedName;

public class Distilleri {

    @SerializedName("name")
    private String nombreDestileria;
    @SerializedName("country")
    private String ciudadDestileria;
    @SerializedName("whiskybase_rating")
    private String ratingDestileria;
    @SerializedName("slug")
    private String slug;

    public String getNombreDestileria() {
        return nombreDestileria;
    }

    public void setNombreDestileria(String nombreDestileria) {
        this.nombreDestileria = nombreDestileria;
    }

    public String getCiudadDestileria() {
        return ciudadDestileria;
    }

    public void setCiudadDestileria(String ciudadDestileria) {
        this.ciudadDestileria = ciudadDestileria;
    }

    public String getRatingDestileria() {
        return ratingDestileria;
    }

    public void setRatingDestileria(String ratingDestileria) {
        this.ratingDestileria = ratingDestileria;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
