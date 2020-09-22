/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author Administrator
 */
public class Enkapsulasi {
    private int alas,tinggi;
    private double LuasSegitiga;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    public int getAlas(){
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuasSegitiga() {
        return LuasSegitiga;
    }

    public void setLuasSegitiga(int alas, int tinggi) {
        LuasSegitiga = 0.5 * (double)(alas*tinggi);
    }
    
    
}
