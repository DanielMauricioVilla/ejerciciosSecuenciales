package pro;
import javax.swing.JOptionPane;
public class ejercicio_14 {
	public static void main (String[]args) {
	String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo");
	int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));
	int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de edad"));
	String profesion = JOptionPane.showInputDialog("Ingrese su profesión");
	int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono"));
	System.out.println("Datos ingresados:");
	System.out.println("Nombre compleo: "+nombre);
	System.out.println("Documento: "+documento);
	System.out.println("Edad: "+edad);
	System.out.println("Profesión: "+profesion);
	System.out.println("Teléfono"+telefono); 
	}
}
