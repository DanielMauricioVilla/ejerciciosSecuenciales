package pro;
import javax.swing.JOptionPane;
public class ejercicio_16 {
	public static void main (String[]args) {
	int i=0;
	do {
	int salario = Integer.parseInt(JOptionPane.showInputDialog("ingrese salario del obrero"));
		double aumento =  salario*1.25;
		System.out.println("El salario anterior es de "+salario+" y con el aumento del 25% es de "+ aumento);
	i++;
}while(i<3);
	}
}

