;; .dir-locals.el

;; modify the list of known REPLs and set some default
((nil
  (eval . (cider-register-cljs-repl-type 'super-cljs "(do (require 'figwheel-sidecar.repl-api) (figwheel-sidecar.repl-api/start-figwheel!) (figwheel-sidecar.repl-api/cljs-repl) (require 'simple.server) (simple.server/foo))"))
  (cider-default-cljs-repl . super-cljs)))
