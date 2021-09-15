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
public class oyuncu  {
    String oyuncuID;
    String oyuncuAdi;
    int skor=0;
    oyuncu(){}
    oyuncu(String oyuncuID,String oyuncuAdi){
    this.oyuncuAdi=oyuncuAdi;
    this.oyuncuID=oyuncuID;
    
    }
   void kartseçim(){
    
       
       
   
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
