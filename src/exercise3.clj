(ns exercise3)

(defn fibonaci [x]
	(if (= x 0)
	    0
	    (if (= x 1)
	      1 
	      (+ (fibonaci (- x 2)) (fibonaci (- x 1)))
	    )
	    
	)
)
