package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private TagInterface tag;
    private String type;

    public LabelTag(String type, TagInterface tag) {
        this.type = type;
        this.tag = tag;
    }

    @Override
    public String render() {
        return String.format("<label>%s%s</label>", type, tag.render());
    }
}
// END
