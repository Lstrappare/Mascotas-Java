import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        do {
            System.out.println("**********************************************************");
            System.out.println("************** Bienvenido a Master Solobino **************");
            System.out.println("**********************************************************");
            System.out.println("\n");
            System.out.println("Te explicamos rapidamente como funcionana Master Solobino\n");
            System.out.println("En este apartado solo vamos a tener una visualizacion de las mascotas que tenemos para ti\n");
            System.out.println("Como igual alimento y juguetes para tu mascota\n");
            System.out.println("Para que podamos empezar puedes seleccionar entre Mascotas y productos\n");
            System.out.println("Preciona numero \n");
            System.out.println("1) Mascotas");
            System.out.println("2) Productos");
            System.out.println("0. Salir");
            System.out.println("\n");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("***************************");
                    System.out.println("Que mascota estas buscando?");
                    System.out.println("***************************\n");

                    System.out.println("1) Perros          (Mas fieles que tu novia la toxica)");
                    System.out.println("2) Gatos           (Los reyes de la elegancia felina)\n");

                    opcion = scanner.nextLine();

                    switch (opcion) {
                        case "1":
                            System.out.println("***************");
                            System.out.println("Elige un perro:");
                            System.out.println("***************\n");

                            System.out.println("1) Perro1");
                            System.out.println("2) Perro2");
                            System.out.println("3) Perro3\n");

                            opcion = scanner.nextLine();

                            switch (opcion) {
                                case "1":
                                    Perro perro1 = new Perro("Perro", "Doguiee", "Negro", 500.0f, "Hembra", "1 ano", 0.75f, 15.0f, "Pasivo", "Show show", "Muy fiel");
                                    perro1.MostrarInformacion();
                                    break;

                                case "2":
                                    Perro perro2 = new Perro("Perro", "Pambazo", "Marron", 500.0f, "Macho", "6 meses", 0.75f, 15.0f, "Pasivo", "Indefinido", "Obediente");
                                    perro2.MostrarInformacion();
                                    break;

                                case "3":
                                    Perro perro3 = new Perro("Perro", "Jack", "Blanco", 500.0f, "Macho", "1 ano", 0.75f, 15.0f, "Jugueton", "Labrador", "Muy inquieto");
                                    perro3.MostrarInformacion();
                                    break;

                                default:
                                    System.out.println("------------------");
                                    System.out.println("Opcion invalida :(");
                                    System.out.println("------------------");
                                    break;
                            }

                            break;

                        case "2":
                            System.out.println("**************");
                            System.out.println("Elige un gato:");
                            System.out.println("**************\n");

                            System.out.println("1) Gato1");
                            System.out.println("2) Gato2");
                            System.out.println("3) Gato3\n");

                            opcion = scanner.nextLine();

                            switch (opcion) {
                                case "1":
                                    Gato gato1 = new Gato("Gato", "Pelusa", "Blanco", 300.0f, "Hembra", "2 anos", 0.5f, 5.0f, "Tranquilo", "Siames", "Independiente");
                                    gato1.MostrarInformacion();
                                    break;

                                case "2":
                                    Gato gato2 = new Gato("Gato", "Michi", "Negro", 300.0f, "Macho", "1 ano", 0.4f, 4.0f, "Jugueton", "Persa", "Independiente");
                                    gato2.MostrarInformacion();
                                    break;

                                case "3":
                                    Gato gato3 = new Gato("Gato", "Garfield", "Naranja", 300.0f, "Macho", "3 anos", 0.6f, 6.0f, "Tranquilo", "Esfinge", "Independiente");
                                    gato3.MostrarInformacion();
                                    break;

                                default:
                                    System.out.println("------------------");
                                    System.out.println("Opcion invalida :(");
                                    System.out.println("------------------");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("------------------");
                            System.out.println("Opcion invalida :(");
                            System.out.println("------------------");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("****************************");
                    System.out.println("Que producto estas buscando?");
                    System.out.println("**************************\n");

                    System.out.println("1) Alimento");
                    System.out.println("2) Juguete");

                    opcion = scanner.nextLine();

                    switch (opcion) {
                        case "1":
                            System.out.println("******************");
                            System.out.println("Elige un alimento:");
                            System.out.println("******************\n");

                            System.out.println("1) Alimento1");
                            System.out.println("2) Alimento2");
                            System.out.println("3) Alimento3");

                            opcion = scanner.nextLine();

                            switch (opcion) {
                                case "1":
                                    Alimento alimento1 = new Alimento("Alimento", "Croquetas Premium", 50.0f, "Perros", "ALI001", "Croquetas", "Perros", "Alto en proteínas");
                                    alimento1.MostrarInformacion();
                                    break;

                                case "2":
                                    Alimento alimento2 = new Alimento("Alimento", "Purina Cat Chow", 40.0f, "Gatos", "ALI002", "Croquetas", "Gatos", "Equilibrado en nutrientes");
                                    alimento2.MostrarInformacion();
                                    break;

                                case "3":
                                    Alimento alimento3 = new Alimento("Alimento", "Snack Dental", 20.0f, "Perros", "ALI003", "Snacks", "Perros", "Ayuda a la higiene dental");
                                    alimento3.MostrarInformacion();
                                    break;

                                default:
                                    System.out.println("------------------");
                                    System.out.println("Opcion invalida :(");
                                    System.out.println("------------------");
                                    break;
                            }
                            break;

                        case "2":
                            System.out.println("*****************");
                            System.out.println("Elige un juguete:");
                            System.out.println("*****************\n");

                            System.out.println("1) Juguete1");
                            System.out.println("2) Juguete2");
                            System.out.println("3) Juguete3");

                            opcion = scanner.nextLine();

                            switch (opcion) {
                                case "1":
                                    Juguete juguete1 = new Juguete("Juguete", "Pelota de goma", 15.0f, "Pelotas", "JUG001", "Pelota", "Goma", "Buena", "Resistente y elastica", "Rojo");
                                    juguete1.MostrarInformacion();
                                    break;

                                case "2":
                                    Juguete juguete2 = new Juguete("Juguete", "Raton de juguete", 10.0f, "Juguetes interactivos", "JUG002", "Raton", "Felpa", "Buena", "Con sonido y movimiento", "Gris");
                                    juguete2.MostrarInformacion();
                                    break;

                                case "3":
                                    Juguete juguete3 = new Juguete("Juguete", "Cana de pescar", 20.0f, "Juguetes interactivos", "JUG003", "Cana", "Plastico", "Excelente", "Con plumas y campanillas", "Verde");
                                    juguete3.MostrarInformacion();
                                    break;

                                default:
                                    System.out.println("------------------");
                                    System.out.println("Opcion invalida :(");
                                    System.out.println("------------------");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("------------------");
                            System.out.println("Opcion invalida :(");
                            System.out.println("------------------");
                            break;
                    }
                    break;

                case "0":
                    System.out.println("Gracias por usar Master Solobino Hasta luego!");
                    break;

                default:
                    System.out.println("------------------");
                    System.out.println("Opcion invalida :(");
                    System.out.println("------------------");
                    break;
            }
        } while (!opcion.equals("0"));
        scanner.close();
    }
}