package org.ms1;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-11
 */
@RestController
public class Controller {

    @Autowired
    private FormattingConversionService formattingConversionService;

    @PostConstruct
    public void init(){
        formattingConversionService.addConverter(new StringToDateConvert());
        formattingConversionService.addConverter(new DateToStringConvert());
    }

    private class StringToDateConvert implements Converter<String,Date>{

        @Override
        public Date convert(String source) {
            if (source.length()==10) {
                return  DateUtils.parseYMd(source);
            }
            return DateUtils.parseYMdHms(source);
        }
    }

    private class DateToStringConvert implements Converter<Date,String>{

        @Override
        public String convert(Date source) {
            return DateUtils.formatYMd(source);
        }
    }

    @Autowired
    private MeterRegistry meterRegistry;


    @RequestMapping("/test/date")
    @Timed("请求时间")
    public Object test1(Date date){
        meterRegistry.timer("test-date").record(()->{
            try {
                TimeUnit.SECONDS.sleep(2L);
            }catch (Exception e){
                System.out.println("错误");
            }
        });
        return date;
    }
}
