package pro;
import javax.swing.JOptionPane;
public class ejercicio_12 {
	public static void main (String[]args) {
	String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo");
	int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));
	int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de edad"));
	String profesion = JOptionPane.showInputDialog("Ingrese su profesión");
	System.out.println("Datos ingresados:");
	System.out.println("Nombre: "+nombre);
	System.out.println("Documento: "+documento);
	System.out.println("Edad: "+edad);
	System.out.println("Profesión: "+profesion);
	System.out.println("Bienvenido!!!");
	}
}
