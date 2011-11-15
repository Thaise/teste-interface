/**
*Teste de programa com JOptionPane
*/
import javax.swing.JOptionPane;
public class Teste{
	
	public static void main(String[] args){
		String notas = JOptionPane.showInputDialog(null, "Digite suas notas: ", "Notas", JOptionPane.PLAIN_MESSAGE);
		String[] notasSeparadas = notas.split(",");
		
		double[] notasParaMedia = new double[notasSeparadas.length];
		for(int i = 0; i < notasSeparadas.length; i++){
			notasParaMedia[i] = Double.parseDouble(notasSeparadas[i]);
		}
		double media = calcularMedia(notasParaMedia);
		String situacao = avaliarSituacao(media);
		JOptionPane.showMessageDialog(null, "Sua m�dia �: "+media+" - Voc� est� "+situacao);
	}
	
	public static double calcularMedia(double[] notasParaMedia){
		double media = 0;
		for(int i = 0; i < notasParaMedia.length; i++){
			media = media + notasParaMedia[i];
		}
		return media / notasParaMedia.length;
	}
	
	public static String avaliarSituacao(double media){
		String situacao = "";
		if(media < 7){
			situacao = "reprovado(a).";
		}else{
			situacao = "aprovado(a).";
		}	
		return situacao;
	}
}
