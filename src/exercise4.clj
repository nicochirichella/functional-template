(ns exercise4)

(defn summary "Devuelve la suma de una lista de numeros" [listaNumeros]
	(if (not(empty? listaNumeros))
	  (+ (first listaNumeros) (summary (rest listaNumeros)))   
	  0   
	)
)
