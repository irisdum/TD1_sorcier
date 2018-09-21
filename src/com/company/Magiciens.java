package com.company;

public class Magiciens extends Sorcier implements Superpouvoir {
    public Magiciens (String nom, float pointVie){
        super(nom,pointVie);
    }

    public double sort(){
        return Math.random();
    }
    public double getPouvoir() {
        return this.pouvoir*extra;
    }
    
}
