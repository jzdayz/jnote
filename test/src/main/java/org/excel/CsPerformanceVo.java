package org.excel;


import java.lang.annotation.*;
import java.time.LocalTime;
import java.util.*;

/**
 * @author huqingfeng 1397649957@qq.com
 * @date 2019/1/3 3:42 PM
 * @since 1.0.0
 *
 */
public class CsPerformanceVo {
    private Integer avgRespInQuickTime;

    private Integer sessionNum;

    @Table(SUMMARIZE)
    @Property(value = "咨询人数")
    private Integer consultNum;

    @Property(value = "接待人数")
    private Integer receiveNum;

    @Property(value = "询单人数")
    private Integer enquiryNum;

    @Property(value = "首次平均响应(s)", direct = true)
    private Double avgRespTimeFirst;

    @Property(value = "平均响应(s)", direct = true)
    private Double avgRespTime;

    @Property(value = "销售额、是否扣除退款、是否扣除邮费",titleShort = "销售额")
    private Double saleAmount;

    @Property(value = "销售量、是否扣除退款件数",titleShort = "销售量", direct = true)
    private Integer saleGoodsNum;

    @Property(value = "销售人数")
    private Integer saleBuyerNum;

    @Property(value = "销售订单数")
    private Integer saleOrderNum;

    @Property(value = "个人销售额占比", direct = true)
    private Double saleAmountPercent;

    @Property(value = "询单→付款转化率", direct = true)
    private Double queryToFinalPaid;

    @Property(value = "销售客单价（元/人）", direct = true)
    private Double saleGuestAvgAmount;

    @Property(value = "出库金额")
    private Double outStockAmount;

    @Property(value = "出库件数")
    private Integer outStockGoodsNum;

    @Property(value = "出库人数")
    private Integer outStockNum;

    @Property(value = "出库订单数")
    private Integer outStockOrderNum;

    @Property(value = "个人出库金额占比", direct = true)
    private Double personalOutStockAmountPercent;

    @Property(value = "出库客单价（元/人）", direct = true)
    private Double outStockGuestAvgAmount;

    @Property(value = "完成退款金额")
    private Double completedRefundAmount;

    @Property(value = "完成退款件数")
    private Integer completedRefundProductNum;

    @Property(value = "邮费总额")
    private Double postFee;


    // ============================================================================

    @Table(INQUIRY_TO_ORDERED)
    @Property(value = "询单流失人数",titleShort = "询单流失人数", direct = true)
    private Integer enquiryLossNum;

    @Property(value = "询单→当日下单人数")
    private Integer orderedNumToday;

    @Property(value = "询单→当日下单金额")
    private Double orderedAmountToday;

    @Property(value = "询单→最终下单人数")
    private Integer orderedNumFinal;

    @Property(value = "询单→最终下单金额")
    private Double orderedAmountFinal;

    // ============================================================================

    @Table(ORDER_TO_PAY)
    @Property(value = "客服落实下单人数")
    private Integer toOrderedNum;

    @Property(value = "客服落实下单件数")
    private Integer toOrderedGoodsNum;

    @Property(value = "客服落实下单金额")
    private Double toOrderedAmount;

    @Property(value = "客服落实下单订单数")
    private Integer toOrderedOrderNum;

    @Property(value = "客服落实下单未付款人数",titleShort = "付款流失人数", direct = true)
    private Integer paidLossNum;

    @Property(value = "客服落实下单未付款件数",titleShort = "付款流失件数", direct = true)
    private Integer paidLossGoodsNum;

    @Property(value = "客服落实下单未付款金额",titleShort = "付款流失金额", direct = true)
    private Double paidLossMoney;

    @Property(value = "下单→当日付款人数")
    private Integer toOrderedPaidNumToday;

    @Property(value = "下单→当日付款件数")
    private Integer toOrderedPaidGoodsToday;

    @Property(value = "下单→当日付款金额")
    private Double toOrderedPaidAmountToday;

    @Property(value = "下单→最终付款人数")
    private Integer toOrderedPaidNumFinal;

    @Property(value = "下单→最终付款件数")
    private Integer toOrderedPaidGoodsFinal;

    @Property(value = "下单→最终付款金额")
    private Double toOrderedPaidAmountFinal;

    // ============================================================================

    @Table(ORDER_TO_OUT_STOCK)
    @Property(value = "下单→出库人数", direct = true)
    private Integer toOrderedOutStockNum;

    @Property(value = "下单→出库件数", direct = true)
    private Integer toOrderedOutStockGoodsNum;

    @Property(value = "下单→出库金额", direct = true)
    private Double toOrderedOutStockAmount;

    @Property(value = "下单→出库订单数", direct = true)
    private Integer toOrderedOutStockOrderNum;

    @Property(value = "下单→出库流失人数", direct = true,titleShort = "出库流失人数")
    private Integer outStackLossNum;

    @Property(value = "下单→出库流失件数", direct = true,titleShort = "出库流失件数")
    private Integer outStackLossGoodsNum;

    @Property(value = "下单→出库流失金额", direct = true,titleShort = "出库流失金额")
    private Double outStackLossMoney;

    @Property(value = "下单→出库流失订单数", direct = true,titleShort = "出库流失订单数")
    private Integer outStackLossOrderNum;

    // ============================================================================
    @Table(MAKE_PAY)
    @Property(value = "本人落实下单付款-件数", direct = true)
    private Integer toOrderedPaidGoodsNum;

    @Property(value = "本人落实下单付款-订单数", direct = true)
    private Integer toOrderedPaidOrderNum;

    @Property(value = "本人落实下单付款-人数", direct = true)
    private Integer toOrderedPaidNum;

    @Property(value = "本人落实下单付款-金额", direct = true)
    private Double toOrderedPaidAmount;

    @Property(value = "本人落实下单他人落实付款-件数", direct = true)
    private Integer toOrderedNotPaidGoodsNum;

    @Property(value = "本人落实下单他人落实付款-订单数", direct = true)
    private Integer toOrderedNotPaidOrderNum;

    @Property(value = "本人落实下单他人落实付款-人数 ", direct = true)
    private Integer toOrderedNotPaidNum;

    @Property(value = "本人落实下单他人落实付款-金额 ", direct = true)
    private Double toOrderedNotPaidAmount;

    @Property(value = "他人落实下单本人落实付款-件数 ", direct = true)
    private Integer toPaidGoodsNum;

    @Property(value = "他人落实下单本人落实付款-订单数 ", direct = true)
    private Integer toPaidOrderNum;

    @Property(value = "他人落实下单本人落实付款-人数", direct = true)
    private Integer toPaidNum;

    @Property(value = "他人落实下单本人落实付款-金额", direct = true)
    private Double toPaidAmount;

    @Property(value = "静默下单本人落实付款-件数 ", direct = true)
    private Integer silentOrderToPaidGoodsNum;

    @Property(value = "静默下单本人落实付款-订单数 ", direct = true)
    private Integer silentOrderToPaidOrderNum;

    @Property(value = "静默下单本人落实付款-人数", direct = true)
    private Integer silentOrderToPaidNum;

    @Property(value = "静默下单本人落实付款-金额", direct = true)
    private Double silentOrderToPaidAmount;

    @Property(value = "全静默订单本人跟进-件数 ", direct = true)
    private Integer silentToFolowupGoodsNum;

    @Property(value = "全静默订单本人跟进-订单数 ", direct = true)
    private Integer silentToFolowupOrderNum;

    @Property(value = "全静默订单本人跟进-人数", direct = true)
    private Integer silentToFolowupNum;

    @Property(value = "全静默订单本人跟进-金额", direct = true)
    private Double silentToFolowupAmount;

    // ============================================================================
    @Table(AID)
    @Property(value = "协助下单人数", direct = true)
    private Integer assitOrderCreateNum;

    @Property(value = "协助下单金额", direct = true)
    private Double assitOrderCreateAmount;

    @Property(value = "协助付款人数", direct = true)
    private Integer assitOrderPayNum;

    @Property(value = "协助付款金额", direct = true)
    private Double assitOrderPayAmount;

    @Property(value = "协助跟进人数", direct = true)
    private Integer assitOrderFollowupNum;

    @Property(value = "协助跟进金额", direct = true)
    private Double assitOrderFollowupAmount;

    // ============================================================================
    @Table(TRANSFORM_INQUIRY_TO_OUT_STOCK)
    @Property(value = "最终出库人数")
    private Integer outStockOrderBuyerNumFinal;

    @Property(value = "询单→出库转化率", direct = true)
    private Double queryToOutStock;

    // ============================================================================
    @Table(TRANSFORM_INQUIRY_TO_PAY)
    @Property(value = "询单→次日付款人数")
    private Integer paidNumTodayNext;

    @Property(value = "询单→最终付款人数")
    private Integer paidNumFinal;

    @Property(value = "询单→次日付款转化率", direct = true)
    private Double queryToTomorrow;

    // ============================================================================
    @Table(TRANSFORM_ORDERED_TO_PAY)
    @Property(value = "下单→当日付款转化率", direct = true)
    private Double orderedToPaid;

    @Property(value = "下单→付款转化率", direct = true)
    private Double orderedToPaidFinal;


    // ============================================================================
    @Table(TRANSFORM_INQUIRY_TO_ORDERED)
    @Property(value = "询单→当日下单转化率", direct = true)
    private Double queryToOrderedToday;

    @Property(value = "询单→下单转化率", direct = true)
    private Double queryToFinalOrdered;


    // ============================================================================
    @Table(WORKLOAD)
    @Property(value = "咨询量")
    private Integer consultSessionNum;

    @Property(value = "接待量")
    private Integer receiveSessionNum;

    @Property(value = "登录时长", direct = true)
    private Long loginDurationTime;

    @Property(value = "接待时长", direct = true)
    private Long rceiveDurationTime;

    @Property(value = "直接接待量")
    private Integer directReceiveSessionNum;

    @Property(value = "转入量")
    private Integer forwardInSessionNum;

    @Property(value = "转出量")
    private Integer forwardOutSessionNum;

    @Property(value = "顾客发起量")
    private Integer custConsultSessionNum;

    @Property(value = "客服主动跟进量")
    private Integer csToCustSessionNum;

    @Property(value = "总消息数")
    private Integer chatNum;

    @Property(value = "顾客消息数")
    private Integer custChatNum;

    @Property(value = "客服消息数")
    private Integer csChatNum;

    @Property(value = "答问比", direct = true)
    private Double answerRatio;

    @Property(value = "客服字数")
    private Integer csWordNum;

    @Property(value = "平均回复消息数", direct = true)
    private Double avgCsMsgSessionNum;

    @Property(value = "最大同时接待量")
    private Integer maxReceiveSessionNum;

    @Property(value = "未回复量")
    private Integer nonReplySessionNum;

    @Property(value = "回复率", direct = true)
    private Double responseRate;

    @Property(value = "快速应答率")
    private Double rapidAnswerRate;

    @Property(value = "留言分配量", direct = true)
    private Integer leaveMsgSessionNum;

    @Property(value = "留言接待量", direct = true)
    private Integer leaveMsgReceiveSessionNum;

    @Property(value = "留言响应率", direct = true)
    private Double leaveMsgResponseRate;

    @Property(value = "平均会话时长", direct = true)
    private Double avgSessionDurationTime;

    @Property(value = "慢响应量", direct = true)
    private Integer slowRespSessionNum;

    @Property(value = "长接待量", direct = true)
    private Integer longRespSessionNum;

    // ============================================================================
    @Table(CUSTOMER_AVG)
    @Property(value = "销售客件数（件/人）", direct = true)
    private Double saleGuestAvgGoods;

    @Property(value = "销售件均价（元/件）", direct = true)
    private Double saleGoodsAvgAmount;

    @Property(value = "出库客件数（件/人）", direct = true)
    private Double outStockGuestItemNum;

    @Property(value = "出库件均价（元/件）", direct = true)
    private Double outStockItemAvgAmount;

    // ============================================================================
    @Table(SATISFACTION)
    @Property(value = "满意度-非常满意")
    private Integer verySatisfiedNum;

    @Property(value = "满意度-满意")
    private Integer satisfiedNum;

    @Property(value = "满意度-一般")
    private Integer generalNum;

    @Property(value = "满意度-不满意")
    private Integer dissatisfiedNum;

    @Property(value = "满意度-非常不满意")
    private Integer veryDissatisfiedNum;

    @Property(value = "评价量", direct = true)
    private Integer evalReplyNum;

    @Property(value = "满意率", direct = true)
    private Double satisfactionRate;

    @Property(value = "评价率")
    private Double evaluationRate;

    @Property(value = "邀评率")
    private Double inviteRate;

    @Property(value = "邀评量")
    private Integer inviteNum;

    // ============================================================================
    @Table(RECEIVE_HOUR)
    private Integer hour0;

    private Integer hour1;

    private Integer hour2;

    private Integer hour3;

    private Integer hour4;

    private Integer hour5;

    private Integer hour6;

    private Integer hour7;

    private Integer hour8;

    private Integer hour9;

    private Integer hour10;

    private Integer hour11;

    private Integer hour12;

    private Integer hour13;

    private Integer hour14;

    private Integer hour15;

    private Integer hour16;

    private Integer hour17;

    private Integer hour18;

    private Integer hour19;

    private Integer hour20;

    private Integer hour21;

    private Integer hour22;

    private Integer hour23;

    @Property(value = "全天分时接待")
    private Integer allDay;

    // ============================================================================
    @Table(EVALUATE)
    @Property(value = "售前好评数")
    private Integer goodEvaluateNumPreSale;

    @Property(value = "售前中评数")
    private Integer neutralEvaluateNumPreSale;

    @Property(value = "售前差评数")
    private Integer badEvaluateNumPreSale;

    @Property(value = "售中好评数")
    private Integer goodEvaluateNumBetSale;

    @Property(value = "售中中评数")
    private Integer neutralEvaluateNumBetSale;

    @Property(value = "售中差评数")
    private Integer badEvaluateNumBetSale;

    @Property(value = "售后好评数")
    private Integer goodEvaluateNumAfterSale;

    @Property(value = "售后中评数")
    private Integer neutralEvaluateNumAfterSale;

    @Property(value = "售后差评数")
    private Integer badEvaluateNumAfterSale;

    @Property(value = "好评总数")
    private Integer goodEvaluateNumTotal;

    @Property(value = "中评总数")
    private Integer neutralEvaluateNumTotal;

    @Property(value = "差评总数")
    private Integer badEvaluateNumTotal;

    // ============================================================================
    @Table(REFUND)
    @Property(value = "申请退款笔数")
    private Integer applyRefundNum;

    @Property(value = "申请退款件数")
    private Integer applyRefundProductNum;

    @Property(value = "申请退款人数")
    private Integer applyRefundBuyerNum;

    @Property(value = "申请退款金额")
    private Double applyRefundAmount;

    @Property(value = "完成退款笔数")
    private Integer completedRefundNum;

    @Property(value = "完成退款人数")
    private Integer completedRefundBuyerNum;

    // ============================================================================
    @Table(REFUND_RATE)
    @Property("成交件数")
    // 数据同 销售量
    private Integer transactionsNum;

    @Property(value = "退款件数")
    // 同完成退款件数
    private Integer refundProductNum;

    @Property(value = "退款率", direct = true)
    private Double refundPercent;

    private static final String SUMMARIZE  = "汇总";
    private static final String INQUIRY_TO_ORDERED  = "询单->下单";
    private static final String ORDER_TO_PAY = "下单->付款";
    private static final String ORDER_TO_OUT_STOCK = "下单->出库";
    private static final String MAKE_PAY = "落实付款";
    private static final String AID = "协助服务";
    private static final String TRANSFORM_INQUIRY_TO_OUT_STOCK = "转化率->询单->出库";
    private static final String TRANSFORM_INQUIRY_TO_PAY = "转化率->询单->付款";
    private static final String TRANSFORM_INQUIRY_TO_ORDERED = "转化率->询单->下单";
    private static final String TRANSFORM_ORDERED_TO_PAY = "转化率->下单->付款";
    private static final String WORKLOAD = "工作量";
    private static final String CUSTOMER_AVG = "客单价";
    private static final String SATISFACTION = "满意率";
    private static final String RECEIVE_HOUR = "分时接待量";
    private static final String EVALUATE = "中差评";
    private static final String REFUND = "退款数据";
    private static final String REFUND_RATE = "退款率";


    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface Done{}


    @Done
    @Property(value = "店铺ID")
    private Long shopId;

    @Property(value = "昵称")
    private String simpleName;

    @Property(value = "客服Nick")
    private String csNick;

    @Property(value = "日期")
    private Date date;

    @Property(value = "团队销售额", direct = true)
    private Double teamSaleAmount;

    @Property(value = "下单件均价（元/件）", direct = true)
    private Double orderItemAvgAmount;

    @Property(value = "询单→当日的下单件数")
    private Integer orderedGoodsNumToday;

    @Property(value = "下单客单价（元/人）", direct = true)
    private Double orderedGuestAvgPrice;

    @Property(value = "下单客件数（件/人）", direct = true)
    private Double orderedGuestAvgAmount;

    @Property(value = "询单→最终付款金额")
    private Double paidAmountFinal;

    @Property(value = "当日询单 当天落实下单 并且 付了款的人数")
    private Integer paidNumToday;

    @Property(value = "下单当日付款的件数")
    private Integer paidGoodsNumToday;

    @Property(value = "成交笔数")
    private Integer saleOrderSkuNum;

    @Property(value = "勋章评价")
    private Integer medalNum;

    @Property(value = "上班天数", direct = true)
    private Integer workDay;

    @Property(value = "平均上线时间", direct = true)
    private LocalTime avgFirstOnlineDateTime;

    @Property(value = "平均下线时间", direct = true)
    private LocalTime avgLastOfflineDateTime;

    @Property(value = "最早上线时间", direct = true)
    private LocalTime firstOnlineDateTime;

    @Property(value = "最晚下线时间", direct = true)
    private LocalTime lastOfflineDateTime;

    @Property(value = "登录次数", direct = true)
    private Integer loginTimesNum;

    @Property(value = "日均登录次数", direct = true)
    private Double avgLoginTimesNum;

    @Property(value = "日均登录时长", direct = true)
    private Double avgLoginDurationTime;

    @Property(value = "日均接待时长", direct = true)
    private Double avgRceiveDurationTime;

    @Property(value = "挂起时长", direct = true)
    private Long hangupDurationTime;

    @Property(value = "日均挂起时长", direct = true)
    private Double avgHangupDurationTime;

    @Property(value = "接待时长占比", direct = true)
    private Double rceiveTimeRate;

    @Property(value = "上班期间离线时长", direct = true)
    private Long offlineDurationTime;
}
