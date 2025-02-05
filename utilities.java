import Model.Element;
import View.Squares;

import javax.swing.*;
import java.util.ArrayList;

public class utilities {
    public static void troca(ArrayList<Squares> array, int pos1, int pos2){
        Element temp = array.get(pos1).getElement();

        array.get(pos1).setElement(array.get(pos2).getElement());
        array.get(pos1).moveSquare();
        array.get(pos2).setElement(temp);
        array.get(pos2).moveSquare();

        try {
            Thread.sleep(10); // Atraso de 10 milissegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

