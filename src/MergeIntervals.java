import util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1){
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });
        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval : intervals){
            if (interval.start <= end){
                end = Math.max(end, interval.end);
            }else {
                res.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervals = new ArrayList<>();
        Interval i1 = new Interval();
        Interval i2 = new Interval();
        Interval i3 = new Interval();
        Interval i4 = new Interval();
        i1.start = 1;
        i1.end = 3;
        i2.start = 2;
        i2.end = 6;
        i3.start = 8;
        i3.end = 10;
        i4.start = 15;
        i4.end = 18;
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        mergeIntervals.merge(intervals);
    }
}


