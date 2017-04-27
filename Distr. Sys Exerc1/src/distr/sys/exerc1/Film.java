/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.sys.exerc1;

/**
 *
 * @author Marc
 */
public class Film {
  
  public int laenge;
  public String autor;
  public String regisseur;
  public String titel;
  
  public Film(int laenge, String autor,String regisseur,String titel)
  {
      this.laenge=laenge;
      this.autor=autor;
      this.regisseur=regisseur;
      this.titel=titel;
      
  }
  @Override
  public String toString(){
      return String.valueOf(laenge) +" " + autor +" " + regisseur +" "+ titel;
  }
    
}
