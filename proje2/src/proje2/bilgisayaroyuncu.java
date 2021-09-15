/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

/**
 *
 * @author Ayşenur Akpınar
 */
public class bilgisayaroyuncu extends oyuncu{
    bilgisayaroyuncu(){}
    bilgisayaroyuncu(String oyuncuID,String oyuncuAdi){
    this.oyuncuAdi=oyuncuAdi;
    this.oyuncuID=oyuncuID;
    
    }

    @Override
    void kartseçim() {
        super.kartseçim(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

   
    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }
    
    
    
}
