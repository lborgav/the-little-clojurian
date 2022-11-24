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

(def car first)

(def cdr rest)

(defn null?
  "Return true if x is a null list"
  [x]
  (and
    (list? x)
    (= '() x)))