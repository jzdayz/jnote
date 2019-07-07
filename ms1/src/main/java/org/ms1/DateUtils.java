package org.ms1;

import org.springframework.util.Assert;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

/**
 * @author huqingfeng 1397649957@qq.com
 * @since 1.0.0
 */
@SuppressWarnings("Duplicates")
public class DateUtils {

    private static final ZoneId SYS_ZONEID;

    private static final String ERR_FORMAT = "参数date不能为空，格式化失败";

    private static final DateTimeFormatter FORMATTER_yyyyMMddHHmmss;

    static {
        SYS_ZONEID = ZoneId.systemDefault();
        FORMATTER_yyyyMMddHHmmss = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    private static ZonedDateTime getZonedDateTime(Date date) throws DateTimeParseException {
        return date.toInstant().atZone(ZoneId.systemDefault());
    }

    /**
     * Date->String( rule: yyyy-MM-dd )
     *
     * @param date
     * @return example { 2018-10-25 }
     */
    public static String formatYMd(Date date) throws DateTimeParseException {
        return getZonedDateTime(Objects.requireNonNull(date, ERR_FORMAT)).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /**
     * 自定义 formatter 格式化
     */
    public static Date parseYMd(String textDate, DateTimeFormatter formatter) throws DateTimeParseException {
        Assert.isTrue(textDate.length() == 10, " The format string must match { yyyy-MM-dd } ");
        return Date.from(LocalDate.parse(
                textDate, formatter).atStartOfDay(SYS_ZONEID).toInstant());
    }

    /**
     * Date->String   format rule{ yyyy-MM-dd HH:mm:ss }
     *
     * @param date
     * @return
     */
    public static String formatYMdHms(Date date) throws DateTimeParseException {
        return getZonedDateTime(Objects.requireNonNull(date, ERR_FORMAT)).format(FORMATTER_yyyyMMddHHmmss);
    }

    /**
     * String->Date   format rule{ yyyy-MM-dd }
     *
     * @param textDate
     * @return
     */
    public static Date parseYMd(String textDate) throws DateTimeParseException {
        Assert.isTrue(textDate.length() == 10, " The format string must match { yyyy-MM-dd } ");
        return Date.from(LocalDate.parse(
                textDate, DateTimeFormatter.ISO_LOCAL_DATE).atStartOfDay(SYS_ZONEID).toInstant());
    }

    /**
     * String->Date   format rule{ yyyy-MM-dd HH:mm:ss }
     *
     * @param textDate
     * @return
     */
    public static Date parseYMdHms(String textDate) throws DateTimeParseException {
        Assert.isTrue(textDate.length() == 19, " The format string must match { yyyy-MM-dd HH:mm:ss } ");
        return Date.from(LocalDateTime.parse(
                textDate, FORMATTER_yyyyMMddHHmmss).atZone(SYS_ZONEID).toInstant());
    }

    /**
     * add or lower days
     * 增加或者减少对应日期的天数，如果{@param period}为负数，那么就减少日期
     *
     * @param date
     * @param period 增加或减少的天数
     * @return updated date 修改后的日期
     */
    public static Date getDateByPeriod(Date date, int period) throws DateTimeParseException {
        return Date.from(LocalDateTime.ofInstant(
                Objects.requireNonNull(date, ERR_FORMAT).toInstant(), SYS_ZONEID)
                .plusDays(period).atZone(SYS_ZONEID).toInstant());
    }

    /**
     * 获取指定日期的开始时间 2018-02-02 12:12:12 -> 2018-02-02 00:00:00
     * get begin datetime of the specify date
     *
     * @param date specify date
     * @return updated date
     */
    public static Date getStartTimeOfDate(Date date) throws DateTimeParseException {
        return Date.from(LocalDateTime.ofInstant(
                Objects.requireNonNull(date, ERR_FORMAT).toInstant(),
                SYS_ZONEID).toLocalDate().atStartOfDay(SYS_ZONEID).toInstant());
    }

    /**
     * 获取指定日期的结束时间 2018-02-02 12:12:12 -> 2018-02-02 23:59:59
     * get end datetime of the specify date
     *
     * @param date
     * @return updated date
     */
    public static Date getEndTimeOfDate(Date date) throws DateTimeParseException {
        return Date.from(LocalDateTime.ofInstant(
                Objects.requireNonNull(date, ERR_FORMAT).toInstant(), SYS_ZONEID)
                .plusDays(1L).toLocalDate().atStartOfDay().minusSeconds(1L).atZone(SYS_ZONEID).toInstant());
    }

    /**
     * 获取指定日期一年前的时间  2018-02-02 12:12:12 -> 2017-02-02 12:12:12
     * get pre year datetime of the specify date
     *
     * @param date
     * @return updated date
     */
    public static Date getPreYearDate(Date date) throws DateTimeParseException {
        return Date.from(LocalDateTime.ofInstant(
                Objects.requireNonNull(date, ERR_FORMAT).toInstant(),
                SYS_ZONEID).minusYears(1L).atZone(SYS_ZONEID).toInstant());
    }

    /**
     * 获取指定开始和结束时间间隔日期的集合
     * example :
     * splitDate(@begin "2018-02-02 12:12:12",@end "2018-02-03 11:11:11") -> {@list "2018-02-02 00:00:00","2018-02-03 00:00:00"}
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return 集合 may be null
     */
    public static List<Date> splitDate(Date begin, Date end) {
        return getDates(begin, end, DateType.UTILDATE, Date.class);
    }

    public static Date now() {
        return new Date();
    }

    public static List<java.sql.Date> splitSqlDate(Date begin, Date end) {
        return getDates(begin, end, DateType.SQLDATE, java.sql.Date.class);
    }

    private static <T> List<T> getDates(Date begin, Date end, DateType type, Class<T> dateCla) {
        Objects.requireNonNull(begin, "开始时间不能为空");
        Objects.requireNonNull(end, "结束时间不能为空");
        List<T> result;
        long days = Duration.between(begin.toInstant(), end.toInstant()).toDays();
        if (days < 0) return Collections.emptyList();
        if (days == 0) {
            T b = (T) Date.from(LocalDateTime.ofInstant(begin.toInstant(), SYS_ZONEID).toLocalDate().atStartOfDay(SYS_ZONEID).toInstant());
            T e = (T) Date.from(LocalDateTime.ofInstant(end.toInstant(), SYS_ZONEID).toLocalDate().atStartOfDay(SYS_ZONEID).toInstant());
            if (Objects.equals(b, e)) {
                return Collections.singletonList(b);
            }
        }
        result = new ArrayList<>(((int) days) + 1);
        LocalDate beginLocalDate = LocalDateTime.ofInstant(begin.toInstant(), SYS_ZONEID).toLocalDate();
        result.add((T) Date.from(beginLocalDate.atStartOfDay(SYS_ZONEID).toInstant()));
        for (int i = 0; i < days; i++) {
            if (Objects.equals(type, DateType.UTILDATE)) {
                result.add((T) Date.from(beginLocalDate.plusDays((long) i + 1).atStartOfDay(SYS_ZONEID).toInstant()));
                continue;
            }
            result.add((T) java.sql.Date.from(beginLocalDate.plusDays((long) i + 1).atStartOfDay(SYS_ZONEID).toInstant()));
        }
        return result;
    }

    @Deprecated
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
//        List<Date> dates = splitDate(new Date(), new Date(l + 2 * (24 * 60 * 60 * 1000)));
//        System.out.println(System.currentTimeMillis()-l);
//        boolean falg=isEffectiveDate(new Date(), DateUtils.parseYMd("2019-04-09"), DateUtils.parseYMd("2019-04-11"));
//        System.out.println(falg);
    }

    private enum DateType {
        SQLDATE, UTILDATE
    }

    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     *
     * @param nowTime   当前时间
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     * @author
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {

        if (nowTime.after(startTime) && nowTime.before(endTime)) {
            return true;
        } else {
            return false;
        }
    }

}
