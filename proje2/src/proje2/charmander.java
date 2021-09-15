/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import javax.swing.ImageIcon;

/**
 *
 * @author Ayşenur Akpınar
 */
public class charmander extends pokemon {
      public String dosyayolu="src\\img\\char.jpg";
    public String getdosyayolu(){
        return dosyayolu;
    }
     public ImageIcon image=new ImageIcon(dosyayolu);
    
    public int hasar=60;
    
    
    
    
    public charmander(){}
    public charmander(String pokemonID,String pokemonAdi,String pokemonTip){
    super(pokemonID,pokemonAdi,pokemonTip);
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }
    
}
