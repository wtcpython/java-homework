package cn.campsg.java.experiment;

public class HrMarketer {
    public HrMarketer() {
    }
    
    public String seekJob(SeekJob seeker) {
        float average = seeker.getSeekerAverage();
        if (average >= SeekJob.SEEKER_AVERAGE_SCORE) {
            return seeker.getName() + "被本公司录用";
        } else {
            return seeker.getName() + "成绩未达标，不予录用";
        }
    }
}
