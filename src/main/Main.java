package main;
import strings.Constants;

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
        String resultString;
        String sign = signSc.nextLine().toLowerCase();
        if (!sign.isBlank()) {
            if (sign.equals("/") || sign.equals("*") || sign.equals("sqrt") || sign.equals("log10") || sign.equals("+") || sign.equals("-")) {
                logger.log(Level.INFO, Constants.INSERT);
                Scanner n1Sc = new Scanner(System.in);
                Double n1 = Double.parseDouble(n1Sc.nextLine());
                switch (sign) {
                    case "sqrt":
                        resultString = Constants.RESULT + Math.sqrt(n1);
                        logger.log(Level.INFO, resultString);
                        break;
                    case "log10":
                        resultString = Constants.RESULT + Math.log10(n1);
                        logger.log(Level.INFO, resultString);
                        break;
                    default:
                        logger.log(Level.INFO, Constants.INSERT);
                        Scanner n2Sc = new Scanner(System.in);
                        Double n2 = Double.parseDouble(n2Sc.nextLine());
                        switch (sign) {
                            case "+":
                                result = n1+n2;
                                resultString = Constants.RESULT + result;
                                logger.log(Level.INFO, resultString);
                                break;
                            case "/":
                                result = n1/n2;
                                resultString = Constants.RESULT + result;
                                logger.log(Level.INFO, resultString);
                                break;
                            case "*":
                                result = n1*n2;
                                resultString = Constants.RESULT + result;
                                logger.log(Level.INFO, resultString);
                                break;
                            case "-":
                                result = n1-n2;
                                resultString = Constants.RESULT + result;
                                logger.log(Level.INFO, resultString);
                                break;
                            default:
                                logger.log(Level.SEVERE, "\nOperazione non valida");
                       }
                }
            }
            else {
                logger.log(Level.SEVERE, "\nOperazione non valida");
            }
        }
    }
}