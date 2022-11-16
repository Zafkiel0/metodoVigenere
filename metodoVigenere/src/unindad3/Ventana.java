package unindad3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	JPanel panel=new JPanel();
	public Ventana() {
		
		
		setSize(500,500);
		
		 agregarInicio();
		componentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void componentes() {
		
		panel.setBackground(Color.white);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
	}

	public void agregarInicio() {
		JLabel titulo =new JLabel("Metodo vigenere");
		JButton encriptar=new JButton("Encriptar");
		JButton desencriptar=new JButton("Desencriptar");
		encriptar.setBounds(100,100,120,20);
		titulo.setBounds(200,10,100,100);
		desencriptar.setBounds(250,100,120,20);
		panel.add(titulo);
		panel.add(encriptar);
		panel.add(desencriptar);
		
		ActionListener accionEnc= new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				dispose();
				encriptar ventencriptar = new encriptar();
				ventencriptar.setVisible(true);
				    System.out.print("hola");
			  }
		
		};
		ActionListener accionDes= new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				dispose();
				Desencriptar ventDesencriptar = new Desencriptar();
				ventDesencriptar.setVisible(true);
				    System.out.print("adios");
			  }
		
		};
		desencriptar.addActionListener(accionDes);
		encriptar.addActionListener(accionEnc);
		
		
	}
}
