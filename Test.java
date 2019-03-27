public class Test{
    public static void main(String[] a){
        Lista<String> lista = new Lista<String>();
        lista.dodaj("Prvi");
        lista.dodaj("Drugi");
        lista.dodaj("Treci");
        lista.ispisi();
        System.out.println("Duljina liste: "+lista.velicina());
        lista.izbrisi(1);
        System.out.println("Izbrisan [1] element");
        lista.ispisi();
        System.out.println("Duljina liste: "+lista.velicina());
        System.out.println("Dohvacen [0] element: "+lista.dohvati(0));
        lista.ispisi();
        System.out.println("Duljina liste: "+lista.velicina());
        System.out.println("Izbacen [1] element: "+lista.izbaci(1));
        lista.ispisi();
        System.out.println("Duljina liste: "+lista.velicina());
    }
}