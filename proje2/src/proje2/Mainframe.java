/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static proje2.Proje2.getSayaçnot;
import static proje2.Proje2.insanliste;
/**
 *
 * @author Ayşenur Akpınar
 */
 public class Mainframe extends javax.swing.JFrame {
 
   boolean aa=false;
   boolean b=false;
   boolean c=false;
   boolean d=false;
   boolean e=false;
   boolean f=false;
   boolean g=false;
   boolean h=false;
   boolean j=false;
   int sayaç=0,sayaçkart1=0,sayaçkart2=0,sayaçkart3=0,sayaçkart7=0,sayaçkart8=0,sayaçkart9=0;
    static int kart1hasar,kart2hasar,kart3hasar,kart4hasar,kart5hasar,kart6hasar,kart7hasar,kart8hasar,kart9hasar,kart10hasar,kart11hasar,kart12hasar,kart13hasar,kart14hasar;
    static ArrayList<pokemon> list=new ArrayList<pokemon>();
   
   static ArrayList<pokemon> bilgliste=new ArrayList<pokemon>();  
      static  bilgisayaroyuncu blgsyr=new bilgisayaroyuncu();
      static insanoyuncu insan=new insanoyuncu();
    /*
     * Creates new form Mainframe
     */
    public Mainframe() {
        initComponents();
        kart1.setVisible(false);
        kart2.setVisible(false);
        kart3.setVisible(false);
        kart4.setVisible(false);
        kart5.setVisible(false);
        kart6.setVisible(false);
        kart7.setVisible(false);
        kart8.setVisible(false);
        kart9.setVisible(false);
        kart10.setVisible(false);
        kart11.setVisible(false);
         kart12.setVisible(false);
         kart13.setVisible(false);
         kart14.setVisible(false);
        savaş.setVisible(false);
        jTextField2.setVisible(false);
        seç.setVisible(false);
       seçkart.setVisible(false);
       tebrik.setVisible(false);
      biltebrik.setVisible(false);
      beraber.setVisible(false);
       bilgvsbilg no1=new bilgvsbilg();
        Random rnd=new Random();
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
      
        /*
        ArrayList<pokemon> list=new ArrayList<pokemon>();
        pikachu pkc=new pikachu("01","pikachu","elektrik");
        
        charmander chr=new charmander("02","charmander","ateş");
        
        squirtle sqrt=new squirtle("03","squirtle","su");
        
        oyuncuvs no1=new oyuncuvs();
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
        ArrayList<pokemon> bilgliste=new ArrayList<pokemon>();  
        bilgisayaroyuncu blgsyr=new bilgisayaroyuncu();
         ArrayList<pokemon> insanliste=new ArrayList<pokemon>(); 
         insanoyuncu insan=new insanoyuncu();*/
        
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
         kart1hasar=d.hasar;
            }
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
        
        insanliste.removeAll(insanliste);
      bilgliste.removeAll(bilgliste);
        System.out.println("başlangıçoyuncu"+insan.skor); 
        System.out.println("başlangıçblgsyr"+blgsyr.skor); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        kart1 = new javax.swing.JButton();
        kart4 = new javax.swing.JButton();
        kart11 = new javax.swing.JButton();
        kart10 = new javax.swing.JButton();
        kart5 = new javax.swing.JButton();
        savaş = new javax.swing.JButton();
        kart6 = new javax.swing.JButton();
        kart3 = new javax.swing.JButton();
        kart8 = new javax.swing.JButton();
        kart9 = new javax.swing.JButton();
        kart7 = new javax.swing.JButton();
        kart13 = new javax.swing.JButton();
        kart2 = new javax.swing.JButton();
        kart14 = new javax.swing.JButton();
        kart12 = new javax.swing.JButton();
        seç = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        biltebrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField2 = new javax.swing.JTextField();
        tebrik = new javax.swing.JLabel();
        beraber = new javax.swing.JLabel();
        seçkart = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 730));
        getContentPane().setLayout(null);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton3.setText("KULLANICI VS BİLGİSAYAR");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 430, 380, 90);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(89, 148, 207));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                OYUN TİPİNİ SEÇİNİZ:");
        getContentPane().add(jTextArea1);
        jTextArea1.setBounds(430, 220, 390, 40);

        kart1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart1ActionPerformed(evt);
            }
        });
        getContentPane().add(kart1);
        kart1.setBounds(300, 400, 160, 240);

        kart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart4ActionPerformed(evt);
            }
        });
        getContentPane().add(kart4);
        kart4.setBounds(310, 40, 160, 240);

        kart11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart11ActionPerformed(evt);
            }
        });
        getContentPane().add(kart11);
        kart11.setBounds(300, 40, 160, 240);
        getContentPane().add(kart10);
        kart10.setBounds(310, 40, 160, 240);

        kart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart5ActionPerformed(evt);
            }
        });
        getContentPane().add(kart5);
        kart5.setBounds(530, 40, 160, 240);

        savaş.setText("SAVAŞ");
        savaş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savaşActionPerformed(evt);
            }
        });
        getContentPane().add(savaş);
        savaş.setBounds(990, 640, 190, 40);

        kart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart6ActionPerformed(evt);
            }
        });
        getContentPane().add(kart6);
        kart6.setBounds(730, 40, 160, 240);

        kart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart3ActionPerformed(evt);
            }
        });
        getContentPane().add(kart3);
        kart3.setBounds(740, 400, 160, 240);

        kart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart8ActionPerformed(evt);
            }
        });
        getContentPane().add(kart8);
        kart8.setBounds(520, 400, 160, 240);

        kart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart9ActionPerformed(evt);
            }
        });
        getContentPane().add(kart9);
        kart9.setBounds(740, 400, 160, 240);

        kart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart7ActionPerformed(evt);
            }
        });
        getContentPane().add(kart7);
        kart7.setBounds(300, 400, 160, 240);

        kart13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart13ActionPerformed(evt);
            }
        });
        getContentPane().add(kart13);
        kart13.setBounds(520, 400, 160, 240);

        kart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart2ActionPerformed(evt);
            }
        });
        getContentPane().add(kart2);
        kart2.setBounds(520, 400, 160, 240);

        kart14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart14ActionPerformed(evt);
            }
        });
        getContentPane().add(kart14);
        kart14.setBounds(740, 400, 160, 240);

        kart12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart12ActionPerformed(evt);
            }
        });
        getContentPane().add(kart12);
        kart12.setBounds(300, 400, 160, 240);

        seç.setBackground(new java.awt.Color(232, 90, 199));
        seç.setText("KART SEÇ");
        seç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seçActionPerformed(evt);
            }
        });
        getContentPane().add(seç);
        seç.setBounds(20, 580, 170, 50);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setText("BİLGİSAYAR VS BİLGİSAYAR");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 310, 380, 90);

        biltebrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bil.png"))); // NOI18N
        getContentPane().add(biltebrik);
        biltebrik.setBounds(180, 310, 956, 94);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 200, 2, 2);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(53, 138, 193));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jTextField2.setText("BİLGİSAYAR VS OYUNCU");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(990, 30, 190, 40);

        tebrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tebrik.png"))); // NOI18N
        getContentPane().add(tebrik);
        tebrik.setBounds(180, 310, 956, 94);

        beraber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/berabere.png"))); // NOI18N
        getContentPane().add(beraber);
        beraber.setBounds(180, 310, 956, 94);

        seçkart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kartt.png"))); // NOI18N
        seçkart.setText("jLabel3");
        getContentPane().add(seçkart);
        seçkart.setBounds(10, 310, 200, 260);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bckgrd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 720);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-40, 0, 1350, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        bilgvsbilg no1=new bilgvsbilg();
       
        no1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     jButton2.setVisible(false);
     jButton3.setVisible(false);
     jTextArea1.setVisible(false);
     kart1.setVisible(true);
        kart2.setVisible(true);
        kart3.setVisible(true);
           kart4.setVisible(true);
        kart5.setVisible(true);
        kart6.setVisible(true);
        seç.setVisible(true);
        seçkart.setVisible(true);
        savaş.setVisible(true);
        
        jTextField2.setVisible(true);
     
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     *
     * @return
     */
   

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JButton getKart1() {
        return kart1;
    }

    public void setKart1(JButton kart1) {
        this.kart1 = kart1;
    }

    public JButton getKart2() {
        return kart2;
    }

    public void setKart2(JButton kart2) {
        this.kart2 = kart2;
    }

    public JButton getKart3() {
        return kart3;
    }

    public void setKart3(JButton kart3) {
        this.kart3 = kart3;
    }

    public JButton getKart4() {
        return kart4;
    }

    public void setKart4(JButton kart4) {
        this.kart4 = kart4;
    }

    public JButton getKart5() {
        return kart5;
    }

    public void setKart5(JButton kart5) {
        this.kart5 = kart5;
    }

    public JButton getKart6() {
        return kart6;
    }

    public void setKart6(JButton kart6) {
        this.kart6 = kart6;
    }

    private void kart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart1ActionPerformed
       
        
          
          
    
        aa=true;
         if(sayaç==0){
              kart4.setLocation(1000, 100);
          kart1.setLocation(1000,400);
          
          
          
      int randomindex=(int)(Math.random()*list.size());
            
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
            
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
           
        
         if(kart1hasar<kart4hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart1hasar>kart4hasar){
                
            insan.skor=insan.skor+5;}
            if(kart1hasar==kart4hasar){
                
            }
      }
      else if(sayaç==1){
           kart10.setLocation(1000, 100);
          kart1.setLocation(1000,400);
      
       int randomindex=(int)(Math.random()*list.size());
            
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
           
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
           
        
        
         if(kart1hasar<kart10hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart1hasar>kart10hasar){
              
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==2){
       kart11.setLocation(1000, 100);
          kart1.setLocation(1000,400);
      
        
         if(kart1hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart1hasar>kart11hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
              kart5.setLocation(1000, 100);
          kart1.setLocation(1000,400);
      
      
            
        
         if(kart1hasar<kart5hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart1hasar>kart5hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      
        kart6.setLocation(1000, 100);
          kart1.setLocation(1000,400);
        
        
         if(kart1hasar<kart6hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart1hasar>kart6hasar){
              
            insan.skor=insan.skor+5;}
      
      
      }
        sayaç++;
        sayaçkart1++;
        
        
    }//GEN-LAST:event_kart1ActionPerformed

    private void kart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart4ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_kart4ActionPerformed

    private void kart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kart5ActionPerformed

    private void kart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kart6ActionPerformed

    private void kart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart3ActionPerformed
sayaçkart3=1;
           jTextField2.setVisible(true);  
          c=true;
        if(sayaç==0){
            kart4.setLocation(1000, 100);
          kart3.setLocation(1000,400);
      int randomindex=(int)(Math.random()*list.size());
            
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
           
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
           
        
        
         if(kart3hasar<kart4hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart4hasar<kart3hasar){ 
               
            insan.skor=insan.skor+5;}
      }
      else if(sayaç==1){
      kart10.setLocation(1000, 100);
          kart3.setLocation(1000,400);
       int randomindex=(int)(Math.random()*list.size());
          
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
            
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
            
        
        
         if(kart3hasar<kart10hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            
              if(kart3hasar>kart10hasar)  {
            insan.skor=insan.skor+5;}
      
      
      }  
           else if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart3.setLocation(1000,400);
      
        
        
         if(kart3hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart3hasar>kart11hasar){
                
            insan.skor=insan.skor+5;
      
             }
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart3.setLocation(1000,400);
       
        
        
         if(kart3hasar<kart5hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart3hasar>kart5hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart3.setLocation(1000,400);
       
        
        
         if(kart3hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart3hasar>kart6hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
          
     
          
sayaç++;

    }//GEN-LAST:event_kart3ActionPerformed
    
    private void kart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart2ActionPerformed
       kart4.setLocation(1000, 100);
          kart2.setLocation(1000,400);
           jTextField2.setVisible(true); 
      b=true;
      
      sayaçkart2=1;
      if(sayaç==0){
          kart4.setLocation(1000, 100);
          kart2.setLocation(1000,400);
      int randomindex=(int)(Math.random()*list.size());
           
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
           
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
           
        
        
         if(kart2hasar<kart4hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart2hasar>kart4hasar){
               
            insan.skor=insan.skor+5;}
      }
      else if(sayaç==1){
          kart10.setLocation(1000, 100);
          kart2.setLocation(1000,400);
          
       int randomindex=(int)(Math.random()*list.size());
           
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
            
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
           
         if(kart2hasar<kart10hasar){
              
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart2hasar>kart10hasar){
               
            insan.skor=insan.skor+5;
            }
      
      }
         else if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart2.setLocation(1000,400);
      
       if(kart2hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart2hasar>kart11hasar){
               
            insan.skor=insan.skor+5;
            }
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart2.setLocation(1000,400);
       int randomindex=(int)(Math.random()*list.size());
            
        
         if(kart2hasar<kart5hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
           if(kart2hasar>kart5hasar){
               
            insan.skor=insan.skor+5;
           }
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart2.setLocation(1000,400);
      
        
         if(kart2hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart2hasar>kart6hasar){
               
            insan.skor=insan.skor+5;
            }
      
      }
      sayaç++;
        
          
// TODO add your handling code here:
    }//GEN-LAST:event_kart2ActionPerformed

    public JButton getKart10() {
        return kart10;
    }

    public void setKart10(JButton kart10) {
        this.kart10 = kart10;
    }

    public JButton getKart11() {
        return kart11;
    }

    public void setKart11(JButton kart11) {
        this.kart11 = kart11;
    }

    public JButton getKart7() {
        return kart7;
    }

    public void setKart7(JButton kart7) {
        this.kart7 = kart7;
    }

    public JButton getKart8() {
        return kart8;
    }

    public void setKart8(JButton kart8) {
        this.kart8 = kart8;
    }

    public JButton getKart9() {
        return kart9;
    }

    public void setKart9(JButton kart9) {
        this.kart9 = kart9;
    }

    private void seçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seçActionPerformed
     
        
        if(sayaç==2){
        seç.setVisible(false);
        seçkart.setVisible(false);
        }
        
        if(sayaç==1){
        kart10.setVisible(true);
      pokemon a=new pokemon();
        a=bilgliste.get(0);
        
         
         if(a instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) a;
       
         kart10.setIcon(d.image);
         kart10hasar=d.hasar;
            }
        if(a instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) a;
        
         kart10.setIcon(d.image);
    kart10hasar=d.hasar;
            }
        if(a instanceof charmander){
        charmander d=new charmander();
        d=(charmander) a;
        
           kart10.setIcon(d.image);
           kart10hasar=d.hasar;
            }
        if(a instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) a;
        
           kart10.setIcon(d.image);
           kart10hasar=d.hasar;
            }
        if(a instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) a;
        
            kart10.setIcon(d.image);
            kart10hasar=d.hasar;
         
            }
        if(a instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) a;
        
           kart10.setIcon(d.image);
           kart10hasar=d.hasar;
         
            }
        if(a instanceof meowth){
        meowth d=new meowth();
        d=(meowth) a;
        
         kart10.setIcon(d.image);
         kart10hasar=d.hasar;
            }
        if(a instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) a;
        
           kart10.setIcon(d.image);
           kart10hasar=d.hasar;
            }
        if(a instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) a;
        
          kart10.setIcon(d.image);
          kart10hasar=d.hasar;
            }
        if(a instanceof zubat){
        zubat d=new zubat();
        d=(zubat) a;
        
          kart10.setIcon(d.image);
          kart10hasar=d.hasar;
            }
        bilgliste.remove(0);
        }
    if(sayaç==2){
          kart11.setVisible(true);
      pokemon a=new pokemon();
        a=bilgliste.get(0);
        
        
         if(a instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) a;
       
         kart11.setIcon(d.image);
         kart11hasar=d.hasar;
            }
        if(a instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) a;
       
         kart11.setIcon(d.image);
         kart11hasar=d.hasar;
            }
        if(a instanceof charmander){
        charmander d=new charmander();
        d=(charmander) a;
        
           kart11.setIcon(d.image);
           kart11hasar=d.hasar;
            }
        if(a instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) a;
        
           kart11.setIcon(d.image);
           kart11hasar=d.hasar;
            }
        if(a instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) a;
        
            kart11.setIcon(d.image);
            kart11hasar=d.hasar;
            }
        if(a instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) a;
        
           kart11.setIcon(d.image);
           kart11hasar=d.hasar;
         
            }
        if(a instanceof meowth){
        meowth d=new meowth();
        d=(meowth) a;
        
         kart11.setIcon(d.image);
         kart11hasar=d.hasar;
            }
        if(a instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) a;
        
           kart11.setIcon(d.image);
           kart11hasar=d.hasar;
            }
        if(a instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) a;
        
          kart11.setIcon(d.image);
          kart11hasar=d.hasar;
            }
        if(a instanceof zubat){
        zubat d=new zubat();
        d=(zubat) a;
        
          kart11.setIcon(d.image);
          kart11hasar=d.hasar;
            }
        }
    
       
    if(sayaçkart1==1 && (kart2.isVisible())&& (kart3.isVisible()) ||sayaçkart1==1 && (kart8.isVisible())&& (kart3.isVisible()) ||sayaçkart1==1 && (kart2.isVisible())&& (kart9.isVisible()) ){
        if(aa){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
        
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
        
         kart7.setIcon(d.image);
         kart7hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
       
         kart7.setIcon(d.image);
    kart7hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
        
           kart7.setIcon(d.image);
           kart7hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart7.setIcon(d.image);
           kart7hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
        
            kart7.setIcon(d.image);
            kart7hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
        
           kart7.setIcon(d.image);
           kart7hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
        
         kart7.setIcon(d.image);
         kart7hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
       
           kart7.setIcon(d.image);
           kart7hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
       
          kart7.setIcon(d.image);
          kart7hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
        
          kart7.setIcon(d.image);
          kart7hasar=d.hasar;
            }
      kart7.setVisible(true); 
      
      insanliste.remove(0);
           
      }}
        
    if((sayaçkart1+sayaçkart7)==21 ){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
       
        
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
       
         kart12.setIcon(d.image);
         kart12hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
       
         kart12.setIcon(d.image);
    kart12hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
       
           kart12.setIcon(d.image);
           kart12hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart12.setIcon(d.image);
           kart12hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
        
            kart12.setIcon(d.image);
            kart12hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
      
           kart12.setIcon(d.image);
           kart12hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
      
         kart12.setIcon(d.image);
         kart12hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
      
           kart12.setIcon(d.image);
           kart12hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
        
          kart12.setIcon(d.image);
          kart12hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
      
          kart12.setIcon(d.image);
          kart12hasar=d.hasar;
            }
      kart12.setVisible(true);
       
      insanliste.remove(0);
      
      }
    
    
    
        if(b){
            if(sayaçkart2==1 && (kart1.isVisible())&& (kart3.isVisible()) ||sayaçkart2==1 && (kart7.isVisible())&& (kart3.isVisible()) ||sayaçkart2==1 && (kart1.isVisible())&& (kart9.isVisible())){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
        
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
        
         kart8.setIcon(d.image);
         kart8hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
        
         kart8.setIcon(d.image);
    kart8hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
        
           kart8.setIcon(d.image);
           kart8hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart8.setIcon(d.image);
           kart8hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
        
            kart8.setIcon(d.image);
            kart8hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
        
           kart8.setIcon(d.image);
           kart8hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
        
         kart8.setIcon(d.image);
         kart8hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
        
           kart8.setIcon(d.image);
           kart8hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
        
          kart8.setIcon(d.image);
          kart8hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
        
          kart8.setIcon(d.image);
          kart8hasar=d.hasar;
            }
         
        insanliste.remove(0);
       kart8.setVisible(true);
       
        }
            
        if((sayaçkart2+sayaçkart8)==21 ){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
       
         kart13.setIcon(d.image);
         kart13hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
       
         kart13.setIcon(d.image);
    kart13hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
        
           kart13.setIcon(d.image);
           kart13hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart13.setIcon(d.image);
           kart13hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
        
            kart13.setIcon(d.image);
            kart13hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
        
           kart13.setIcon(d.image);
           kart13hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
        
         kart13.setIcon(d.image);
         kart13hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
       
           kart13.setIcon(d.image);
           kart13hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
        
          kart13.setIcon(d.image);
          kart13hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
       
          kart13.setIcon(d.image);
          kart13hasar=d.hasar;
            }
      kart13.setVisible(true);
       
      insanliste.remove(0);
      }
        
        
        
        }
        
        if(c){
         if(sayaçkart3==1 && (kart2.isVisible())&& (kart1.isVisible()) ||sayaçkart3==1 && (kart8.isVisible())&& (kart1.isVisible()) ||sayaçkart3==1 && (kart2.isVisible())&& (kart7.isVisible())){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
            
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
        
         kart9.setIcon(d.image);
         kart9hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
        
         kart9.setIcon(d.image);
    kart9hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
        
           kart9.setIcon(d.image);
           kart9hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart9.setIcon(d.image);
           kart9hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
       
            kart9.setIcon(d.image);
            kart9hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
        
           kart9.setIcon(d.image);
           kart9hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
        
         kart9.setIcon(d.image);
         kart9hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
        
           kart9.setIcon(d.image);
           kart9hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
        
          kart9.setIcon(d.image);
          kart9hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
       
          kart9.setIcon(d.image);
          kart9hasar=d.hasar;
           } 
         kart9.setVisible(true);
          
         insanliste.remove(0);
        
         }
          if((sayaçkart3+sayaçkart9)==21 ){
            pokemon aaa=new pokemon();
        aaa=insanliste.get(0);
       
        
         if(aaa instanceof squirtle){
        squirtle d=new squirtle();
        d=(squirtle) aaa;
        
         kart14.setIcon(d.image);
         kart14hasar=d.hasar;
            }
        if(aaa instanceof pikachu){
        pikachu d=new pikachu();
        d=(pikachu) aaa;
        
         kart14.setIcon(d.image);
    kart14hasar=d.hasar;
            }
        if(aaa instanceof charmander){
        charmander d=new charmander();
        d=(charmander) aaa;
        
           kart14.setIcon(d.image);
           kart14hasar=d.hasar;
            }
        if(aaa instanceof bulbasaur){
        bulbasaur d=new bulbasaur();
        d=(bulbasaur) aaa;
        
           kart14.setIcon(d.image);
           kart14hasar=d.hasar;
            }
        if(aaa instanceof butterfree){
        butterfree d=new butterfree();
        d=(butterfree) aaa;
       
            kart14.setIcon(d.image);
            kart14hasar=d.hasar;
         
            }
        if(aaa instanceof jigglypuff){
        jigglypuff d=new jigglypuff();
        d=(jigglypuff) aaa;
       
           kart14.setIcon(d.image);
           kart14hasar=d.hasar;
         
            }
        if(aaa instanceof meowth){
        meowth d=new meowth();
        d=(meowth) aaa;
        
         kart14.setIcon(d.image);
         kart14hasar=d.hasar;
            }
        if(aaa instanceof psyduck){
        psyduck d=new psyduck();
        d=(psyduck) aaa;
        
           kart14.setIcon(d.image);
           kart14hasar=d.hasar;
            }
        if(aaa instanceof snorlax){
        snorlax d=new snorlax();
        d=(snorlax) aaa;
        
          kart14.setIcon(d.image);
          kart14hasar=d.hasar;
            }
        if(aaa instanceof zubat){
        zubat d=new zubat();
        d=(zubat) aaa;
        
          kart14.setIcon(d.image);
          kart14hasar=d.hasar;
            }
      kart14.setVisible(true);
      
      insanliste.remove(0);
      }
         
          
        }
        
        
        
    }//GEN-LAST:event_seçActionPerformed

    private void kart11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kart11ActionPerformed

    private void savaşActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savaşActionPerformed
       
      /*if(sayaç==1){
      if(aa=t){
          kart1.setVisible(false);
   kart4.setVisible(false);
      }
          System.out.println("jdknfkdsflsdmflamdkf"+b);
      if(b=false){
      kart2.setVisible(false);
   kart4.setVisible(false);
      }
      
      }*/
        
       if(aa & sayaç==1){
   kart1.setVisible(false);
   kart4.setVisible(false);
   } if(aa & sayaç==2){
   kart1.setVisible(false);
   kart10.setVisible(false);
   } if(aa & sayaç==3){
   kart1.setVisible(false);
   kart11.setVisible(false);
   }
    if(aa& sayaç==4){
   kart1.setVisible(false);
   kart5.setVisible(false);
   }
     if(aa & sayaç==5){
   kart1.setVisible(false);
   kart6.setVisible(false);
   }    
     if(b & sayaç==1){
   kart2.setVisible(false);
   kart4.setVisible(false);
   } if(b & sayaç==2){
   kart2.setVisible(false);
   kart10.setVisible(false);
   } if(b & sayaç==3){
   kart2.setVisible(false);
   kart11.setVisible(false);
   }
    if(b & sayaç==4){
   kart2.setVisible(false);
   kart5.setVisible(false);
   }
     if(b & sayaç==5){
   kart2.setVisible(false);
   kart6.setVisible(false);
   }    
          if(c & sayaç==1){
   kart3.setVisible(false);
   kart4.setVisible(false);
   } if(c & sayaç==2){
   kart3.setVisible(false);
   kart10.setVisible(false);
   } if(c & sayaç==3){
   kart3.setVisible(false);
   kart11.setVisible(false);
   }
    if(c & sayaç==4){
   kart3.setVisible(false);
   kart5.setVisible(false);
   }
     if(c & sayaç==5){
   kart3.setVisible(false);
   kart6.setVisible(false);
   }
       if(d & sayaç==2){
   kart7.setVisible(false);
   kart10.setVisible(false);
   } if(d & sayaç==3){
   kart7.setVisible(false);
   kart11.setVisible(false);
   }
    if(d & sayaç==4){
   kart7.setVisible(false);
   kart5.setVisible(false);
   }
     if(d & sayaç==5){
   kart7.setVisible(false);
   kart6.setVisible(false);
   }
     if(e & sayaç==2){
   kart8.setVisible(false);
   kart10.setVisible(false);
   } if(e & sayaç==3){
   kart8.setVisible(false);
   kart11.setVisible(false);
   }
    if(e & sayaç==4){
   kart8.setVisible(false);
   kart5.setVisible(false);
   }
     if(e & sayaç==5){
   kart8.setVisible(false);
   kart6.setVisible(false);
   }
     if(f & sayaç==2){
   kart9.setVisible(false);
   kart10.setVisible(false);
   } if(f & sayaç==3){
   kart9.setVisible(false);
   kart11.setVisible(false);
   }
    if(f & sayaç==4){
   kart9.setVisible(false);
   kart5.setVisible(false);
   }
     if(f & sayaç==5){
   kart9.setVisible(false);
   kart6.setVisible(false);
   }
      if(g & sayaç==2){
   kart12.setVisible(false);
   kart10.setVisible(false);
   } if(g & sayaç==3){
   kart12.setVisible(false);
   kart11.setVisible(false);
   }
    if(g & sayaç==4){
   kart12.setVisible(false);
   kart5.setVisible(false);
   }
     if(g & sayaç==5){
   kart12.setVisible(false);
   kart6.setVisible(false);
   }
    if(h & sayaç==2){
   kart13.setVisible(false);
   kart10.setVisible(false);
   } if(h & sayaç==3){
       
   kart13.setVisible(false);
   kart11.setVisible(false);
   }
    if(h & sayaç==4){
   kart13.setVisible(false);
   kart5.setVisible(false);
   }
     if(h & sayaç==5){
   kart13.setVisible(false);
   kart6.setVisible(false);
   } 
       if(j & sayaç==2){
   kart14.setVisible(false);
   kart10.setVisible(false);
   } if(j & sayaç==3){
        
   kart14.setVisible(false);
   kart11.setVisible(false);
   }
    if(j & sayaç==4){
   kart14.setVisible(false);
   kart5.setVisible(false);
   }
     if(j & sayaç==5){
   kart14.setVisible(false);
   kart6.setVisible(false);
   } 
     
        System.out.println("Oyuncu skoru:"+insan.skor);    
        System.out.println("Bilgisayar skoru:"+blgsyr.skor);
        if(sayaç==5){
            savaş.setVisible(false);
            jTextField2.setVisible(false);
        if(insan.skor>blgsyr.skor){
            tebrik.setVisible(true);
            System.out.println("TEBRİKLER!KAZANDINIZ!");
        
        }
        else if(blgsyr.skor>insan.skor){
            biltebrik.setVisible(true);
                System.out.println("BİLGİSAYAR KAZANDI");}
        else if(insan.skor==blgsyr.skor){
            beraber.setVisible(true);
            System.out.println("BERABERE");
        }
        
        }
        
    }//GEN-LAST:event_savaşActionPerformed

    private void kart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart8ActionPerformed
     sayaçkart8=1;
     sayaçkart2=20;
      e=true;
        if(sayaç==1){
      kart10.setLocation(1000, 100);
          kart8.setLocation(1000,400);
       int randomindex=(int)(Math.random()*list.size());
           
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
           
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
            
        
        
         if(kart8hasar<kart10hasar){
               
                blgsyr.skor=blgsyr.skor+5;        
            }
             if(kart10hasar<kart8hasar){
               
            insan.skor=insan.skor+5;}
      }  
           else if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart8.setLocation(1000,400);
       if(kart8hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart11hasar<kart8hasar){
                
            insan.skor=insan.skor+5;}
     }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart8.setLocation(1000,400);
           if(kart8hasar<kart5hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart5hasar<kart8hasar){
              
            insan.skor=insan.skor+5;}
     }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart8.setLocation(1000,400);
          if(kart8hasar<kart6hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart6hasar<kart8hasar){
                
            insan.skor=insan.skor+5;}
         }  
        sayaç++;
        
    }//GEN-LAST:event_kart8ActionPerformed

    private void kart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart7ActionPerformed

        d=true;
        sayaçkart7=1;
        sayaçkart1=20;
        
        if(sayaç==1){
      kart10.setLocation(1000, 100);
          kart7.setLocation(1000,400);
       int randomindex=(int)(Math.random()*list.size());
           
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
            
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
          
        
        
         if(kart7hasar<kart10hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart10hasar<kart7hasar){
             
            insan.skor=insan.skor+5;}
      
      
      }  
           else if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart7.setLocation(1000,400);
      
        
        
         if(kart7hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart11hasar<kart7hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart7.setLocation(1000,400);
       
        
        
         if(kart7hasar<kart5hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart5hasar<kart7hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart7.setLocation(1000,400);
       
        
        
         if(kart7hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart6hasar<kart7hasar) {
               
            insan.skor=insan.skor+5;}
      
         }
        sayaç++;
          
    }//GEN-LAST:event_kart7ActionPerformed

    private void kart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart9ActionPerformed
     f=true;
     sayaçkart9=1;
     sayaçkart3=20;
        if(sayaç==1){
          kart10.setLocation(1000, 100);
          kart9.setLocation(1000,400);
       int randomindex=(int)(Math.random()*list.size());
            
            bilgliste.add(list.get(randomindex));
            list.remove(list.get(randomindex));
            
             int randomindexx=(int)(Math.random()*list.size());
            
            insanliste.add(list.get(randomindexx));
            list.remove(list.get(randomindexx));
            
        
        
         if(kart9hasar<kart10hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
            if(kart10hasar<kart9hasar){
               
            insan.skor=insan.skor+5;
            }
      
      }  
           else if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart9.setLocation(1000,400);
      
        
        
         if(kart9hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart11hasar<kart9hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart9.setLocation(1000,400);
       
        
        
         if(kart9hasar<kart5hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart5hasar<kart9hasar) {
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart9.setLocation(1000,400);
       
        
        
         if(kart9hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart6hasar<kart9hasar){
               
            insan.skor=insan.skor+5;}
      
         }
        sayaç++;
          
    }//GEN-LAST:event_kart9ActionPerformed

    private void kart12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart12ActionPerformed
       g=true;
            if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart12.setLocation(1000,400);
   if(kart12hasar<kart11hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart11hasar<kart12hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart12.setLocation(1000,400);
       
        
        
         if(kart12hasar<kart5hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart5hasar<kart12hasar){
                
            insan.skor=insan.skor+5;
             }
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart12.setLocation(1000,400);
       
        
        
         if(kart12hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart6hasar<kart12hasar){
               
            insan.skor=insan.skor+5;}
      
         }
        sayaç++;
          
    }//GEN-LAST:event_kart12ActionPerformed

    private void kart13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart13ActionPerformed
     
        h=true;
        if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart13.setLocation(1000,400);
      
        
        
         if(kart13hasar<kart11hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart11hasar<kart13hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart13.setLocation(1000,400);
       
        
        
         if(kart13hasar<kart5hasar){
              
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart5hasar<kart13hasar){
               
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart13.setLocation(1000,400);
       
        
        
         if(kart13hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart6hasar<kart13hasar) {
               
            insan.skor=insan.skor+5;}
      
         }
        sayaç++;
          
    }//GEN-LAST:event_kart13ActionPerformed

    private void kart14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart14ActionPerformed
        j=true;
        if(sayaç==2){
      kart11.setLocation(1000, 100);
          kart14.setLocation(1000,400);
      
        
        
         if(kart14hasar<kart11hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart11hasar<kart14hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==3){
      kart5.setLocation(1000, 100);
          kart14.setLocation(1000,400);
       
        
        
         if(kart14hasar<kart5hasar){
               
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart5hasar<kart14hasar){
                
            insan.skor=insan.skor+5;}
      
      
      }
         else if(sayaç==4){
      kart6.setLocation(1000, 100);
          kart14.setLocation(1000,400);
       
        
        
         if(kart14hasar<kart6hasar){
                
                blgsyr.skor=blgsyr.skor+5;
             
            }
             if(kart6hasar<kart14hasar){
               
            insan.skor=insan.skor+5;}
      
         }
        sayaç++;
         
    }//GEN-LAST:event_kart14ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beraber;
    private javax.swing.JLabel biltebrik;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton kart1;
    private javax.swing.JButton kart10;
    private javax.swing.JButton kart11;
    private javax.swing.JButton kart12;
    private javax.swing.JButton kart13;
    private javax.swing.JButton kart14;
    private javax.swing.JButton kart2;
    private javax.swing.JButton kart3;
    private javax.swing.JButton kart4;
    private javax.swing.JButton kart5;
    private javax.swing.JButton kart6;
    private javax.swing.JButton kart7;
    private javax.swing.JButton kart8;
    private javax.swing.JButton kart9;
    private javax.swing.JButton savaş;
    private javax.swing.JButton seç;
    private javax.swing.JLabel seçkart;
    private javax.swing.JLabel tebrik;
    // End of variables declaration//GEN-END:variables
}
