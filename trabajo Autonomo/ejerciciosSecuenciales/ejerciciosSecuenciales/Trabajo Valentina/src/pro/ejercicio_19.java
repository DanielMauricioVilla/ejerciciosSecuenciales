package pro;
import javax.swing.JOptionPane;
public class ejercicio_19 {
	public static void main(String[]args) {
		double nota1, nota2, notaTrabajos, examenFinal, notaFinal;	
		nota1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 1"));
		nota2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 2"));
		notaTrabajos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de los trabajos"));
		examenFinal= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota del examen final"));
		notaFinal = (nota1*.2)+(nota2*.2)+(notaTrabajos*.3)+(examenFinal*.3);
		System.out.println("La nota definitiva es de "+notaFinal);
	}
}
