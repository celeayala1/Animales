
package principal;


public class Perro extends Animal implements InterfaceC {
    
    private String marcaC;
    private String Idiomap;

    public Perro(String marcaC,String Idiomap, String nom, String tam, String color) {
        super(nom, tam, color);
        this.marcaC = marcaC;
        this.Idiomap= Idiomap;
    }
     

   @Override 
   //METODO ABSTRACTO
   public void hablar()
{
    System.out.println("Soy un perro y digo "+Idiomap);
}
   //INTERFACE
   public void comercarne()
   {
       System.out.println("soy "+COMIDA);
   }

    
   public void Imprime()
   {        
      System.out.println("Mi marca favorita es:"+marcaC);
   }
   
}  
    
    
    

