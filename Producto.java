public class Producto extends Inventario {
    protected String Categoria;
    protected String Codigo;

    public Producto(String Animal, String Nombre, String Color, float Precio,
                    String Categoria, String Codigo) {
        super(Animal, Nombre, Color, Precio);
        this.Categoria = Categoria;
        this.Codigo = Codigo;
    }
}