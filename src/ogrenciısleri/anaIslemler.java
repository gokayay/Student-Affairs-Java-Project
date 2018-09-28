
package ogrenciısleri;

/**
 *
 * @author Gokay
 */
public interface anaIslemler 

{
    public void kaydet(String ad, String soyad, int ogrno);
    public void sil(int ogrno);
    public void guncelle(String ad, String soyad,int ogrno);
    
}
