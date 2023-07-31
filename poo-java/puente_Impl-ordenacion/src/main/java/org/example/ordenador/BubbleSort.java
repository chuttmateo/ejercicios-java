package org.example.ordenador;

import org.example.orden.Orden;

import java.util.List;

public class BubbleSort extends Ordenacion<List<Integer>> {
    public BubbleSort(Orden orden) {
        super(orden);
    }

    @Override
    public List<Integer> ordenar(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() -i - 1; j++) {
                if (orden.comparar(lista.get(j), lista.get(j+1))){
                    Integer aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
        return lista;
    }
}
