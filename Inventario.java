public abstract class Inventario {
    protected String Animal;
    protected String Nombre;
    protected String Color;
    protected float Precio;

    public Inventario(String Animal, String Nombre, String Color, float Precio) {
        this.Animal = Animal;
        this.Nombre = Nombre;
        this.Color = Color;
        this.Precio = Precio;
    }

    public String Animal() {
        return Animal;
    }

    public String Nombre() {
        return Nombre;
    }

    public String Color() {
        return Color;
    }

    public float Precio() {
        return Precio;
    }
}
