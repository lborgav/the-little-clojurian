(ns the-little-clojurian.core-test
  (:require [clojure.test :refer :all]
            [the-little-clojurian.core :refer :all]))


;; Chapter 1

(deftest atom-test
  (testing "tests if input is an atom"
    (is (true? (atom? 'atom)))
    (is (true? (atom? 'turkey)))
    (is (true? (atom? 1492)))
    (is (true? (atom? 'u)))
    (is (true? (atom? '*abc$)))))

(deftest s-expression-test
  (testing "tests if input is a s-expression"
    (is (true? (S-expression? 'xyz)))
    (is (true? (S-expression? '(x y z))))
    (is (true? (S-expression? '((x y) z))))))

(deftest car-test
  (testing "tests car"
    (is (= 'a (car '(a b c))))
    (is (= '(a b c) (car '((a b c) x y z))))
    (is (thrown? Exception (car 'hotdog)))
    ))

(deftest cdr-test
  (testing "tests cdr"
    (is (= '(x y z) (cdr '((a b c) x y z))))
    (is (= '() (cdr '(hamburger))))
    (is (= '(b c) (cdr '(a b c))))))

(deftest cons-test
  (testing "tests cons"
    (is (= '(peanut butter and jelly) (cons 'peanut '(butter and jelly))))
    (is (= '((a b (c))) (cons '(a b (c)) '())))
    (is (thrown? Exception (cons '((a b c)) 'b)))))

(deftest null-test
  (testing "tests null?"
    (is (= true (null? (quote ()))))
    (is (= false (null? '(a b c))))))