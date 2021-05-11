
# JUnit

Para alcanzar los resultados deseados de forma r�pida se requiere un framework de 
prueba. JUnit es un framework bastante bueno para realizar y automatizar estas 
pruebas en Java.

Una prueba unitaria se caracteriza por realizar una comparaci�n del resultado 
esperado de un m�todo con lo retornado por la codificaci�n de dicho m�todo.  

Esta comparaci�n puede ser con cualquier tipo de dato o conjunto de datos, ya 
sean num�ricos, textos, booleanos o incluso una excepci�n de programaci�n esperada. 

El �nico requisito para que una prueba unitaria resulte efectiva es que tenga 
�nicamente dos posibilidades de resoluci�n (correcta/incorrecta). 

Con las pruebas unitarias podemos comparar el resultado aislado de un m�todo, como el c�lculo de una f�rmula matem�tica que nos retorne un �nico dato est�tico. 
Pero tambi�n podemos realizar pruebas enviando una serie de datos parametrizados, 
sometiendo al m�todo a realizar operaciones con diferentes rangos y as� comprobar 
su correcto funcionamiento en diferentes situaciones.

Con las pruebas unitarias se busca tambien dar un porcentaje de cobertura a tu c�digo, es decir, por cuantas lineas del total del lineas que tiene tu programa son capaces de pasar tus pruebas. Un 100% ser�a el caso, pero muchas veces es dificil de conseguir, entre un 70% y un 90% suele ser lo normal.


## Caracteristicas

   1. JUnit es un framework de c�digo abierto que se utiliza para escribir y ejecutar pruebas.

   2. Proporciona anotaciones para identificar los m�todos de ensayo o test.

   3. Proporciona aserciones para resultados esperados del an�lisis.

   4. Proporciona clases para la ejecuci�n de pruebas o ejecutores de pruebas.

## Instalaci�n

JUnit5 no viene incluido en el JRE 1.8 por lo que hay que add las librer�as al classpath.

Ademas JUnit 5 esta fragmentado en 3 proyectos, nosotros nos centraremos en JUnit Jupiter (otro es Junit vintage con las caracteristicas de JUnit4, y el otro Junit platform que es para pruebas con la JVM)

## Para crear un modulo JUnit5 en eclipse:

   1. Crear una carpeta al mismo nivel que src (test)
   2. Add esa carpeta al classpath del proyecto
       - Bot�n derecho sobre la carpeta que hemos creado (test) -> build path -> configure build path
       - Pulsamos en la pesta�a source y dentro de ahi -> add Folder -> add carpeta test -> pulsamos OK
     
   3. boton derecho sobre la carpeta (test) -> new -> JUnit Test Case -> new JUnit Jupiter test. Es mejor crear primero un paquete antes de hacer este paso, y luego hacerlo sobre dicho paquete.
   4. Dentro de la ventana rellenamos el nombre del paquete (juni5) y el nombre de la clase (_00_Anotaciones)
   5. Si no tenemos JUnit5 add al proyecto, Eclipse nos preguntar� para a�adir el framework de JUNIT5. Decid que s� :)
   6. Podemos observar como se ha creado una libreria en nuestro proyecto con el nombre de JUNIT 5

