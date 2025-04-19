package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String body;
    private List<Tag> children;

    public PairedTag(String tagName,
                     Map<String,String> tagAttributes,
                     String body,
                     List<Tag> children) {
        super(tagName, tagAttributes);
        this.body = body;
        this.children = children;
    }

    private String childrenToString() {
        return children.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return String.format("<%s%s>%s%s</%s>",
                getTagName(),
                attributesToString(),
                body,
                childrenToString(),
                getTagName());
    }
}
// END
