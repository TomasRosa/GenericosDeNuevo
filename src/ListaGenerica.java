import java.util.ArrayList;
import java.util.List;

///1
public class ListaGenerica <T>
{
    private ArrayList<T> listaGenerica;

    public ListaGenerica ()
    {
        this.listaGenerica = new ArrayList<>();
    }

    public void agregar (T elemento)
    {
        listaGenerica.add(elemento);
    }
    public int tamanioLista ()
    {
        return listaGenerica.size();
    }
    public T obtenerElementoPosEspecifica (int pos)
    {
        if(pos < 0 || pos > this.listaGenerica.size())
        {
            throw new RuntimeException("Error.");
        }
        else
        {
            return this.listaGenerica.get(pos);
        }
    }
    ///2
    public <T> void intercambiarElementos (T elemento1, T elemento2)
    {
        System.out.println("Elemento 1 antes del intercambio: " + elemento1);
        System.out.println("Elemento 2 antes del intercambio: " + elemento2);

        T aux = elemento1;
        elemento1 = elemento2;
        elemento2 = aux;

        System.out.println("Elemento 1 luego del intercambio: " + elemento1);
        System.out.println("Elemento 2 luego del intercambio: " + elemento2);
    }
    public <T extends Comparable> void imprimirLista (List<T> lista)
    {
        for(T elemento: lista)
        {
            System.out.println(elemento);
        }
    }
    ///8.
    public void imprimirElementos (List<? super Empleado<T>> lista) ///Preguntar
    {
        for(Object elemento: lista)
        {
            System.out.println(elemento);
        }
    }
}
