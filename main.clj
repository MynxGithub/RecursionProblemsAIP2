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

;; 4
;; (brack-lis '(blob))
(defn brack-lis [x]
      (if (empty? x)
        ()
        (cons (list (first x)) (brack-lis(rest x)))))

;; first it checks if its empty
;; (first x) puts the first thing out of x into a new list
;; cons is combining that with the rest of the list

;; 5
;; (fac-list '(2 3 4))
(defn fac-list [x]
      (if (empty? x)
        ()
        (cons (fac-list2 (first x)) (fac-list (rest x)))))

(defn fac-list2 [y]
      (if (zero? y)
        1
        (* y (fac-list2(dec y)))))


;; 7
(defn delete-item [target, list1]
      (if (empty? list1)
        ()
        (if (= target (first list1))
          (delete-item target (rest list1))
          (cons (first list1) (delete-item target (rest list1)))
          )))





































