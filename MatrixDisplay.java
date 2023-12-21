import javax.swing.*;
import java.awt.*;

public class MatrixDisplay {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(10, 10);
        displayMatrix(matrix);
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 2);  // Generate random number (0 or 1)
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        JFrame frame = new JFrame("Matrix Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(matrix.length, matrix[0].length));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                JTextField textField = new JTextField(String.valueOf(matrix[i][j]));
                textField.setHorizontalAlignment(JTextField.CENTER);
                panel.add(textField);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
