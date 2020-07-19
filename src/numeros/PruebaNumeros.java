package numeros;

import javax.swing.JOptionPane;

public class PruebaNumeros {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

		Numeros n = new Numeros();
		System.out.println("La Suma es:" + n.Suma(num1, num2));
		System.out.println("La Resta es:" + n.Resta(num1, num2));
		System.out.println("La Multiplicacion es:" + n.Multiplicacion(num1, num2));
		System.out.println("La Division es:" + n.Division(num1, num2));

	}

}
