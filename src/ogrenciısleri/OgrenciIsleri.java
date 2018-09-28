// Gökay AY / 1306160093
package ogrenciısleri;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Gokay
 * 
 * ************************** / Gökay AY / 1306160093 /
 * 
 */
public class OgrenciIsleri {

   
    public static void main(String[] args) throws IOException {
        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
        System.out.println("Ogrenci Isleri Otomasyonumuza Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
        boolean cikis=false;
        while(!cikis){                                                               // döngüde kalması için
        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");    
        System.out.println("1- Admin Islemleri");
        System.out.println("2- Ogrenci Islemleri");
        System.out.println("3- Ogretim Uyesi Islemleri");
        System.out.println("0- Cikis");
        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*"); 
        
        Scanner sc = new Scanner(System.in);
        int secim1= sc.nextInt();
        
        switch(secim1){
        
            case 1: {
                 
                System.out.println("Admin Islemlerine Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
                System.out.println("Lütfen şifrenizi giriniz! (İpucu: 123)");
                boolean cikis2=false;
                while(!cikis2){
                int sifre=123;  // admin şifresi verip p şifre girildiği taktirde admin işlemleri yapılabilir
                
                Scanner scsifre = new Scanner(System.in);
                int kullaniciSifresi= scsifre.nextInt();
                
                if(sifre==kullaniciSifresi){
                
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                System.out.println("1- Ogrenci Ana İşlemleri");
                System.out.println("2- Ogretim Uyesi Ana İşlemleri");
                System.out.println("3- Ders Ekleme/Cikarma/Gunceleme");
                System.out.println("4- Ders Programi Gör/Olustur");
                System.out.println("5- Ogretim Uyesine Ders Ekle");
                System.out.println("6- Sinav Programi Olustur");
                System.out.println("0- Üst Menüye Dön");
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                
                Scanner sc2 = new Scanner(System.in);
                int secim2= sc2.nextInt();
                
                switch(secim2)
                {
                    case 1:
                    {
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     System.out.println("Ogrenci Kaydet/Sil/Guncelle");
                     System.out.println("1- Ogrenci Kaydet");
                     System.out.println("2- Ogrenci Sil");
                     System.out.println("3- Ogrenci Guncelle");
                     System.out.println("0- Üst Menüye Dön");
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                      
                     Scanner sc4 = new Scanner(System.in);
                        int secim4= sc4.nextInt();
                         boolean cikis3=false;
                         while(!cikis3){
                        switch(secim4)
                        {
                            case 1:
                            {
                                System.out.println("Ogrenci Kaydetme Ekranına Hoşgeldiniz! Lütfen kaydedilmesi istenen ogrencinin adini giriniz:");
                                Scanner isim= new Scanner(System.in);
                                String ad= isim.nextLine();
                                
                                System.out.println("Lütfen kaydedilmesi istenen ogrencinin soyadini giriniz:");
                                Scanner soyisim=new Scanner(System.in);
                                String soyad=soyisim.nextLine();
                                System.out.println("Lütfen kaydedilmesi istenen ogrencinin numarasini giriniz:");
                                Scanner numara=new Scanner(System.in);
                                int ogrno=numara.nextInt();
                                
                                ogrenciler ogr1 = new ogrenciler();
                                ogr1.kaydet(ad,soyad,ogrno); // ad -soyad ve numarası bilinen öğrenciyi txt'ye kaydettik
                                
                                System.out.println( "Ogrenci basariyla kaydedildi.");
                            break;
                           
                            }
                            case 2:
                            {
                                System.out.println("Ogrenci Silme Ekranına Hoşgeldiniz! Lütfen silinmesi istenen ogrencinin numarasini giriniz:");
                                Scanner numara= new Scanner(System.in);
                                int ogrno= numara.nextInt(); // ogrno'su ile sildik
                                
                                ogrenciler ogr2 = new ogrenciler();
                                
                                ogr2.sil(ogrno);
                                System.out.println( "Ogrenci basariyla silindi.");    
                            break;
                            } 
                            case 3:
                            {
                                System.out.println("Guncellemek istediginiz ogrencinin numarasini giriniz:");
                                Scanner a=new Scanner(System.in);
                                int ogrno=a.nextInt();                                                  // numarası verilen öğrencinin adını ve soyadını güncelledik
                                
                                System.out.println("Guncellemek istediginiz ogrencinin adini giriniz:");
                                Scanner b=new Scanner(System.in);
                                String ad=b.nextLine();
                                
                                System.out.println("Guncellemek istediginiz ogrencinin soyadini giriniz:");
                                Scanner c=new Scanner(System.in);
                                String soyad=c.nextLine();
                                
                                ogrenciler ogr2 = new ogrenciler();
                                ogr2.guncelle(ad, soyad, ogrno);
                                System.out.println(ogrno+" numarali ogrenci guncellendi");

                            break;
                            }
                            case 0:
                            cikis3=true;
                            break;                                       
                            
                            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
 
                            break;
                        }
                    
                    break;
                    }
                    }
                    case 2:
                    {
                        
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     System.out.println("Ogretim Uyesi Kaydet/Sil/Guncelle");
                     System.out.println("1- Ogretim Uyesi Kaydet");
                     System.out.println("2- Ogretim Uyesi Sil");
                     System.out.println("3- Ogretim Uyesi Guncelle");    
                     System.out.println("0- Üst Menüye Dön");
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     
                     // öğrenci işlemleri ile aynı işlemler //
                    Scanner sc5 = new Scanner(System.in);
                    int secim5= sc5.nextInt();
                    boolean cikis4=false;
                    while(!cikis4){
                        switch(secim5){
                            case 1:{
                                System.out.println("Ogretim Uyesi Kaydetme Ekranına Hoşgeldiniz! Lütfen kaydedilmesi istenen ogretim uyesinin adini giriniz:");
                                Scanner isim= new Scanner(System.in);
                                String ad= isim.nextLine();
                                
                                System.out.println("Lütfen kaydedilmesi istenen ogretim uyesinin soyadini giriniz:");
                                Scanner soyisim=new Scanner(System.in);
                                String soyad=soyisim.nextLine();
                                
                                System.out.println("Lütfen kaydedilmesi istenen ogretim uyesinin numarasini giriniz:");
                                Scanner numara=new Scanner(System.in);
                                int ogrno=numara.nextInt();
                                
                                ogretimUyeleri ogr1 = new ogretimUyeleri();
                                ogr1.kaydet(ad,soyad,ogrno);
                                
                                System.out.println( "Ogretim uyesinin basariyla kaydedildi.");
                            break;
                           
                            }
                            case 2:
                            {
                                System.out.println("Ogretim uyesi Silme Ekranına Hoşgeldiniz! Lütfen silinmesi istenen ogretim uyesinin numarasini giriniz:");
                                Scanner numara= new Scanner(System.in);
                                int ogrno= numara.nextInt();
                                
                                ogrenciler ogr2 = new ogrenciler();
                                
                                ogr2.sil(ogrno);
                                System.out.println( "Ogretim uyesi basariyla silindi.");    
                            break;
                            } 
                            case 3:
                            {
                                System.out.println("Guncellemek istediginiz ogretim uyesinin numarasini giriniz:");
                                Scanner a=new Scanner(System.in);
                                int ogrno=a.nextInt();
                                
                                System.out.println("Guncellemek istediginiz ogretim uyesinin adini giriniz:");
                                Scanner b=new Scanner(System.in);
                                String ad=b.nextLine();
                                
                                System.out.println("Guncellemek istediginiz ogretim uyesinin soyadini giriniz:");
                                Scanner c=new Scanner(System.in);
                                String soyad=c.nextLine();
                                
                                ogrenciler ogr2 = new ogrenciler();
                                ogr2.guncelle(ad, soyad, ogrno);
                                System.out.println(ogrno+" numarali ogretim uyesi guncellendi");

                            break;
                            }
                            case 0: cikis4=true; break;
                            
                            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                            break;
                            
                        }
                    
                    }
                    break;
                    } 
                    case 3:
                    {
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");

                     System.out.println("Ders İşlemleri //////////////// Kaydet/Sil/Guncelle");
                     System.out.println("1- Ders Kaydet");
                     System.out.println("2- Ders Sil");
                     System.out.println("3- Ders Guncelle");    
                     System.out.println("0- Cikis");
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*"); 
                     
                    Scanner sc5 = new Scanner(System.in);
                    int secim5= sc5.nextInt();
                    boolean cikis5=false;
                    while(!cikis5){
                        switch(secim5){
                            case 1:{
                            System.out.println("Ders Kaydetme Ekranına Hoşgeldiniz! Lütfen kaydedilmesi istenen dersin adini giriniz:");
                                Scanner isim= new Scanner(System.in);
                                String dersadi= isim.nextLine();
                                
                               
                            
                                System.out.println("Lütfen kaydedilmesi istenen dersin id'sini giriniz:");
                                Scanner numara=new Scanner(System.in);
                                int dersid=numara.nextInt();
                                
                                dersler ders1 = new dersler();
                                ders1.kaydet(dersadi, dersid);
                                
                                System.out.println( "Ders basariyla kaydedildi.");
                            break;
                           
                            }
                            case 2:
                            {
                                System.out.println("Ders Silme Ekranına Hoşgeldiniz! Lütfen silinmesi istenen dersin id'sini giriniz:");
                                Scanner numara= new Scanner(System.in);
                                int dersid= numara.nextInt();
                                
                                dersler ders2 = new dersler();
                                
                                ders2.sil(dersid);
                                System.out.println( "Ders basariyla silindi.");    
                            break;
                            } 
                            case 3:
                            {
                                System.out.println("Guncellemek istediginiz dersin id'sini giriniz:");
                                Scanner a=new Scanner(System.in);
                                int dersid=a.nextInt();
                                
                                System.out.println("Guncellemek istediginiz dersin adini giriniz:");
                                Scanner b=new Scanner(System.in);
                                String dersadi=b.nextLine();
                                
                                dersler ders2 = new dersler();
                                ders2.guncelle(dersadi, dersid);
                                
                                System.out.println(dersid+" numarali ders guncellendi");

                            break;
                            }
                            case 0: cikis5=true; break;
                            
                            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                            break;
                            
                        }
                    
                    }
                    break;
                    
                    } 
                    case 4:
                    {
     
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     System.out.println("1- Ders Programi Gör");
                     System.out.println("2- Ders Programi Olustur");
                     System.out.println("0- Üst Menüye Dön");
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     
                    Scanner sc21 = new Scanner(System.in);
                    int secim21= sc21.nextInt();
                    boolean cikis6=false;
                    while(!cikis6){
                        switch(secim21){ 
                       
                    case 1: // daha önceden oluşturulan ders programını görmek için
                    {
                       dersprogrami dp0 = new dersprogrami();
                       dp0.dersProgramigoruntule();
                    
                    break;
                    }
                      case 2:
                    {
                        dersprogrami dp = new dersprogrami();  
                        dp.dersprogramiListe();
                        System.out.println("Yukarıda tüm dersler verilmiştir. Ders Programi için lütfen her güne ders ekleyiniz...");
                        dp.dersProgrami2();
                    
                    break;
                    }      
                        
                       case 0:{
                    
                    cikis6=true;
                    break;
                    
                    }
                    
                    default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
 
                    break;     
                        }
                    }
                     
                        
                    
                    break;
                    }
                    case 5:
                    {
                       System.out.println("Ogretim Uyesine Ders Ekleme Ekranına Hoşgeldiniz!");
                        ogretimUyesineDersEkle oude = new ogretimUyesineDersEkle();  
                        oude.dersEkleme();
                       
                    break;
                    }
                    case 6:
                    {
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                     System.out.println("1- Sinav Programi Gör");
                     System.out.println("2- Sinav Programi Olustur");
                     System.out.println("0- Üst Menüye Dön");
                     System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                    Scanner sc21 = new Scanner(System.in);
                    int secim21= sc21.nextInt();
                    boolean cikis7=false;
                    while(!cikis7){
                        switch(secim21){ 
                       
                    case 1:
                    {
                       sinavProgrami sp0 = new sinavProgrami();
                       sp0.sinavProgramigoruntule();
                    
                    break;
                    }
                      case 2:
                    {
                        sinavProgrami sp = new sinavProgrami();
                        sp.dersprogramiListe();
                        System.out.println("Yukarıda tüm dersler verilmiştir. Sinav Programi için lütfen her güne bir ders ekleyiniz...");
                        sp.sinavProgrami2();
                    
                    break;
                    }      
                        
                       case 0:{
                    
                    cikis7=true;
                    break;
                    
                    }
                    
                    default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
 
                    break;     
                        }
                    
                    }
                    }
                    
                    case 0:{
                    
                    cikis2=true;
                    break;
                    
                    }
                    
                     default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
 
                    break;
                    
                
                }
 
            }
            else 
            System.out.println("Hatali Sifre Girdiniz! Lütfen Tekrar Deneyin... ");
                break;
            }
            break;
            } 
            
            
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            
            
            
            case 2: {
                System.out.println("Ogrenci Islemlerine Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
                
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");    
                System.out.println("1- Notları Gör");
                System.out.println("2- Ders Seç");
                System.out.println("0- Üst Menüye Dön");
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                
                Scanner sc3 = new Scanner(System.in);
                int secim3= sc3.nextInt();
                boolean cikis8=false;                
                while(!cikis8){
                switch(secim3)
                {

                    case 1:
                    {
                        System.out.println("Not Gorme İslemine Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
                
                        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");    
                        System.out.println("1- Vize Notumu Gör");
                        System.out.println("2- Final Notumu Gör");
                        System.out.println("3- Proje Notumu Gör");
                        System.out.println("0- Üst Menüye Dön");
                        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                        
                        Scanner sc76 = new Scanner(System.in);
                        int secim76= sc76.nextInt();
                        boolean cikis9=false; 
                        while(!cikis9){
                        switch(secim76)
                        {
                            case 1:
                            {
                                System.out.println("**********Vize Notum***********");
                                System.out.println("Lütfen numaranizi giriniz:");
                                Scanner idm = new Scanner(System.in);
                                int ogrno= idm.nextInt();
                                VizeNotlari vng= new VizeNotlari();
                                vng.ogrencininNotunuGor(ogrno);
                                System.out.println("**********Notunuz yukarida yer almaktadir.***********");
                                
                            break;
                            }
                            case 2:
                            {
                                System.out.println("**********Final Notum***********");
                                System.out.println("Lütfen numaranizi giriniz:");
                                Scanner idm = new Scanner(System.in);
                                int ogrno= idm.nextInt();
                                FinalNotlari fng= new FinalNotlari();
                                fng.ogrencininNotunuGor(ogrno);
                                System.out.println("**********Notunuz yukarida yer almaktadir.***********");
                                
                            break;
                            } 
                            case 3:
                            { 
                                System.out.println("**********Proje Notum***********");
                                System.out.println("Lütfen numaranizi giriniz:");
                                Scanner idm = new Scanner(System.in);
                                int ogrno= idm.nextInt();
                                ProjeNotlari png= new ProjeNotlari();
                                png.ogrencininNotunuGor(ogrno);
                                System.out.println("**********Notunuz yukarida yer almaktadir.***********");
                           


                            break;
                            }
                            case 0: cikis9=true; break;

                            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                            break;


                        }



                        } 
                        break;
                    }
                  
                    case 2:
                    { 
                        
                     Scanner dersAdi= new Scanner(System.in);
                     String ders= dersAdi.nextLine();
                     dersSecimi ds = new dersSecimi();
                     ds.dersprogramiListe();
                     dersSecimi.dersEkle(ders);
                    
                    
                    break;
                    }
                    case 0: cikis8=true; break;
                    
                    default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                    break;
                           
                    
                }
                
                
                
                } 
                break;
            }
            
            
            
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            
   
            
            case 3: {
                System.out.println("Ogretim Uyesi Islemlerine Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
                
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                System.out.println("1- Ogrenci Notlarını Gor");
                System.out.println("2- Verdiğim Dersleri Gor");
                System.out.println("3- Vize Notu Ekle");
                System.out.println("4- Final Notu Ekle");
                System.out.println("5- Proje Notu Ekle");
                System.out.println("0- Üst Menüye Dön");
                System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                
                Scanner sc4 = new Scanner(System.in);
                int secim4= sc4.nextInt();
                 boolean cikis10=false; 
                while(!cikis10){
                switch(secim4)
                {

                    case 1:
                    {
                     
                        System.out.println("Öğrenci Notları Listesi İslemine Hoşgeldiniz! Lütfen menüden hangi islem grubunda ilerleyeceğinizi seciniz!\n");
                
                        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");    
                        System.out.println("1- Vize Notlarini Gör");
                        System.out.println("2- Final Notlarini Gör");
                        System.out.println("3- Proje Notlarini Gör");
                        System.out.println("0- Üst Menüye Dön");
                        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*");
                        
                        Scanner sc89= new Scanner(System.in);
                        int secim89= sc89.nextInt();
                        boolean cikis11=false; 
                        while(!cikis11){
                        switch(secim89)
                        {
                            case 1:
                            {
                                
                                VizeNotlari vng= new VizeNotlari();
                                vng.NotListesiGoruntule();
                                System.out.println("**********Notlar yukarida yer almaktadir.***********");
                                
                            break;
                            }
                            case 2:
                            {
                                
                                FinalNotlari fng= new FinalNotlari();
                                fng.NotListesiGoruntule();
                                System.out.println("**********Notlar yukarida yer almaktadir.***********");
                                
                            break;
                            } 
                            case 3:
                            { 
                               
                                ProjeNotlari png= new ProjeNotlari();
                                png.NotListesiGoruntule();
                                System.out.println("**********Notlar yukarida yer almaktadir.***********");
                           


                            break;
                            }
                            case 0: 
                                cikis11=true; 
                                break;

                            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                            break;


                        }



                        } 
                        
                 
                    break;
                    } 
                    case 2:
                    {
                                System.out.println("**********Verdiğim Dersler***********");
                                System.out.println("Lütfen numaranizi giriniz:");
                                Scanner idm = new Scanner(System.in);
                                int ogrno= idm.nextInt();
                                ogretimUyesineDersEkle oude = new ogretimUyesineDersEkle();
                                oude.derslerimiGor(ogrno);
                                System.out.println("**********Verdiğiniz Dersler yukarida yer almaktadir.***********");
                    break;
                    }
                    case 3:
                    {
                        VizeNotlari vn = new VizeNotlari();
                        vn.notEkle();
                    
                    break;
                    }
                    case 4:
                    {
                        FinalNotlari fn = new FinalNotlari();
                        fn.notEkle();
                    
                    break;
                    }
                    case 5:
                    {
                        ProjeNotlari pn = new ProjeNotlari();
                        pn.notEkle();
                    
                    break;
                    }
                    
                    case 0:{
                        cikis10=true;
                        break;
                    }
                    default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
                    break;
                }
 
                
                break;
                
            }
                break;
            }
            case 0: {    
            cikis=true;
            break;
}
            
            
            default: System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz.");
 
            break;
        }
        
        
    }
    }
}
