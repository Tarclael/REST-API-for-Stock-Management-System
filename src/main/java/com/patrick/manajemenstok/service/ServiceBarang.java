package com.patrick.manajemenstok.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patrick.manajemenstok.model.Barang;
import com.patrick.manajemenstok.repository.RepositoriBarang;

@Service
public class ServiceBarang {
    private RepositoriBarang repositoriBarang;

    public ServiceBarang(RepositoriBarang repositoriBarang){
        this.repositoriBarang = repositoriBarang;
    }

    public List<Barang> getAllBarang(){
        return repositoriBarang.findAll();
    }

    public Barang getBarangById(long id){
        return repositoriBarang.findById(id).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));
    }

    public List<Barang> saveBarang(List<Barang> listBarang){
        return repositoriBarang.saveAll(listBarang);
    }

    public Barang updateBarang(long id, Barang barangBaru){
        Barang barang = repositoriBarang.findById(id).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));

        barang.setNamaBarang(barangBaru.getNamaBarang());
        barang.setStokBarang(barangBaru.getStokBarang());

        return repositoriBarang.save(barang);
    }

    public Barang patchBarang(long id, Barang barangBaru){
        Barang barang = repositoriBarang.findById(id).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));

        if(barangBaru.getNamaBarang() != null){
            barang.setNamaBarang(barangBaru.getNamaBarang());
        }

        if(barangBaru.getStokBarang() != null){
            barang.setStokBarang(barangBaru.getStokBarang());
        }
        return repositoriBarang.save(barang);
    }

    public void hapusBarang(long id){
        Barang barang = repositoriBarang.findById(id).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));

        repositoriBarang.delete(barang);
    }
}
