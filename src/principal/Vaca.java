
package principal;

public class  Vaca extends Animal implements InterfaceH{
    
    private int cantvecescomid;
    private String Idiomav;

    public Vaca(int cantvecescomid, String Idiomav, String nom, String tam, String color)
    {
        super(nom, tam, color);
        this.cantvecescomid = cantvecescomid;
        this.Idiomav = Idiomav;
    }

 

//Metodo abstracto
    @Override
    public void hablar()
    {
        System.out.println("Soy una vaca y digo "+ Idiomav);
    }
    //interface
  public void comerhierba()
   {
       System.out.println("soy "+COMIDAH);
   }
    

public void Imprimir()

 {
     System.out.println("La cantidad de veces que como en el dia es:"+cantvecescomid);
 }

}