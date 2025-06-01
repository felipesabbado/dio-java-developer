package custom;

import javax.swing.*;

public class CustomException2 {

    public static void main(String[] args) {
        int[] numeradores = {4, 5, 8, 10};
        int[] denominadores = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominadores.length; i++) {
            try {
                if (numeradores[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!", numeradores[i], denominadores[i]);
                }

                int resultado = numeradores[i] / denominadores[i];

                JOptionPane.showMessageDialog(null, "O resultado da divisão de " + numeradores[i] + " por " + denominadores[i] + " é " + resultado);

            } catch (DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisão por Zero não é permitida.");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "O tamanho da lista de numeradores (" + numeradores.length + ") é menor que o tamanho da lista de denominadores (" + denominadores.length + ").");
            }
        }

        System.out.println("O programa continua...");
    }
}
