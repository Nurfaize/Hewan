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
public class ListAnime {
    private String judulAnime;
    private String studio;
    private String genre;
    private int tahunRilis;
    private Double rating;

    public String getJudulAnime() {
        return judulAnime;
    }

    public void setJudulAnime(String judulAnime) {
        this.judulAnime = judulAnime;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
