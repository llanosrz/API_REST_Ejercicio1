package com.example.services;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

import com.example.entities.Mascota;

public interface MascotaService {

    public List<Mascota> findAll(Sort sort);
    //public Mascota findById(long id);
    public void save(Mascota mascota);
    public void deleteById(long id);
}
