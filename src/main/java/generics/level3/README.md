# Nivel 3
En este nivel combinarás genéricos avanzados con interfaces, limitaciones de tipos (bounded types) y polimorfismo. Simularás un ejemplo real con dispositivos que pueden realizar llamadas y fotos.
## 📌 Enunciado
Crea una interfaz llamada Phone con el método call().

Después, crea tres clases:

Smartphone, que implementa Phone y añade el método takePhoto().
GenericUtils, con dos métodos genéricos:
El primero, llamado usePhone(), acepta un argumento limitado por la interfaz Phone( T extends Phone) y llama al método call().
El segundo, llamado useSmartphone(), acepta un argumento limitado por la clase Smartphone( T extends Smartphone) y llama tanto call()como takePhoto().
Main, con el método main(), donde se crea un objeto de tipos Smartphone y se pasa a ambos métodos de la clase GenericUtils.

### Importante
¿El método limitado por la interfaz Phone, dentro GenericUtils, puede llamar takePhoto()? ¿Por qué sí o por qué no? Reflexiona y compruébalo en el código.

## 🧩 Explicaciones
- El método usePhone solo admite que le pasemos por parámetro objetos que implementen la interfaz Phone que es la que tiene el método call(). No se puede invocar al metodo takePhoto porque no pertenece a la interfaz, el método solo podrá hacer llamadas a métodos que estén dentro de la interfaz que le hemos dicho que reciba por parámetro. La "utilidad" de esto es que si creo un objeto NoSmartPhone que implemente la interfaz podré invocar dicho método, así tanto objetos SmartPhone como NoSmarphone serán aceptados por el método por parámetro porque ambos implementan la interfaz Phone y ambos está forzados a tener un método call.