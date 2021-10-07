package com.company;

public class Bil {
    String biltype;
    String model;
    String stelnummer;
    int antalDøre;
    String softwareversion;
    double gps_koordinater1;
    double gps_koordinater2;
    float hastighed;
    float accel;

    public Bil(String biltype, String model, String stelnummer, int antalDøre, String softwareversion, double gps_koordinater1, double gps_koordinater2, float hastighed, float accel) {
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antalDøre = antalDøre;
        this.softwareversion = softwareversion;
        this.gps_koordinater1 = gps_koordinater1;
        this.gps_koordinater2 = gps_koordinater2;
        this.hastighed = hastighed;
        this.accel = accel;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "biltype='" + biltype + '\'' +
                ", model='" + model + '\'' +
                ", stelnummer='" + stelnummer + '\'' +
                ", døre=" + antalDøre +
                ", softwareversion='" + softwareversion + '\'' +
                ", gps_koordinater=" + gps_koordinater1 +
                ", gps_koordinater=" + gps_koordinater2 +
                ", hastighed=" + hastighed +
                ", accel=" + accel +
                '}';
    }

    public double getGps_koordinater1() {
        return gps_koordinater1;
    }

    public void setGps_koordinater1(double gps_koordinater1) {
        this.gps_koordinater1 = gps_koordinater1;
    }

    public double getGps_koordinater2() {
        return gps_koordinater2;
    }

    public void setGps_koordinater2(double gps_koordinater2) {
        this.gps_koordinater2 = gps_koordinater2;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getDøre() {
        return antalDøre;
    }

    public void setDøre(int døre) {
        this.antalDøre = døre;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    public float getHastighed() {
        return hastighed;
    }

    public void setHastighed(float hastighed) {
        this.hastighed = hastighed;
    }

    public float getAccel() {
        return accel;
    }

    public void setAccel(float accel) {
        this.accel = accel;
    }


}
