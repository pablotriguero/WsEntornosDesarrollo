Los paquetes es la manera que tenemos en java de organizar nuestras clases.

El convenio java dicta lo siguiente a la hora de crear paquetes y es mediante la convencion de LowerSnakeCase (todo en minuscula)

Convenciones de codigo
-
Porque convenciones de codigo? En la informatica en general y en programaci�n en particular suele haber muchos problemas con los "espacios en blanco". Por ejemplo, si yo quiero crear una clase que se lleme "Pais de origen", no podr�a crearla as� directamente porque java no me deja usar espacios en blanco. Entonces, como podemos crear esa case con una convenci�n de c�digo?

Tenemos 2 grandes tipos de convenciones

### CamelCase
Es un tipo de convencion la cual cada vez que haya un cambio de palabra en vez de poner un espacio en blanco, se capitaliza la siguiente palabra. Dentro del Camel case tenemos 2 tipos

	1. LowerCamelCase -> En esta convenci�n la primera letra de nuestras palabras va en minuscula. Ej: paisDeOrigen-
	Esta convenci�n se usa en java a la hora de poner variables y m�todos.
	2. UpperCamelCase -> En esta convenci�n la primera letra de nuestras palabras va en mayuscula. Ej: PaisDeOrigen
	Esta convencion se utiliza en java en las Clases
	
2) SnakeCase, este tipo de convenci�n cada vez que haya un cambio de palabra se pone un guion bajo "_". Tambi�n 2 tipos:

	1. LowerSnakeCase -> En esta convenci�n TODAS la letras de las palabras van en minuscula. Ej: pais_de_origen
	Esta convenci�n no se suele utilizar en java, pero por ejemplo se utiliza en php a la hora de crear varibles
	2. UpperSnakeCase -> En esta convenci�n TODAS la letras de las palabras van en mayuscula. Ej: PAIS_DE_ORIGEN
	Esta convenci�n se utiliza en las constantes de clase en java
	