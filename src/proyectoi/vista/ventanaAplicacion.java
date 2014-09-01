package proyectoi.vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ventanaAplicacion extends JFrame implements Observer {
    
     public ventanaAplicacion(String titulo) {
        super(titulo);
        ajustarComponentes(getContentPane());
        setSize(600, 400);
        setMinimumSize(new Dimension(300, 200));
        setResizable(true);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
      private void ajustarComponentes(Container c) {
        c.setLayout(new BorderLayout());
        ajustarMenus();
        JPanel d= new JPanel();
        d.setLayout(new FlowLayout());
    }
      
       private void ajustarMenus() {

    }
       
        @Override
    public void update(Observable m, Object e) {
        
    }

    public void init() {
        setVisible(true);
    }
    
    
}