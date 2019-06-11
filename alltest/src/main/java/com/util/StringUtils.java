package com.util;

import java.util.stream.IntStream;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-10
 */
public class StringUtils {


    public static String addStr(String txt,String spec,String added){
        char[] chars = spec.toCharArray();
        StringBuilder sb = new StringBuilder(txt.length()+100);
        sb.append(txt);
        for (int i = 0;i<sb.length()-spec.length();i++){
            int j = i;
            boolean append = true;
            for (char aChar : chars) {
                if (aChar != sb.charAt(j)){
                    append = false;
                }
                j++;
            }
            if (append)
            sb.insert(j,added);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String txt = "(#{id,jdbcType=BIGINT}, #{shopId,jdbcType=BIGINT}, #{date,jdbcType=DATE}, \n" +
                "      #{csNick,jdbcType=VARCHAR}, #{consultSessionNum,jdbcType=INTEGER}, #{receiveSessionNum,jdbcType=INTEGER}, \n" +
                "      #{receiveSessionDurationTime,jdbcType=DOUBLE}, #{directReceiveSessionNum,jdbcType=INTEGER}, \n" +
                "      #{forwardInSessionNum,jdbcType=INTEGER}, #{forwardOutSessionNum,jdbcType=INTEGER}, \n" +
                "      #{custConsultSessionNum,jdbcType=INTEGER}, #{csToCustSessionNum,jdbcType=INTEGER}, \n" +
                "      #{chatNum,jdbcType=INTEGER}, #{custChatNum,jdbcType=INTEGER}, #{csChatNum,jdbcType=INTEGER}, \n" +
                "      #{csWordNum,jdbcType=INTEGER}, #{avgCsMsgSessionNum,jdbcType=DOUBLE}, #{maxReceiveSessionNum,jdbcType=INTEGER}, \n" +
                "      #{nonReplySessionNum,jdbcType=INTEGER}, #{leaveMsgSessionNum,jdbcType=INTEGER}, \n" +
                "      #{leaveMsgReceiveSessionNum,jdbcType=INTEGER}, #{slowRespSessionNum,jdbcType=INTEGER}, \n" +
                "      #{longRespSessionNum,jdbcType=INTEGER}, #{avgRespTimeFirst,jdbcType=DOUBLE}, #{avgRespTime,jdbcType=DOUBLE}, \n" +
                "      #{avgSessionDurationTime,jdbcType=DOUBLE}, #{avgRespInQuickTime,jdbcType=INTEGER}, \n" +
                "      #{sessionNum,jdbcType=INTEGER}, #{avgRespTimeFirstCount,jdbcType=DOUBLE}, #{sessionDurationTimeCount,jdbcType=DOUBLE}, \n" +
                "      #{sessionBoutTimeCount,jdbcType=DOUBLE}, #{sessionBoutCount,jdbcType=DOUBLE})";


        System.out.println(addStr(txt,"#{","record."));
    }
}
