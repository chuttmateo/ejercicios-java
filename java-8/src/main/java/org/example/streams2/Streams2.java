package org.example.streams2;


import org.example.streams2.utils.Persona;
import org.example.streams2.utils.Producto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Streams2 {
    public static void main(String[] args) {

        /*Ejercicio de filtrado por múltiples condiciones: Dado un arreglo de objetos de tipo Producto
        con atributos como nombre, precio y existencias, utiliza Stream API para filtrar los productos
        que tienen un precio menor a 50 y existencias mayores a 0.*/
        List<Producto> productosej1 = new ArrayList<>();
        productosej1.add(new Producto("pan", 5.0, 23));
        productosej1.add(new Producto("fideos", 3.0, 20));
        productosej1.add(new Producto("TV", 500.0, 5));
        productosej1.add(new Producto("tostadora", 40.0, 0));
        productosej1.add(new Producto("pc", 1000.0, 10));

        List<Producto> pFiltrados = productosej1.stream()
                .filter(producto -> producto.getPrecio() < 50.0 && producto.getExistencias() > 0)
                .toList();
        pFiltrados.forEach(System.out::println);


        /*Ejercicio de búsqueda y conteo: Dado un arreglo de cadenas, utiliza Stream API para buscar
        cuántas cadenas contienen la letra "E" en mayúscula.*/
        List<String> cadenasej2 = new ArrayList<>();
        cadenasej2.add("hola");
        cadenasej2.add("estEban");
        cadenasej2.add("esteban");

        long conteo = cadenasej2.stream()
                .filter(cadena -> cadena.contains("E")).count();
        System.out.printf("Cantidad de palabras con E: %s %n", conteo);


        /*Ejercicio de cálculo de factorial: Utiliza Stream API para calcular el factorial de un número
        ingresado por el usuario. (Extiende el ejercicio mencionado previamente sobre el cálculo del factorial).*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para calcular su factorial");
        Integer n = scanner.nextInt();
        scanner.close();

        long factorial =  IntStream.rangeClosed(1,n)
                .reduce(1, (acc, numero) -> acc * numero);
        System.out.println(factorial);*/

        //ejercicio prueba
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        System.out.println(numeros.stream().reduce(Integer::sum).orElse(0));


        /*Ejercicio de transformación de fechas: Crea una lista de objetos de tipo LocalDate que
        representen diferentes fechas. Utiliza Stream API para transformar las fechas en cadenas
        con un formato específico y muestra el resultado en la consola.*/
        List<LocalDate> fechasej3 = new ArrayList<>();
        fechasej3.add(LocalDate.of(1816,7,9));
        fechasej3.add(LocalDate.of(1810,5,25));
        fechasej3.add(LocalDate.of(1850,8,17));
        fechasej3.add(LocalDate.of(1820,9,20));

        List<String> fechasString = fechasej3.stream()
                .map(f -> f.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))
                .toList();
        fechasString.forEach(System.out::println);

    }
}
