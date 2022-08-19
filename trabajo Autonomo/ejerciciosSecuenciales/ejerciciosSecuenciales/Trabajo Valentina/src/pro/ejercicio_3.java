package pro;
import javax.swing.JOptionPane;
public class ejercicio_3 {
	public static void main(String[]args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de dinero"));
		double porsentaje = valor*0.15;
		System.out.println("El porsentaje de: "+valor+" es "+porsentaje);
	}
}
