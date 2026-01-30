package com.patrick.manajemenstok.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.patrick.manajemenstok.model.Barang;
import com.patrick.manajemenstok.service.ServiceBarang;

@RestController
@RequestMapping("/barang")
public class ControllerBarang {
    ServiceBarang serviceBarang;

    public ControllerBarang(ServiceBarang serviceBarang){
        this.serviceBarang = serviceBarang;
    }

    @GetMapping
    public List<Barang> getSemuaBarang(){
        return serviceBarang.getAllBarang();
    }

    @GetMapping("/id/{id}")
    public Barang getBarangById(@PathVariable long id){
        return serviceBarang.getBarangById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Barang buatBarang(@RequestBody Barang barang){
        return serviceBarang.saveBarang(barang);
    }
}
