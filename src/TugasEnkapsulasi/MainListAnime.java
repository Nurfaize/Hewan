/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnkapsulasi;

/**
 *
 * @author Administrator
 */
public class MainListAnime {
    
    public static void main(String[]args){
        ListAnime ob = new ListAnime();
        ob.setJudulAnime("Maou Gakuin no Futekigousha Shijou Saikyou");
        ob.setStudio("Silver Link");
        ob.setGenre("Fantasy,Magic,School");
        ob.setTahunRilis(2020);
        ob.setRating(7.46);
        
        System.out.println("Judul Anime : "+ob.getJudulAnime());
        System.out.println("Studio : "+ob.getStudio());
        System.out.println("Genre : "+ob.getGenre());
        System.out.println("Tahun Rilis : "+ob.getTahunRilis());
        System.out.println("Rating : "+ob.getRating());
    }
}
