package urlparser;

public class Main {
    public static void main(String[] args) {
        String path = "https://vk.com/profile/alex";
        try {
            UrlParser urlParser = new UrlParser(path);
            System.out.println(urlParser.getProtocol());
            System.out.println(urlParser.getHost());
            System.out.println(urlParser.getUrl());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
