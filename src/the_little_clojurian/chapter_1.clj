(ns the-little-clojurian.chapter-1
  (:gen-class))

;; Chapter 1 - Toys

(defn atom?
  "Return true if x is an atom (Scheme)"
  [x]
  (or
    (symbol? x)
    (number? x)))

(defn S-expression?
  "Return true if x is a S-expression"
  [x]
  (or
    (atom? x)
    (list? x)))

(def car
  "We're creating a car function that is identical to first"
  first)

(def cdr
  "We're creating a cdr function that is identical to rest"
  rest)

(defn null?
  "Return true if x is a null list"
  [x]
  (cond
    (atom? x) (throw "Type error")
    :else (and
            (list? x)
            (= '() x))))

(defn eq?
  "eq?"
  [x y]
  (= x y))
