package main

import (
  "fmt"
  "strings"
  "net/http"
  "io/ioutil"
)

func main() {

  url := "https://<resource-server-ip>/resource-server/pscdcl/v1/count"
  method := "POST"

  payload := strings.NewReader("{\n	\"id\": \"rbccps.org/aa9d66a000d94a78895de8d4c0b3a67f3450e531/pune-resource-server/changebhai/crowd-sourced-images\",\n	\"time\": \"2019-11-06T12:33:28.000+05:30\",\n	\"TRelation\": \"TEquals\"\n}")

  client := &http.Client {
  }
  req, err := http.NewRequest(method, url, payload)

  if err != nil {
    fmt.Println(err)
  }
  req.Header.Add("Content-Type", "application/json")

  res, err := client.Do(req)
  defer res.Body.Close()
  body, err := ioutil.ReadAll(res.Body)

  fmt.Println(string(body))
}
