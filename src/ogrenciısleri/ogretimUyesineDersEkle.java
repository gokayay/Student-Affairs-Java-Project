/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gokay
 */

public class ogretimUyesineDersEkle extends ogretimuyesiSoyut {
    String path = System.getProperty("user.dir");
        public void dersEkleme(){
           
            String ders;
            ArrayList<String> list = new ArrayList<>();
            try{
            File f = new File(path+"\\src\\ogrenciısleri\\ogretimUyesiListesi.txt");
            FileReader fileReader = new FileReader(f);
            String line;
            Scanner dersim=new Scanner(System.in);
            try (BufferedReader br = new BufferedReader(fileReader)) {
            while ((line = br.readLine()) != null) {
            System.out.println(line+"isimli ogretim uyesinin verdigi dersi giriniz:");
            ders=dersim.nextLine();
            list.add(line+" "+ders);
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
    
        public void derslerimiGor(int ogrno){
            String path = System.getProperty("user.dir");
            String a = String.valueOf(ogrno);
            String[] ders;
            try{
            File f = new File(path+"\\src\\ogrenciısleri\\ogretimUyesiListesi.txt");
            FileReader fileReader = new FileReader(f);
            String line;
            BufferedReader br = new BufferedReader(fileReader);

            line = br.readLine();
            while (line != null) {
            if( !(line=br.readLine()).startsWith(a)){}
            else{
                ders=line.split(" ");
                System.out.println("Dersin: "+ders[3]);
                break;
            }
            } 

            }
            catch(IOException e) {
            System.out.println(e);
            }
            }

    
        
        
        
        
        
        
        
    }
    
    
    

