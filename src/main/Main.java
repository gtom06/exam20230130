package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.log(Level.INFO, "\nQuesta calcolatrice esegue le seguenti operazioni:\n+\n-\n*\n/\nsqrt\nlog10\n");
        logger.log(Level.INFO, "Inserisci l'operazione da eseguire, come riportato specificato nell'elenco precedente");

        Scanner signSc = new Scanner(System.in);
        double result;
        String sign = signSc.nextLine().toLowerCase();
        if (!sign.isBlank()) {
            logger.log(Level.INFO, "\nInserisci un numero");
            Scanner n1Sc = new Scanner(System.in);
            Double n1 = Double.parseDouble(n1Sc.nextLine());

            if (sign.equals("/") || sign.equals("*") || sign.equals("sqrt") || sign.equals("log10") || sign.equals("+") || sign.equals("-")) {
                switch (sign) {
                    case "sqrt":
                        logger.log(Level.INFO, "\nRisultato:\n" + Math.sqrt(n1));
                        break;
                    case "log10":
                        logger.log(Level.INFO, "\nRisultato:\n" + Math.log10(n1));
                        break;
                    default:
                        logger.log(Level.INFO, "\nInserisci un numero");
                        Scanner n2Sc = new Scanner(System.in);
                        Double n2 = Double.parseDouble(n2Sc.nextLine());
                        switch (sign) {
                            case "+":
                                result = n1+n2;
                                logger.log(Level.INFO, "\nRisultato:\n" + result);
                                break;
                            case "/":
                                result = n1/n2;
                                logger.log(Level.INFO, "\nRisultato:\n" + result);
                                break;
                            case "*":
                                result = n1*n2;
                                logger.log(Level.INFO, "\nRisultato:\n" + result);
                                break;
                            case "-":
                                result = n1-n2;
                                logger.log(Level.INFO, "\nRisultato:\n" + result);
                                break;
                            default:
                                logger.log(Level.SEVERE, "\nError");
                                System.exit(1);
                       }
                }
            }
        }
    }
}