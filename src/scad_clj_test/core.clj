(ns scad-clj-test.core
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(def primitives
  (union
    (cube 100 100 100)
    (sphere 70)
    (cylinder 10 250)))

(spit "out.scad" (write-scad primitives))
