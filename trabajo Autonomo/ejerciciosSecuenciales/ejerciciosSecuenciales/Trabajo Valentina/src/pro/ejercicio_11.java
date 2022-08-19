package pro;
import javax.swing.JOptionPane;
public class ejercicio_11 {
	public static void main (String[]args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer nota parcial"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota parcial"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tecer nota parcial"));
		double total = (num1+num2+num3)/3;
		System.out.println("El valor del promedio de las tres notas parciales es de "+total);
	}
}
