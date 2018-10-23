(defproject project1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                [ring "1.2.0"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler project1.core/route-handler
         :init    project1.core/on-init
         :destroy project1.core/on-destroy})
