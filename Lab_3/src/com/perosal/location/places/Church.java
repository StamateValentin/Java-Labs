package com.perosal.location.places;

import com.perosal.location.Location;
import com.perosal.location.places.types.Visitable;
import java.util.Calendar;

public class Church extends Location implements Visitable {
    private Calendar openStart;
    private Calendar openEnd;

    public Church(String name, Calendar openStart, Calendar openEnd) {
        super(name, LocationType.CHURCH);
        this.setOpeningHours(openStart, openEnd);
    }

    public Church(String name) {
        super(name, LocationType.CHURCH);
        openStart = Calendar.getInstance();
        openEnd = Calendar.getInstance();
        setDefaultHours(openStart, openEnd);
    }

    @Override
    public void setOpeningHours(Calendar openStart, Calendar openEnd) {
        this.openStart = openStart;
        this.openEnd = openEnd;
    }

    @Override
    public String getOpeningHours() {
        return "The church " + getName() + " is opened between: "
                + openStart.get(Calendar.HOUR) + ":" + openStart.get(Calendar.MINUTE)
                + " and "
                + openEnd.get(Calendar.HOUR) + ":" + openEnd.get(Calendar.MINUTE);
    }


}
