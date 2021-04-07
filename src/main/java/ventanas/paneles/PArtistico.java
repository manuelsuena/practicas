package ventanas.paneles;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import ventanas.botones.BotonPrincipal;
import java.awt.*;


public class PArtistico extends JPanel{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonMusical;
    private JButton botonTeatral;
    private JTextPane textoTitulo;
    private JTextPane textoLey;
    private JTextPane textoMusical;
    private JTextPane textoTeatral;

    public PArtistico(){
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
        textoTeatral = new JTextPane();
        textoMusical = new JTextPane();
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
        gridBagConstraints.ipady = 40;
        gridBagConstraints.ipadx = 1000;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(100, 80, 0, 0);
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
        gridBagConstraints.ipady = 220;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-200, 40, 0, 0);
        this.add(textoLey, gridBagConstraints);

        textoTeatral.setEditable(false);
        textoTeatral.setBorder(null);
        textoTeatral.setFont(new Font("Arial", 0, 16)); 
        textoTeatral.setText("Representación pública de obras teatrales, artísticas o escénicas, mediante la utilización, aislada o conjuntamente, del lenguaje, de la mímica, de la música, del cómic, de marionetas u otros objetos a cargo de artistas, intérpretes o ejecutantes, sean o no profesionales, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
        textoTeatral.setMinimumSize(new Dimension(200, 100));
        textoTeatral.setOpaque(false);
        textoTeatral.setPreferredSize(new Dimension(400, 150));
        centrarTexto(textoTeatral);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 350;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-220, 140, 0, 0);
        this.add(textoTeatral, gridBagConstraints);
        
        textoMusical.setEditable(false);
        textoMusical.setBorder(null);
        textoMusical.setFont(new Font("Arial", 0, 16)); 
        textoMusical.setText("Ejecución o representación pública de obras o composiciones musicales, operísticas o de danza, mediante la utilización, aislada o conjuntamente, de instrumentos musicales, música grabada y enviada por medios mecánicos o de la voz humana a cargo de artistas, intérpretes o ejecutantes, profesionales u personas aficionadas, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
        textoMusical.setMinimumSize(new Dimension(200, 100));
        textoMusical.setOpaque(false);
        textoMusical.setPreferredSize(new Dimension(400, 150));
        textoMusical.setRequestFocusEnabled(false);
        centrarTexto(textoMusical);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 350;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new Insets(-220, 160, 0, 0);
        this.add(textoMusical, gridBagConstraints);
    }

    private void colocarBotones(){
        botonTeatral = new BotonPrincipal("TEATRAL");
        //botonTeatral.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-280, 80, 0, 0);
        this.add(botonTeatral, gridBagConstraints);

         botonMusical = new BotonPrincipal("MUSICAL");
        // botonMusical.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-280, 120, 0, 0);
        this.add(botonMusical, gridBagConstraints);
    }

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    } 
}