
Crear una clase Articulo con un nombre y un precio, que ambos se puedan modificar.

También tendrá un id que se generará de forma automática mediante un contador (totalArticulos) y una función generarId(). Este id no podrá modificarse ni obtenerse fuera de Articulo.

Crear un método promocionNavidad() que reciba el porcentaje de rebaja y lo aplique al precio.

Sobreescribir el método toString() para que retorne el "{nombre} - {precio con dos decilames}€ (ID: {id})".

Crear una clase que herede de Articulo y se llame Ordenador. Debe agregar a su constructor primario el tipo, que será de TipoOrdenador (BASICO, OFIMATICA, TODOTERRENO, GAMING) y por defecto será BASICO.

Sobreescribe el método promocionNavidad() para que solo aplique la promoción si el precio es superior a 500 euros.

En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores, el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

Crear una variable para generar una lista con ellos y recorrerla aplicándoles la promoción e imprimiendo su contenido.

Puedes declarar la variable de la siguiente forma:

// Lista de todos los artículos
val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)
Responde a las siguientes preguntas:

¿De qué tipo genera en la lista por defecto el compilador? 
>Una lista de tipo <T> que indica que los elementos son de cualquier tipo, genéricos.

¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
>Es capaz de recibir cualquier tipo de elemento y cambiarlo para nuestro mejor uso del código.
> 
¿Qué pasaría si creáramos la lista con listOf< Ordenador >? ¿Y si la hiciéramos con listOf< Any >?
>listOf<Ordenador> hace referencia a una lista de objetos de tipo Ordenador, por lo que habría incompatibilidad de tipos.
> En el caso de lsitOf<Any> sería igual que no indicarle el tipo de elemento que introducimos y que automáticamente los perciba como genéricos.