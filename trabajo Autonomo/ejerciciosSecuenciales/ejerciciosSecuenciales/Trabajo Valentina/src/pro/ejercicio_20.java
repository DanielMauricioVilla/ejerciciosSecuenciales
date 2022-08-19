package pro;
import javax.swing.JOptionPane;
public class ejercicio_20 {
	public static void main(String[]args) {
		int monto, dias;
		double interes, rendimiento;
		monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un monto"));
		interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una taza de interes"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese plazo en días"));
		rendimiento = (monto*interes*dias)/360;
		System.out.println("El rendimiento es de "+rendimiento);
	}
}
