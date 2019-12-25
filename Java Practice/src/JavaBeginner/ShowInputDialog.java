package JavaBeginner;

import javax.swing.*;
import java.awt.*;

public class ShowInputDialog {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Enter your name : ", "Hello!", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, input + " Wellcome to Java!");
        JOptionPane.showConfirmDialog(null, "Do you want to quit?", "End!", JOptionPane.YES_NO_OPTION);

    }
}
