package utils;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        System.out.println("时间格式化，SpringMVC转换器");
        Date parse = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        try {
            parse = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return parse;
    }
}
