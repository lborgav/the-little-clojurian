(ns the-little-clojurian.chapter-2
  (:gen-class)
  (:require [the-little-clojurian.chapter-1 :refer :all]))

;; Chapter 2 - Do It, Do It Again, and Again...

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
