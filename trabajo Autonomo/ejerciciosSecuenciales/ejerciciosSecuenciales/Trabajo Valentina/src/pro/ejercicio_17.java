package pro;
import javax.swing.JOptionPane;
public class ejercicio_17 {
	public static void main (String[]args) {
	int i=0;
	while(i<3){
	int salario = Integer.parseInt(JOptionPane.showInputDialog("ingrese salario del obrero"));
	double porsentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el aumento"));
	double totalAumento = porsentaje/100;
		double aumento =  salario+(salario*totalAumento);
		System.out.println("El salario anterior es de "+salario+" y con el aumento del " +porsentaje +"%"+" es de "+ aumento);
	i++;
}
	}
}