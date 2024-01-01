public class Perro extends Animales {
    private String Raza;
    private String Fidelidad;

    public Perro(String Animal, String Nombre, String Color, float Precio,
                String Sexo, String Edad, float Tamano, float Peso, String Personalidad,
                String Raza, String Fidelidad) {
        super(Animal, Nombre, Color, Precio, Sexo, Edad, Tamano, Peso, Personalidad); 
        this.Raza = Raza;
        this.Fidelidad = Fidelidad;
    }
    
    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Raza: " + Raza);
        System.out.println("Fidelidad: " + Fidelidad);
        System.out.println("Color: " + Color);
        System.out.println("Precio: " + Precio);
        System.out.println("Sexo: " + Sexo);
        System.out.println("Edad: " + Edad);
        System.out.println("Grandeza: " + Tamano);
        System.out.println("Peso: " + Peso);
        System.out.println("Personalidad:" + Personalidad);
        System.out.println("\n");
        Cita citaPerro1 = new Cita("Perro", Nombre, Color, Precio, "Veterinaria XYZ", 15.0f, 10.0f);
        citaPerro1.MostrarDatos();
        
    }
}
