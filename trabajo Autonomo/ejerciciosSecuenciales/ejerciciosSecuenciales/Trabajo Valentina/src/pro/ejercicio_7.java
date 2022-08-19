package pro;
import javax.swing.JOptionPane;
public class ejercicio_7 {
	public static void main(String[]args) {
		int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
		double total = (base*altura)/2;
		System.out.println("La base del triangulo es "+base+" y la altura es "+altura);
		System.out.println("El area del triangulo es de "+total);
	}

}
