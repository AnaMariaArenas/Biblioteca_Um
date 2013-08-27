package co.edu.um.BibliotecaUM;

import co.edu.um.BibliotecaUM.Modelo.Libro;
import co.edu.um.BibliotecaUM.Vista.ventanaPrincipal;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ventanaPrincipal ven = new ventanaPrincipal();
        Libro lib = new Libro();

        ven.setBounds(300,460,800,530);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
        ven.getContentPane().setBackground(new Color(207, 243, 235));
        System.out.println(lib.getIsbn());



    }
}
