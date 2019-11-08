OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://<catalogue-server-ip>/catalogue/v1/search?attribute-name=(tags)&attribute-value=((traffic))")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
