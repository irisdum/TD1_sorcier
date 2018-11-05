package com.company;

import java.awt.geom.NoninvertibleTransformException;

public class Sorcier extends Personnage implements Victime {
    protected double pouvoir;
    //double cst=Math.random();
    public Sorcier(String nom, float pointVie) {
        super(nom, pointVie);
        this.pouvoir = Math.random();
    }

    public double subitCharme(double force) {

        return 0;

    }

    public double subitFrappe(double coup) {
        this.pointVie = this.pointVie - coup;
        return this.pointVie*this.pouvoir ;
    }

    public void attaque(Personnage m) {
        if (this.mort()==false && m.mort()==false){

            m.subitCharme(this.pouvoir * this.pointVie);

            this.addVie(m.subitCharme(this.pouvoir * this.pointVie));

        }

    }
    public double getPouvoir(){
        return this.pouvoir;
    }
}
