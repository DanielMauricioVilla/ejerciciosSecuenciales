import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio = 0, pago = 0, descuento =0;
		String preg= "";

		do {
			
			precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del articulo"));
		
			if (precio>=0) {
				if (precio>=1 && precio <= 20000) {
					descuento = 0;
				} else if (precio>=10001 && precio <= 10000) {
					descuento = 0.05;
				} else if (precio>=20001 && precio <= 30000) {
					descuento = 0.08;
				} else if (precio>=30000) {
					descuento = 0.1;
				} else {
					System.out.println("No es un precio valido!!");
				}
			
				pago=precio - (precio * descuento);
				System.out.println("El pago es: $"+pago+" con un descuento de: "+(descuento * 100)+"%");
				
				else {
					System.out.println("El precio es incorrecto");
				}
			
			}while()
		
	}

}
