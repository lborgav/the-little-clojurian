(ns the-little-clojurian.chapter-3
  (:require [the-little-clojurian.chapter-1 :refer :all]))

;; Chapter 3 - Const the Magnificent

(defn rember
  "Remove a member from list"
  [a lat]
  (cond
    (null? lat) '()
    :else (cond
            (eq? (car lat) a) (cdr lat)
            :else (cons (car lat) (rember a (cdr lat))))))