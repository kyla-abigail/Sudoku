package guiDesign;

import javax.swing.*;
import java.awt.Color;
public class Grid extends JTextField {

    public static final Color selection = new Color(240, 240, 240);
    public static final Color getSelection = Color.BLACK;
    public static final Color a_match = new Color(60, 179, 113);
    public static final Color a_wrong_guess = new Color(128, 0, 0);
    public static final Color a_number = Color.YELLOW;

    //variables for rows and cols
    //between 0-12
    int row;
    int col;

    //either 4 , 9 or 12
    int size;

    //Calling input
    Input fill;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
}