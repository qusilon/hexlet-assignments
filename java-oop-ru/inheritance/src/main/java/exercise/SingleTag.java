package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> TagAttributes) {
        super(tagName, TagAttributes);
    }


    @Override
    public String toString() {
        return String.format("<%s%s>", getTagName(), attributesToString() );
    }
}
// END
