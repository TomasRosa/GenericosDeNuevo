import java.util.ArrayList;

public class Contenedor <T extends ClaseEspecifica<?>>
{
    private ArrayList<T> arrayListContenedor;

    public Contenedor ()
    {
        this.arrayListContenedor = new ArrayList<>();
    }
    public void agregarElemento (T elemento)
    {
        this.arrayListContenedor.add(elemento);
    }
    public void mostrar ()
    {
        for(T elemento: this.arrayListContenedor)
        {
            System.out.println(elemento.toString());
        }
    }
    public <T> String concatenar (T elemento1, T elemento2)
    {
       return String.valueOf(elemento1) + String.valueOf(elemento2);
    }
}
