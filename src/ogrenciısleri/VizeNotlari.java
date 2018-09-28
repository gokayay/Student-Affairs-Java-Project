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
public class VizeNotlari extends NotlarSoyut implements NotGormeArayuz{
    
 @Override
        public void NotListesiGoruntule() 
    {
            try (BufferedReader br = new BufferedReader(new FileReader(path+"\\src\\ogrenciısleri\\vizeNotlari.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String notlar = sb.toString();
                System.out.println("**********VizeNotlari***********");
                System.out.println(notlar);
                
                
            } catch (FileNotFoundException ex) {
            Logger.getLogger(dersSecimi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(dersSecimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

 public void ogrencininNotunuGor (int ogrno){
           
            String a = String.valueOf(ogrno);
            String[] not;
            try{
            File f = new File(path+"\\src\\ogrenciısleri\\vizeNotlari.txt");
            FileReader fileReader = new FileReader(f);
            String line;
            BufferedReader br = new BufferedReader(fileReader);

            line = br.readLine();
            while (line != null) {
            if( !(line=br.readLine()).startsWith(a)){}
            else{
                not=line.split(" ");
                System.out.println("Vize Notun: "+not[3]);
                break;
            }
            } 

            }
            catch(IOException e) {
            System.out.println(e);
            }
            }
 
 
 public void notEkle () {
  
                int not;
                ArrayList<String> list = new ArrayList<>();
                try{
                File f = new File(path+"\\src\\ogrenciısleri\\ogrenciListesi.txt");
                FileReader fileReader = new FileReader(f);
                String line;
                Scanner vize=new Scanner(System.in);
                try (BufferedReader br = new BufferedReader(fileReader)) {
                while ((line = br.readLine()) != null) {
                System.out.println(line+"isimli ogrencinin vize notunu giriniz");
                not=vize.nextInt();
                list.add(line+" "+not);
                } 
                }
                }
                catch(Exception e){
                }
                try{
                File f = new File(path+"\\src\\ogrenciısleri\\vizeNotlari.txt");
                FileWriter outFile = new FileWriter(f);
                PrintWriter out = new PrintWriter(outFile,true);
                for (String d: list){out.println(d);}
                out.close();
                }catch (Exception e){
                System.err.println("Hata: " + e.getMessage());
                }

  
  
 }


    
}
