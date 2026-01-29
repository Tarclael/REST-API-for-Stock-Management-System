package com.patrick.manajemenstok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.manajemenstok.model.Barang;

public interface RepositoriBarang extends JpaRepository<Barang, Long>{}
