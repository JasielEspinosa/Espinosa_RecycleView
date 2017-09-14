package com.iics.ust.myapplicationrecycleview;

/**
 * Created by 9720JAS-PC-LT on 9/14/2017.
 */

public class AndroidVersion {
    int logo;
    String condename, version, api, date;

    public AndroidVersion (int logo, String codename, String version, String api, String date){
        this.logo = logo;
        this.condename = codename;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCondename() {
        return condename;
    }

    public void setCondename(String condename) {
        this.condename = condename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
