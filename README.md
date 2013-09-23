# req-param

This web program get the url request params with clojure and ring.The web server is jetty.

## Usage

cd req-param

lein deps

lein run


## View

Now, you haved started the server.Visit http://localhost:3030 ,you will see 

[(:ssl-client-cert nil) (:remote-addr "127.0.0.1") (:scheme :http) (:request-method :get) (:query-string nil) (:content-type nil) (:uri "/") (:server-name "localhost") (:headers {"accept-encoding" "gzip,deflate,sdch", "cache-control" "max-age=0", "connection" "keep-alive", "user-agent" "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36", "accept-language" "zh-CN,zh;q=0.8", "accept" "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "host" "localhost:3000"}) (:content-length nil) (:server-port 3000) (:character-encoding nil) (:body #)]

## License

Copyright © 2013 LRQ
