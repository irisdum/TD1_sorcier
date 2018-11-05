package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String sorcierListe[]={"s1","s2","s3","s4","s5"};
        String monstreListe[]={"m1","m2","m3","m4","m5"};
        ArrayList <Personnage> l=new ArrayList<Personnage>();
        Random r= new Random ();

        for(int i=0;i<5;i++) {
            /** création du tableau contenant les monstres et les sorciers */
            float valeur = r.nextInt(100);
            float valeur2 = r.nextInt(100);
            Sorcier s = new Sorcier(sorcierListe[i], valeur);
            Monstre m = new Monstre(monstreListe[i], valeur2);
            l.add(m);
            l.add(s);
        }

        System.out.println("Le jeu commence : ");

        for (int i=0;i<10;i++) {
            /** Deux personnages tirés au sort s'attaque */

            Random r2 = new Random();
            int valeur3 = r2.nextInt(9);
            int valeur4= r2.nextInt(9);
            if(valeur3 !=valeur4){ // test pour eviter qu'un personnage ne s'attaque lui meme
                if (l.get(valeur3).mort()==false && l.get(valeur4).mort()==false){
                //System.out.println(l.get(valeur3).nom+" "+ l.get(valeur3).pointVie+ " PV " + " attaque " + l.get(valeur4).nom+" "+l.get(valeur4).pointVie+ " PV ");
                l.get(valeur3).attaque(l.get(valeur4));
                //l.get(valeur3).mort();
                //l.get(valeur4).mort();
                System.out.println(l.get(valeur3).nom+" "+ l.get(valeur3).pointVie+ " PV "+ " et "+ l.get(valeur4).nom+" " +l.get(valeur4).pointVie+ " PV ");
        }
            }



        }

    }

}

