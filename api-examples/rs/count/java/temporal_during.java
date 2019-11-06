OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n\t\"id\": \"rbccps.org/aa9d66a000d94a78895de8d4c0b3a67f3450e531/pudx-resource-server/aqm-bosch-climo/ABC Farm House Junction_4\",\n\t\"time\": \"2019-07-27T00:00:00.000Z/2019-07-28T00:00:00.000Z\",\n\t\"TRelation\": \"during\"\n}");
Request request = new Request.Builder()
  .url("https://(resource-server:ip)/resource-server/pscdcl/v1/count")
  .method("POST", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();
