(defn greeting []
  (println (str "What's your name? "))
  (def name (read-line))
  (println (str "Hello, " name "! Nice to meet you!")))

(greeting)