
package ejerciciosSecuenciales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Procesos {
		
	public void ejercicio2() {
		int a,b,c;
		 c = 8;
		 a = 2;
		 b = -2;
		 c = (a*b)+2;
		 a = a-2 + b * ( b + 3 )-c ;
		 b = c;
		
		System.out.println("El valor de 'c' es: "+c+"; El de 'a' es: "+a+"; El de 'b' es: "+b);

	}
	
	public void ejercicio3() {
		final double VALOR = 20;
		double porcentage = 15;
		double totalPorcentage = VALOR * porcentage / 100;
		
		System.out.println("El "+porcentage+"% de "+VALOR+" es: "+totalPorcentage);
	}
	
	public void ejercicio4() {
		double valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor numerico: "));
		double porcentage = 15;
		double totalPorcentage = valor * porcentage / 100;
		
		System.out.println("El "+porcentage+"% de "+valor+" es: "+totalPorcentage);
	}
	
	public void ejercicio5() {
		double salarioAnterior = 15000;
		double valorIncrementado = salarioAnterior * 25 /100;
		double salarioNuevo = salarioAnterior + valorIncrementado;
		
	
		System.out.println("su salario con el incremento del 25% es de: "+salarioNuevo);
	}
	
	public void ejercicio6() {
		
		double salario =  Integer.parseInt(JOptionPane.showInputDialog("ingrese su sueldo (en numeros): "));
		double horasExtra =  Integer.parseInt(JOptionPane.showInputDialog("ingrese horas extras (en numeros): "));
		double valorHorasExtra = horasExtra * 3000;
		double sueldoTotal = salario + valorHorasExtra;
		
		System.out.println("Su sueldo total es de: "+sueldoTotal);
	}
	
	public void ejercicio7() {
		double valorTratamiento = 1000;
		int i = 0;
		while (i<3) {
			int medicamentos = Integer.parseInt(JOptionPane.showInputDialog("cantidad medicamentos suministrados (valor por unidad 20000): "));
			double valorMedicamento = medicamentos * 20000;
			double diasHospitalizacion = Integer.parseInt(JOptionPane.showInputDialog("ingrese los dias de hospitalizacion: "));
			double valorDiasHospitalizacion = 100000 * diasHospitalizacion;
			double totalDePago = valorTratamiento + valorMedicamento + valorDiasHospitalizacion;
			i++;
			System.out.println("El paciente debe pagar: "+totalDePago);
			System.out.println("-----------------------------");
		}
	}
	
	public void ejercicio8() {
		double base =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor para la base: "));
		double altura =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor para la altura: "));
		double area = (base * altura)/2;
		
		System.out.println("El area es: "+area);
	}
	
	public void ejercicio9() {
		int a,b,x;
		a = 2;
		b = 2;
		x = a + (b*2*a);
		System.out.println("El valor de 'x' es: "+x);
	}
	
	public void ejercicio10() {
		double num []= {2,2,2,2};
		double suma = 0;
		for ( int i = 0; i < num.length; i++) {
			suma = suma + num[(int)i];
		};
		System.out.println("La suma de los numeros da un tatal de: "+suma);
	}
	
	public void ejercicio11() {
		double num1 = 2;
		double num2 = 2;
		double num3 = 2;
		double multiplicar = (num1 +num2 + num3) * 2;
		System.out.println("La suma y multiplicacion por 2 de los numeros "+num1+","+num2+","+num3+" da un tatal de:"+multiplicar);
	}
	
	public void ejercicio12 () {
		double notas []= {2.5,2.5,2.5};
		double sumaNotas = 0;
		for (int i = 0; i < notas.length ; i ++) {
			sumaNotas = sumaNotas + notas[(int)i];
		};
		double promedio = sumaNotas/notas.length;
		System.out.println("su promedio es de: "+ promedio);
	}
	
	public void ejercicio13 () {
		String nombre = "Pepito Pérez";
		int documento = 10934566;
		int edad = 21;
		int imprecion = 0;
		do {		
			String profesion = "Estudiante";
			System.out.println("Datos ingresados:");
			System.out.println("Nombre completo: "+nombre);
			System.out.println("Documento: "+documento);
			System.out.println("Edad: "+edad);
			System.out.println("Profesión: "+profesion);
			System.out.println("");
			System.out.println("Biemvenidoo!!!");
			imprecion ++;
		}
		while(imprecion < 1);
	}
	
	public void ejercicio14() {
		int i = 0;
		do {
		double base =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor para la base: "));
		double altura =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor para la altura: "));
		double area = (base * altura)/2;
		i++;
		System.out.println("Teniendo en cuenta la base "+base+" y la altura "+altura+" el area del triangulo rectangulo es de: "+area);
		System.out.println("-----------------------");
		}while(i<2);
	}
	
	public void ejercicio15() {
		int a,b,x;
		a = 2;
		b = 2;
		x = a + (b*2*a);
		System.out.println("El valor de 'x' es: "+x);
	}
	
	public void ejercicio16 () {
		int precio = 2000;
		String productos [] = {"producto1","producto2"};
		int cantidad = 0;
		while (cantidad < productos.length) {
			cantidad ++;
		}
		int valorPagado = 5000;
		int cuenta  = cantidad * precio;
		int devuelta = valorPagado - cuenta;
		if (devuelta < 0) {
			System.out.println("Dinero insuficiente, total faltante: "+devuelta);
		}else {
			System.out.println("Su devuelta es: "+ devuelta);
		}
	}
	
	public void ejercicio17 () {
		String nombre = "Pepito Pérez";
		int documento = 10934566;
		int edad = 23;
		
			String profesion = "Estudiante";
			String telefono = "3113841824";
			System.out.println("Datos ingresados:");
			System.out.println("Nombre completo: "+nombre);
			System.out.println("Documento: "+documento);
			System.out.println("Edad: "+edad);
			System.out.println("Profesión: "+profesion);
			System.out.println("Teléfono: "+telefono);
			System.out.println("");
			System.out.println("Biemvenidoo!!!");
			
		
	}
	
	public void ejercicio18() {
		double base = 10;
		double altura = 10;
		double area = (base * altura)/2;
		
		System.out.println("El area es: "+area);
	}
	
	public void ejercicio19() {
		int a,b,x;
		a = 2;
		b = 2;
		x = a + (b*2*a);
		System.out.println("El valor de 'x' es: "+x);
	}
	
	public void ejercicio20() {
		
		double salario = 100;
		double horasExtra = 2;
		double valorHorasExtra = horasExtra * 3000;
		double sueldoTotal = salario + valorHorasExtra;
		
		System.out.println("Su sueldo es de: "+sueldoTotal);
	}
	
	public void ejercicio21 () {
		int horasTrabajadas = 20;
		int valorHoras = horasTrabajadas * 2000;
		int impuesto = (valorHoras * 10)/100;
		int sueldo = valorHoras - impuesto;
		System.out.println("El empleado gana: "+sueldo);
		
	}
	
	public void ejercicio22() {
		
		double salario = 100;
		double horasExtra = 2;
		double valorHorasExtra = horasExtra * 3000;
		double sueldoTotal = salario + valorHorasExtra;
		
		System.out.println("Su sueldo es de: "+sueldoTotal);
	}
	
	public void ejercicio23 () {
		int horasTrabajadas = 20;
		int valorHoras = horasTrabajadas * 2000;
		int impuesto = (valorHoras * 10)/100;
		int sueldo = valorHoras - impuesto;
		System.out.println("El empleado gana: "+sueldo);
		
	}
	
	public void ejercicio24() {
		double salarioAnterior = 15000;
		double valorIncrementado = salarioAnterior * 25 /100;
		double salarioNuevo = salarioAnterior + valorIncrementado;
		
	
		System.out.println("su salario con el incremento del 25% es de: "+salarioNuevo);
	}
	
	public void ejercicio25 () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un valor: ");
		
		double salarioAnterior = 15000;
		double incremento = sc.nextInt();
		double valorIncrementado = salarioAnterior * incremento /100;
		double salarioNuevo = salarioAnterior + valorIncrementado;
		
	
		System.out.println("su salario con el incremento del 25% es de: "+salarioNuevo);
	}
	
	public void ejercicio26 () {
		int n = 1;
		int suma = (n * (n+1))/2;
		System.out.println("la suma de los primeros numeros naturales es: "+suma);

	}
	
	public void ejercicio27 () {
		double nota1 = 5.0;
		double nota2 = 4.0;
		double trabajos = 5.0;
		double examen = 4.0;
		double promedio = (nota1 * 0.2)+(nota2 * 0.2)+(trabajos * 0.3)+(examen *0.3);
		System.out.println("El promedio es: "+ promedio);
	}
	
	public void ejercicio28 () {
		double monto = 2000;
		int plazo = 5;
		double interes = 2.5;
		double reendimiento = (monto * interes * plazo) /360;
		
		System.out.println("El rendimiento CDT es de: "+reendimiento);
	}
}


