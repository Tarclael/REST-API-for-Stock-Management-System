package com.patrick.manajemenstok;

import com.patrick.manajemenstok.model.enumeration.JenisTransaksi;

public class RequestTransaksi {
    private long idBarang;
    private JenisTransaksi jenisTransaksi;
    private Integer jumlah;

    public long getIdBarang(){return idBarang;}
    public void setIdBarang(long idBarang){this.idBarang = idBarang;}

    public JenisTransaksi getJenisTransaksi(){return jenisTransaksi;}
    public void setJenisTransaksi(JenisTransaksi jenisTransaksi){this.jenisTransaksi = jenisTransaksi;}

    public Integer getJumlah(){return jumlah;}
    public void setJumlah(Integer jumlah){this.jumlah = jumlah;}
}
