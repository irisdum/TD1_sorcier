package com.company;

public class Monstre extends Personnage implements Victime{

    public Monstre(String nom, float pointVie) {
        super(nom, pointVie);
    }


    public double subitCharme(double force) {
            /**retourne la valeur du dégat causé par la riposte du monstre */
        double s = Math.abs( this.pointVie - force);
        this.pointVie=s;
        return s/2;

    }

    public double subitFrappe(double coup) {
        double t = this.pointVie - coup;
        this.pointVie=t;
        return this.pointVie/2;
        //System.out.println(");
    }

    public void attaque(Personnage m) {
        if (this.mort() == false) {
//            m.subitFrappe(this.getVie() / 2);
            //System.out.println(this.nom+ "  a "+this.pointVie+" PV"+" et attaque "+m.nom+ " "+ m.pointVie+" PV"
            //);
            this.addVie(-m.subitFrappe(this.pointVie/2));
           // System.out.println("Je suis "+ m.nom+ " et j'ai " +m.pointVie);


        }
    }

}


