# Librerías en JAVA - Java Archive (JAR)

Muchos desarrolladores en el mundo deciden hacer librerías o bibliotecas en java para realizar alguna funcinalidad. Dicha funcinalidad se exporta en lo que se conoce como "JAR" que no es más que un conjunto de clases que aportan alguan funcionalidad.

Dichos JAR puedes ser importados dentro de un proyecto para usar sus clases.

En este ejemplo vamos a crear un jar de operaciones de suma.

Las librerías pueden tener o pueden no tener un metodo main

## Crear las libreías a partir de un proyecto

Una vez hechas las clases de nuestro proyecto podemos crear el jar

Pasos:

1. Creamos una carpeta con nombre "jar" dentro del proyecto (optativo)
2. Boton derecho sobre nuestro proyecto
3. Export -> Java -> Jar File -> Next
4. Pulsamos el boton "Browser" y elegimos la carpeta donde queremos importar el fichero "jar". En nuestro caso la carpeta "jar" de este proyecto que hemos creado en el paso 1. Tambien seleccionamos "Classpath" y "proyect"

Si queremos crear un jar ejecutable, es decir un jar que nos los llevemos a cualquier ordenador que tenga instalado java para poder ser usado como una aplicacion de escritorio, podemos hacerlo igual que antes pero esta vez tenemos que elegir "Runnable Jar file" en el paso 3.

Tambien debemos de elegir el main que queremos ejecutar y el nombre del jar que queremos crear. 

Una vez creado el jar, lo llevamos al ordenador que querais y que tenga el java instalado y lo podemos ejecutar con el comando "java -jar NOMBRE_FICHERO.jar"
