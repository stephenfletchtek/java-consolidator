package ten_min_walk;

import java.util.Objects;

public class TenMin {
    public Boolean tenMinuteWalk(String[] walk) {
        Integer north = 0;
        Integer south = 0;
        Integer east = 0;
        Integer west = 0;

        if (walk.length < 10) {
            return false;
        }

        for (String item : walk) {
            if (Objects.equals(item, "n")) {
                north ++;
            } else if (Objects.equals(item, "s")) {
                south ++;
            } else if (Objects.equals(item, "e")) {
                east ++;
            } else if (Objects.equals(item, "w")) {
                west ++;
            }
        }
        return (Objects.equals(north, south)) && (Objects.equals(east, west));
    }
}
