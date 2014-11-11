import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Love_Letter {

//pablo musus califico a rudy

	public static void main(String[] args) {
	
		System.out.println("***BIENVENIDOS A LOVE LETTER***");
		System.out.println("1. JUGAR UNA PARTIDA");
		System.out.println("2. SELECCIONAR EL NUMERO DE TOKENS A JUGAR");
		System.out.println("3. MOSTRAR LAS REGLAS DEL JUEGO");
		System.out.println("4. SALIR DEL JUEGO");

		int x;
		String JUGADOR1;
		String JUGADOR2;
		
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		
		switch (x){
		
		case 1:
		
			System.out.println("NOMBRE JUGADOR1");
			JUGADOR1 = teclado.next();
			
			System.out.println("NOMBRE JUGADOR2");
			JUGADOR2 = teclado.next();
			
			System.out.println("----------------------------------------");
			System.out.println(" ");
			System.out.println("**** BARAJEADAS****");
			
			System.out.println(" ");
			System.out.println("----------------------------------------");
			Integer [] MAZO = new Integer [] {1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8};
			Collections.shuffle(Arrays.asList(MAZO));
			
			int a ;
			for(int i = 0; i<16; i++){
				a = MAZO[i];
			}	
			
			
			int ManoJG1[] = new int[2];
			int ManoJG2[] = new int[2];
			System.out.println(" ****REPARTIR CARTAS A CADA JUGADOR**** ");
			System.out.println(" ");
			System.out.println("Jugador1: " + JUGADOR1 + " Tokens: " + "Token" + "\t\tjugador2: PC " + JUGADOR2 + " Tokens: " + "Token" );
			System.out.println(" ");
			ManoJG2[0] = MAZO[1];
			ManoJG1[0] = MAZO[0];
			System.out.println("Tu mano:" + DarNombreCarta(ManoJG1[0]) + "\t\t\t" +JUGADOR2 + ": [x]");
			
			System.out.println("-------------------------------------------");
			
			boolean continuarJuego = true;
			int numCarta = 3;
			Scanner accionPJ1 = new Scanner(System.in);
			while(continuarJuego == true){
				System.out.println("\n**********Turno de " + JUGADOR1 +  "***********\n");
				System.out.println("\nJugador1: " + JUGADOR1 + " Token: " + "Token" + "\t\tjugador2 PC: " + JUGADOR2 + " Token: " + "Token\n");
			
				
				ManoJG1[1] = MAZO[numCarta];
				System.out.println("Tu mano:" + DarNombreCarta(ManoJG1[0]) +  DarNombreCarta(ManoJG1[1])+ "\t\t" +JUGADOR2 + ": [x]");
				System.out.println("(1) Usar carta 1");
				System.out.println("(2) Usar carta 2");
				System.out.println("(3) Terminar juego");
				
				switch (accionPJ1.nextInt()){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(ManoJG1[0]));
						ManoJG1[0] = ManoJG1[1];
						break;
					}
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(ManoJG1[1]));
						break;
					}
					case 3:{
						numCarta = 15;
						break;
					}
				}
				
				System.out.println("\n**********Turno de " + JUGADOR2 +  "***********\n");
				System.out.println("Jugador: " + JUGADOR1 + " Token: " + "Token" + "\t\tPC: " + JUGADOR2 + " Token: " + "Token" );
				
				numCarta++;
				if(numCarta <= 15){
					ManoJG2[1] = MAZO[numCarta];
					System.out.println("\nTu mano:" + DarNombreCarta(ManoJG1[0])+ "\t\t\t"+JUGADOR2 + ": [x][x]");
					System.out.println("");
					accionPC(ManoJG2[0],ManoJG2[1]);
					numCarta++;
				}else{
					continuarJuego = false;
					System.out.println("FIN DEL JUEGO");
					
				}
			}
			
		}//fin del switch menu
			
	}

	public static String DarNombreCarta(int idCarta){
		switch(idCarta){
			case 1:{
				return " [GUARD]";
			}
			
			case 2:{
				return " [PRIEST]";
			}
			
			case 3:{
				return " [BARON]";
			}
			
			case 4:{
				return " [HANDMAIN]";
			}
			
			case 5:{
				return " [PRINCE]";
			}
			
			case 6:{
				return " [KING]";
				
			}
			
			case 7:{
				return " [COUNTESS]";
			
			}
			
			case 8:{
				return " [PRINCESS]";				
				
			}
		}
		return "Error";
	}
	
	public static void accionPC(int Carta1, int Carta2){
		switch(Carta1){
			case 1:{
				switch(Carta2){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 3:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 4:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 5:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 6:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));	
						break;
					}
					
					case 7:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					case 8:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
				}
				break;//fin del caso princess
			}
			
			case 2:{
				switch(Carta2){
				case 1:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 2:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 3:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
					break;
				}
				
				case 4:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
					break;
				}
				
				case 5:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 6:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
					break;
				}

				case 7:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
					break;
				}

				case 8:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
					break;
				}
			}
			break;

//fin del caso princess	
			
			}
			
			case 3:{
				switch(Carta2){
				case 1:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 2:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 3:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 4:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
					break;
				}
				
				case 5:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
					break;
				}
				
				case 6:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
					break;
				}

				case 7:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
					break;
				}

				case 8:{
					System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
					break;
				}
			}
			break;//fin del caso princess	
			}
			
			case 4:{
				switch(Carta2){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 3:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 4:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 5:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 6:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
						break;
					}
	
					case 7:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
						break;
					}
	
					case 8:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
			}
			break;//fin del caso princess	
			}
			
			case 5:{
				switch(Carta2){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 3:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 4:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 5:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 6:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
						break;
					}
	
					case 7:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));	
						break;
					}
	
					case 8:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
				}
				break;//fin del caso princess	
						
			}
			
			case 6:{
				switch(Carta2){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 3:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 4:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 5:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 7:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
						break;
					}
	
					case 8:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
				}
				break;//fin del caso princess	
			}
			
			case 7:{
				switch(Carta2){
					case 1:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 2:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 3:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 4:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
						break;
					}
					
					case 5:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
					
					case 6:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));	
						break;
					}
	
					case 8:{
						System.out.println("has utilizado la carta "+  DarNombreCarta(Carta1));
						break;
					}
				}
				break;//fin del caso princess
			}
			
			case 8:{
				//SWITCH(CARTA1)
					switch(Carta2){
						case 1:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
						
						case 2:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
						
						case 3:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
						
						case 4:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
						
						case 5:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
						
						case 6:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));	
							break;
						}
						
						case 7:{
							System.out.println("has utilizado la carta "+  DarNombreCarta(Carta2));
							break;
						}
				}
				break;//fin del caso princess	
			}
			
		}
	}
}


