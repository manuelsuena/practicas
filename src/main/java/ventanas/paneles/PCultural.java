package ventanas.paneles;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import ventanas.botones.BotonPrincipal;
import java.awt.*;

public class PCultural extends JPanel{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonExhibicion;
    private JButton botonFeria;
    private JButton botonCinematografico;
    private JTextPane textoTitulo;
    private JTextPane textoLey;
    private JTextPane textoExhibicion;
    private JTextPane textoFeria;
    private JTextPane textoCinematografico;

    public PCultural(){
        colocarTextoArtistico();
        colocarBotones();
    }

     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoArtistico(){
        textoTitulo = new JTextPane();
        textoLey = new JTextPane();
        textoCinematografico = new JTextPane();
        textoFeria = new JTextPane();
        textoExhibicion = new JTextPane();
        this.setLayout(new GridBagLayout());

        textoTitulo.setEditable(false);
        textoTitulo.setBorder(null);
        textoTitulo.setFont(new Font("Arial", 1, 28));
        textoTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA");
        textoTitulo.setMinimumSize(new Dimension(484, 500));
        textoTitulo.setPreferredSize(new Dimension(1000, 400));
        textoTitulo.setOpaque(false);
        textoTitulo.setRequestFocusEnabled(false);
        textoTitulo.setBackground(Color.black);
        centrarTexto(textoTitulo);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.ipadx = 1000;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(20, 80, 0, 0);
        this.add(textoTitulo, gridBagConstraints);

        textoLey.setEditable(false);
        textoLey.setBorder(null);
        textoLey.setFont(new Font("Arial", 2, 24)); 
        textoLey.setText("Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos  abiertos  al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas disposiciones geraless de aplicación en la materia.");
        textoLey.setMinimumSize(new Dimension(350, 200));
        textoLey.setPreferredSize(new Dimension(350, 200));
        textoLey.setOpaque(false);
        textoLey.setRequestFocusEnabled(false);
        centrarTexto(textoLey);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.ipadx = 800;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-10, 40, 0, 0);
        this.add(textoLey, gridBagConstraints);

        textoCinematografico.setEditable(false);
        textoCinematografico.setBorder(null);
        textoCinematografico.setFont(new Font("Arial", 0, 16)); 
        textoCinematografico.setText("Exhibición o proyección pública de películas cinematográficas y otros contenidos susceptibles de ser proyectados en pantalla, con independencia de los medios técnicos utilizados, y sin prejuicio de que se exhiban o proyecten en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
        textoCinematografico.setMinimumSize(new Dimension(200, 100));
        textoCinematografico.setOpaque(false);
        textoCinematografico.setPreferredSize(new Dimension(400, 150));
        centrarTexto(textoCinematografico);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-50, 150, 0, 0);
        this.add(textoCinematografico, gridBagConstraints);
        
        textoFeria.setEditable(false);
        textoFeria.setBorder(null);
        textoFeria.setFont(new Font("Arial", 0, 16)); 
        textoFeria.setText("Presentación en público de productos naturales o artificiales derivados de las plantas, animales o naturaleza en establecimentos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
        textoFeria.setMinimumSize(new Dimension(200, 100));
        textoFeria.setOpaque(false);
        textoFeria.setPreferredSize(new Dimension(400, 150));
        textoFeria.setRequestFocusEnabled(false);
        centrarTexto(textoFeria);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-50, 80, 0, 0);
        this.add(textoFeria, gridBagConstraints);

        textoExhibicion.setEditable(false);
        textoExhibicion.setBorder(null);
        textoExhibicion.setFont(new Font("Arial", 0, 16)); 
        textoExhibicion.setText("Realización en público de bailes, exhibiciones, cabalgatas o desfiles de carácter popular, tradicional o de cualquier índole en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
        textoExhibicion.setMinimumSize(new Dimension(200, 100));
        textoExhibicion.setOpaque(false);
        textoExhibicion.setPreferredSize(new Dimension(400, 150));
        textoExhibicion.setRequestFocusEnabled(false);
        centrarTexto(textoExhibicion);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 270;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-180, -500, 0, 0);
        this.add(textoExhibicion, gridBagConstraints);
    }

    private void colocarBotones(){
        botonCinematografico = new BotonPrincipal("CINEMATOGRÁFICO");
        //botonCinematografico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-280, 100, 0, 0);
        this.add(botonCinematografico, gridBagConstraints);

         botonFeria = new BotonPrincipal("FERIA");
        // botonFeria.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-300, 120, 0, 0);
        this.add(botonFeria, gridBagConstraints);

        botonExhibicion = new BotonPrincipal("EXHIBICIÓN");
        // botonExhibicion.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-260, -500, 0, 0);
        this.add(botonExhibicion, gridBagConstraints);
    }

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    } 
}