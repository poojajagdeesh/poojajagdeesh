public static String getSearchContent(String googleSearchQuery) throws Exception {
    //URL encode string in JAVA to use with google search
    System.out.println("Searching for: " + googleSearchQuery);
    googleSearchQuery = googleSearchQuery.trim();
    googleSearchQuery = URLEncoder
        .encode(googleSearchQuery, StandardCharsets.UTF_8.toString());
    String queryUrl = "https://www.google.com/search?q=" + googleSearchQuery + "&num=10";
    System.out.println(queryUrl);
    final String agent = "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)";
    URL url = new URL(queryUrl);
    final URLConnection connection = url.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    return getString(stream);
  }