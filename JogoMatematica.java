import java.util.Random;
import java.util.Scanner;

public class JogoMatematica {
	public static void main(String[] args){
		System.out.println("####################################");
		System.out.println("\n     #MATHEMATICS GAME#     \n");
		System.out.println("####################################");
		System.out.println("\n     #WELCOME TO THE GAME#     \n");
		System.out.println("####################################");
		System.out.println(" 1 - NEW GAME            ");
		System.out.println(" 2 - EXIT                ");
		
		System.out.print("\nEnter the desired option: ");
		int option = new Scanner(System.in).nextInt();
		
		if(option == 1){
			int tentativas=8, num1=0, num2=0, operacao=0,resposta, respostaUsuario=0;
          	String simboloOperacao;
            boolean valorAdequado = false;
            
            for(int nivel = 1; nivel <= 4; nivel++){
            	for(int rodada = 1; rodada <= 3; rodada++){
            		
            		if(nivel == 1)
			{
            			num1 = new Random().nextInt(10);
                        num2 = new Random().nextInt(10);
                        operacao = new Random().nextInt(2);
                        if(operacao == 0){
                            resposta = num1 + num2;
                            simboloOperacao = "+";
                        }
                        else
			{
                            resposta = num1 - num2;
                            simboloOperacao = "-";
                        }
            		}
            		else if(nivel == 2)
			{
            			num1 = new Random().nextInt(10);
                        num2 = new Random().nextInt(10);
                        resposta = num1 * num2;
                        simboloOperacao = "*";
            		}
            		else if(nivel == 3)
			{
            			while(num1 % num2 != 0  &&  num2 != 0){
                        	num1 = new Random().nextInt(10);
                            num2 = new Random().nextInt(10);
                        }
                        resposta = num1 / num2;
                        simboloOperacao = "/";
            		}
            		else
			{
            			num1 = 10 + new Random().nextInt(100);
                        num2 = 10 + new Random().nextInt(100);
                        operacao = new Random().nextInt(4);
                        switch(operacao){
                            case 0:
                                simboloOperacao = "+";
                                resposta = num1 + num2;
                                break;
                            case 1:
                                simboloOperacao = "-";
                                resposta = num1 - num2;
                                break;
                            case 2:
                                simboloOperacao = "*";
                                resposta = num1 * num2;
                                break;
                            default:
                                simboloOperacao = "/";
                                while(num1 % num2 != 0  &&  num2 != 0){
                                	num1 = 10 + new Random().nextInt(100);
                                    num2 = 10 + new Random().nextInt(100);
                                }
                                resposta = num1 / num2;
                        }
            		}
            		System.out.println();
            		System.out.println("Nível " + nivel + " Rodada " + rodada + " Tentativas: " + tentativas);
            		System.out.println(num1 + " " + simboloOperacao + " " + num2 + " = ?");
            		System.out.print("Enter your answer: ");
            		
            		valorAdequado = false;
            		while(!valorAdequado){
	            		try{
	            			respostaUsuario = new Scanner(System.in).nextInt();
	            			valorAdequado = true;
	            		}
	            		catch(Exception e){
	            			System.out.print("\nInappropriate value! Please retype your answer: ");
	            		}
            		}
            		
            		if(respostaUsuario == resposta){
            			System.out.println("\nRIGHT!");
            		}
            		else{
            			System.out.println("\nWRONG!");
            			tentativas--;
            		}
            		if(tentativas == 0){
            			break;
            		}
            	}
            	if(tentativas == 0){
            		break;
            	}
            }
            if(tentativas > 0){
            	System.out.println("\nYou won! Congratulations!");
            }
            else{
            	System.out.println("\nYou lost.");
            }
		}
		else{
			System.out.println("###I hope you have enjoyed the game! Check back often!"###);
		}
	}
}
