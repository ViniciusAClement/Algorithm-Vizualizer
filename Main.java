import Model.Element;
import View.Squares;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize(700,700);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);

        ArrayList<Squares> lista = new ArrayList<>();

        for (int i = 0;i < 500;i++){
            lista.add(new Squares(new Element(i), janela));
        }
        for (int i = 0;i < lista.size();i++){
            lista.get(i).addSquare(i);
        }

        shuffle(lista);

        for (int i = 1; i < lista.size(); i++){
            lista.get(i).moveSquare();
            janela.add(lista.get(i).getLine());
        }
        new Thread(() -> QuickSort.quickSort(lista,0,lista.size()-1)).start();

        janela.setVisible(true);
    }
    //salve
    public static void shuffle(ArrayList<Squares> lista) {
        Random random = new Random();
        for (int i = lista.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            utilities.troca(lista, i, j);
        }
    }
}