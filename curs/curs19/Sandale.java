package curs.curs19;

import java.util.Objects;

public class Sandale extends GenericPantofi implements Incaltaminte {

    @Override
    public boolean areToc(String culoare) {
        if (culoare.equals("rosu")) {
            return true;
        }
        return false;
    }

}
