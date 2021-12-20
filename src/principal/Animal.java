
package principal;


public abstract class  Animal  {
    
    private String nom;
    private String tam;
    private String color;

    public Animal(String nom, String tam, String color)
    {
        this.nom = nom;
        this.tam = tam;
        this.color = color;
    }
    public void imprimedatos()
    {
     System.out.println("Nombre:"+nom);
     System.out.println("Tamaño:"+tam);
     System.out.println("Color:"+color);
    
    }
    
    
    public abstract void hablar(); //asi se define un metodo abstract
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
