package View;

import Model.Element;

import javax.swing.*;
import java.awt.*;

public class Squares{
    private Element element;
    private JPanel line;
    private JFrame janela;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;

    public Squares (Element element, JFrame janela){
        this.element = element;
        line = new JPanel();
        this.janela = janela;
    }

    public JPanel getLine(){
        return line;
    }

    public void addSquare(int position){
        xPosition = position;
        yPosition = janela.getHeight() - element.getValue() - 40;
        width = 1;
        height = element.getValue();

        line.setBounds(xPosition, yPosition, width, height);
        line.setBackground(Color.black);

    }

    public void moveSquare(){
        yPosition = janela.getHeight() - element.getValue() - 40;
        height = element.getValue();

        line.setBounds(xPosition, yPosition, width, height);
        line.revalidate();
        line.repaint();
    }

    public int getValue(){
        return element.getValue();
    }

    public void setElement(Element element){
        this.element = element;
    }
    public Element getElement(){
        return element;
    }
}
