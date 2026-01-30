package com.patrick.manajemenstok;

import com.patrick.manajemenstok.model.enumeration.JenisTransaksi;

public class RequestTransaksi {
    private long idBarang;
    private JenisTransaksi jenisTransaksi;
    private Integer jumlah;

    public long getIdBarang(){return idBarang;}
    public JenisTransaksi getJenisTransaksi(){return jenisTransaksi;}
    public Integer getJumlah(){return jumlah;}
}
