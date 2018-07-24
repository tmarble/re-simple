# re-simple

simple re-frame example configured for CIDER and figwheel

## Background

The goal of this project is to demonstrate configuring the
[simple](https://github.com/Day8/re-frame/tree/master/examples/simple)
re-frame example with [CIDER](http://docs.cider.mx/en/latest/clojurescript/#using-figwheel-leiningen-only)
using [Figwheel](https://github.com/bhauman/lein-figwheel)
as the `cider-default-cljs-repl` and launch a
[dual-REPL](http://docs.cider.mx/en/latest/clojurescript/#starting-a-clojurescript-repl)
with `cider-jack-in-clj&cljs`.

_NOTES_
* This project is intentionally using the deprecated `figwheel` REPL rather than the new `figwheel-main` REPL.
* The `.dir-locals.el` setting is not quite working correctly (`cider-default-cljs-repl` must be set to `Figwheel` in customize)
  * see also [Directory Variables](https://www.gnu.org/software/emacs/manual/html_node/emacs/Directory-Variables.html) and [Directory Local Variables](https://www.gnu.org/software/emacs/manual/html_node/elisp/Directory-Local-Variables.html)
* Perhaps once `.dir-locals.el` it will be possible to require and eval a specific CLJ function (?)

## Usage


## License

Copyright (c) 2018 Tom Marble

Licensed under teh [MIT](https://opensource.org/licenses/MIT) [LICENSE](LICENSE)
