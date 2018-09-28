/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokay
 */
public class sinavProgrami extends dersler implements dersListesiArayuz{
    
    @Override
    public void dersprogramiListe() 
    
    {
            try (BufferedReader br = new BufferedReader(new FileReader(path+"\\src\\ogrenciısleri\\dersler.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                System.out.println("**********Dersler***********");
                System.out.println(everything);
                
                
            } catch (FileNotFoundException ex) {
            Logger.getLogger(sinavProgrami.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(sinavProgrami.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public void sinavProgrami2(){
    
                    String sinav;
                    ArrayList<String> list = new ArrayList<>();
                    
                    try{
                    File f = new File(path+"\\src\\ogrenciısleri\\sinavProgrami.txt");
                    FileReader fileReader = new FileReader(f);
                    String line;
                    Scanner ders=new Scanner(System.in);
                    
                    
                    try (BufferedReader br = new BufferedReader(fileReader)) {
                    while ((line = br.readLine()) != null) {
                    System.out.println(line+" sinav gününe bir ders ekleyiniz! Not: O gün herhangi bir sinav yoksa - koyunuz.");
                    sinav=ders.nextLine();
                    list.add(line+" "+sinav);
                    } 
                    }
                    }
                    catch(Exception e){
                    }
                    
                     try{
                        File f = new File(path+"\\src\\ogrenciısleri\\sinavProgrami.txt");
                        FileWriter outFile = new FileWriter(f);
                        PrintWriter out = new PrintWriter(outFile,true);
                        for (String d: list){out.println(d);}
                        out.close();
                        }catch (Exception e){
                        System.err.println("Hata: " + e.getMessage());
                        }
                    
                    
                    
                }
    
     public void sinavProgramigoruntule() throws FileNotFoundException, IOException{
               
               try (BufferedReader br = new BufferedReader(new FileReader(path+"\\src\\ogrenciısleri\\sinavProgrami.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                System.out.println("*************Sınav Programı***********");
                System.out.println(everything);
               
               
           }
           
           }
    
    
    
    
    
}
