package unindad3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class encriptar extends JFrame {
	JPanel panel =new JPanel();
	public encriptar() {
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
		JLabel titulo =new JLabel("Encriptar");
		JLabel palabraEn =new JLabel("Palabra a encriptar");
		JLabel palabraClave =new JLabel("Palabra a clave");
		JLabel palabraDesMost =new JLabel("Palabra  encriptada");
		JButton regresar=new JButton("regresar");
		JButton limpiar=new JButton("limpiar");
		JButton encriptar=new JButton("Encriptar");
		JTextField jTextFieldPalabraEn =new JTextField();
		JTextField jTextFieldPalabraClave =new JTextField();
		JTextField jTextFieldPalabraDesMos =new JTextField();
		ActionListener accionEnc= new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Vigen encVigen=new Vigen(jTextFieldPalabraEn.getText(),jTextFieldPalabraClave.getText());
				jTextFieldPalabraDesMos.setText(encVigen.encriptarText());
				System.out.print(encVigen.desencriptar());
				System.out.print(jTextFieldPalabraEn.getText());
			 }
	   
	   };
	   ActionListener regresarAc= new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Ventana Inicio=new Ventana();
			System.out.print("hola");
			Inicio.setVisible(true);
			dispose();
		 }
		 
   
   };
   ActionListener limpiarAc= new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		jTextFieldPalabraClave.setText("");
		jTextFieldPalabraEn.setText("");
		jTextFieldPalabraDesMos.setText("");
	 }
	 

};
	encriptar.addActionListener(accionEnc);
	regresar.addActionListener(regresarAc);
	limpiar.addActionListener(limpiarAc);
	  encriptar.addActionListener(accionEnc);
	    palabraClave.setBounds(20,170,100,20);
		jTextFieldPalabraClave.setBounds(20,190,100,20);
		palabraEn.setBounds(20,70,150,100);
		titulo.setBounds(200,10,100,100);
		encriptar.setBounds(20,220,100,20);
		palabraDesMost.setBounds(20,240,150,100);
		  limpiar.setBounds(150,310,100,20);
	   regresar.setBounds(20,310,100,20);
	   jTextFieldPalabraDesMos.setBounds(20,260,100,20);
		panel.add(palabraEn);
		panel.add(limpiar);
		panel.add(regresar);
		panel.add(palabraDesMost);
		panel.add(jTextFieldPalabraDesMos);
		panel.add(jTextFieldPalabraClave);
		panel.add(titulo);
		panel.add(encriptar);
		panel.add(palabraClave);
		jTextFieldPalabraEn.setBounds(20,150,120,20);
		panel.add(jTextFieldPalabraEn);
		
			
	}
	
}
