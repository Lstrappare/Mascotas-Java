public class Cita extends Inventario {
    private String Lugar;
    private float Fecha;
    private float Hora;

    public Cita(String Animal, String Nombre, String Color, float Precio, String Lugar, float Fecha, float Hora) {
        super(Animal, Nombre, Color, Precio); 
        this.Lugar = Lugar;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public void MostrarDatos() {
        System.out.println("Felicidades ahora puedes pasar a recoger en esta sucursal\n");
        System.out.println("Sucursal: " + Lugar);
        System.out.println("Te recomencamos pasar: " + Fecha);
        System.out.println("Si es posible a esta hora: " + Hora);
        System.out.println("Por tu nuevo : " + Animal());
        System.out.println("El nombre es: " + Nombre());
        System.out.println("De color: " + Color());
        System.out.println("Por favor traer la cantidad de $: " + Precio());
        System.out.println("Muchas gracias por tu compra y tu preferencia\n");
        System.out.println("\n");
    }
}