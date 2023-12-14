package ssss;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testete {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o seu nome: ");
		        String nome = scanner.nextLine();
		        
		        System.out.print("\nDigite o seu sexo: ");
		        String sexo = scanner.nextLine();

		        System.out.print("\nDigite o seu peso: ");
		        double peso = scanner.nextDouble();
		        
		        System.out.print("\nDigite a sua altura: ");
		        double altura = scanner.nextDouble();

		        System.out.print("\nDigite a data de seu nascimento no formato 'dd/MM/yyyy': ");
		        String dataInput = scanner.next();

		       
		        DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        LocalDate dataNascimento = LocalDate.parse(dataInput, formata);

		       
		        LocalDate dataAtual = LocalDate.now();
		        Period periodo = Period.between(dataNascimento, dataAtual);
		        
		        int anos = periodo.getYears();
		        int maxima = 220 - anos;
		        double porcentagem = 0.37;
		        
		        double imc = peso / (altura * 2);
		        String imcFormata = String.format("%.2f", imc);
		        double alvo = maxima - (maxima * porcentagem);
		       
		        System.out.println("\n" + nome.toUpperCase());
		        System.out.println("\nA sua frequencia cardiaca maxima e: " + maxima + "bpm");	
		        System.out.println("\nA sua frequencia cardiaca alvo e: " + alvo + "bpm");	
		        System.out.println("\nE o seu IMC e: " + imcFormata);
		        System.out.println("Verifique se você está dentro do seu padrao ideal de peso!");
		        System.out.println("\n TABELA DE IMC \n\r ABAIXO DO PESO: menos que 18.5 \r PESO IDEAL: entre 18.5 e 24.9 \r ACIMA DO PESO: entre 25 e 29.9 \r OBESO: 30 ou mais");
		        
		        scanner.close();
		    }

}
