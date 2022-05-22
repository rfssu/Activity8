package com.example.activity8.database;

import java.io.Serializable;

public class Teman implements Serializable {

    String id, nama, telpon;

    public Teman() {
        this.id = id;
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getTelpon() {

        return telpon;
    }

    public void setTelpon(String telpon) {

        this.telpon = telpon;
    }
}
