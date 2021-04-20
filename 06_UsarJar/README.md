# Importar un fichero .jar en nuestro proyecto

En este ejemplo vamos a importar el fichero .jar que hemos creado en el proyecto anterior para poder usarlo aqu�.

Es una practica muy muy muy habitual el usar fichero .jar que han creado otras personas.

Pasos:

1. Crear la carpeta "lib" en nuestro proyecto
2. Copiar los ficheros .jar que queramos usar en nuestro proyecto dentro de la carpeta "lib"
3. Tenemos que a�adir los ficheros jar al "Classpath" de nuestro proyecto
    - Boton derecho sobre nuestro proyecto
    - Build path -> Configure Build path
    - Vamos a la pesta�a "libreries"
    - Pulsamos el boton "Add JARs"
    - Vamos a la carpeta "lib" donde hemos copiado nuestros jar y los seleccionamos
    - Aplicamos y cerramos.
    
4. Para asegurarnos de que hemos importado bien nuestras librer�as, podemos observar que eclipse ha tenido que crear una carpeta llamada "Referenced Libraries" y dentro de esta debe de estar las librer�as importadas.
5. Ahora ya podemos usar las clases de dicha librer�a en nuestro proyecto
    