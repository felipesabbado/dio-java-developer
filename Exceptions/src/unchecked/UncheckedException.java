package unchecked;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLoop = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                continueLoop = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!\n" + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            } finally {
                System.out.println("Chegou no finally");
            }
        } while (continueLoop);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
