package com.patrick.manajemenstok.service;

import org.springframework.stereotype.Service;

import com.patrick.manajemenstok.model.Barang;
import com.patrick.manajemenstok.model.TransaksiBarang;
import com.patrick.manajemenstok.model.enumeration.JenisTransaksi;
import com.patrick.manajemenstok.repository.RepositoriBarang;
import com.patrick.manajemenstok.repository.RepositoriTransaksiBarang;

@Service
public class ServiceTransaksiBarang {
    private RepositoriBarang repositoriBarang;
    private RepositoriTransaksiBarang repositoriTransaksiBarang;

    public ServiceTransaksiBarang(RepositoriBarang repositoriBarang, RepositoriTransaksiBarang repositoriTransaksiBarang){
        this.repositoriBarang = repositoriBarang;
        this.repositoriTransaksiBarang = repositoriTransaksiBarang;
    }

    public TransaksiBarang buatTransaksiBarang(long idBarang, JenisTransaksi jenisTransaksi, Integer jumlah){
        System.out.println("id barang masuk: " + idBarang);
        Barang barang = repositoriBarang.findById(idBarang).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));

        if(jumlah <= 0) throw new RuntimeException("Jumlah barang harus lebih dari 0!");


        if(jenisTransaksi == JenisTransaksi.KELUAR){
            if(barang.getStokBarang() < jumlah){
                throw new RuntimeException("Stok tidak mencukupi!");
            }
            barang.setStokBarang(barang.getStokBarang() - jumlah);
        }else{
            barang.setStokBarang(barang.getStokBarang() + jumlah);
        }
        repositoriBarang.save(barang);

        TransaksiBarang transaksiBarang = new TransaksiBarang(
            barang,
            jenisTransaksi,
            jumlah
        );
        return repositoriTransaksiBarang.save(transaksiBarang);
    }
}
