(defproject re-simple "0.11.0"
  :dependencies [[org.clojure/clojure       "1.9.0"]
                 [org.clojure/clojurescript "1.10.339"]
                 [reagent                   "0.8.1"]
                 [re-frame                  "0.10.5"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel  "0.5.17-SNAPSHOT"]]

  :hooks [leiningen.cljsbuild]

  :figwheel {:repl true
             :css-dirs ["resources/public/css"]}

  :clean-targets ^{:protect false} ["resources/public/js" :target]

  :profiles
  {:dev {:dependencies [[figwheel-sidecar "0.5.17-SNAPSHOT"]
                        [cider/piggieback "0.3.6"]
                        [binaryage/devtools "0.9.10"]]}}
  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src"] ;; <--- Note classpath, REQUIRED
     :figwheel {:on-jsload "simple.core/run"
                :open-urls ["http://localhost:3449/index.html"]}
     :compiler {:main simple.core
                :output-to "resources/public/js/compiled/app.js"
                :output-dir "resources/public/js/compiled/out"
                :asset-path "js/compiled/out"
                :optimizations :none
                :source-map true
                :source-map-timestamp true
                :preloads [devtools.preload]
                :external-config {:devtools/config
                                  {:features-to-install :all}}}}]})
