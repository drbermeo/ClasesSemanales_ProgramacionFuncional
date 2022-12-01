//Conjuntos en scala
//Conjunto de valores unicos
val conj2: Set[ Int] = Set (1,2,3,4,5)
//Algunas Funciones
val conjunto: Set[ Int] = Set (1,2,3)
val conjuntoNuevo = conjunto + 6
val conNuevo = conjunto.concat(List(2,3,4,5))
conNuevo.intersect(conjunto)
//Mapas
//Metodo toMap: Convertir una Lista de tuplas en Mapas
List(("apples",3),("oranges",2),("pears",0)).toMap
List("apples"->3,"oranges" ->2,"pears" ->0).toMap
// Otra forma de crear mapas
Map(("apples",3),("oranges",2),("pears",0))
Map("apples"->3,"oranges" ->2,"pears" ->0)
// Metodo toSeq: convertir un Map en una secuencia de pares(tulpas 2)
Map(("apples",3),("oranges",2),("pears",0)).toSeq
Map("apples"->3,"oranges" ->2,"pears" ->0).toSeq
//Seq[(String, Int)] = List(("apples",3),("oranges",2),("pears",0))
//Map en Mapas
val fruitBasket = Map("apples"->3,"oranges" ->2,"pears" ->0)
fruitBasket.map( data => data
match {
    case (fruit,count) => count *2
})
//otra forma
fruitBasket.map{ case (fruit,count) => count *2}
val fruitBaskett = Map("apples"->3,"oranges" ->2,"pears" ->0)
fruitBaskett.map{ case (fruit,count) => (fruit,count*2)}
fruitBaskett.map{ case (fruit,count) => (fruit,count, count*2)}.map{ 
case (fruit,_,count2) => (fruit,count2/2)
}.toMap
//Itera sobre pares key/value
fruitBaskett.filter { case (fruit,count) => count > 0 }
/* Groups By reorganiza una secuencia de un mapa , por ejemplo dada una secuencia de palabras,podemos agrupar todas la palabras que comienza con la letra y
en una subsecuencia y todas las demas palabras en otra subsecuencia*/
Seq("wombat","xanthan","yogurt","zebra").
groupBy(s=> if (s startsWith "y")1 else 2)
//otro ejemplo
List(1,2,3,4,5).groupBy( k => k%3)
