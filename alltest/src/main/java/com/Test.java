package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ☞ 🏀
 * @date 2019-05-16
 */
public class Test {
    public static void main(String[] args) {
        String s= "<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
                "<if test=\"shopId != null\">shop_id,</if>\n" +
                "<if test=\"date != null\">date,</if>\n" +
                "<if test=\"csNick != null\">cs_nick,</if>\n" +
                "<if test=\"buyerNick != null\">buyer_nick,</if>\n" +
                "<if test=\"firstReceiveDate != null\">first_receive_date,</if>\n" +
                "<if test=\"lastReceiveDate != null\">last_receive_date,</if>\n" +
                "<if test=\"buyerEvalInit != null\">buyer_eval_init,</if>\n" +
                "</trim>";

        String m = "<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
                "<if test=\"shopId != null\">#{shopId},</if>\n" +
                "<if test=\"date != null\">#{date},</if>\n" +
                "<if test=\"csNick != null\">#{csNick},</if>\n" +
                "<if test=\"buyerNick != null\">#{buyerNick},</if>\n" +
                "<if test=\"firstReceiveDate != null\">#{firstReceiveDate},</if>\n" +
                "<if test=\"lastReceiveDate != null\">#{lastReceiveDate},</if>\n" +
                "<if test=\"buyerEvalInit != null\">#{buyerEvalInit},</if>\n" +
                "</trim>";

        final Pattern compile = Pattern.compile("(test=\"(\\s|\\w|=|!)*\"|#\\{\\w*})");
        final Matcher matcher = compile.matcher(m);
        String tmp = m;
        while (matcher.find()){
            final String group = matcher.group();
            final int i1 = group.indexOf("\"");
            final int i = i1 == -1 ? group.indexOf("{") : i1;
            if (i == -1)continue;
            final String substring = group.substring(i+1);
            final String res = group.substring(0, i) + "\\{" + "sub." + substring;
            System.out.println(res);
            tmp = tmp.replaceFirst(group,res);
        }
        System.out.println(tmp);

    }
}
