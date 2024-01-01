public class Juguete extends Producto {
    private String Tipo_Juguete;
    private String Material;
    private String Calidad;
    private String Caracteristicas;
    
    public Juguete(String Animal, String Nombre, float Precio,
                    String Categoria, String Codigo,
                    String Tipo_Juguete, String Material, String Calidad, String Caracteristicas, String Color) {
        super(Animal, Nombre, Color, Precio, Categoria, Codigo);
        this.Tipo_Juguete = Tipo_Juguete;
        this.Material = Material;
        this.Calidad = Calidad;
        this.Caracteristicas = Caracteristicas;
        this.Color = Color;
    }

    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Tipo_Juguete: " + Tipo_Juguete);
        System.out.println("Material: " + Material);
        System.out.println("Precio: " + Precio);
        System.out.println("Categoria: " + Categoria);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Caracteristicas: " + Caracteristicas);
        System.out.println("Color: " + Color);
        System.out.println("Calidad: " + Calidad);
        System.out.println("\n");
        Cita citaJuguete1 = new Cita("Juguete", Nombre, Color, Precio, "Veterinaria XYZ", 15.0f, 10.0f);
        citaJuguete1.MostrarDatos();
    }
}
