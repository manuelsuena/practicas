package ventanas.paneles;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import ventanas.botones.BotonPrincipal;
import java.awt.*;

public class PAnalogo extends JPanel{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonCirsenses;
    private JButton botonTaurino;
    private JButton botonPirotecnico;
    private JTextPane textoTitulo;
    private JTextPane textoLey;
    private JTextPane textoCircenses;
    private JTextPane textoTaurino;
    private JTextPane textoPirotecnico;

    public PAnalogo(){
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
        textoPirotecnico = new JTextPane();
        textoTaurino = new JTextPane();
        textoCircenses = new JTextPane();
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

        textoPirotecnico.setEditable(false);
        textoPirotecnico.setBorder(null);
        textoPirotecnico.setFont(new Font("Arial", 0, 12)); 
        textoPirotecnico.setText("Aquellos en que se produce la ejecución o representación en público de obras o composiciones de efectos visuales, sonoros, y fumígenos con una finalidad lúdica, mediante el uso de artificios de pirotecnia, conjunta o aisladamente con composiciones audiovisuales, de instrumentos musicales oo voz humana, a cargo de intérpretes musicales, cantantes o artistas, profesionales o personas aficionadas, en espacios abiertos al público debidamente acondicionados y habilitados para eso.");
        textoPirotecnico.setMinimumSize(new Dimension(200, 100));
        textoPirotecnico.setOpaque(false);
        textoPirotecnico.setPreferredSize(new Dimension(400, 150));
        centrarTexto(textoPirotecnico);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-80, 150, 0, 0);
        this.add(textoPirotecnico, gridBagConstraints);
        
        textoTaurino.setEditable(false);
        textoTaurino.setBorder(null);
        textoTaurino.setFont(new Font("Arial", 0, 12)); 
        textoTaurino.setText("Aquellos en que intervienen reses de ganado bovino bravo para ser lidiadas en plazas de toros con público, por profesionales o personas aficionadas, de acuerdo con la normativa específica. La clasificación y características de los recintos serán las establecidas en la normativa específica aplicable");
        textoTaurino.setMinimumSize(new Dimension(200, 100));
        textoTaurino.setOpaque(false);
        textoTaurino.setPreferredSize(new Dimension(400, 150));
        textoTaurino.setRequestFocusEnabled(false);
        centrarTexto(textoTaurino);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-80, 80, 0, 0);
        this.add(textoTaurino, gridBagConstraints);

        textoCircenses.setEditable(false);
        textoCircenses.setBorder(null);
        textoCircenses.setFont(new Font("Arial", 0, 12)); 
        textoCircenses.setText("La ejecución o representación en público de ejercicios físicos, de acrobacia o habilidad, actuacinoes de payasos, malabaristas, prestidigitadores, animales amaestrados o no, y otras semejantes, realizadas por artistas, intérpretes o ejecutantes, profesionales o personas aficionadas, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso, sin prejuizo de lo dispuesto en el artículo 9.I) de la Ley 4/2017, del 3 de octubre, de protección y bienestar de los animales de compañía.");
        textoCircenses.setMinimumSize(new Dimension(200, 100));
        textoCircenses.setOpaque(false);
        textoCircenses.setPreferredSize(new Dimension(400, 150));
        textoCircenses.setRequestFocusEnabled(false);
        centrarTexto(textoCircenses);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 270;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-200, -500, 0, 0);
        this.add(textoCircenses, gridBagConstraints);
    }

    private void colocarBotones(){
        botonPirotecnico = new BotonPrincipal("PIROTÉCNICO");
        //botonPirotecnico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-290, 100, 0, 0);
        this.add(botonPirotecnico, gridBagConstraints);

         botonTaurino = new BotonPrincipal("TAURINO");
        // botonTaurino.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-290, 120, 0, 0);
        this.add(botonTaurino, gridBagConstraints);

        botonCirsenses = new BotonPrincipal("CIRCENSES");
        // botonCirsenses.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-240, -500, 0, 0);
        this.add(botonCirsenses, gridBagConstraints);
    }

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    } 
}