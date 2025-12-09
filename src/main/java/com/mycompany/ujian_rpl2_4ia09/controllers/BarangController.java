/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09.controllers;

import com.mycompany.ujian_rpl2_4ia09.models.BarangModel;
import com.mycompany.ujian_rpl2_4ia09.services.BarangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author LENOVO
 */
@Controller
public class BarangController {
    
    @Autowired
    private BarangService barangService;
    
    // Create barng
    public void addBarang(BarangModel barang) {
        barangService.addBarang(barang);
    }
    
    // Get by id 
    public BarangModel getBarangById(int id) {
        return barangService.getBarangById(id);
    }
    
    // Get all
    public List<BarangModel> getAllBarang() {
        return barangService.getAllBarang();
    }
    
    // Update barang
    public void updateBarang(BarangModel barang) {
        barangService.updateBarang(barang);
    }
    
    // Delete barang
    public void deleteBarangById(int id) {
        barangService.deleteBarangById(id);
    }
}
