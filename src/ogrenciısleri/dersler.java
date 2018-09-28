/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokay
 */

public class dersler extends dosyaSoyut{
    
        private String dersadi;
        private int dersid;
      
               
   
    public void kaydet(String dersadi, int dersid) {
        
                            PrintWriter out = null;
                            try {
                            this.dersadi=dersadi;
                            this.dersid=dersid;
                            out = new PrintWriter(new BufferedWriter(new FileWriter(path+"\\src\\ogrenciısleri\\dersler.txt", true)));
                            out.println(dersid+" - "+dersadi);
                            } 
                            catch (IOException ex) {
                            Logger.getLogger(ogrenciler.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            out.close();
    }

    
 
    public void sil(int dersid) {
                this.dersid = dersid;
                String a = String.valueOf(dersid);
                
                ArrayList<String> list = new ArrayList<>();
                try{
                File f = new File(path+"\\src\\ogrenciısleri\\dersler.txt");
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
        
   

    
    public void guncelle(String dersadi , int dersid) {
        
        this.dersadi=dersadi;
        this.dersid=dersid;

        String a = String.valueOf(dersid);
        ArrayList<String> list = new ArrayList<>();
        try{
        File f = new File(path+"\\src\\ogrenciısleri\\dersler.txt");
        FileReader fileReader = new FileReader(f);
        String line;
        try (BufferedReader br = new BufferedReader(fileReader)) {
        line = br.readLine();
        while (line != null) {
        if((line=br.readLine()).startsWith(a)){
        {list.add(dersid+" - "+dersadi);}
        }
        else{ list.add(line);}
        } 
        }
        }
        catch(Exception e){
        }
        try{
        File f = new File(path+"\\src\\ogrenciısleri\\dersler.txt");
        FileWriter outFile = new FileWriter(f);
        PrintWriter out = new PrintWriter(outFile,true);
        for (String d: list){out.println(d);}
        out.close();
        }catch (Exception e){
        System.err.println("Hata: " + e.getMessage());
        }
        

    }
    
    
    
    
    
    
    
}
