package proyectoi;

import javax.swing.*;
import proyectoi.vista.ventanaAplicacion;

public class ProyectoI {
public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println(e.getMessage());
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrarInterfaz();
            }
        });

        System.out.println("Aplicacion iniciada...");
    }

    public static void mostrarInterfaz() {
        ventanaAplicacion principal = new ventanaAplicacion("Proyecto I");
        principal.init();
    }
}
