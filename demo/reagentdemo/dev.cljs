(ns reagentdemo.dev
  "Initializes the demo app, and runs the tests."
  (:require [reagentdemo.core :as core]
            [reagenttest.runtests :as tests]))

(enable-console-print!)

(defn init! []
  (core/init! (tests/init!)))

(init!)
