package proyectoi.vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        JPanel p = new JPanel();
        c.add(BorderLayout.CENTER, p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 4, 8, 4);

        Object[][] datos = {{""}, {""}, {""}, {""}};//se debe recibir un Object[][] array con TODA la info

        String[] nomColumnas = {};
        for (int i = 0; i < 5; i++) { //aqui hay que ajustar el limite del for a la cant de partidos q obtiene la vista
            nomColumnas = agregarElemento(nomColumnas, "Partido " + numALetra(i+1));
        }

        DefaultTableModel modeloTab = new DefaultTableModel(datos, nomColumnas);
        tablaInfo = new JTable(modeloTab);
        
        //cada vez que se obtiene una fila nueva para actualziar la tabla se debe recibir
        //de tipo Object[] fila = {"dato", "dato",.....};
        //luego se debe agregar llamando al sgte funcion del del DefaultDataModel modeloTab.addRow(fila);
        tablaInfo.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scPane = new JScrollPane(tablaInfo);
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        p.add(scPane);
    }

    @Override
    public void update(Observable m, Object e) {

    }

    public void init() {
        setVisible(true);
    }

    private JTable tablaInfo;

    static private <T> T[] agregarElemento(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }

    static private String numALetra(int i) {
        return i > 0 && i < 27 ? String.valueOf((char) (i + 'A' - 1)) : null;
    }

}
