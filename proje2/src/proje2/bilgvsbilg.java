/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.util.ArrayList;
import static proje2.Mainframe.list;

import static proje2.Proje2.insanliste;


/**
 *
 * @author Ayşenur Akpınar
 */
public class bilgvsbilg extends javax.swing.JFrame {
static int b1hasar,b2hasar,b3hasar,b4hasar,b5hasar,b6hasar,b7hasar,b8hasar,b9hasar,b10hasar,b11hasar,b12hasar;
static ArrayList<pokemon> liste=new ArrayList<pokemon>(); 
   static ArrayList<pokemon> bil1=new ArrayList<pokemon>(); 
   static ArrayList<pokemon> bil2=new ArrayList<pokemon>(); 
   static  bilgisayaroyuncu bilg1=new bilgisayaroyuncu();
   static  bilgisayaroyuncu bilg2=new bilgisayaroyuncu();
   static int bsayaç,b2sayaç;
    /**
     * Creates new form bilgvsbilg
     */
    public bilgvsbilg() {
        initComponents();
        b9.setVisible(false);
         b10.setVisible(false);
          b11.setVisible(false);
           b12.setVisible(false);
           bil1tebrik.setVisible(false);
           bil2tebrik.setVisible(false);
           berabere.setVisible(false);
        bsayaç=0;
        b2sayaç=0;
        pikachu pkc=new pikachu("01","pikachu","elektrik");
        
        charmander chr=new charmander("02","charmander","ateş");
        
        squirtle sqrt=new squirtle("03","squirtle","su");
        bulbasaur bulb=new bulbasaur("04","bulbasaur","çim");
        butterfree butter=new butterfree("05","butterfree","hava");
        jigglypuff jiggly=new jigglypuff("06","jigglypuff","ses");
        meowth meow=new meowth("07","meowth","normal");
        psyduck psy=new psyduck("08","psyduck","su");
        snorlax snor=new snorlax("09","snorlax","normal");
        zubat zbt=new zubat("10","zubat","hava");
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
        for(i=0;i<5;i++){
            int randomindex=(int)(Math.random()*liste.size());
           
            bil1.add(liste.get(randomindex));
            
           
            liste.remove(liste.get(randomindex));
       
        }
        for(i=0;i<5;i++){
            int randomindex=(int)(Math.random()*liste.size());
           
            bil2.add(liste.get(randomindex));
            
          
            liste.remove(liste.get(randomindex));
       
        }
       
            
        pokemon a=new pokemon();
        a=bil1.get(0);
      
        
     
                 
        if(a instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) a;
        
         b1.setIcon(d.image);
         b1hasar=d.hasar;
            }
        if(a instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) a;
     
         b1.setIcon(d.image);
    b1hasar=d.hasar;
            }
        if(a instanceof charmander){
        charmander d=new charmander();
        d=(charmander) a;
       
           b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        if(a instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) a;
        
           b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        if(a instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) a;
       
            b1.setIcon(d.image);
            b1hasar=d.hasar;
         
            }
        if(a instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) a;
        
           b1.setIcon(d.image);
           b1hasar=d.hasar;
         
            }
        if(a instanceof meowth){
        meowth d=new meowth();
        d=(meowth) a;
        
         b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        if(a instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) a;
        
          b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        if(a instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) a;
       
          b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        if(a instanceof zubat){
        zubat d=new zubat();
        d=(zubat) a;
        
          b1.setIcon(d.image);
           b1hasar=d.hasar;
            }
        pokemon b=new pokemon();
        b=bil1.get(1);
        
      
             if(b instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) b;
        
         b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) b;
        
         b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof charmander){
        charmander d=new charmander();
        d=(charmander) b;
        
          b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) b;
       
           b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) b;
        
            b2.setIcon(d.image);
         b2hasar=d.hasar;
         
            }
        if(b instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) b;
        
           b2.setIcon(d.image);
         b2hasar=d.hasar;
         
            }
        if(b instanceof meowth){
        meowth d=new meowth();
        d=(meowth) b;
       
          b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) b;
        
            b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) b;
       
          b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        if(b instanceof zubat){
        zubat d=new zubat();
        d=(zubat) b;
        
           b2.setIcon(d.image);
         b2hasar=d.hasar;
            }
        pokemon c=new pokemon();
        c=bil1.get(2);
        
           
        
         if(c instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) c;
        
         b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) c;
       
         b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof charmander){
        charmander d=new charmander();
        d=(charmander) c;
        
      b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) c;
        
            b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) c;
       
        b3.setIcon(d.image);
         b3hasar=d.hasar;
         
            }
        if(c instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) c;
        
           b3.setIcon(d.image);
         b3hasar=d.hasar;
         
            }
        if(c instanceof meowth){
        meowth d=new meowth();
        d=(meowth) c;
        
        b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) c;
       
         b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) c;
       
           b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
        if(c instanceof zubat){
        zubat d=new zubat();
        d=(zubat) c;
        
           b3.setIcon(d.image);
         b3hasar=d.hasar;
            }
       pokemon ba=new pokemon();
        ba=bil2.get(0);
        
   
                 
        if(ba instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) ba;
        
         b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) ba;
       
        b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof charmander){
        charmander d=new charmander();
        d=(charmander) ba;
      
           b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) ba;
        
          b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) ba;
       
         b4.setIcon(d.image);
         b4hasar=d.hasar;
         
            }
        if(ba instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) ba;
       
          b4.setIcon(d.image);
         b4hasar=d.hasar;
         
            }
        if(ba instanceof meowth){
        meowth d=new meowth();
        d=(meowth) ba;
   
         b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) ba;
        
           b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) ba;
       
          b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        if(ba instanceof zubat){
        zubat d=new zubat();
        d=(zubat) ba;
       
         b4.setIcon(d.image);
         b4hasar=d.hasar;
            }
        pokemon bb=new pokemon();
        bb=bil2.get(1);
        
    
             if(bb instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) bb;
        
           b5.setIcon(d.image);
           b5hasar=d.hasar;
         
            }
        if(bb instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) bb;
       
          b5.setIcon(d.image);
           b5hasar=d.hasar;
      
            }
        if(bb instanceof charmander){
        charmander d=new charmander();
        d=(charmander) bb;
       
           b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        if(bb instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) bb;
        
             b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        if(bb instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) bb;
        
           b5.setIcon(d.image);
           b5hasar=d.hasar;
         
            }
        if(bb instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) bb;
       
            b5.setIcon(d.image);
           b5hasar=d.hasar;
         
            }
        if(bb instanceof meowth){
        meowth d=new meowth();
        d=(meowth) bb;
   
      b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        if(bb instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) bb;
        
           b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        if(bb instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) bb;
        
         b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        if(bb instanceof zubat){
        zubat d=new zubat();
        d=(zubat) bb;
        
            b5.setIcon(d.image);
           b5hasar=d.hasar;
            }
        pokemon bc=new pokemon();
        bc=bil2.get(2);
        
           
        
         if(bc instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) bc;
        
         b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) bc;
       
       b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof charmander){
        charmander d=new charmander();
        d=(charmander) bc;
        
          b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) bc;
        
          b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) bc;
        
            b6.setIcon(d.image);
         b6hasar=d.hasar;
         
            }
        if(bc instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) bc;
        
           b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof meowth){
        meowth d=new meowth();
        d=(meowth) bc;
        
         b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) bc;
        
       b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) bc;
     
         b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        if(bc instanceof zubat){
        zubat d=new zubat();
        d=(zubat) bc;
        
           b6.setIcon(d.image);
         b6hasar=d.hasar;
            }
        pokemon pa=new pokemon();
        pa=bil1.get(3);
       
        
     
                 
        if(pa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) pa;
        
         b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) pa;
        
        b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) pa;
        
           b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) pa;
       
           b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) pa;
        
        
            b9.setIcon(d.image);
         b9hasar=d.hasar;
         
            }
        if(pa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) pa;
        
        
           b9.setIcon(d.image);
         b9hasar=d.hasar;
         
            }
        if(pa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) pa;
        
          b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) pa;
       
          b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) pa;
       
           b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
        if(pa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) pa;
        
           b9.setIcon(d.image);
         b9hasar=d.hasar;
            }
         pokemon fa=new pokemon();
        fa=bil1.get(4);
        
        
     
                 
        if(fa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) fa;
        
         b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) fa;
        
          b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) fa;
       
           b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) fa;
        
         b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) fa;
       
          b10.setIcon(d.image);
         b10hasar=d.hasar;
         
            }
        if(fa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) fa;
        
           b10.setIcon(d.image);
         b10hasar=d.hasar;
         
            }
        if(fa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) fa;
        
        b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) fa;
        
          b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) fa;
        
          b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
        if(fa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) fa;
        
         b10.setIcon(d.image);
         b10hasar=d.hasar;
            }
         pokemon da=new pokemon();
        da=bil2.get(3);
        
        
     
                 
        if(da instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) da;
        
         b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) da;
       
        b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof charmander){
        charmander d=new charmander();
        d=(charmander) da;
        
          b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) da;
        
          b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) da;
        
          b11.setIcon(d.image);
         b11hasar=d.hasar;
         
            }
        if(da instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) da;
        
          b11.setIcon(d.image);
         b11hasar=d.hasar;
         
            }
        if(da instanceof meowth){
        meowth d=new meowth();
        d=(meowth) da;
        
        b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) da;
        
         b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) da;
        
        b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
        if(da instanceof zubat){
        zubat d=new zubat();
        d=(zubat) da;
        
          b11.setIcon(d.image);
         b11hasar=d.hasar;
            }
         pokemon ma=new pokemon();
        ma=bil2.get(4);
       
        
     
                 
        if(ma instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) ma;
        
         b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) ma;
        
         b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof charmander){
        charmander d=new charmander();
        d=(charmander) ma;
        
            b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) ma;
        
           b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) ma;
        
             b12.setIcon(d.image);
         b12hasar=d.hasar;
         
            }
        if(ma instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) ma;
        
            b12.setIcon(d.image);
         b12hasar=d.hasar;
         
            }
        if(ma instanceof meowth){
        meowth d=new meowth();
        d=(meowth) ma;
       
           b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) ma;
       
           b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) ma;
        
            b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
        if(ma instanceof zubat){
        zubat d=new zubat();
        d=(zubat) ma;
      
            b12.setIcon(d.image);
         b12hasar=d.hasar;
            }
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        bil1tebrik = new javax.swing.JLabel();
        bil2tebrik = new javax.swing.JLabel();
        berabere = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1170, 735));
        getContentPane().setLayout(null);
        getContentPane().add(b1);
        b1.setBounds(290, 400, 160, 240);
        getContentPane().add(b2);
        b2.setBounds(480, 400, 160, 240);
        getContentPane().add(b3);
        b3.setBounds(670, 400, 160, 240);
        getContentPane().add(b4);
        b4.setBounds(290, 100, 160, 240);
        getContentPane().add(b5);
        b5.setBounds(480, 100, 160, 240);
        getContentPane().add(b6);
        b6.setBounds(670, 100, 160, 240);

        b7.setText("KART AL");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(40, 580, 160, 40);

        b8.setText("KART AT");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(50, 220, 170, 50);
        getContentPane().add(b9);
        b9.setBounds(290, 400, 160, 240);
        getContentPane().add(b10);
        b10.setBounds(480, 400, 160, 240);
        getContentPane().add(b11);
        b11.setBounds(290, 100, 160, 240);
        getContentPane().add(b12);
        b12.setBounds(480, 100, 160, 240);

        bil1tebrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bil1.png"))); // NOI18N
        getContentPane().add(bil1tebrik);
        bil1tebrik.setBounds(150, 320, 956, 94);

        bil2tebrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bil2.png"))); // NOI18N
        getContentPane().add(bil2tebrik);
        bil2tebrik.setBounds(150, 320, 956, 94);

        berabere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/berabere.png"))); // NOI18N
        getContentPane().add(berabere);
        berabere.setBounds(150, 320, 956, 94);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kartt.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 310, 200, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bckgrd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-140, -60, 1430, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       if(bsayaç==0) {
        b1.setLocation(900,400);
        b4.setLocation(900, 100);
        if(b1hasar>b4hasar){
            bilg1.skor=bilg1.skor+5;
        }
        if(b1hasar<b4hasar){
            bilg2.skor=bilg2.skor+5;}}
       if(bsayaç==1) {
           b1.setVisible(false);
           b4.setVisible(false);
        b2.setLocation(900,400);
        b5.setLocation(900, 100);
        if(b2hasar>b5hasar){
            bilg1.skor=bilg1.skor+5;
        }
        if(b2hasar<b5hasar){
            bilg2.skor=bilg2.skor+5;}}
        if(bsayaç==2) {
         b2.setVisible(false);
         b5.setVisible(false);
        b3.setLocation(900,400);
        b11.setLocation(900, 100);
        if(b3hasar>b11hasar){
            bilg1.skor=bilg1.skor+5;
        }
        if(b3hasar<b11hasar){
            bilg2.skor=bilg2.skor+5;}}
         if(bsayaç==3) {
             b3.setVisible(false);
             b11.setVisible(false);
        b9.setLocation(900,400);
        b6.setLocation(900, 100);
        if(b9hasar>b6hasar){
            bilg1.skor=bilg1.skor+5;
        }
        if(b9hasar<b6hasar){
            bilg2.skor=bilg2.skor+5;}}
          if(bsayaç==4) {
              b9.setVisible(false);
              b6.setVisible(false);
        b10.setLocation(900,400);
        b12.setLocation(900, 100);
        if(b10hasar>b12hasar){
            bilg1.skor=bilg1.skor+5;
        }
        if(b10hasar<b12hasar){
            bilg2.skor=bilg2.skor+5;}}
        
        
       bsayaç++;
        System.out.println("Bilgisayar1:"+bilg1.skor);
        System.out.println("Bilgisayar2:"+bilg2.skor);
        if(bsayaç==5){
            b10.setVisible(false);
            b12.setVisible(false);
            b8.setVisible(false);
            jLabel2.setVisible(false);
            if(bilg1.skor>bilg2.skor){
                bil1tebrik.setVisible(true);
                System.out.println("BİLGİSAYAR 1 KAZANDI");
            
            }
            else if(bilg2.skor>bilg1.skor){
                bil2tebrik.setVisible(true);
                System.out.println("BİLGİSAYAR 2 KAZANDI");}
            else if(bilg1.skor==bilg2.skor){
                berabere.setVisible(true);
                System.out.println("BERABERE");
            }
        
        }
         
        
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
if(b2sayaç==0){
b9.setVisible(true);
b11.setVisible(true);


}       
 if(b2sayaç==1)  {
 b10.setVisible(true);
 b12.setVisible(true);
 }     
        
        b2sayaç++;
        if(b2sayaç==2){
        b7.setVisible(false);
        }
        
    }//GEN-LAST:event_b7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bilgvsbilg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bilgvsbilg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bilgvsbilg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bilgvsbilg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bilgvsbilg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel berabere;
    private javax.swing.JLabel bil1tebrik;
    private javax.swing.JLabel bil2tebrik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
