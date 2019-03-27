package com.example.jnote;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
    @Test
    public void test() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        final A a = new A();
        a.setDate(new Date());
        a.setName("111");
        final String s = objectMapper.writeValueAsString(a);
        System.out.println(s);

    }

    private static class A{
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date date;
        private String name;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void  test2(){
        final Date truncate = DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
        System.out.println(truncate);
    }

    @Test
    public void test3(){
        String tmpo = "update pes_cs_chat_session_2019_03\n" +
                "    set sid = #{sid,jdbcType=VARCHAR},\n" +
                "      shop_id = #{shopId,jdbcType=BIGINT},\n" +
                "      date = #{date,jdbcType=DATE},\n" +
                "      cs_nick = #{csNick,jdbcType=VARCHAR},\n" +
                "      customer = #{customer,jdbcType=VARCHAR},\n" +
                "      session_begin_time = #{sessionBeginTime,jdbcType=TIMESTAMP},\n" +
                "      session_end_time = #{sessionEndTime,jdbcType=TIMESTAMP},\n" +
                "      begin_datetime = #{beginDatetime,jdbcType=TIMESTAMP},\n" +
                "      end_datetime = #{endDatetime,jdbcType=TIMESTAMP},\n" +
                "      reply_datetime = #{replyDatetime,jdbcType=TIMESTAMP},\n" +
                "      session_type = #{sessionType,jdbcType=BIT},\n" +
                "      is_transfer = #{isTransfer,jdbcType=BIT},\n" +
                "      is_non_reply = #{isNonReply,jdbcType=BIT},\n" +
                "      is_slow_resp = #{isSlowResp,jdbcType=BIT},\n" +
                "      is_long_receive = #{isLongReceive,jdbcType=BIT},\n" +
                "      send_eval_num = #{sendEvalNum,jdbcType=INTEGER},\n" +
                "      eval_num = #{evalNum,jdbcType=INTEGER},\n" +
                "      eval_code = #{evalCode,jdbcType=INTEGER},\n" +
                "      satisfied_eval_num = #{satisfiedEvalNum,jdbcType=INTEGER},\n" +
                "      is_consult = #{isConsult,jdbcType=BIT},\n" +
                "      is_receive = #{isReceive,jdbcType=BIT},\n" +
                "      is_assign = #{isAssign,jdbcType=BIT},\n" +
                "      session_duration_time = #{sessionDurationTime,jdbcType=DOUBLE},\n" +
                "      session_receive_duration_time = #{sessionReceiveDurationTime,jdbcType=DOUBLE},\n" +
                "      avg_resp_time_first = #{avgRespTimeFirst,jdbcType=DOUBLE},\n" +
                "      avg_resp_time = #{avgRespTime,jdbcType=DOUBLE},\n" +
                "      cs_chat_num = #{csChatNum,jdbcType=INTEGER},\n" +
                "      cust_chat_num = #{custChatNum,jdbcType=INTEGER},\n" +
                "      receive_start_type = #{receiveStartType,jdbcType=BIT},\n" +
                "      forward_type = #{forwardType,jdbcType=BIT}\n" +
                "    where id = #{id,jdbcType=BIGINT}";
        StringBuilder sb = new StringBuilder(tmpo);
        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '#' && i+1<sb.length() && sb.charAt(i+1) == '{'){
                sb.insert(i+2,"record.");
            }

        }
        System.out.println(sb);
    }
}
