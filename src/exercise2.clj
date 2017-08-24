(ns exercise2)

(defn es-mayor-a-cinco [numero]
	(> numero 5)
)

(defn only-greater-than-five 
"Toma una lista inicial y devuelve una con los elementos mayores a 5"
		[listaNumero]
	(filter es-mayor-a-cinco listaNumero)
)
	

	




