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
    private Integer stokBarang;

    public Barang(){}

    public Barang(String namaBarang, Integer stokBarang){
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public long getId(){return id;}

    public String getNamaBarang(){return namaBarang;}
    public void setNamaBarang(String namaBarang){this.namaBarang = namaBarang;}

    public Integer getStokBarang(){return stokBarang;}
    public void setStokBarang(Integer stokBarang){this.stokBarang = stokBarang;}
}
