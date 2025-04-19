package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String tagName;
    private Map<String, String> tagAttributes;

    public Tag(String tagName, Map<String, String> tagAttributes) {
        this.tagName = tagName;
        this.tagAttributes = tagAttributes;
    }

    public String getTagName() {
        return tagName;
    }

    protected String attributesToString() {
        if (tagAttributes.isEmpty()) {
            return "";
        }
        return tagAttributes.entrySet()
                .stream()
                .map(entry -> {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    return String.format("%s=\"%s\"", key, value);
                })
                .collect(Collectors.joining(" ", " ", ""));
    }

    public abstract String toString();

}
// END
