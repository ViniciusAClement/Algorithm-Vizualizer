import View.Squares;

import java.util.ArrayList;

public class QuickSort {
    public static void quickSort (ArrayList<Squares> array, int first, int last){
        if (first < last){
            int pivot = pivotFinder(array,first,last);
            quickSort(array,first, pivot);
            quickSort(array,pivot+1,last);
        }
    }
    public static int pivotFinder(ArrayList<Squares> array, int first, int last){
        int pivot = array.get((first + last)/2).getValue();
        int eIndice = first-1;
        int fIndice = last+1;

        while(eIndice < fIndice){
            do{
                eIndice++;
            }while (array.get(eIndice).getValue() < pivot);
            do{
                fIndice--;
            }while (array.get(fIndice).getValue() > pivot);
            if(eIndice < fIndice) {
                utilities.troca(array, eIndice, fIndice);
            }
        }
        return fIndice;
    }
}