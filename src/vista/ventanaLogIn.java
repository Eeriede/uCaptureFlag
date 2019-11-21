package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import common.iConstants;
import modelo.Jugador;
import net.SocketClient;

import javax.swing.JPasswordField;

public class ventanaLogIn extends JFrame implements ActionListener, iConstants{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JButton botonEntrar;
	private JButton botonRegistrar;
	private Jugador player = null;
	
	public ventanaLogIn() {
		this.setBounds(TOP, TOP, VENTANA_WIDTH/3, VENTANA_HEIGHT/3);
		setTitle("Captura la bandera");
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(VENTANA_ESPACIO_H, VENTANA_ESPACIO_V, TXT_WIDTH, TXT_HEIGHT);
		lblEmail.setForeground(Color.WHITE);
		contentPane.add(lblEmail);
		
		emailField = new JTextField();
		emailField.setBounds((VENTANA_ESPACIO_H*2)+TXT_WIDTH, VENTANA_ESPACIO_V, ENTRADA_WIDTH, ENTRADA_HEIGHT);
		contentPane.add(emailField);

		JLabel lblPassword = new JLabel("Contrase�a: ");
		lblPassword.setBounds(VENTANA_ESPACIO_H, (VENTANA_ESPACIO_V*3)+TXT_HEIGHT, TXT_WIDTH*2, TXT_HEIGHT);
		lblPassword.setForeground(Color.WHITE);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds((VENTANA_ESPACIO_H*2)+TXT_WIDTH, (VENTANA_ESPACIO_V*3)+TXT_HEIGHT, ENTRADA_WIDTH, ENTRADA_HEIGHT);
		contentPane.add(passwordField);
		
		botonEntrar = new JButton("Ingresar");
		botonEntrar.setBounds((VENTANA_ESPACIO_H*2)+ENTRADA_WIDTH, (VENTANA_ESPACIO_V*5)+ENTRADA_HEIGHT, BOTON_WIDTH, BOTON_HEIGHT);
		botonEntrar.addActionListener(this);
		contentPane.add(botonEntrar);
		
		botonRegistrar = new JButton("Registrar");
		botonRegistrar.setBounds((VENTANA_ESPACIO_H*2), (VENTANA_ESPACIO_V*5)+ENTRADA_HEIGHT, BOTON_WIDTH, BOTON_HEIGHT);
		botonRegistrar.addActionListener(this);
		contentPane.add(botonRegistrar);
	}
	
	@Override
	public void actionPerformed(ActionEvent pEvent) {
		// TODO Auto-generated method stub
		JButton botonActual = (JButton)pEvent.getSource();
		String email = emailField.getText();
		emailField.setText("");
		@SuppressWarnings("deprecation")
		String password = passwordField.getText();
		passwordField.setText("");
		if(isTextoValido(email)&&isTextoValido(password)) {
			System.out.println(email);
			System.out.println(password);
			player = new Jugador(email, password, new SocketClient(LOCAL_HOST));
			if(botonActual.getText().compareTo("Ingresar")==0) {
				//usar la funcion de revision de usuario
				ventanaPrincipal juego = new ventanaPrincipal(player);
				juego.setVisible(true);
				this.setVisible(false);
			}else {
				if(botonActual.getText().compareTo("Registrar")==0) {
					
				}else {
					JOptionPane.showMessageDialog(this, "Me lleva, hay un error y no s� por qu�");
				}
			}
		}else {
			JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados, plis");
		}	
	}
	
	private boolean isTextoValido(String pTexto) {
		if(pTexto=="" || pTexto==" " || pTexto==null || pTexto =="\n") {
			return false;
		}else {
			return true;
		}
	}
	
	/*private boolean isRegistrado(String pEmail, String pPassword) {
		//pEmail.Ha
	}*/
}