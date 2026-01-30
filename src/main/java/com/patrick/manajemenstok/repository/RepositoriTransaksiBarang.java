package com.patrick.manajemenstok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.manajemenstok.model.TransaksiBarang;

public interface RepositoriTransaksiBarang extends JpaRepository<TransaksiBarang, Long>{

}
