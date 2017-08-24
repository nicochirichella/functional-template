(ns exercise2)

(defn only-greater-than-five [x]
	(if (not(empty? x))
		(do(def primero (first x)) 
		    (if (> primero 5)
		      [primero (only-greater-than-five (rest x))]
		      (only-greater-than-five (rest x))
		    ))
		  []
))



