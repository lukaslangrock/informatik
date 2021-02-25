package Containership;

import java.util.Stack;
import java.util.ArrayList;

public class Containership {
    private final int height;
    private final ArrayList<Stack<Container>> containers;

    public Containership(final int pHeight, final int pRows) {
        height = pHeight;
        containers = new ArrayList<Stack<Container>>();
        for (int i = 0; i < pRows; i++) {
            containers.add(new Stack<Container>());
        }
    }

    /**
     * Checks if any container stacks contain any items.
     * 
     * @return true: no items found, false: at least one item in at least one
     *         container stack
     */
    public boolean isEmpty() {
        for (final Stack<Container> c : containers) {
            if (!c.isEmpty()) {
                return false; // return false and exit if any container is not empty
            }
        }

        return true; // return true if none of the containers are empty
    }

    /**
     * 
     * @param pContainer Container to onboard onto the ship.
     * @return Container onbaording status/result. true: onboarded; false: not
     *         onboarded;
     */
    public boolean onboardContainer(final Container pContainer) {
        int bestContainerStackIndex = 0; // set bestContainerStackIndex to index first stack in ArrayList.

        for (int i = 0; i < containers.size(); i++) {
            if (containers.get(i).size() < containers.get(bestContainerStackIndex).size()) {
                bestContainerStackIndex = i;
            }
        }

        // check if best container stack still has room
        if (containers.get(bestContainerStackIndex).size() < height) {
            containers.get(bestContainerStackIndex).push(pContainer); // onboard container
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the first container from a given container row.
     * 
     * @param safeMode Remove contaainer from conatinership or leave it there.
     */
    public Container getFirstContainerFromRow(final int rowIndex, final boolean safeMode) {
        if (safeMode) {
            return containers.get(rowIndex).peek();
        } else {
            return containers.get(rowIndex).pop();
        }
    }

    /**
     * Gets all containers from the entire ship.
     * 
     * @param safeMode Remove contaainer from conatinership or leave it there.
     * @return All containers from containership
     */
    public Container[] getAllContainers(final boolean safeMode) {
        final ArrayList<Container> wantedContainers = new ArrayList<Container>();
        for (final Stack<Container> c : containers) {
            final Stack<Container> temp = new Stack<Container>();

            // loop though entire container stack and move items to temp stack
            while (!c.isEmpty()) {
                wantedContainers.add(c.peek()); // add to ouptut
                temp.push(c.pop()); // move to temp stack
            }
            // then move all items from temp stack back to conatiner stack
            if (safeMode) {
                while (!temp.isEmpty()) {
                    c.push(temp.pop());
                }
            }
        }

        return (Container[]) wantedContainers.toArray(); // return array created from arraylist
    }

    /**
     * Gets all items on top of the containership with target priority. Does not
     * search for containers with target priority if the container on top of stack
     * has a different priority than target priority.
     * 
     * @param priority Target priority
     * @param safeMode Remove contaainer from conatinership or leave it there.
     * @return All containers with target priority
     */
    public Container[] getAllContainersWithPriority(final int priority, final boolean safeMode) {
        final ArrayList<Container> wantedContainers = new ArrayList<Container>();
        for (final Stack<Container> c : containers) {
            final Stack<Container> temp = new Stack<Container>();

            // loop though entire container stack as long as items on top have target
            // priority and move items to temp stack
            while (c.peek().getPriority() == priority) {
                wantedContainers.add(c.peek()); // add to ouptut
                temp.push(c.pop()); // move to temp stack
            }
            // then move all items from temp stack back to conatiner stack
            if (safeMode) {
                while (!temp.isEmpty()) {
                    c.push(temp.pop());
                }
            }
        }

        return (Container[]) wantedContainers.toArray(); // return array created from arraylist
    }

    /**
     * Purges all containers from the ship.
     */
    public void purgeContainers() {
        for (final Stack<Container> c : containers) {
            while (!c.isEmpty()) {
                c.pop();
            }
        }
    }

    /**
     * @return count of container rows in containership
     */
    public int getContainerRows() {
        return containers.size();
    }

    /**
     * @return height of containership
     */
    public int getHeight() {
        return height;
    }
}
