package SA_LPD7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        int hora, minutos;
        
        while (true) {
            System.out.print("Ingresa un día de la semana (lunes a viernes): ");
            dia = sc.nextLine().toLowerCase();
            if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes")) {
                System.out.println("Día inválido. Intenta nuevamente.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Ingresa la hora (de 0 a 23): ");
            hora = sc.nextInt();
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Intenta nuevamente.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Ingresa los minutos (de 0 a 59): ");
            minutos = sc.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Minutos inválidos. Intenta nuevamente.");
                continue;
            }
            break;
        }
        
        int minutosTotales = (hora * 60) + minutos;
        int minutosFinDeSemana = 15 * 60;  
        int minutosRestantes = 0;
        
        switch (dia) {
            case "lunes":
                minutosRestantes = ((5 * 24 * 60) - minutosTotales) + minutosFinDeSemana;
                break;
            case "martes":
                minutosRestantes = ((4 * 24 * 60) - minutosTotales) + minutosFinDeSemana;
                break;
            case "miercoles":
                minutosRestantes = ((3 * 24 * 60) - minutosTotales) + minutosFinDeSemana;
                break;
            case "jueves":
                minutosRestantes = ((2 * 24 * 60) - minutosTotales) + minutosFinDeSemana;
                break;
            case "viernes":
                minutosRestantes = ((1 * 24 * 60) - minutosTotales) + minutosFinDeSemana;
                break;
        }

        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
        sc.close();
    }
}







