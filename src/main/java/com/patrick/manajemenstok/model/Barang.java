package com.patrick.manajemenstok.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String namaBarang;
    @Column(nullable = false)
    private int stokBarang;

    public Barang(String namaBarang, int stokBarang){
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getNamaBarang(){return namaBarang;}
    public void setNamaBarang(String namaBarang){this.namaBarang = namaBarang;}

    public int getStokBarang(){return stokBarang;}
    public void setStokBarang(int stokBarang){this.stokBarang = stokBarang;}
}
