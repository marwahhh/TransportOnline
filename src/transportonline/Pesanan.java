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
public class Pesanan {
    private String idTrans;
    private String jenisPesanan;
    private String tujuan;
    private int tarif;
    private int jarak;

    public Pesanan(String idTrans, String jenisPesanan, 
            String tujuan, int jarak, int tarif){
        this.idTrans = idTrans;
        this.jenisPesanan = jenisPesanan;
        this.tujuan = tujuan;
        this.tarif  = tarif;
        this.jarak = jarak;
        
    }
    
    public String getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(String idTrans) {
        this.idTrans = idTrans;
    }

    public String getJenisPesanan() {
        return jenisPesanan;
    }

    public void setJenisPesanan(String jenisPesanan) {
        this.jenisPesanan = jenisPesanan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }
    
}
