package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello");

        //Monstre m = new Monstre("Clem",10);
        //Sorcier s= new Sorcier("Iris", 16);
        //s.attaque(m);
       // System.out.println(s.pouvoir);
        String sorcierListe[]={"Clem","Marg","Eva","Mylan","Iris"};
        String monstreListe[]={"Stan","Nathan","Lucas","Hugues","Hugo"};
        ArrayList <Personnage> l=new ArrayList<Personnage>();
        //ArrayList <Sorcier> q= new ArrayList<Sorcier>();
        Random r= new Random ();
        //System.out.println(sorcierListe[2]);

        for(int i=0;i<5;i++) {
            float valeur = r.nextInt(100);
            float valeur2 = r.nextInt(100);
            Sorcier s = new Sorcier(sorcierListe[i], valeur);
            Monstre m = new Monstre(monstreListe[i], valeur2);
            l.add(m);
            l.add(s);
        }
        for (int i=0;i<20;i++) {
            Random r2 = new Random();
            int valeur3 = r2.nextInt(9);
            int valeur4= r2.nextInt(9);
            if(valeur3 !=valeur4){
            l.get(valeur3).attaque(l.get(valeur4));
        }



        }

    }

}

