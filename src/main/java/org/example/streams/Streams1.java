package org.example.streams;

import org.example.utils.Persona;

import java.util.*;
import java.util.stream.Collectors;


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


        /*Dado un arreglo de números enteros, utiliza Stream API para filtrar los números mayores que 50
        y cuenta cuántos números cumplen esta condición.*/
        List<Integer> numerosList = Arrays.asList(1,4,6,8,23,435,23,155,324,23,555,59);
        long mayores50 = numerosList.stream().filter(n -> n > 50).count();
        System.out.print("Mayores a 50: "+mayores50+ '\n');

        /*Dado un arreglo de cadenas, utiliza Stream API para buscar la primera cadena que comienza
        con la letra "A" y muéstrala en la consola. Si no se encuentra ninguna cadena que cumpla esta condición,
        muestra un mensaje indicando que no se encontró ninguna cadena.*/
        List<String> strings = Arrays.asList("pepe", "huevo", "avena", "queso");
        Optional<String> palabra = strings.stream().filter(str -> str.startsWith("z")).findFirst();
        if (palabra.isPresent()) {
            System.out.println(palabra.get());
        }else {
            System.out.println("No se encontró ninguna cadena");
        }


        /*Dado un arreglo de números enteros, utiliza Stream API para calcular la suma de todos los números.*/
        int result = numerosList.stream().reduce(0, Integer::sum);
        System.out.println(result);


        /*Dado un arreglo de objetos de tipo Persona con atributos como nombre, edad y ciudad,
        utiliza Stream API para agrupar las personas por ciudad y mostrar la cantidad de personas en cada ciudad.*/
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("mateo", 21,"María Grande"));
        personas.add(new Persona("Tadeo", 20,"Hasenkamp"));
        personas.add(new Persona("antonella", 29, "María Grande"));

        Map<String, Long> personasPorCiudad = personas.stream()
                .collect(Collectors
                        .groupingBy(Persona::getCiudad, Collectors.counting()));

        personasPorCiudad.forEach((ciudad, cantidad) -> System.out.println(ciudad + ": " + cantidad));

    }
}
