public class Animales extends Inventario {
    protected String Sexo; 
    protected String Edad;
    protected float Tamano;
    protected float Peso;
    protected String Personalidad; 

    public Animales(String Animal, String Nombre, String Color, float Precio,
                String Sexo, String Edad, float Tamano, float Peso, String Personalidad) {
        super(Animal, Nombre, Color, Precio); 
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Tamano = Tamano;
        this.Peso = Peso;
        this.Personalidad = Personalidad; 
    }
}