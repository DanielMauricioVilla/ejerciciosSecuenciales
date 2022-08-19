package pro;
import javax.swing.JOptionPane;
public class ejercicio_18 {
	public static void main (String[]args) {
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		int suma = 0;
		for (int i = 0; i <= num; i++) {
			suma += i;
		}
		System.out.println("el resultado es "+suma);
	}
}
