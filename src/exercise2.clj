(ns exercise2)

(defn es-mayor-a-cinco [numero]
	(if (> numero 5)
		true
		false))

(defn only-greater-than-five 
"Toma una lista inicial y devuelve una con los elementos mayores a 5"
		[listaNumero]
	(filter es-mayor-a-cinco listaNumero))
	

	




