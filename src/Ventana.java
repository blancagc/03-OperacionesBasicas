import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Blanca
 *
 */
public class Ventana extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Numero 1:");
	private JLabel lbN2= new JLabel("Numero 2:");
	private JLabel lbResultado= new JLabel("El resultado es:");
	
	private JButton btnResultado= new JButton("Resultado");

	
	private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();

	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);

		lbN2.setBounds(10,80, 280, 30);
		txtN2.setBounds(10, 120, 280, 30);

		btnResultado.setBounds(10, 160, 70, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnResultado);
		
		c.add(lbResultado);
		
		btnResultado.addActionListener(this);
		
	}

	/**
	 * 
	 * @param metodo que se necesita para que el boton realice la accion solicitada que es
	 * mandada a llamar desde la clase Operaciones
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			int r = op.sumar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
			lbResultado.setText(String.format("%s + %s = %d", txtN1.getText(), txtN2.getText(), r));
		
	}
	
	
}
