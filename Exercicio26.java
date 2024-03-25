import java.util.Scanner;

public class Exercicio26 {

    public static void executar() {
        public static int determinarCategoriaSeguro(int idade, int grupoRisco) {
          
            if (idade < 17 || idade > 70) {
                System.out.println("O pretendente não se enquadra na faixa etária permitida para adquirir apólices de seguro.");
                return -1; 
            }
    
            
            if (idade >= 17 && idade <= 20) {
                switch (grupoRisco) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        return -1; 
                }
            } else if (idade >= 21 && idade <= 24) {
                switch (grupoRisco) {
                    case 2:
                        return 3;
                    case 3:
                        return 4;
                    default:
                        return -1;
                }
            } else if (idade >= 25 && idade <= 34) {
                switch (grupoRisco) {
                    case 3:
                        return 4;
                    case 4:
                        return 5;
                    default:
                        return -1;
                }
            } else if (idade >= 35 && idade <= 64) {
                switch (grupoRisco) {
                    case 4:
                        return 5;
                    case 5:
                        return 6;
                    default:
                        return -1;
                }
            } else if (idade >= 65 && idade <= 70) {
                switch (grupoRisco) {
                    case 7:
                        return 8;
                    case 8:
                        return 9;
                    default:
                        return -1;
                }
            } else {
                return -1; 
            }
        }
    }