var settings = {
  "url": "https://<catalogue-server-ip>/catalogue/v1/search?geometry=polygon((18.4,73.9,21.6,78.9,27.1,80,30,75.25,25.7,74.7,18.4,73.9))&relation=within",
  "method": "GET",
  "timeout": 0,
};

$.ajax(settings).done(function (response) {
  console.log(response);
});
