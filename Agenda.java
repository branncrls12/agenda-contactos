
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregar(Contacto c) {
        contactos.add(c);
    }

    public void listar() {
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }
}
