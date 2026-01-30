package com.patrick.manajemenstok.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patrick.manajemenstok.model.Barang;
import com.patrick.manajemenstok.repository.RepositoriBarang;

@Service
public class ServiceBarang {
    RepositoriBarang repositoriBarang;

    public ServiceBarang(RepositoriBarang repositoriBarang){
        this.repositoriBarang = repositoriBarang;
    }

    public List<Barang> getAllBarang(){
        return repositoriBarang.findAll();
    }

    public Barang getBarangById(long id){
        return repositoriBarang.findById(id).orElseThrow(() -> new RuntimeException("Barang tidak ditemukan"));
    }

    public Barang saveBarang(Barang barang){
        return repositoriBarang.save(barang);
    }
}
