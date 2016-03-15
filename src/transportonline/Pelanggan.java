/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestransportonline;

/**
 *
 * @author Rayiemas Manggala P
 */
public class Pelanggan extends Orang {

    private Pesanan[] pesanan;

    private String alamat;
    private int jmlPesanan;

    public Pelanggan(String nama, String jenKel, String noTelp) {
        super(nama, jenKel, noTelp);
        pesanan = new Pesanan[100];
    }

    public long getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(long idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void createPesanan(String idTrans, String jenisPesanan,
            String tujuan, int jarak, int tarif) {
        pesanan[jmlPesanan] = new Pesanan(idTrans, jenisPesanan,
                tujuan, jarak, tarif);
        jmlPesanan++;
    }

    public void createPesananKurir(String idTrans, String jenisPesanan,
            String tujuan, int jarak, int tarif, String namaBarang) {
        pesanan[jmlPesanan] = new Kurir(idTrans, jenisPesanan,
                tujuan, jarak, tarif, namaBarang);
        jmlPesanan++;
    }

    public void removePesanan(String idTrans) {
        boolean found = false;
        for (int i = 0; i < jmlPesanan; i++) {
            if(pesanan[i].getIdTrans().equals(idTrans)){
                found = true;
                for(int j=i; j < jmlPesanan; j++){
                    pesanan[j] = pesanan[j+1];
                }
                jmlPesanan--;
                break;
            }
        }
        if(found == false){
            System.out.println("Pesanan Tidak Ditemukan.");
        }
    }

    public Pesanan getPesanan(int n) {
        return pesanan[n];
    }
}
