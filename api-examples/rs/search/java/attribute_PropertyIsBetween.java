OkHttpClient client = new OkHttpClient();

MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n\t\"id\" : \"rbccps.org/aa9d66a000d94a78895de8d4c0b3a67f3450e531/pscdcl/aqm-bosch-climo/Ambedkar society circle_29\",\n\t\"attribute-name\" : \"LIGHT\",\n\t\"attribute-value\": \"300,2200\",\n\t\"comparison-operator\": \"propertyisbetween\",\n\t\"options\":\"latest\"\n}");
Request request = new Request.Builder()
  .url("https://pune.iudx.org.in/resource-server/pscdcl/v1/search")
  .post(body)
  .addHeader("Content-Type", "application/json")
  .build();

Response response = client.newCall(request).execute();