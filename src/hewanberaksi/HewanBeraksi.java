/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewanberaksi;

/**
 *
 * @author Administrator
 */
public class HewanBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat object
        Hewan hewanku = new Hewan();
        
        /*Memanggil atribut & beri nilai*/
        hewanku.namaHewan = "Kucing Anggora";
        hewanku.diberinama = "Sodiq";
        hewanku.jeniskelamin = "jantan";
        hewanku.warna = "Putih Abu-Abu";
        hewanku.umur =2;
        
        System.out.println("Nama Hewan: " + hewanku.namaHewan);
        System.out.println("Diberi Nama: " + hewanku.diberinama);
        System.out.println("Jenis Kelamin: " + hewanku.jeniskelamin);
        System.out.println("Warna: " + hewanku.warna);
        System.out.println("Umur: " + hewanku.umur +"Tahun");
    }
}
