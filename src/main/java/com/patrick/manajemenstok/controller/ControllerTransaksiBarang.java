package com.patrick.manajemenstok.controller;

import org.springframework.web.bind.annotation.RestController;

import com.patrick.manajemenstok.RequestTransaksi;
import com.patrick.manajemenstok.model.TransaksiBarang;
import com.patrick.manajemenstok.service.ServiceTransaksiBarang;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/transaksi")
public class ControllerTransaksiBarang {
    private final ServiceTransaksiBarang serviceTransaksiBarang;

    public ControllerTransaksiBarang(ServiceTransaksiBarang serviceTransaksiBarang){
        this.serviceTransaksiBarang = serviceTransaksiBarang;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TransaksiBarang buatTransaksiBarang(@RequestBody RequestTransaksi requestTransaksi){
        return serviceTransaksiBarang.buatTransaksiBarang(requestTransaksi.getIdBarang(), requestTransaksi.getJenisTransaksi(), requestTransaksi.getJumlah());
    }
}
