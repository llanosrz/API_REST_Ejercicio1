package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.MascotaDao;
import com.example.entities.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaDao mascotaDao;

    @Override
    public List<Mascota> findAll(Sort sort) {
        return mascotaDao.findAll();
    }

    // @Override
    // public Mascota findById(long id) {
    //     return mascotaDao.findById(id).get();
    // }

    @Override
    public void save(Mascota mascota) {
        mascotaDao.save(mascota);
    }

    @Override
    public void deleteById(long id) {
        mascotaDao.deleteById(id);
    }
    
}
