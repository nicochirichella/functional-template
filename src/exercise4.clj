(ns exercise4)

(defn summary [x]
	(if (not(empty? x))
	  (+ (first x) (summary (rest x)))   
	  0   
	)
)
