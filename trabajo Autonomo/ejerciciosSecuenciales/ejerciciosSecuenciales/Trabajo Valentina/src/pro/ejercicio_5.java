package pro;
import javax.swing.JOptionPane;
public class ejercicio_5 {
	public static void main(String[]args) {
		final int d=3000;
		int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de dinero que gana"));
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas extras trabajadas"));
		int total = salario*(horas*d);
		System.out.println("El sueldo total es de "+total);
	}
}
