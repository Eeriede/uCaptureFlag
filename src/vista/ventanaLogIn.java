package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import common.iConstants;

import javax.swing.JPasswordField;

public class ventanaLogIn extends JFrame implements ActionListener, iConstants{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JButton botonEntrar;
	private JButton botonRegistrar;
	
	public ventanaLogIn() {
		this.setBounds(TOP, TOP, VENTANA_WIDTH/3, VENTANA_HEIGHT/3);
		setTitle("Captura la bandera");
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(VENTANA_ESPACIO_H, VENTANA_ESPACIO_V, TXT_WIDTH, TXT_HEIGHT);
		contentPane.add(lblEmail);
		
		emailField = new JTextField();
		emailField.setBounds((VENTANA_ESPACIO_H*2)+TXT_WIDTH, VENTANA_ESPACIO_V, ENTRADA_WIDTH, ENTRADA_HEIGHT);
		contentPane.add(emailField);

		JLabel lblPassword = new JLabel("Contraseña: ");
		lblPassword.setBounds(VENTANA_ESPACIO_H, (VENTANA_ESPACIO_V*3)+TXT_HEIGHT, TXT_WIDTH*2, TXT_HEIGHT);
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
		String password = (passwordField.getPassword()).toString();
		passwordField.setText("");
		if(isTextoValido(email)&&isTextoValido(password)) {
			if(botonActual.getText().compareTo("Ingresar")==0) {
				
			}else {
				if(botonActual.getText().compareTo("Registrar")==0) {
					
				}else {
					JOptionPane.showMessageDialog(this, "Me lleva, hay un error y no sé por qué");
				}
			}
		}else {
			JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados, plis");
		}	
	}
	
	private boolean isTextoValido(String pTexto) {
		if(pTexto=="" || pTexto==" " || pTexto==null) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean isRegistrado(String pEmail, String pPassword) {
		//pEmail.Ha
	}
}