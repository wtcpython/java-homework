package cn.campsg.java.experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.campsg.java.experiment.entity.Builder;
import cn.campsg.java.experiment.entity.OfficeBuilder;
import cn.campsg.java.experiment.entity.VillaBuilder;

public class MainClass {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Builder office = new OfficeBuilder();
        Builder villa = new VillaBuilder();

        Date oDate = null;
        Date vDate = null;

        try {
            oDate = sdf.parse("2016-10-11");
            vDate = sdf.parse("2016-10-16");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        office.construct(oDate);
        villa.construct(vDate);
    }
}
