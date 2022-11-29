(ns the-little-clojurian.chapter-3-test
  (:require [clojure.test :refer :all])
  (:require [the-little-clojurian.chapter-3 :refer :all]))

;; Chapter 3 - Const the Magnificent

(deftest rember-test
  (testing "tests rember"
    (let [a 'mint
          lat '(lamb chops and mint jelly)
          ]
      (is (= '(lamb chops and jelly) (rember a lat))))))