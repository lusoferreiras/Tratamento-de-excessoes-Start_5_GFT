package ExceptionsGft;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        Boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");


            try{

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("resultado: "+resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null, "Entrada inválida, informe um inteiro! ");
                e.printStackTrace();
            }catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "impossível dividir o número por 0. ");
            }
            finally
            {
                System.out.println("Chegou no finally");
            }
            System.out.println("O código continua... ");

        }while(continueLooping);
    }
    public static int dividir(int a, int b){return a/b;}
}
