package pro;
import javax.swing.JOptionPane;
public class ejercicio_9 {
	public static void main(String[]args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese primer valor decimal"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese segundo valor decimal "));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese trecer valor decimal"));
		double total = num1+num2+num3;
		System.out.println("El valor de la suma de los tres numeros decimales es de "+total);
	}
}
