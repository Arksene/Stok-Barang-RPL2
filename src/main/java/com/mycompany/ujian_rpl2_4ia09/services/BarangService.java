/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09.services;

import com.mycompany.ujian_rpl2_4ia09.models.BarangModel;
import com.mycompany.ujian_rpl2_4ia09.repositories.BarangRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class BarangService {
    
    @Autowired
    private BarangRepository repository;

    // Create function
    public void addBarang(BarangModel barang) {
        repository.save(barang);
    }
    
    // Read functino
    public BarangModel getBarangById(int id) {
        return repository.findById(id).orElse(null);
    }
    
    // Read all functino
    public List<BarangModel> getAllBarang() {
        return repository.findAll();
    }
    
    // Update function
    public void updateBarang(BarangModel barang) {
        repository.save(barang);
    }
    
    // Delete function
    public void deleteBarangById(int id) {
        repository.deleteById(id);
    }
}
