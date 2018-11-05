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
        //System.out.println("Je suis un sorcier ahahaha");
        return 0;

    }

    public double subitFrappe(double coup) {
        this.pointVie = this.pointVie - coup;
        return this.pointVie*this.pouvoir ;
    }

    public void attaque(Personnage m) {
        if (this.mort()==false && m.mort()==false){
            //System.out.println(this.nom+ " a " + this.pointVie+" PV"+ " attaque "+ m.nom+" "+ this.pointVie+" PV" );
            m.subitCharme(this.pouvoir * this.pointVie);
            //System.out.println("Le sorcier à un pouvoir de "+ this.pouvoir);
            this.addVie(m.subitCharme(this.pouvoir * this.pointVie));
            //System.out.println(this.nom+" a " +this.pointVie+ " PV");

        }

    }
    public double getPouvoir(){
        return this.pouvoir;
    }
}
