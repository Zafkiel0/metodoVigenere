package unindad3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Desencriptar extends JFrame {
	JPanel panel =new JPanel();
	public Desencriptar() {
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
		JLabel titulo =new JLabel("Desencriptar");
		JLabel palabraDes =new JLabel("Palabra a Desencriptar");
		JLabel palabraDesMost =new JLabel("Palabra  Desencriptada");
		JButton desencriptar=new JButton("Desencriptar");
		JButton regresar=new JButton("regresar");
		JButton limpiar=new JButton("limpiar");
		JTextField jTextFieldPalabraDes =new JTextField();
		JTextField jTextFieldPalabraDesMos =new JTextField();
		JTextField jTextFieldPalabraClave =new JTextField();
		JLabel palabraClave =new JLabel("Palabra a clave");
		ActionListener accionEnc= new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Vigen desc=new Vigen(jTextFieldPalabraDes.getText(),jTextFieldPalabraClave.getText());
				jTextFieldPalabraDesMos.setText(desc.desencriptar());
				System.out.print(desc.desencriptar());
				System.out.print(jTextFieldPalabraDes.getText());
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
		jTextFieldPalabraDes.setText("");
		jTextFieldPalabraDesMos.setText("");
	 }
	 

};
	   desencriptar.addActionListener(accionEnc);
	   regresar.addActionListener(regresarAc);
	   limpiar.addActionListener(limpiarAc);
	   palabraClave.setBounds(20,170,100,20);
	   jTextFieldPalabraDesMos.setBounds(20,260,100,20);
	   jTextFieldPalabraClave.setBounds(20,190,100,20);
	   limpiar.setBounds(150,310,100,20);
	   regresar.setBounds(20,310,100,20);
		palabraDes.setBounds(20,70,150,100);
		palabraDesMost.setBounds(20,240,150,100);
		titulo.setBounds(200,10,100,100);
		desencriptar.setBounds(20,220,100,20);
		panel.add(limpiar);
		panel.add(regresar);
		panel.add(palabraDes);
		panel.add(jTextFieldPalabraClave);
		panel.add(titulo);
		panel.add(desencriptar);
		panel.add(palabraClave);
		panel.add(palabraDesMost);
		panel.add(jTextFieldPalabraDesMos);
		jTextFieldPalabraDes.setBounds(20,150,120,20);
		panel.add(jTextFieldPalabraDes);
		
			
	}
	
}
