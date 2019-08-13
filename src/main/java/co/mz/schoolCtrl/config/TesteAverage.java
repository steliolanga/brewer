package co.mz.schoolCtrl.config;

import javax.swing.JOptionPane;

public class TesteAverage {
	public static void main(String args[]) {
//	   Vector x=new Vector();
		int n1, n2, n3, n4, media, min = 0, max = 0;
		// Converte sem a necessidade da variavel auxiliar de string
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a primeira nota"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a segunda nota"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a terceira nota"));
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quarta nota"));
		media = (n1 + n2 + n3 + n4) / 4;
		int sum = n1 + n2 + n3 + n4;


		if (sum > 0)
			if (sum > max) {
				max = sum;
			}
		for(int i=0; i<sum;i++) {
		if (sum < min) {
			min = sum;
		}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Avarage: " + media);

	}
//    JOptionPane.showMessageDialog(null, "O Total: " + media);
}