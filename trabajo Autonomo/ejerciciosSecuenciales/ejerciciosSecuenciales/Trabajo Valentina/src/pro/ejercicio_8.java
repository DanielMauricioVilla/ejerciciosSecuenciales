package pro;
import javax.swing.JOptionPane;
public class ejercicio_8 {
	public static void main(String[]args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de b "));
		int x = a+b*2*a;
		System.out.println("El valor de x es "+x);
		
	}
}
