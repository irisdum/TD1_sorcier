package com.company;

public abstract class Personnage {
    protected String nom;
    protected double pointVie;

    public Personnage(String ch, double point)
    {
        this.nom=ch;
        this.pointVie=point;
    }


    public double getVie() {

        return this.pointVie;
    }



    public boolean mort(){
        if(pointVie<=0){
            System.out.println( this.nom +" est mort");
            return true;
        }
        else{
            //System.out.println(this.nom +" est vivant");
            return false;
        }
    }
    public String getnom() {
        return this.nom;

    }
    public void addVie(double a){
        this.pointVie=this.pointVie+a;
    }

    abstract double subitFrappe(double coup);
    abstract void attaque(Personnage m);
    abstract double subitCharme(double pouvoir);
}

