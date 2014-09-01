
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class ventanaAplicacion extends JFrame {
    
     public ventanaAplicacion(String titulo) {
        super(titulo);
        ajustarComponentes(getContentPane());
        setSize(600, 400);
        setResizable(true);
        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
      private void ajustarComponentes(Container c) {
        c.setLayout(new BorderLayout());
        ajustarMenus();
        JPanel d= new JPanel();
        d.setLayout(new FlowLayout());
        /*d.add(btnPrueba = new JButton("Prueba"));
        c.add(BorderLayout.CENTER,d);*/
    }
      
       private void ajustarMenus() {

    }

    public void init() {
        setVisible(true);
    }
    
    
}
