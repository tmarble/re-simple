;; .dir-locals.el

((nil
  (cider-default-cljs-repl . figwheel+re-simple)
  (eval . (cider-register-cljs-repl-type
            'figwheel+re-simple
            "(do (require 'figwheel-sidecar.repl-api) (figwheel-sidecar.repl-api/start-figwheel!) (figwheel-sidecar.repl-api/cljs-repl) (require 'simple.server) (simple.server/foo))"
            'cider-check-figwheel-requirements))))
