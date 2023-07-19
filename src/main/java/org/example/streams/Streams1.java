package org.example.streams;

import org.example.utils.Persona;

import java.util.*;
import java.util.stream.Collectors;


public class Streams1 {
    public static void main(String[] args) {

        /*Dado un array de números enteros haz un System.out.println por cada elemento*/
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        /*Arrays.stream(nums).forEach(s -> System.out.println(s));*/
        Arrays.stream(nums1).forEach(System.out::println);


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
        List<String> cadenas1 = Arrays.asList("zz","bb","ee","cc","dd","aa");
        cadenas1.stream().sorted().forEach(System.out::print);
        System.out.println();


        /*Ejercicio de filtrado y conteo: Dado un arreglo de números enteros, utiliza Stream API para filtrar los
        números mayores que 50 y cuenta cuántos números cumplen esta condición.*/
        List<Integer> nums = Arrays.asList(1,2,50,55,80,100);
        List<Integer> mayores50 = nums.stream().filter(num -> num >= 50).toList();
        mayores50.forEach(System.out::println);


        /*Ejercicio de búsqueda: Dado un arreglo de cadenas, utiliza Stream API para buscar la primera cadena que comienza con la letra "A"
        y muéstrala en la consola. Si no se encuentra ninguna cadena que cumpla esta condición,
        muestra un mensaje indicando que no se encontró ninguna cadena.*/
        List<String> cadenas = Arrays.asList("avena", "casa", "vaca", "escuela", "campo");
        Optional<String> palabra = cadenas.stream().filter(cadena -> cadena.startsWith("a")).findFirst();
        if (palabra.isPresent()){
            System.out.println("acá está: " + palabra.get());
        }else {
            System.out.println("No estoy aca mi bro");
        }


        /*Ejercicio de reducción: Dado un arreglo de números enteros, utiliza Stream API para calcular la suma de todos los números.*/
        List<Integer> numerosEnteros = Arrays.asList(1,2,3,4,5);
        Integer reduce = numerosEnteros.stream().reduce(0, Integer::sum);
        System.out.println("Ejercicio reducción: "+reduce);


        /*Ejercicio de agrupación: Dado un arreglo de objetos de tipo Persona con atributos como nombre, edad y ciudad,
        utiliza Stream API para agrupar las personas por ciudad y mostrar la cantidad de personas en cada ciudad.*/
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("mateo", 23, "María Grande"));
        personas.add(new Persona("tadeo", 22, "hasenkamp"));
        personas.add(new Persona("juan", 20, "hasenkamp"));

        Map<String, Long> mapaPoblacion = personas.stream()
                .collect(Collectors.groupingBy(Persona::getCiudad, Collectors.counting()));
        mapaPoblacion.forEach((ciudad, conteo) -> System.out.println(ciudad+": "+conteo));


        /*Ejercicio de transformación: Dado un arreglo de cadenas, utiliza Stream API para convertir todas las cadenas a minúsculas
        y mostrar el resultado en la consola.*/
        List<String> palabrasMayusculas = Arrays.asList("HOLA", "CHAU", "DDDD");
        List<String> palabrasMinusculas = palabrasMayusculas.stream().map(String::toLowerCase).toList();
        palabrasMayusculas.forEach(System.out::println);
        palabrasMinusculas.forEach(System.out::println);


        /*Ejercicio de ordenamiento y limitación: Dado un arreglo de números enteros, utiliza Stream API
        para ordenarlos de forma descendente y luego muestra los primeros 5 números en la consola.*/
        numerosEnteros= Arrays.asList(23,43,2,3,1,123,324,345,47,567,687);
        List<Integer> numerosOrdenadosDescendentemente = numerosEnteros.stream().sorted((n1,n2) -> Integer.compare(n2,n1)).toList();
        //Puedo eliminar los tipos en la expresion lambda (Integer n1,Integer n2) a (n1,n2) = Type inference; al igual que las llaves y el return
        //numerosEnteros.sort((n1,n2)-> Integer.compare(n2,n1));
        numerosOrdenadosDescendentemente.forEach(System.out::println);
        //TODO: agregar limite

    }
}
