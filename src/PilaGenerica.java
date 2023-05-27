import java.util.Stack;

public class PilaGenerica <T extends Number>
{
    private Stack<T> pila;

    public PilaGenerica ()
    {
        this.pila = new Stack<T>();
    }
    public void agregarElemento (T elemento)
    {
        this.pila.push(elemento);
    }
    public T desapilar ()
    {
        return this.pila.pop();
    }
    public T tope ()
    {
        return this.pila.peek();
    }
    public void mostrar ()
    {
        for(T elemento: this.pila)
        {
            System.out.println(elemento);
        }
    }

}
