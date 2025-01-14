package ventanas;

import javax.swing.*;
import ventanas.paneles.PPrincipal;
import ventanas.paneles.Pidioma;
import java.awt.*;


public class VentanaPrincipal extends JFrame {
    //PPrincipal pPrincipal = new PPrincipal();
    Pidioma    pIdioma = new Pidioma();
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        //Establecer tamano de pantalla y caracteristicas.
        // setSize(anchoPantalla/2+50, alturaPantalla/2);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("Espectaculos CFMMR");
        Image miIcono = miPantalla.getImage("src/main/java/imagenes/SafeShow.png");
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional

        //Creacion del menu en espera
        //crearMenu();
        
        //Funcion de entrada a los componentes
        iniciarComponentes();
        
        //Tipo de cierre de la ventana dprincipal
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
    }

    /*private void crearMenu(){
        Menu menu = new Menu();
        setJMenuBar(menu.createMenuBar());
        setContentPane(menu.createContentPane());
    }*/

    private void colocarPaneles(){
        //Posibilidad de modificar ubicacion de elementos setLayout
        //this.getContentPane().add(pPrincipal);
        this.getContentPane().add(pIdioma);
    }

}
