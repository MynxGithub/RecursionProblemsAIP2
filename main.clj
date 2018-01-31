                           ;Example
 (defn factorial [x]
  (if (= x 1)
      1
      (* x (factorial (- x 1)))))

(factorial 5)

;1. Write a function that takes two lists as its args & returns the longest as its result. (hint: nothing too elaborate, this one does not need to be recursive, it is just to get you writing a function which contains an “if” form)

(def a '(1 2 3 4 5))

(def b '(2 3 4))

(defn length [lis]
  (if (empty? lis)
          0
          (inc (length (rest lis)))
  ))

(defn longest [lis1 lis2]
  (if (> (length lis1) (length lis2))
      lis1 lis2))
    
 (longest a b)
  
;2. Write a function which takes a list of numbers as its arg & returns the list with all numbers incremented, eg: (inc-list1 '(5 2 7 4 1)) => (6 3 8 5 2)  
  
  (defn inc-list [lis]
    (if (empty? lis)
        ()
        (cons (+ (first lis) 1)
              (inc-list (rest lis)))))
            
            (inc-list '(1 2 3))

; 3. Write a function which takes a mixed list (numbers and other items) & returns the     list with all numbers incremented, other items should be left as is. 
;     eg: (inc-list1 '(cat 4 dog 3 x 5)) => (cat 5 dog 4 x 6)
(defn inc-list1 [x]
  (if (empty? x)
      ()
      (if (instance? Long (first x))
          (cons (+ (first x) 1) (inc-list1 (rest x)))
          (cons (first x) (inc-list1 (rest x))))))
  
(inc-list1 '(1 2 3 4 "cat"))



