package com.patrick.manajemenstok.model;

import com.patrick.manajemenstok.model.enumeration.JenisTransaksi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaksi_barang")
public class TransaksiBarang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Barang barang;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private JenisTransaksi jenisTransaksi;

    @Column(nullable = false)
    private Integer jumlah;

    public TransaksiBarang(){}

    public TransaksiBarang(Barang barang, JenisTransaksi jenisTransaksi, Integer jumlah){
        this.barang = barang;
        this.jenisTransaksi = jenisTransaksi;
        this.jumlah = jumlah;
    }

    public long getIdTransaksi(){return id;}

    public Barang getBarang(){return barang;}
    public void setBarang(Barang barang){this.barang = barang;}

    public JenisTransaksi getJenisTransaksi(){return jenisTransaksi;}
    public void setJenisTransaksi(JenisTransaksi jenisTransaksi){this.jenisTransaksi = jenisTransaksi;}

    public Integer getJumlah(){return jumlah;}
    public void setJumlah(Integer jumlah){this.jumlah = jumlah;}
}
