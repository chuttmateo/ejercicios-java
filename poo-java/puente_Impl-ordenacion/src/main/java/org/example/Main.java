package org.example;

import org.example.ordenador.BubbleSort;
import org.example.ordenador.Ordenacion;
import org.example.orden.Asc;
import org.example.orden.Desc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ordenacion<List<Integer>> ordenador =  new BubbleSort(new Asc());
        List<Integer> desordenados = new ArrayList<>();
        List<Integer> ordenados = new ArrayList<>();
        desordenados.add(5);
        desordenados.add(3);
        desordenados.add(2);
        desordenados.add(9);
        desordenados.add(2);

        System.out.println("Orden ascendente");
        ordenados = ordenador.ordenar(desordenados);
        ordenados.forEach(System.out::println);

        ordenador = new BubbleSort(new Desc());

        System.out.println("Orden descendente");
        ordenados = ordenador.ordenar(desordenados);
        ordenados.forEach(System.out::println);

        //TODO: Hacer implementaciones con otros algoritmos de ordenamiento
    }
}