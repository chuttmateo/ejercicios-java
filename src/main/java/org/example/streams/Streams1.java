package org.example.streams;

import java.util.Arrays;
import java.util.List;


public class Streams1 {
    public static void main(String[] args) {

        /*Dado un array de números enteros haz un System.out.println por cada elemento*/
        int[] nums = {1,2,3,4,5,6,7,8,9};
        /*Arrays.stream(nums).forEach(s -> System.out.println(s));*/
        Arrays.stream(nums).forEach(System.out::println);


        /*Ejercicio de filtro y mapeo: Dado un arreglo de números enteros,
        utiliza Stream API para filtrar los números impares y luego mapea cada número al cuadrado.
         Finalmente, muestra los resultados en la consola.*/
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> flujoFiltrado = numeros.stream().filter(n -> n % 2 != 0).toList();
        flujoFiltrado.stream().forEach(System.out::print);
        System.out.println();

        /*flujo al cuadrado*/
        flujoFiltrado.stream().map(x -> x*x).forEach(System.out::print);

        /*otra forma*/
        List<Integer> flujoCuadrado = flujoFiltrado.stream().map(x -> x*x).toList();
        System.out.println();
        flujoCuadrado.forEach(System.out::print);
        System.out.println();


        /*Ejercicio de ordenamiento: Dado un arreglo de cadenas, utiliza Stream API para ordenar las cadenas en
        orden alfabético y muestra el resultado en la consola.*/
        List<String> cadenas = Arrays.asList("zz","bb","ee","cc","dd","aa");
        cadenas.stream().sorted().forEach(System.out::print);
        System.out.println();

    }
}
