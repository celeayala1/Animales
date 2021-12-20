/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;



public class Gato extends Animal implements InterfaceC {
    
  private String marcaArena;  
  private String Idiomag;

    public Gato(String marcaArena,String Idiomag, String nom, String tam, String color) {
        super(nom, tam, color);
        this.marcaArena = marcaArena;
        this.Idiomag = Idiomag;
    }

        @Override 
    public void hablar()
    {
        System.out.println("Soy un gato y digo "+ Idiomag);
    }
    
        
     public void comercarne()
   {
       System.out.println("soy "+COMIDA);
   }
     
     public void Imprime()
     {         
       System.out.println("Mi arena favorita:"+marcaArena);     
     }       
    
}
