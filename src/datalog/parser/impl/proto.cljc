(ns datalog.parser.impl.proto)

#?(:clj (set! *warn-on-reflection* true))

(defprotocol ITraversable
  (-collect      [_ pred acc])
  (-collect-vars [_ acc])
  (-postwalk     [_ f]))

(def traversable? (partial satisfies? ITraversable))

(defprotocol IFindVars
  (-find-vars [this]))

(defprotocol IFindElements
  (find-elements [this]))
