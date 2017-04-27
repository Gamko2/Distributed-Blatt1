/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.sys.exerc1;

import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class Kino {
    public ArrayList<Film> filme;
    public void ladeFilme()
    {
        filme=new ArrayList<Film>();
        filme.add(new Film(120,"Hoja","Spielberg","Guardians of the Galaxy 2"));
        filme.add(new Film(128,"Weroneck","Lucas","Happy Burnout"));
        filme.add (new Film(138,"Klingemann","Freddi","Bye-Bye Man"));
    }
    public void spieleFilme()
    {
        for (Film film: filme ){
            System.out.println("Film: "+film);
        }
    }
    
    public static void main(String[] args){
        Kino kino=new Kino();
        kino.ladeFilme();
        kino.spieleFilme();
    }
    
}
