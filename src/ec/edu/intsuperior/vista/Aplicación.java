package ec.edu.intsuperior.vista;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Aplicación {
    public static void main(String[] args) {
        
    }
    public static void caracteresAscci(){
        
        for (int i=0;i<256;i++)
        {
            System.out.println(i+"."+(char)i);
        }
    }
    public static void numerosNegativosPositivos(){
        int cuenta=0;
        int suma=0;
        int positivos=0;
        int negativos=0;
        int A=0;
        Scanner leer=new Scanner(System.in);
        do {
            System.out.println("Escribe un número: ");
            A=leer.nextInt();
                    cuenta++;
                    if(A>=0)
                        positivos++;
                    else negativos--;
                    suma=suma+A;
        }while(cuenta<10);
        System.out.println("La suma es: "+suma);
        System.out.println("El numero de positivos es: "+positivos);
        System.out.println("El numero de negativos es: "+negativos);
        
        
        }
    public static void cuentaVocales(){
        String cadena ="La lluvia en Sevilla es una maravilla";
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='a'||
              cadena.charAt(i)=='e'||
               cadena.charAt(i)=='i'||
               cadena.charAt(i)=='o'||
                 cadena.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println(" Hay "+contador+" vacales ");
    }
    public static void tablaMultiplicar(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del"+n);
        for(int i = 1; i<=12; i++){
            System.out.println(n +" * " + i + " = " + n*i);
        }
       
    }
    public static void pruebaCubo(){
        System.out.println("El cubo de 7.5 es : "+cubo(7.5));
        
    }
    public static double cubo(double x ) {
        return x*x*x;
    }
  
    public static void saludo(){

		String nombre="laura";

		System.out.println("Bienvenida "+nombre);
    }            
    
   public static void Radio() {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        Scanner useLocale = sc.useLocale(Locale.US);
        double radio=sc.nextDouble();
 
        
        double area=Math.PI*Math.pow(radio, 2);
 
        System.out.println("El area del circulo es "+area);
    }         
     
   public static void ascii() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);
        int codigo = (int) caracter;

        System.out.println(codigo);
    }
            
public static void contadorNumeros() {
        System.out.println("Introduce los numeros");
       Scanner sn=new Scanner(System.in);
       int num=sn.nextInt();
       int contador=0;
       while(num!=-1){
            
           contador++;
            
           num=sn.nextInt(); 
            
       }
         
       System.out.println("Fin, se ha introducido "+contador+" numeros");
        
    }

    
public enum DiasSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
     
}
public static void DiasSemana() {
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
         
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
         
        switch(diaS){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+diaS.name().toLowerCase()+" es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+diaS+" no es laborable");
                break;
             
        }
         
    }
public static void tema() {
		Scanner teclado = new Scanner(System.in);
		String tema = "tema";
		System.out.println("¿ Sabes del tema ? di si o no ");
		tema = teclado.nextLine();
		tema = tema.toLowerCase();

		if (tema.equals("si")) {
			System.out.println("Estas informado puedes hablar.");
		} else if (tema.equals("no")) {
			do {
				System.out.println(" No sabes mejor te informas");
				System.out.println("¿ Ya estas informado ? Si o No ");
				tema = teclado.nextLine();
				tema = tema.toLowerCase();

			} while (tema.equals("no"));

			System.out.println("Estas informado puedes hablar.");
		}

	}
public static void adivinaNumero() {
    Scanner scanner = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int contador = 10;
 
    numeroAleatorio = (int) (Math.random()*100+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. "
        + "Tienes 10 intentos.");
    System.out.println(numeroAleatorio);
    
    do {
      System.out.println("Número contador: " + contador);
      System.out.print("Introduce el número que creas posible: ");
      intento = scanner.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println("El número que buscas es menor, te quedan "
            + (contador-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println("El número que buscas es mayor, te quedan "
            + (contador-1) + " intentos: ");
      } else {
        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
      }
      contador--;
    } while (intento != numeroAleatorio && contador > 0);
    if (contador == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
    }
  }
 public static void vocal(){
    Scanner scanner = new Scanner(System.in);
    String cadena;
    int longitud;
    char caracter;
    boolean vocal = true;

    System.out.println("El programa analizará si los carácteres son vocales o no.");
    System.out.print("Introduce los carácteres a analizar, en caso de querer terminar "
        + "el programa, introduce un espacio: ");
    cadena = scanner.nextLine();
    while (!cadena.equals(" ")){
      longitud = cadena.length();
      for (int i=0;(i < longitud);i++){
        caracter = cadena.toUpperCase().charAt(i);
        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
          vocal = true;
        } else {
          vocal =false;
          cadena = " ";
          break;
        }
      }
      if (vocal){
        System.out.println("Los carácteres son VOCALES.");
       } else {
         System.out.println("Los carácteres NO SON VOCALES");
       }
      System.out.print("Introduce nuevos carácteres a analizar, en caso de querer terminar "
          + "el programa, introduce un espacio: ");
      cadena = scanner.nextLine(); 
     }
    System.out.println("FIN DEL PROGRAMA");
  }
 public static void limite(){
    Scanner scanner = new Scanner(System.in);
    int inferior;
    int superior;
    int numero;
    int suma = 0;
    int contador = 0;
    boolean esLimite = false;
    
    System.out.println("El programa solicitará un límite inferior y superior de intervalo.");
    System.out.println("Después pedirá la introducción de números a analizar, para finalizar "
        + "de introducir números, pulsa 0");
    System.out.println("Mostrará la siguiente información: ");
    System.out.println("Suma de los números que están dentro del intervalo");
    System.out.println("Cuantos números están fuera del intervalo");
    System.out.println("Si se ha introducido alguno de los números que marcan los límites "
        + "de los intervalos");
    
    do {
      System.out.print("Introduce el límite inferior: ");
      inferior = scanner.nextInt();
      System.out.print("Introduce el límite superior: ");
      superior = scanner.nextInt();
      if (inferior > superior) {
        System.out.println("Error, el límite inferior debe ser que el superior. "
            + "Revisa los valores introducidos.");
      }
    } while (inferior > superior);
    
  
    do {
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      
      if (numero != 0) {
        if (numero > inferior && numero < superior) {
          suma += numero;
        } else if (numero <= inferior || numero >= superior) {
          contador++;
        }
        if (numero == inferior || numero == superior) {
          esLimite = true;
        }
      } 
    } while (numero != 0);
    
    
    System.out.println("El valor de la suma de los números introducidos en el rango " + inferior +"-" +superior +" es de " +suma);
    System.out.println("Se han introducido un total de " + contador + " números fuera del intervalo " + inferior+"-"+superior);
    if (esLimite){
      System.out.println("Alguno de los valores introducidos ha coincidido con alguno de los límites del intervalo");
    } else {
      System.out.println("No se ha introducido ningún valor igual a los límites del intervalo");
    }
  }
 
  public static void cronometro(){
    int hora;
    int minuto;
    int segundo;
    String borraAnterior = "\b\b\b\b\b\b\b\b"; 
    
    for (hora=0; hora<=23; hora++) {
     
      for (minuto=0; minuto<=59; minuto++) {
        
        for (segundo=0; segundo<=59; segundo++) {
          
          System.out.printf("%02d:%02d:%02d",hora,minuto,segundo);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aplicación.class.getName()).log(Level.SEVERE, null, ex);
            }
          System.out.print(borraAnterior);
        }
      }
    }
  }
   public static void numeros() {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int contador;
    int mayor = 0;
    int igual = 0;
    int menor = 0;

    System.out.println("El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
    System.out.print("Introduce la cantidad de número que vamos a introducir: ");
    contador = scanner.nextInt();
    do {
      if (contador <= 0) {
        System.out.println("El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
        contador = scanner.nextInt();
      }
    } while (contador <= 0);
    while (contador > 0){
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      contador = contador-1;
      if (numero > 0){
        mayor++;
      } else if (numero < 0){
        menor++;
      } else {
        igual++;
      }
    }    
    System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor + " son menores a 0\n" + igual + " son iguales a 0.");
  }
    public static void numeroSuerte() {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;                                          
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();
        suma = dia + mes + año;
        cifra1 = suma/1000;      
        cifra2 = suma/100%10;    
        cifra3 = suma/10%10;     
        cifra4 = suma%10;       
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);                                               
    }
    public static void contador() {
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                             System.out.print(i != 3 ? i : "E");
                             System.out.print(j != 3 ? j : "E");
                             System.out.print(k != 3 ? k : "E");
                             System.out.print(l != 3 ? l : "E");
                             System.out.println(m != 3 ? m : "E");                                           
                        }
                    }
                }
            }
        }
    }
    public static void cuadradoMagico() {
        
        int[][] M = crearArray();
        cuadradoMagico(M);
        mostrarMatriz(M);
    }
    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas;
        do {
            System.out.print("Número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);
        int[][] A = new int[filas][filas];
        return A;
    }
    public static void cuadradoMagico(int[][] matriz) {                                                           
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont; 
        for (cont = 2; cont <= N * N; cont++) { 
            if (!multiplo) {        
                i--;                
                if (i < 0){ 
                    i = N - 1;
                }
                j++;                
                if (j >= N){ 
                    j = 0; 
                }
            } else {               
                i++;                
                if (i >= N){
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            multiplo = cont % N == 0;
        }
    }

    
    public static void mostrarMatriz(int[][] A) {
        for (int[] A1 : A) {
            for (int j = 0; j < A1.length; j++) {
                System.out.printf("%5d", A1[j]);
            }
            System.out.println();
        }
    }
   
        } 

