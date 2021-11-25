package cs2030.simulator;

import java.util.Comparator;

public class ServerComparator implements Comparator<Server> {
    
    @Override
    public int compare(Server s1, Server s2) {

        if (s1.inQueue() > s2.inQueue()) {
            return 1;
        } else if (s1.inQueue() < s2.inQueue()) {
            return -1;
        } else {
            if (s1.getId() > s2.getId()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

