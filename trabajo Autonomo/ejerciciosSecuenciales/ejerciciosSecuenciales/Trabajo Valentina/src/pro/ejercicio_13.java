package pro;
import javax.swing.JOptionPane;
public class ejercicio_13 {
	public static void main(String[]args) {
		int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
		int pago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pago del producto"));
		int resultado = precio*cantidad-pago;
		if (resultado > 0) {
			System.out.println("Dinero faltante "+resultado);
		}else if(resultado == 0) {
			System.out.println("El resultado ha sido pagado, no hay cambio");
		}else if (resultado < 0) {
			resultado = resultado + (resultado * -2);
			System.out.println("Articulo pagado, su devuelta es de "+resultado);
		}
	}
}
