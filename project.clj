(defproject project1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.3"]
                 [org.postgresql/postgresql "9.2-1003-jdbc4"]
                 [korma "0.3.0-RC6"]
                 [ring "1.2.0"]]
  :plugins [[lein-ring "0.8.7"]
            [lein-cljsbuild "1.0.3"]]
  :ring {:handler project1.core/full-handler
         :init    project1.core/on-init
         :destroy project1.core/on-destroy}
  :cljsbuild {:builds [{:source-paths ["cljs"]
                        :compiler {:output-to "resources/public/app.js"}}]})
