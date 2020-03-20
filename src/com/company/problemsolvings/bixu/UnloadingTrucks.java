package com.company.problemsolvings.bixu;

import java.text.SimpleDateFormat;
import java.util.*;

public class UnloadingTrucks {

    public static Boolean canUnloadAll(Collection<UnloadingTime> unloadingTimes) {
        Iterator<UnloadingTime> iterator = unloadingTimes.iterator();

        LinkedList<UnloadingTime> list = new LinkedList<>();

        while (iterator.hasNext()) {
            UnloadingTime unloadingTime = iterator.next();

            if (list.isEmpty()) {
                list.add(unloadingTime);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (unloadingTime.getStart().after(list.get(i).getEnd()) || unloadingTime.getEnd().before(list.get(i).getStart())) {
                        list.add(unloadingTime);
                    } else {
                        return false;
                    }
                }
            }
        }
        if (list.size() == unloadingTimes.size()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<UnloadingTime> unloadingTimes = new ArrayList<UnloadingTime>();
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 19:00"), sdf.parse("03/04/2019 20:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 22:10"), sdf.parse("03/04/2019 22:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 20:30"), sdf.parse("03/04/2019 22:00")));

        System.out.println(UnloadingTrucks.canUnloadAll(unloadingTimes));
    }
}

class UnloadingTime {
    private Date start, end;

    public UnloadingTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
