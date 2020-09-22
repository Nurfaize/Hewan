/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOverloading;

/**
 *
 * @author Administrator
 */
public class Manga {
    
  private String judul;
  private String pengarang;

  public Manga(){
    judul = "Tidak ada judul";
    pengarang = "Tidak ada pengarang";
  }
  public Manga(String judul){
    this.judul = judul;
    pengarang = "Tidak ada pengarang";
  }
 public Manga(String judul, String pengarang){
    this.judul = judul;
    this.pengarang = pengarang;
  }
  public void cetakManga(){
    System.out.println("Judul    : "+ judul);
    System.out.println("Pengarang : "+ pengarang);
    System.out.println();
  }
 public static void main(String[] a){
    Manga manga1 = new Manga();
    Manga manga2 = new Manga("Kanojo, Okarishimasu", "Reiji Miyajima");
    Manga manga3 = new Manga("Demon Slayer:Kimetsu no Yaiba", "Koyoharu Gotoge");
    manga1.cetakManga();
    manga2.cetakManga();
    manga3.cetakManga();
  }
}
