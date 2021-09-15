/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ayşenur Akpınar
 */

public class Proje2 {
   static int kart1hasar,kart2hasar,kart3hasar,kart4hasar,kart5hasar,kart6hasar;
   static ArrayList<pokemon> list=new ArrayList<pokemon>();
   static ArrayList<pokemon> bilgliste=new ArrayList<pokemon>();  
   static ArrayList<pokemon> liste=new ArrayList<pokemon>(); 
   static ArrayList<pokemon> bil1=new ArrayList<pokemon>(); 
   static ArrayList<pokemon> bil2=new ArrayList<pokemon>(); 
      static  bilgisayaroyuncu blgsyr=new bilgisayaroyuncu();
       static  ArrayList<pokemon> insanliste=new ArrayList<pokemon>(); 
        static insanoyuncu insan=new insanoyuncu();
     static int sayaç=0;
     static String sayaçnot;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mainframe frame=new Mainframe();
        
        
        
        frame.setVisible(true);
        JButton kart1=new JButton();
          kart1=frame.getKart1();
           JButton kart2=new JButton();
          kart2=frame.getKart2();
           JButton kart3=new JButton();
          kart3=frame.getKart3();
           JButton kart4=new JButton();
          kart4=frame.getKart4();
           JButton kart5=new JButton();
          kart5=frame.getKart5();
           JButton kart6=new JButton();
          kart6=frame.getKart6();
           JButton kart7=new JButton();
          kart7=frame.getKart7();
           JButton kart8=new JButton();
          kart8=frame.getKart8();
           JButton kart9=new JButton();
          kart9=frame.getKart9();
           JButton kart10=new JButton();
          kart10=frame.getKart10();
           JButton kart11=new JButton();
          kart11=frame.getKart11();
       
        System.out.println("buda görünüyor");
        pikachu pkc=new pikachu("01","pikachu","elektrik");
        
        charmander chr=new charmander("02","charmander","ateş");
        
        squirtle sqrt=new squirtle("03","squirtle","su");
        
        bilgvsbilg no1=new bilgvsbilg();
        Random rnd=new Random();
        bulbasaur bulb=new bulbasaur("04","bulbasaur","çim");
        butterfree butter=new butterfree("05","butterfree","hava");
        jigglypuff jiggly=new jigglypuff("06","jigglypuff","ses");
        meowth meow=new meowth("07","meowth","normal");
        psyduck psy=new psyduck("08","psyduck","su");
        snorlax snor=new snorlax("09","snorlax","normal");
        zubat zbt=new zubat("10","zubat","hava");
       list.add(pkc);
       list.add(chr); 
       list.add(sqrt);
       list.add(bulb);
       list.add(butter);
       list.add(jiggly);
       list.add(meow);
       list.add(psy);
       list.add(snor);
       list.add(zbt);
       liste.add(pkc);
       liste.add(chr); 
       liste.add(sqrt);
       liste.add(bulb);
       liste.add(butter);
       liste.add(jiggly);
       liste.add(meow);
       liste.add(psy);
       liste.add(snor);
       liste.add(zbt);
        
        int i;
        for(i=0;i<3;i++){
            int randomindex=(int)(Math.random()*list.size());
            
            bilgliste.add(list.get(randomindex));
            
          
            list.remove(list.get(randomindex));
       
        }
        for(i=0;i<3;i++){
            int randomindex=(int)(Math.random()*list.size());
          
            insanliste.add(list.get(randomindex));
            
         
            list.remove(list.get(randomindex));
       
        }
      pokemon a=new pokemon();
        a=insanliste.get(0);
    
        
     
               
        if(a instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) a;
   
         kart1.setIcon(d.image);
         kart1hasar=d.hasar;
            }
        if(a instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) a;
    
         kart1.setIcon(d.image);
         kart1hasar=d.hasar;
            }
        if(a instanceof charmander){
        charmander d=new charmander();
        d=(charmander) a;
        
           kart1.setIcon(d.image);
           kart1hasar=d.hasar;
            }
        if(a instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) a;
       
           kart1.setIcon(d.image);
           kart1hasar=d.hasar;
            }
        if(a instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) a;
        
        
            kart1.setIcon(d.image);
            kart1hasar=d.hasar;
         
            }
        if(a instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) a;
        
           kart1.setIcon(d.image);
           kart1hasar=d.hasar;
         
            }
        if(a instanceof meowth){
        meowth d=new meowth();
        d=(meowth) a;
        
         kart1.setIcon(d.image);
         kart1hasar=d.hasar;}
            
        if(a instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) a;
        
           kart1.setIcon(d.image);
           kart1hasar=d.hasar;
            }
        if(a instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) a;
        
          kart1.setIcon(d.image);
          kart1hasar=d.hasar;
            }
        if(a instanceof zubat){
        zubat d=new zubat();
        d=(zubat) a;
        
          kart1.setIcon(d.image);
          kart1hasar=d.hasar;
            }
        pokemon b=new pokemon();
        b=insanliste.get(1);
        
        b=insanliste.get(1);
       
        
             if(b instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) b;
        
         kart2.setIcon(d.image);
         kart2hasar=d.hasar;
            }
        if(b instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) b;
        
         kart2.setIcon(d.image);
         kart2hasar=d.hasar;
            }
        if(b instanceof charmander){
        charmander d=new charmander();
        d=(charmander) b;
        
           kart2.setIcon(d.image);
           kart2hasar=d.hasar;
            }
        if(b instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) b;
        
           kart2.setIcon(d.image);
           kart2hasar=d.hasar;
            }
        if(b instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) b;
        
            kart2.setIcon(d.image);
            kart2hasar=d.hasar;
         
            }
        if(b instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) b;
        
           kart2.setIcon(d.image);
           kart2hasar=d.hasar;
         
            }
        if(b instanceof meowth){
        meowth d=new meowth();
        d=(meowth) b;
        
         kart2.setIcon(d.image);
         kart2hasar=d.hasar;
            }
        if(b instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) b;
        
           kart2.setIcon(d.image);
           kart2hasar=d.hasar;
            }
        if(b instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) b;
       
          kart2.setIcon(d.image);
          kart2hasar=d.hasar;
            }
        if(b instanceof zubat){
        zubat d=new zubat();
        d=(zubat) b;
      
          kart2.setIcon(d.image);
          kart2hasar=d.hasar;
            }
        pokemon c=new pokemon();
        c=insanliste.get(2);
       
     
        
         if(c instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) c;
      
         kart3.setIcon(d.image);
         kart3hasar=d.hasar;
            }
        if(c instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) c;
       
         kart3.setIcon(d.image);
         kart3hasar=d.hasar;
            }
        if(c instanceof charmander){
        charmander d=new charmander();
        d=(charmander) c;
      
           kart3.setIcon(d.image);
           kart3hasar=d.hasar;
            }
        if(c instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) c;
        
           kart3.setIcon(d.image);
           kart3hasar=d.hasar;
            }
        if(c instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) c;
        
            kart3.setIcon(d.image);
            kart3hasar=d.hasar;
         
            }
        if(c instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) c;
        
           kart3.setIcon(d.image);
           kart3hasar=d.hasar;
         
            }
        if(c instanceof meowth){
        meowth d=new meowth();
        d=(meowth) c;
        
         kart3.setIcon(d.image);
         kart3hasar=d.hasar;
            }
        if(c instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) c;
        
           kart3.setIcon(d.image);
           kart3hasar=d.hasar;
            }
        if(c instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) c;
       
          kart3.setIcon(d.image);
          kart3hasar=d.hasar;
            }
        if(c instanceof zubat){
        zubat d=new zubat();
        d=(zubat) c;
        
          kart3.setIcon(d.image);
          kart3hasar=d.hasar;
            }
        pokemon ba=new pokemon();
        ba=bilgliste.get(0);
        

                 
        if(ba instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) ba;
        
         kart4.setIcon(d.image);
         kart4hasar=d.hasar;
            }
        if(ba instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) ba;
        
         kart4.setIcon(d.image);
          kart4hasar=d.hasar;
            }
        if(ba instanceof charmander){
        charmander d=new charmander();
        d=(charmander) ba;
        
           kart4.setIcon(d.image);
            kart4hasar=d.hasar;
            }
        if(ba instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) ba;
        
           kart4.setIcon(d.image);
            kart4hasar=d.hasar;
            }
        if(ba instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) ba;
        
            kart4.setIcon(d.image);
             kart4hasar=d.hasar;
         
            }
        if(ba instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) ba;
        
           kart4.setIcon(d.image);
            kart4hasar=d.hasar;
         
            }
        if(ba instanceof meowth){
        meowth d=new meowth();
        d=(meowth) ba;
       
         kart4.setIcon(d.image);
          kart4hasar=d.hasar;
            }
        if(ba instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) ba;
        
           kart4.setIcon(d.image);
            kart4hasar=d.hasar;
            }
        if(ba instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) ba;
       
          kart4.setIcon(d.image);
           kart4hasar=d.hasar;
            }
        if(ba instanceof zubat){
        zubat d=new zubat();
        d=(zubat) ba;
        
          kart4.setIcon(d.image);
           kart4hasar=d.hasar;
            }
        pokemon bb=new pokemon();
        bb=bilgliste.get(1);
        
      
             if(bb instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) bb;
       
         kart5.setIcon(d.image);
          kart5hasar=d.hasar;
            }
        if(bb instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) bb;
        
         kart5.setIcon(d.image);
         kart5hasar=d.hasar;
            }
        if(bb instanceof charmander){
        charmander d=new charmander();
        d=(charmander) bb;
       
           kart5.setIcon(d.image);
           kart5hasar=d.hasar;
            }
        if(bb instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) bb;
        
           kart5.setIcon(d.image);
           kart5hasar=d.hasar;
            }
        if(bb instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) bb;
        
            kart5.setIcon(d.image);
            kart5hasar=d.hasar;
         
            }
        if(bb instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) bb;
        
           kart5.setIcon(d.image);
           kart5hasar=d.hasar;
         
            }
        if(bb instanceof meowth){
        meowth d=new meowth();
        d=(meowth) bb;
        
         kart5.setIcon(d.image);
         kart5hasar=d.hasar;
            }
        if(bb instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) bb;
      
           kart5.setIcon(d.image);
           kart5hasar=d.hasar;
            }
        if(bb instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) bb;
        
          kart5.setIcon(d.image);
          kart5hasar=d.hasar;
            }
        if(bb instanceof zubat){
        zubat d=new zubat();
        d=(zubat) bb;
        
          kart5.setIcon(d.image);
          kart5hasar=d.hasar;
            }
        pokemon bc=new pokemon();
        bc=bilgliste.get(2);
       
     
         if(bc instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) bc;
        
         kart6.setIcon(d.image);
         kart6hasar=d.hasar;
            }
        if(bc instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) bc;
       
         kart6.setIcon(d.image);
         kart6hasar=d.hasar;
            }
        if(bc instanceof charmander){
        charmander d=new charmander();
        d=(charmander) bc;
        
           kart6.setIcon(d.image);
           kart6hasar=d.hasar;
            }
        if(bc instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) bc;
        
           kart6.setIcon(d.image);
           kart6hasar=d.hasar;
            }
        if(bc instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) bc;
        
            kart6.setIcon(d.image);
            kart6hasar=d.hasar;
         
            }
        if(bc instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) bc;
       
           kart6.setIcon(d.image);
         kart6hasar=d.hasar;
            }
        if(bc instanceof meowth){
        meowth d=new meowth();
        d=(meowth) bc;
        
         kart6.setIcon(d.image);
         kart6hasar=d.hasar;
            }
        if(bc instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) bc;
       
           kart6.setIcon(d.image);
           kart6hasar=d.hasar;
            }
        if(bc instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) bc;
       
          kart6.setIcon(d.image);
          kart6hasar=d.hasar;
            }
        if(bc instanceof zubat){
        zubat d=new zubat();
        d=(zubat) bc;
        
          kart6.setIcon(d.image);
          kart6hasar=d.hasar;
            }
        
 
   
     
    }

    public static int getKart1hasar() {
        return kart1hasar;
    }

    public static int getKart2hasar() {
        return kart2hasar;
    }

    public static int getKart3hasar() {
        return kart3hasar;
    }

    public static int getKart4hasar() {
        return kart4hasar;
    }

    public static int getKart5hasar() {
        return kart5hasar;
    }

    public static int getKart6hasar() {
        return kart6hasar;
    }

    public static ArrayList<pokemon> getList() {
        return list;
    }

    public static ArrayList<pokemon> getBilgliste() {
        return bilgliste;
    }

    public static bilgisayaroyuncu getBlgsyr() {
        return blgsyr;
    }

    public static ArrayList<pokemon> getInsanliste() {
        return insanliste;
    }

    public static insanoyuncu getInsan() {
        return insan;
    }

    public static int getSayaç() {
        return sayaç;
    }
public static String getSayaçnot() {
        return sayaçnot;
    }
    
}
        
    
    
