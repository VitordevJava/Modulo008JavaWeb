package exerciciosMod008;

import javax.swing.JOptionPane;

public class ExerciMedia {
	public static void main(String[] args) {
		
		String Nota1 = JOptionPane.showInputDialog("Digite sua nota do primeiro bimestre : ");
		String Nota2 = JOptionPane.showInputDialog("Digite sua nota do primeiro bimestre : ");
		String Nota3 = JOptionPane.showInputDialog("Digite sua nota do primeiro bimestre : ");
		String Nota4 = JOptionPane.showInputDialog("Digite sua nota do primeiro bimestre : ");
		
		
		double Media = Double.parseDouble(Nota1);
		double Media2 = Double.parseDouble(Nota2);
		double Media3 = Double.parseDouble(Nota3);
		double Media4 = Double.parseDouble(Nota4);

		double MediaFinal = (Media + Media2 + Media3 + Media4) / 4;
		
		if(MediaFinal >= 6) {
			JOptionPane.showMessageDialog(null, "Parabens vc está aprovado sua media final é : " + MediaFinal);
		}else {
			JOptionPane.showMessageDialog(null, "Uma pena, vc não conseguiu atingir a media e ficou com a seguinte nota : " + MediaFinal);
		}
		
		
	}

}
