/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokay
 */
public class ogrenciler extends dosyaSoyut implements anaIslemler{
        private String ad;
        private String soyad;
        private int ogrno;
                
     
        
    @Override
    public void kaydet(String ad, String soyad, int ogrno) {
                            
                            PrintWriter out = null;
                            try {
                            this.ad=ad;
                            this.soyad=soyad;
                            this.ogrno=ogrno;
                            out = new PrintWriter(new BufferedWriter(new FileWriter(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt", true)));
                            out.println(ogrno+" "+ad+" "+soyad);
                            } 
                            catch (IOException ex) {
                            Logger.getLogger(ogrenciler.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            out.close();
    }

    
    @Override
    public void sil(int ogrno) {
                
                this.ogrno = ogrno;
                String a = String.valueOf(ogrno);
                
                ArrayList<String> list = new ArrayList<>();
                try{
                File f = new File(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt");
                FileReader fileReader = new FileReader(f);
                String line;
                try (BufferedReader br = new BufferedReader(fileReader)) {
                line = br.readLine();
                while (line != null) {
                if((line=br.readLine()).startsWith(a)){}
                else{list.add(line);}
                } 
                }
                }
                catch(Exception e){
        }
        try{
        File f = new File(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt");
        FileWriter outFile = new FileWriter(f);
        PrintWriter out = new PrintWriter(outFile,true);
        for (String d: list){out.println(d);}
        out.close();
        }catch (Exception e){
        System.err.println("Hata: " + e.getMessage());
        }

    }
        
   

    @Override
    public void guncelle(String ad , String soyad, int ogrno) {
         
        this.ad=ad;
        this.soyad=soyad;
        this.ogrno=ogrno;

        String a = String.valueOf(ogrno);
        ArrayList<String> list = new ArrayList<>();
        try{
        File f = new File(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt");
        FileReader fileReader = new FileReader(f);
        String line;
        try (BufferedReader br = new BufferedReader(fileReader)) {
        line = br.readLine();
        while (line != null) {
        if((line=br.readLine()).startsWith(a)){
        {list.add(ogrno+" "+ad+" "+soyad);}
        }
        else{ list.add(line);}
        } 
        }
        }
        catch(Exception e){
        }
        try{
        File f = new File(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt");
        FileWriter outFile = new FileWriter(f);
        PrintWriter out = new PrintWriter(outFile,true);
        for (String d: list){out.println(d);}
        out.close();
        }catch (Exception e){
        System.err.println("Hata: " + e.getMessage());
        }
        
        
        
    }
    
}
