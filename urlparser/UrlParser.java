package urlparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {
    private String path;
    private String protocol;
    private String host;
    private String url;

    public UrlParser(String path) {
        Pattern pattern = Pattern.compile("(https?)://([^/]+)/(.+)");
        Matcher matcher = pattern.matcher(path);
        if (matcher.find()) {
            protocol = matcher.group(1);
            host = matcher.group(2);
            url = matcher.group(3);
        } else {
            throw new IllegalArgumentException("Url is not valid");
        }
    }
    public String getProtocol() {
        return protocol;
    }
    public String getHost() {
        return host;
    }
    public String getUrl() {
        return url;
    }
}
