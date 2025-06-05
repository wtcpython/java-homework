package cn.campsg.java.experiment;

import cn.campsg.java.experiment.impl.BigDataSeeker;
import cn.campsg.java.experiment.impl.SoftwareSeeker;

public class MainClass {
    public static void main(String[] args) {
        HrMarketer hrm = new HrMarketer();

        SoftwareSeeker soft1 = new SoftwareSeeker("张小龙", new float[] { 10.0f, 100.0f });

        SoftwareSeeker soft2 = new SoftwareSeeker("李小龙", new float[] { 80.0f, 100.0f });

        BigDataSeeker bdata1 = new BigDataSeeker("张彦宏", new float[] { 10.0f, 100.0f });

        BigDataSeeker bdata2 = new BigDataSeeker("李彦宏", new float[] { 80.0f, 100.0f });
        
        String res1 = hrm.seekJob(soft1);
        String res2 = hrm.seekJob(soft2);
        String res3 = hrm.seekJob(bdata1);
        String res4 = hrm.seekJob(bdata2);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
