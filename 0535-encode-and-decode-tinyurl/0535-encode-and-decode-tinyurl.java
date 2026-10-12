public class Codec {

    private Map<Integer, String> urlMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        while(urlMap.containsKey(key) && !urlMap.get(key).equals(longUrl)){
            key++;
        }

        urlMap.put(key, longUrl);
        return "http://tinyurl.com/" + key;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace("http://tinyurl.com/",""));
        return urlMap.get(key);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));