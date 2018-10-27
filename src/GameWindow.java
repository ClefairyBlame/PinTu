import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GameWindow extends JFrame {
    int row = 3,column = 3;
    private JLabel playerName;

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public int getColumn(){
        return column;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public BufferedImage getImage(){
        return  image;
    }

    public void setImage(BufferedImage image){
        this.image = image;
    }

    BufferedImage image;
    JMenuBar menuBar = new JMenuBar();
    private PuzzlePanel puzzlePanel;
    private JPanel imagePanel;
    ControlGamePanel controlPanel;
    JPanel messagePanel;
    JMenu menu1 = new JMenu("�ļ�");
    JMenu menu2 = new JMenu("�༭");
    JMenu menu3 = new JMenu("��Դ");
    public GameWindow() throws HeadlessException{
        this.setSize(800,700);
//        ����Ĭ��ͼƬ
        try {
            image = ImageIO.read(new File("image/1.jpg"));
//            image = ImageIO.read(GameWindow.class.getClassLoader().getResourceAsStream("image/1.jpg"));
        }catch (Exception e) {
            e.printStackTrace();
        }
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        puzzlePanel = new PuzzlePanel(this);
        puzzlePanel.initPanel();
        imagePanel = new JPanel();
        controlPanel = new ControlGamePanel(this);
        creatMessagePanel();
//        messagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(240,120));
        add(controlPanel,BorderLayout.SOUTH);
        add(messagePanel,BorderLayout.NORTH);
        add(puzzlePanel,BorderLayout.CENTER);
        add(imagePanel,BorderLayout.EAST);

        messagePanel.setBackground(Color.CYAN);
        imagePanel.setBackground(Color.magenta);
        //���ò˵���
        this.setJMenuBar(menuBar);


        setSize(new Dimension(Cell.WIDTH * column + 240,Cell.HEIGHT * row +100));
        setVisible(true);
        setResizable(false);
        validate();
    }

    private void creatMessagePanel(){
        messagePanel = new JPanel();
        playerName = new JLabel("������߹��Ĳ���");
        messagePanel.add(playerName);
        playerName.setBackground(Color.yellow);
    }
}