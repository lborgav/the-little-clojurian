(ns the-little-clojurian.core
  (:gen-class))


;; Chapter 1

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
  (and
    (list? x)
    (= '() x)))

(defn eq?
  "eq?"
  [x y]
  (= x y))

;; Chapter 2

(defn lat?
  "Return true if x is a list of atoms"
  [x]
  (cond
    (null? x) true
    (atom? (car x)) (lat? (cdr x))
    :else false))


(defn member?
  "Return true if a is a member of list l"
  [a lat]
  (cond
    (null? lat) true
    :else (or (eq? (car lat) a)
              (member? a (cdr lat)))))
