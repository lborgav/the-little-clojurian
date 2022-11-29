(ns the-little-clojurian.chapter-2-test
  (:require [clojure.test :refer :all])
  (:require [the-little-clojurian.chapter-2 :refer :all]))

;; Chapter 2 - Do It, Do It Again, and Again...

(deftest lat?-test
  (testing "tests lat"
    (is (= false (lat? '(bacon (and eggs)))))
    (is (= true (lat? '(coffee tea or milk))))))


(deftest member?-test
  (testing "tests member"
    (is (= true (member? 'meat '(mashed potatoes and meat gravy))))))
