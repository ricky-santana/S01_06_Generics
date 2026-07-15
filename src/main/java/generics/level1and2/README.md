# Nivel 1

## 📌 Enunciado Ejercicio 1
Crea una clase llamada NoGenericMethods que almacene tres argumentos del mismo tipo , junto con:

un constructor que los inicialice,
y métodos getElement1(), getElement2(), getElement3()para acceder a ellos.
Comprueba que puedes pasar los argumentos en cualquier orden al constructor.

Este ejercicio sirve para comparar después el comportamiento con una versión genérica.


## 📌 Enunciado Ejercicio 2
Crea una clase Person con los atributos name, surname y age. Después, crea una clase llamada GenericMethods con un método genérico llamado printElements()que acepte tres argumentos de tipo genérico y los imprima por pantalla.

Al main()de la clase principal, llama a este método con diferentes tipos de parámetros (por ejemplo: un objeto Person, uno Stringy un valor numérico primitivo).

Con este ejercicio verificarás que los métodos genéricos pueden aceptar cualquier combinación de tipos y en cualquier orden.


## 🧩 Explicaciones
-

# Nivel 2

## 📌 Enunciado Ejercicio 1
Modifica el ejercicio anterior para hacer que uno de los argumentos del método genérico no sea genérico, sino de un tipo fijo, tales como String. Los otros dos argumentos deben seguir siendo genéricos.
## 📌 Enunciado Ejercicio 2
Adapta el ejercicio anterior para que el método acepte un número variable de argumentos genéricos (varargs). El nombre del método puede ser printAll().

### Importante:

Recuerda que el uso de varargs con genéricos puede generar advertencias en compilación (unchecked warnings). Infórmate sobre cómo afecta esto a la seguridad de tipos.

## 🧩 Explicaciones
-