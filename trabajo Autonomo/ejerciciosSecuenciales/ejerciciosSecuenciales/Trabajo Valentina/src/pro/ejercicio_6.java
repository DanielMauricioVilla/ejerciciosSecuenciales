package pro;
import javax.swing.JOptionPane;
public class ejercicio_6 {
	public static void main(String[]args) {
		final int d = 100000;
		int tratamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del tratamiento"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias de hopitalizacion"));
		int medicamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del medicamento"));
		int total = tratamiento + medicamentos + (dias*d);
		System.out.println("El tratamiento vale "+tratamiento);
		System.out.println("Estubo "+dias+" dias hospitalizado");
		System.out.println("Y los medicamentos costaron "+medicamentos);
		System.out.println("El valor a pagar es: "+total);
	}
}
