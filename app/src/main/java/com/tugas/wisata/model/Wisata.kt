package com.tugas.wisata.model

class Wisata(
    private var nama: String,
    private var alamat: String,
    private var deskripsi: String,
    private var gambar1: Int,
    private var gambar2: Int
) {

    // Getter dan Setter untuk properti nama
    fun getNama(): String {
        return nama
    }

    fun setNama(nama: String) {
        this.nama = nama
    }

    // Getter dan Setter untuk properti alamat
    fun getAlamat(): String {
        return alamat
    }

    fun setAlamat(alamat: String) {
        this.alamat = alamat
    }

    // Getter dan Setter untuk properti deskripsi
    fun getDeskripsi(): String {
        return deskripsi
    }

    fun setDeskripsi(deskripsi: String) {
        this.deskripsi = deskripsi
    }

    // Getter dan Setter untuk properti gambar1
    fun getGambar1(): Int {
        return gambar1
    }

    fun setGambar1(gambar1: Int) {
        this.gambar1 = gambar1
    }

    // Getter dan Setter untuk properti gambar2
    fun getGambar2(): Int {
        return gambar2
    }

    fun setGambar2(gambar2: Int) {
        this.gambar2 = gambar2
    }
}