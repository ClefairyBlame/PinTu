import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControlGamePanel extends JPanel {
    JButton buttonStart, buttonPreview, buttonSave, buttonDraw, buttonExit;
    int row, column;
    ArrayList<Image> imageList;
    Cell [][] cells;
    Cell lastCall,noImageCell;
    PuzzlePanel puzzlePanel;
    GameWindow gameWin;
    private  JPanel imagePanel;

    public ControlGamePanel(GameWindow gameWin){
        this.gameWin = gameWin;

        buttonStart = new JButton("��ʼ����Ϸ");
        buttonPreview = new JButton("Ԥ��ȫͼ");
        buttonSave = new JButton("������Ϸ");
        buttonDraw = new JButton("��ȡ��Ϸ");
        buttonExit = new JButton("������ǰ��Ϸ");

        add(buttonStart);
        add(buttonPreview);
        add(buttonSave);
        add(buttonDraw);
        add(buttonExit);
    }
}
