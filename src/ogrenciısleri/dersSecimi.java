/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokay
 */
public class dersSecimi implements dersListesiArayuz{
    
    private String ders;
    
    @Override
        public void dersprogramiListe() 
    {
             String path = System.getProperty("user.dir");
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
            Logger.getLogger(dersSecimi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(dersSecimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dersEkle(String ders) {
                            String path = System.getProperty("user.dir");
                            PrintWriter out = null;
                            try {   
                            out = new PrintWriter(new BufferedWriter(new FileWriter(path+"\\src\\ogrenciısleri\\alinanDersler.txt", true)));
                            out.println("Alinan Ders:"+ders);
                            } 
                            catch (IOException ex) {
                            Logger.getLogger(ogrenciler.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            out.close();
    }
    
    
    
}
