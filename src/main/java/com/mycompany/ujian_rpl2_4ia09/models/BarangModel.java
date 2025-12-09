/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09.models;

import jakarta.persistence.*;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "barang")
public class BarangModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "kode_barang", nullable = false)
    private String kodeBarang;
    
    @Column(name = "nama_barang", nullable = false)
    private String namaBarang;
    
    @Column(name = "kategori", nullable = false)
    private String kategori;
    
    @Column(name = "harga", nullable = false)
    private double harga;
    
    @Column(name = "stok", nullable = false)
    private int stok;

    public BarangModel() {
    }

    public BarangModel(int id, String kodeBarang, String namaBarang, String kategori, double harga, int stok) {
        this.id = id;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
