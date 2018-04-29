; use of str
(str "hello " "my " "name " "is Samuel")

; use of vector
(vector  1 2 3 4 5 6) ; vector of the numbers 1 to 6
(vector) ; empty vectory

; use of list
(list) ; empty list
(list 1 2 3 4 5 6 7 8 9) ; list of the number from 1 to 9

; use of hash-map
(def my-map (hash-map 1 "toto" :my-sym 555 "oups" :something))

; use of hash-set function
(def my-set (hash-set 1 "toto" "toto" :my-sym :my-sym 555 598.40983 451/713))

; write a function that takes a number and add 100 to it
(defn add100
"write a function that takes a number and add 100 to it"
  [num]
  (+ num 100))

(defn dec-maker
  "write a function that take a number \"num\" in parameter and return
  a function that decrement any number \"n\" by num"
  [num]
  #(- % num))

(defn mapset
  "take a function as parameter and a sequence and create a set  by applying 
  the function f to all the element"
 [f xs]
  (loop [remain xs
         acc (hash-set)]
    (if (empty? remain)
      acc
      (let [[x & rest] remain]
        (recur rest (into acc #{(f x)}))))))
 
(defn mapset2
  "take a function as parameter and a sequence and create a set  by applying 
  the function f to all the element"
 [f xs]
  (loop [remain xs
         acc (hash-set)]
    (if (empty? remain)
      acc
      (recur (rest remain)  (into acc #{(f (first remain))})))))

