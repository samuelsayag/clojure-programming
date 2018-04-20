; defining a value
(def toto 555)

; defining a function
(defn func1
  "this is a pure and util funtion !"
  [x y]
  (+ x y))

(defn func2
  "this function take one or two parameter"
  ([x]
    (+ x))
  ([x y]
   (+ x y)))

; this one is an anonymous function

(map (fn [name] (str "Hi, " name)) ["Darth Vader" "Winnie the Poo"])
(map #(str "Hi, " %) ["Darth Vader" "Winnie the Poo"])
   

