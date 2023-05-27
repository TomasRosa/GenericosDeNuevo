import java.util.ArrayList;
import java.util.Scanner;

///Preguntar punto 8.
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese que ejercicio desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ///Punto 1.
                ListaGenerica<String> lista = new ListaGenerica<>();

                lista.agregar("Hola");
                lista.agregar("Adios");

                ListaGenerica<Double> lista2 = new ListaGenerica<>();

                lista2.agregar(2.5);
                lista2.agregar(3.8);

                System.out.println("Tamaño de la lista de double: " + lista2.tamanioLista());

                System.out.println("Ingrese una posicion (0 o 1). Se le retornara el elemento que se encuentre alli en la lista de Strings");
                int pos = scan.nextInt();
                System.out.println("Elemento: " + lista.obtenerElementoPosEspecifica(pos));
                ///Punto 2.

                System.out.println("Ingrese una palabra. ");
                scan.nextLine();
                String palabra = scan.nextLine();
                System.out.println("Ingrese un int. ");
                int num = scan.nextInt();

                lista.intercambiarElementos(palabra,num);
                break;
            }
            case 3:
            {
                PilaGenerica pilita = new PilaGenerica<>();

                pilita.agregarElemento(8);
                pilita.agregarElemento(2.5);
                pilita.agregarElemento(3);

                System.out.println("Tope: " + pilita.tope());

                System.out.println("Tope desapilado: " + pilita.desapilar());
                System.out.println("Pila luego de haber desapilado: ");
                pilita.mostrar();
                break;
            }
            case 4:
            {
                ListaGenerica lista = new ListaGenerica<>();
                ArrayList<Integer> arrayListEnteros = new ArrayList<>();

                arrayListEnteros.add(1);
                arrayListEnteros.add(5);

                ArrayList<Persona> arrayListPersona = new ArrayList<>();
                Persona p1 = new Persona("Tomas",19);
                Persona p2 = new Persona("Floky",29);

                arrayListPersona.add(p1);
                arrayListPersona.add(p2);

                System.out.println("Lista enteros. Comparable: ");
                lista.imprimirLista(arrayListEnteros);
                System.out.println("Lista persona. No comparable: ");
                lista.imprimirLista(arrayListPersona);
                break;
            }
            case 5:
            {
                ArrayList<ClaseHijaGenerica> arrayClaseHija = new ArrayList<>();
                ClaseHijaGenerica h1 = new ClaseHijaGenerica<>(5);
                ClaseHijaGenerica h2 = new ClaseHijaGenerica<>(6);

                arrayClaseHija.add(h1);
                arrayClaseHija.add(h2);

                ///arrayClaseHija.add(5); No deja ya que el tipo de dato Int no es subclase de ClasePadreGenerica.
                ///En cambio claseHija si es subClase de clasePadreGenerica.

                ///Punto 6.
                boolean resultado = h1.compararIdentidad(h1,h2);
                boolean resultadoIgualdad = h1.compararIgualdad(h1,h2);

                System.out.println("Iguales por identidad? " + resultadoIgualdad);
                System.out.println("Iguales por igualdad? " + resultadoIgualdad);

                h1 = h2;

                resultado = h1.compararIdentidad(h1,h2);
                resultadoIgualdad = h1.compararIgualdad(h1,h2);

                System.out.println("Iguales por identidad? " + resultadoIgualdad);
                System.out.println("Iguales por igualdad? " + resultadoIgualdad);
                break;
            }
            case 6:
            {
                ///Punto 7.
                ///Nombre y edad
                Par par = new Par<>("Tomas",18);
                ///Altura y peso
                Par par2 = new Par<>(170,65);

                System.out.println(par.toString());
                System.out.println(par2.toString());
                break;
            }
            case 7:
            {
                ///Punto 8. PREGUNTAR
                ListaGenerica listita =new ListaGenerica<>();
                ArrayList<Persona> personas = new ArrayList<>();

                Persona p1 = new Persona("Tomas",19);
                Persona p2 = new Persona("Floky",29);

                personas.add(p1);
                personas.add(p2);

                ArrayList<Integer> enteros = new ArrayList<>();
                enteros.add(5);
                enteros.add(6);

                listita.imprimirElementos(personas);

                System.out.println("Error.");

                listita.imprimirElementos(enteros);
                break;
            }
            case 8:
            {
                ///Punto 9.
                Contenedor<Persona> contenedor = new Contenedor<>();

                Empleado p1 = new Empleado("Tomas",19,"Cajero");
                Empleado p2 = new Empleado("Floky",29,"Repositor");

                contenedor.agregarElemento(p1);
                contenedor.agregarElemento(p2);
                ///contenedor.agregarElemento(5); --> No deja xq no es subclase de persona

                contenedor.mostrar();
                ///Punto 10.
                String palabra = "Gago";
                int numero = 118;

                System.out.println("Concatenacion: " + contenedor.concatenar(palabra,numero));
                break;
            }
        }
    }
}