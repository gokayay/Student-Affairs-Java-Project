/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciısleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gokay
 */
public class dersprogrami extends dersler implements dersListesiArayuz{
    
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
            Logger.getLogger(dersprogrami.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(dersprogrami.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           public void dersProgrami2(){  // dersi güne ekleyip program olusturma metodu
                String path = System.getProperty("user.dir");
                String ders;
                    ArrayList<String> list = new ArrayList<>();
                    try{
                    File f = new File(path+"\\src\\ogrenciısleri\\dersProgrami.txt");
                    FileReader fileReader = new FileReader(f);
                    String line;
                    Scanner girdi=new Scanner(System.in);
                    try (BufferedReader br = new BufferedReader(fileReader)) {
                    while ((line = br.readLine()) != null) {
                    System.out.println(line+" gününe ders ekleyiniz!");
                    ders=girdi.nextLine();
                    list.add(line+" "+ders);
                    } 
                    }
                    }
                    catch(Exception e){
                    }
                    
                     try{
                        File f = new File(path+"\\src\\ogrenciısleri\\dersProgrami.txt");
                        FileWriter outFile = new FileWriter(f);
                        PrintWriter out = new PrintWriter(outFile,true);
                        for (String d: list){out.println(d);}
                        out.close();
                        }catch (Exception e){
                        System.err.println("Hata: " + e.getMessage());
                        }
                    
                    
                    
                }

           
           
           public void dersProgramigoruntule() throws FileNotFoundException, IOException{
                String path = System.getProperty("user.dir");
               try (BufferedReader br = new BufferedReader(new FileReader(path+"\\src\\ogrenciısleri\\dersProgrami.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                System.out.println("*************Ders Programı***********");
                System.out.println(everything);
                
                
               
               
               
               
           }
           
           }
           
           
           
    }
    
    
    
    
    
    
    
    

