
package proyectoi.control;

import proyectoi.modelo.Modelo;
import java.util.Observer;

public class Control {

    public Control(Modelo nuevosDatos) {
        datos = nuevosDatos;

        System.out.println("Creando instancia de control..");
    }

    public Control() {
        this(new Modelo());
    }

    public void registrarObservador(Observer nuevoObservador) {
        datos.addObserver(nuevoObservador);
    }

    private Modelo datos;
}
