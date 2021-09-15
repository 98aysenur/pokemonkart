package proje2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayşenur Akpınar
 */
public class pokemon {
    
     public String dosyayolu;
    
    private String pokemonID;
    private String pokemonAdi;
    private String pokemonTip;
    private int hasar;
    
    
    public pokemon(){}
    public pokemon(String pokemonID,String pokemonAdi,String pokemonTip){
   
    this.pokemonAdi=pokemonAdi;
    this.pokemonID=pokemonID;
    this.pokemonTip=pokemonTip;
    
    
    
    
    }

   

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

   

    public int getHasar() {
        return hasar;
    }
    
    
 

    public String getDosyayolu() {
        return dosyayolu;
    }
  
    
    
    
    
    
    
    
}
