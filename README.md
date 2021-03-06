# datalog-parser <a href="https://clojars.org/io.lambdaforge/datalog-parser"> <img src="https://img.shields.io/clojars/v/io.lambdaforge/datalog-parser.svg" /></a>

A Datalog parser. This parser is used by [Datahike](https://github.com/replikativ/datahike) and follows the Datalog dialect of [Datomic](https://www.datomic.com/).

## Usage
Add the current release of `io.lambdaforge/datalog-parser` to your `project.clj`. Start a repl and run:

```Clojure
(require '[datalog.parser :as parser])

(parser/parse '[:find ?x :in $ ?y :where [?x :z ?y]])

;;=> (namespaces omitted for brevity)
;; #Query{:qfind  #FindRel{:elements [#Variable{:symbol ?x}]}
;;        :qwith  nil
;;        :qin    [#BindScalar{:variable #SrcVar{:symbol $}}
;;                 #BindScalar{:variable #Variable{:symbol ?y}}]
;;        :qwhere [#Pattern{:source #DefaultSrc{}
;;                          :pattern [#Variable{:symbol ?x}
;;                                    #Constant{:value  :z}
;;                                    #Variable{:symbol ?y}]}]}
```

For more examples look at the [tests](test/datalog/parser_test.cljc).

## TODO

## 0.2.0

Unparsing support, missing types:

- PullSpec
- PullAttrName
- PullReverseAttrName
- PullLimitExpr
- PullDefaultExpr
- PullWildcard
- PullRecursionLimit
- PullMapSpecEntry
- PullAttrWithOpts


## License

Copyright © 2020 lambdaforge UG (haftungsbeschränkt), Nikita Prokopov

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 1.0.
