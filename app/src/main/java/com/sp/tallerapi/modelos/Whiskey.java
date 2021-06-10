package com.sp.tallerapi.modelos;

import com.google.gson.annotations.SerializedName;

public class Whiskey {

    @SerializedName("name")
    private String nombreWhiskey;
    @SerializedName("base_currency")
    private String monedaWhiskey;
    @SerializedName("url")
    private String urlWhiskey;
    //@SerializedName("slug")
    //private String slug;


    public String getNombreWhiskey() {
        return nombreWhiskey;
    }

    public void setNombreWhiskey(String nombreWhiskey) {
        this.nombreWhiskey = nombreWhiskey;
    }

    public String getMonedaWhiskey() {
        return monedaWhiskey;
    }

    public void setMonedaWhiskey(String monedaWhiskey) {
        this.monedaWhiskey = monedaWhiskey;
    }

    public String getUrlWhiskey() {
        return urlWhiskey;
    }

    public void setUrlWhiskey(String urlWhiskey) {
        this.urlWhiskey = urlWhiskey;
    }

    /*public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

     */


}
