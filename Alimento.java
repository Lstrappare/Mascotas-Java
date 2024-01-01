public class Alimento extends Producto {
    private String Tipo_Alimento;
    private String Tipo_Animal;
    private String Nutricion;

    public Alimento(String Animal, String Nombre, float Precio,
                    String Categoria, String Codigo,
                    String Tipo_Alimento, String Tipo_Animal, String Nutricion) {
        super(Animal, Nombre, "X", Precio, Categoria, Codigo);
        this.Tipo_Alimento = Tipo_Alimento;
        this.Tipo_Animal = Tipo_Animal;
        this.Nutricion = Nutricion;
    }

    public void MostrarInformacion() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Tipo_Alimento: " + Tipo_Alimento);
        System.out.println("Tipo_Animal: " + Tipo_Animal);
        System.out.println("Precio: " + Precio);
        System.out.println("Categoria: " + Categoria);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nutricion: " + Nutricion);
        System.out.println("\n");
        Cita citaAlimento1 = new Cita("Alimento", Nombre, Color, Precio, "Veterinaria XYZ", 15.0f, 10.0f);
        citaAlimento1.MostrarDatos();
    }
}
