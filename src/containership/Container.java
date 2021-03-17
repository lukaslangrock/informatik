package containership;

import jdk.jfr.ContentType;

public class Container {
    ContentType content; // content in container
    int amount; // amount of content container (optional)
    int priority; // high priority means the container will be removed (offboarded) from the ship
                  // before ones with lower priorities.

    public Container(final ContentType pContent, final int pAmount, final int pPriority) {
        content = pContent;
        amount = pAmount;
        priority = pPriority;
    }

    public Container(final ContentType pContent, final int pPriority) {
        content = pContent;
        priority = pPriority;
    }

    public ContentType getContentType() {
        return content;
    }

    public int getAmount() {
        try {
            return amount;
        } catch (Exception ex) {
            return 1;
        }
    }

    public int getPriority() {
        return priority;
    }
}
