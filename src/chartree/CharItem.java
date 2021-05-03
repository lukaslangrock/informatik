package chartree;

import lib.ComparableContent;

public class CharItem implements ComparableContent<CharItem>{
    private Character content;
    private int count;

    public CharItem(char pContent) {
        content = pContent;
        count = 1;
    }

    public void incrementCount() {
        count++;
    }

    public Character getContent() {
        return content;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean isGreater(CharItem pCharItem) {
        return (this.getContent().compareTo(pCharItem.getContent()) > 0);
    }

    @Override
    public boolean isLess(CharItem pCharItem) {
        return (this.getContent().compareTo(pCharItem.getContent()) < 0);
    }

    @Override
    public boolean isEqual(CharItem pCharItem) {
        return (this.getContent().compareTo(pCharItem.getContent()) == 0);
    }
}
