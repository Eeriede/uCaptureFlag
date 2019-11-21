package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import common.iConstants;
import modelo.Equipo;
import modelo.EspacioMapa;
import modelo.Grafo;
import modelo.Jugador;

public class ventanaPrincipal extends JFrame implements ActionListener, iConstants, MouseListener{
	private static final long serialVersionUID = 1L;
	private int contArq = 3;
	private int contMrn = 2;
	private int contGlp = 6;
	private int contBse = 1;
	private Jugador jugador;
	private Grafo<EspacioMapa> mapa;
	private JPanel contentPane;
	private JPanel extraPane;
	private JTextArea areaTexto;
	private JButton botonAceptar;
	private JLabel contArquero;
	private JLabel contMarine;
	private JLabel contGolpeador;
	private JLabel contBase;
	private JCheckBox cbArquero;
	private JCheckBox cbMarine;
	private JCheckBox cbGolpeador;
	private JCheckBox cbBase;

	public ventanaPrincipal(Jugador pJugador) {
		jugador=pJugador;
		mapa = new Grafo<>();
		//crearGrafo();
		
		this.setBounds(TOP, TOP, VENTANA_WIDTH, VENTANA_HEIGHT);
		setTitle("Captura la bandera");
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GREEN);
		contentPane.setBounds(TOP, TOP, JUEGO_WIDTH, JUEGO_HEIGHT);
		setContentPane(contentPane);
		
		extraPane = new JPanel();
		extraPane.setLayout(null);
		extraPane.setBackground(Color.WHITE);
		extraPane.setBounds(JUEGO_WIDTH, TOP, VENTANA_WIDTH-JUEGO_WIDTH, JUEGO_HEIGHT);
		contentPane.add(extraPane);
		
		areaTexto = new JTextArea();
		areaTexto.setLayout(null);
		areaTexto.setBackground(Color.DARK_GRAY);
		areaTexto.setForeground(Color.WHITE);
		areaTexto.setBounds(TOP, TOP, VENTANA_WIDTH-JUEGO_WIDTH, JUEGO_HEIGHT/2);
		extraPane.add(areaTexto);
		areaTexto.setText("Bienvenido\n\n Divida las tropas en tres grupos y\n elija una base para la bandera"
				+ "\n\n Debe marcar la opción que desea agregar\n y marcarla en el mapa con el mouse");
		
		botonAceptar =  new JButton("Listo");
		botonAceptar.setLayout(null);
		botonAceptar.setName("btnListo");
		botonAceptar.setBounds((VENTANA_ESPACIO_H*2),(JUEGO_HEIGHT/2)+(VENTANA_ESPACIO_V*1) , BOTON_WIDTH, BOTON_HEIGHT);
		botonAceptar.addActionListener(this);
		extraPane.add(botonAceptar);
		
		JLabel lblArq = new JLabel("Arquero");
		lblArq.setLayout(null);
		lblArq.setBounds(IMG_WIDTH/4,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8) ,TXT_WIDTH, TXT_HEIGHT);
		extraPane.add(lblArq);
		lblArq.setVisible(true);
		
		JLabel imgArq = new JLabel();
		imgArq.setLayout(null);
		imgArq.setBounds(TOP,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8) ,IMG_WIDTH, IMG_HEIGHT);
		imgArq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Arquero.png")));
		extraPane.add(imgArq);
		imgArq.setVisible(true);
		
		JLabel lblMrn = new JLabel("Marine");
		lblMrn.setLayout(null);
		lblMrn.setBounds((IMG_WIDTH+VENTANA_ESPACIO_H/2),(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8) ,TXT_WIDTH, TXT_HEIGHT);
		extraPane.add(lblMrn);
		lblMrn.setVisible(true);
		
		JLabel imgMrn = new JLabel();
		imgMrn.setLayout(null);
		imgMrn.setBounds(IMG_WIDTH,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*7) ,IMG_WIDTH, IMG_HEIGHT);
		imgMrn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Marine.png")));
		extraPane.add(imgMrn);
		imgMrn.setVisible(true);
		
		JLabel lblGlp = new JLabel("Golpeador");
		lblGlp.setLayout(null);
		lblGlp.setBounds(IMG_WIDTH*2,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8) ,TXT_WIDTH*2, TXT_HEIGHT);
		extraPane.add(lblGlp);
		lblGlp.setVisible(true);
		
		JLabel imgGlp = new JLabel();
		imgGlp.setLayout(null);
		imgGlp.setBounds(IMG_WIDTH*2,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*7) ,IMG_WIDTH, IMG_HEIGHT);
		imgGlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Golpeador.png")));
		extraPane.add(imgGlp);
		imgGlp.setVisible(true);
		
		cbArquero = new JCheckBox();
		cbArquero.setLayout(null);
		cbArquero.setName("cbArquero");
		cbArquero.setBounds((IMG_WIDTH/4)+TXT_WIDTH, (JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8), CHB_WIDTH, CHB_HEIGHT);
		cbArquero.addActionListener(this);
		extraPane.add(cbArquero);
		
		cbMarine = new JCheckBox();
		cbMarine.setLayout(null);
		cbMarine.setName("cbMarine");
		cbMarine.setBounds((IMG_WIDTH+VENTANA_ESPACIO_H/2)+TXT_WIDTH-VENTANA_ESPACIO_V/2, (JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8), CHB_WIDTH, CHB_HEIGHT);
		cbMarine.addActionListener(this);
		extraPane.add(cbMarine);
		
		cbGolpeador = new JCheckBox();
		cbGolpeador.setLayout(null);
		cbGolpeador.setName("cbGolpeador");
		cbGolpeador.setBounds((IMG_WIDTH*3)-CHB_HEIGHT, (JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*8), CHB_WIDTH, CHB_HEIGHT);
		cbGolpeador.addActionListener(this);
		extraPane.add(cbGolpeador);
		
		contArquero = new JLabel();
		contArquero.setLayout(null);
		contArquero.setBounds(IMG_WIDTH/3,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*9) ,TXT_WIDTH, TXT_HEIGHT);
		contArquero.setText(contArq+"");
		extraPane.add(contArquero);
		contArquero.setVisible(true);
		
		contMarine = new JLabel();
		contMarine.setLayout(null);
		contMarine.setBounds((IMG_WIDTH+VENTANA_ESPACIO_H),(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*9) ,TXT_WIDTH, TXT_HEIGHT);
		contMarine.setText(contMrn+"");
		extraPane.add(contMarine);
		contMarine.setVisible(true);
		
		contGolpeador = new JLabel();
		contGolpeador.setLayout(null);
		contGolpeador.setBounds((IMG_WIDTH*2)+VENTANA_ESPACIO_H,(JUEGO_HEIGHT)-(VENTANA_ESPACIO_V*9) ,TXT_WIDTH, TXT_HEIGHT);
		contGolpeador.setText(contGlp+"");
		extraPane.add(contGolpeador);
		contGolpeador.setVisible(true);
		
		JLabel imgBdr = new JLabel();
		imgBdr.setLayout(null);
		imgBdr.setBounds((VENTANA_ESPACIO_H*2),(JUEGO_HEIGHT/2)+(VENTANA_ESPACIO_V*3),IMG_WIDTH, IMG_HEIGHT);
		imgBdr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Bandera.png")));
		extraPane.add(imgBdr);
		imgBdr.setVisible(true);
		
		contBase = new JLabel();
		contBase.setLayout(null);
		contBase.setBounds((VENTANA_ESPACIO_H*3),(JUEGO_HEIGHT/2)+(VENTANA_ESPACIO_V*8)/2,TXT_WIDTH, TXT_HEIGHT);
		contBase.setText(contBse+"");
		extraPane.add(contBase);
		contBase.setVisible(true);
		
		cbBase = new JCheckBox();
		cbBase.setLayout(null);
		cbBase.setName("cbBase");
		cbBase.setBounds((VENTANA_ESPACIO_H*3)+TXT_WIDTH,(JUEGO_HEIGHT/2)+(VENTANA_ESPACIO_V*8)/2,CHB_WIDTH, CHB_HEIGHT);
		cbBase.addActionListener(this);
		extraPane.add(cbBase);
		
		JLabel imgB1 = new JLabel();
		imgB1.setLayout(null);
		imgB1.setBounds(TOP,TOP,NODO_WIDTH,NODO_HEIGHT);
		imgB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Base1.png")));
		contentPane.add(imgB1);
		imgB1.setVisible(true);
		
		JLabel imgB2 = new JLabel();
		imgB2.setLayout(null);
		imgB2.setBounds(TOP,(JUEGO_HEIGHT/2)-NODO_HEIGHT,NODO_WIDTH,NODO_HEIGHT);
		imgB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Base1.png")));
		contentPane.add(imgB2);
		imgB2.setVisible(true);
		
		JLabel imgB3 = new JLabel();
		imgB3.setLayout(null);
		imgB3.setBounds(TOP,(JUEGO_HEIGHT)-NODO_HEIGHT,NODO_WIDTH,NODO_HEIGHT);
		imgB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Base1.png")));
		contentPane.add(imgB3);
		imgB3.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent pEvent) {
		// TODO Auto-generated method stub
		JComponent boton = (JComponent)pEvent.getSource();
		System.out.println(boton.getName());
		if(boton instanceof JButton) {
			JButton botonActual = (JButton)boton;
			//revisar que todo este listo para iniciar
		}else {
			if(boton instanceof JCheckBox) {
				switch(boton.getName()) {
				case "cbArquero":
					if(!cbArquero.isSelected()) {	
					}else {
						cbMarine.setSelected(false);
						cbGolpeador.setSelected(false);
						cbBase.setSelected(false);
					}
					break;
				case "cbMarine":
					if(!cbMarine.isSelected()) {	
					}else {
						cbArquero.setSelected(false);
						cbGolpeador.setSelected(false);
						cbBase.setSelected(false);
					}
					break;
				case "cbGolpeador":
					if(!cbGolpeador.isSelected()) {	
					}else {
						cbArquero.setSelected(false);
						cbMarine.setSelected(false);
						cbBase.setSelected(false);
					}
					break;
				case "cbBase":
					if(!cbBase.isSelected()) {	
					}else {
						cbArquero.setSelected(false);
						cbMarine.setSelected(false);
						cbGolpeador.setSelected(false);
					}
					break;
				default:
					System.out.println("ERROR EN RECONOCIMIENTO DEL CHECKBOX");
					break;
				}
			}else{
				System.out.println("ERROR EN RECONOCIMIENTO DEL BOTON");
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent evnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent evnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent evnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent evnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent evnt) {
		// TODO Auto-generated method stub
		
	}
	
	private void crearGrafo() {
		for(int contNodosX = 0 ; contNodosX<JUEGO_WIDTH/NODO_WIDTH ; contNodosX++) {
			for(int contNodosY = 0 ; contNodosY<JUEGO_HEIGHT/NODO_HEIGHT ; contNodosY++) {
				mapa.insertarNodo(new EspacioMapa(NODO_WIDTH*contNodosX, NODO_HEIGHT*contNodosY, null));
			}
		}
	}
}
