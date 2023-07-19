package org.example.streams;

import org.example.utils.Persona;
import org.example.utils.Producto;

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
        personas.add(new Persona("juan", 25, "hasenkamp"));

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
        numerosOrdenadosDescendentemente.stream().limit(5).forEach(System.out::println);


        /*Ejercicio de concatenación: Dado un arreglo de cadenas, utiliza Stream API para concatenar todas las cadenas en una sola cadena separadas por comas
        y muestra el resultado en la consola.*/
        List<String> cadenas2 = Arrays.asList("hola", "como", "estas");
        //String resultante = String.join(", ", cadenas2);
        String resultante = cadenas2.stream().collect(Collectors.joining(", "));
        System.out.println(resultante);


        /*Ejercicio de transformación y filtrado: Dado un arreglo de objetos de tipo Producto con atributos como nombre, precio y categoría,
        utiliza Stream API para filtrar los productos con un precio mayor a 100 y transforma los resultados en una lista de nombres de productos.*/
        List<Producto> productos = Arrays.asList(new Producto("jabón", 150.0, "limpieza"),new Producto("escoba", 180.0, "limpieza"), new Producto("pollo", 80.0, "alimentacion"));
        List<String> filtrados = productos.stream()
                .filter(producto -> producto.getPrecio() > 100)
                .map(Producto::getNombre).toList();

        filtrados.forEach(System.out::println);


        /*Ejercicio de búsqueda y mapeo: Dado un arreglo de objetos de tipo Persona con atributos como nombre, edad y ciudad,
        utiliza Stream API para buscar la persona de mayor edad y mapear su nombre en mayúsculas.*/

        String personaBuscada = personas.stream().max(Comparator.comparingInt(Persona::getEdad))
                .map(persona -> persona.getNombre().toUpperCase())
                .orElse("No existe");
        System.out.println(personaBuscada);


        /*Ejercicio de conteo condicional: Dado un arreglo de números enteros,
        utiliza Stream API para contar cuántos números son positivos, negativos y cero.*/
        List<Integer> numeros2 = Arrays.asList(12,0,0,234,342,-23,-234,-234,534,342,5,-234,0);
        long positivos = numeros2.stream().filter(num -> num > 0).count();
        long negativos = numeros2.stream().filter(num -> num < 0).count();
        long ceros = numeros2.stream().filter(num -> num == 0).count();

        System.out.printf("Negativos: %d, Positivos: %d, Ceros: %d", negativos, positivos, ceros);

    }
}
