(ns req-param.core
    (:use ring.adapter.jetty))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str (vec (partition 2 (interleave (keys request) (vals request)))) )})
 

(defn -main []
  (run-jetty #'handler {:port 3000}))
