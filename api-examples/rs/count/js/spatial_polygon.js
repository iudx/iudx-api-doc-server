var settings = {
  "url": "https://<resource-server-ip>/resource-server/pscdcl/v1/count",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": "{\n\t\"id\": \"rbccps.org/aa9d66a000d94a78895de8d4c0b3a67f3450e531/pudx-resource-server/changebhai/crowd-sourced-images\",\n\t\"geometry\":\"polygon((18.0,72.0),(20.2,75.3),(23.6,69.1),(23.6,65.5),(19.7,65.5),(18.0,72.0))\"\n}",
};

$.ajax(settings).done(function (response) {
  console.log(response);
});
