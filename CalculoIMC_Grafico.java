import javax.swing.JOptionPane; // classe JOptionPane

public class CalculoIMC_Grafico
{
	public static void main(String args[])
	{		
			
		String message = ("Bem vindo ao programa para Calcúlo de IMC!");
		JOptionPane.showMessageDialog(null, message);
		
		int sexo = 0;

		while (sexo != 2 && sexo != 1)
		{
		sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o seu sexo: masculino ou feminino? \n Para masculino digite [1]. \n Para feminino digite [2]."));  
		switch(sexo)
		{
 		case 1: JOptionPane.showMessageDialog(null, "- O seu sexo é: Masculino.");
   		break;
   		case 2: JOptionPane.showMessageDialog(null, "- O seu sexo é: Feminino.");;
  		break;
   		default: JOptionPane.showMessageDialog(null, "Favor digite apenas os números 1 ou 2.");;
		}
		}
				
		JOptionPane.showMessageDialog(null, "- Observação:\n Ao digitar os dados \"peso\" e \"altura\", \nsempre use o ponto(.) ao invês da vírgula(,).");

		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu peso [Exemplo: 80.5]?"));		
		JOptionPane.showMessageDialog(null, "- O seu peso é: " + peso + " kilogramas!");		

		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a sua altura [Exemplo: 1.99]?"));
		JOptionPane.showMessageDialog(null, "- A sua altura é: " + altura + " metros!");

		double calcular_IMC = peso / ((altura)*(altura)); // calcula o valor do IMC
		double imc[] = new double[2];

		if (sexo == 1)
		{
			JOptionPane.showMessageDialog(null, "Resultado IMC (Masculino):");
			imc[0] =  18.6; imc[1] = 24.9;
		}
		else if (sexo == 2)
		{
			JOptionPane.showMessageDialog(null, "Resultado IMC (Feminino):");
			imc[0] = 18.5; imc[1] = 24.9; 
		}

		String resultado = ("Abaixo do peso: Menor que " + imc[0] + ".\nPeso ideal: Maior que " + imc[0] + " e menor que " + imc[1] + ".\nAcima do peso: Maior que " + imc[1] + " ");

		if (calcular_IMC < imc[0])
		{
			JOptionPane.showMessageDialog(null, "- O seu IMC é: " + calcular_IMC + "\n Você está abaixo do peso!\n\n" + resultado);
		}

		else if ((calcular_IMC >= imc[0]) && (calcular_IMC < imc[1]))
		{
			JOptionPane.showMessageDialog(null, "- O seu IMC é: " + calcular_IMC + "\n Você está no peso ideal!\n\n" + resultado);
		}

		else if (calcular_IMC >= imc[1])
		{
			JOptionPane.showMessageDialog(null, "- O seu IMC é: " + calcular_IMC + "\n Você está acima do peso!\n\n" + resultado);
		}		
	}		

 } // fim da classe CalculoIMC_Grafico