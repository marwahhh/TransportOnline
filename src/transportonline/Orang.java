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
public abstract class Orang {
    private String nama;
    private String jenKel;
    private String noTelp;
    
    public Orang(String nama, String jenKel, String noTelp){
        this.nama = nama;
        this.jenKel = jenKel;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenKel() {
        return jenKel;
    }

    public void setJenKel(String jenKel) {
        this.jenKel = jenKel;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
}
