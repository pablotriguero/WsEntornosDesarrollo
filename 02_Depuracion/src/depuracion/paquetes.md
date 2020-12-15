Los paquetes es la manera que tenemos en java de organizar nuestras clases.

El convenio java dicta lo siguiente a la hora de crear paquetes y es mediante la convencion de LowerSnakeCase (todo en minuscula)

Convenciones de codigo
-
Porque convenciones de codigo? En la informatica en general y en programación en particular suele haber muchos problemas con los "espacios en blanco". Por ejemplo, si yo quiero crear una clase que se lleme "Pais de origen", no podría crearla así directamente porque java no me deja usar espacios en blanco. Entonces, como podemos crear esa case con una convención de código?

Tenemos 2 grandes tipos de convenciones

### CamelCase
Es un tipo de convencion la cual cada vez que haya un cambio de palabra en vez de poner un espacio en blanco, se capitaliza la siguiente palabra. Dentro del Camel case tenemos 2 tipos

	1. LowerCamelCase -> En esta convención la primera letra de nuestras palabras va en minuscula. Ej: paisDeOrigen-
	Esta convención se usa en java a la hora de poner variables y métodos.
	2. UpperCamelCase -> En esta convención la primera letra de nuestras palabras va en mayuscula. Ej: PaisDeOrigen
	Esta convencion se utiliza en java en las Clases
	
2) SnakeCase, este tipo de convención cada vez que haya un cambio de palabra se pone un guion bajo "_". También 2 tipos:

	1. LowerSnakeCase -> En esta convención TODAS la letras de las palabras van en minuscula. Ej: pais_de_origen
	Esta convención no se suele utilizar en java, pero por ejemplo se utiliza en php a la hora de crear varibles
	2. UpperSnakeCase -> En esta convención TODAS la letras de las palabras van en mayuscula. Ej: PAIS_DE_ORIGEN
	Esta convención se utiliza en las constantes de clase en java
	