package com.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.google.common.io.Closer;
import org.springframework.util.ReflectionUtils;

import java.io.FileInputStream;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author huqingfeng 1397649957@qq.com
 * @date 2019/1/3 3:42 PM
 * @since 1.0.0
 *
 */
public class CsPerformanceVo {


    public static CsPerformanceVo getFilled(){
        CsPerformanceVo vo = new CsPerformanceVo();
        vo.setAvgRespInQuickTime(0);
        vo.setSessionNum(0);
        vo.setReceiveSessionDurationTime(0.0D);
        vo.setAllDay(0);
        vo.setShopId(0L);
        vo.setSimpleName(null);
        vo.setCsNick(null);
        vo.setDate(null);
        vo.setTransactionsNum(0);
        vo.setSaleAmount(0.0D);
        vo.setSaleAmountPercent(0.0D);
        vo.setSaleGoodsNum(0);
        vo.setSaleBuyerNum(0);
        vo.setTeamSaleAmount(0.0D);
        vo.setSaleOrderNum(0);
        vo.setEnquiryNum(0);
        vo.setPostFee(0.0D);
        vo.setSaleGuestAvgAmount(0.0D);
        vo.setSaleGuestAvgGoods(0.0D);
        vo.setSaleGoodsAvgAmount(0.0D);
        vo.setOutStockGuestAvgAmount(0.0D);
        vo.setOutStockNum(0);
        vo.setOutStockAmount(0.0D);
        vo.setOutStockGoodsNum(0);
        vo.setOutStockOrderNum(0);
        vo.setOutStockGuestItemNum(0.0D);
        vo.setOutStockItemAvgAmount(0.0D);
        vo.setOrderItemAvgAmount(0.0D);
        vo.setOrderedNumToday(0);
        vo.setInviteNum(0);
        vo.setOrderedAmountToday(0.0D);
        vo.setOrderedGoodsNumToday(0);
        vo.setOrderedGuestAvgPrice(0.0D);
        vo.setOrderedGuestAvgAmount(0.0D);
        vo.setQueryToTomorrow(0.0D);
        vo.setPaidNumTodayNext(0);
        vo.setPaidAmountFinal(0.0D);
        vo.setPaidNumFinal(0);
        vo.setQueryToFinalPaid(0.0D);
        vo.setQueryToOrderedToday(0.0D);
        vo.setOrderedNumFinal(0);
        vo.setOrderedToPaid(0.0D);
        vo.setOrderedToPaidFinal(0.0D);
        vo.setPaidNumToday(0);
        vo.setQueryToFinalOrdered(0.0D);
        vo.setQueryToOutStock(0.0D);
        vo.setOrderedAmountFinal(0.0D);
        vo.setPaidGoodsNumToday(0);
        vo.setConsultNum(0);
        vo.setReceiveNum(0);
        vo.setRapidAnswerRate(0.0D);
        vo.setPersonalOutStockAmountPercent(0.0D);
        vo.setGoodEvaluateNumPreSale(0);
        vo.setNeutralEvaluateNumPreSale(0);
        vo.setBadEvaluateNumPreSale(0);
        vo.setGoodEvaluateNumBetSale(0);
        vo.setNeutralEvaluateNumBetSale(0);
        vo.setBadEvaluateNumBetSale(0);
        vo.setGoodEvaluateNumAfterSale(0);
        vo.setNeutralEvaluateNumAfterSale(0);
        vo.setBadEvaluateNumAfterSale(0);
        vo.setGoodEvaluateNumTotal(0);
        vo.setNeutralEvaluateNumTotal(0);
        vo.setBadEvaluateNumTotal(0);
        vo.setVerySatisfiedNum(0);
        vo.setSatisfiedNum(0);
        vo.setGeneralNum(0);
        vo.setDissatisfiedNum(0);
        vo.setVeryDissatisfiedNum(0);
        vo.setApplyRefundNum(0);
        vo.setApplyRefundProductNum(0);
        vo.setApplyRefundBuyerNum(0);
        vo.setApplyRefundAmount(0.0D);
        vo.setCompletedRefundNum(0);
        vo.setCompletedRefundProductNum(0);
        vo.setCompletedRefundBuyerNum(0);
        vo.setCompletedRefundAmount(0.0D);
        vo.setRefundProductNum(0);
        vo.setSaleOrderSkuNum(0);
        vo.setRefundPercent(0.0D);
        vo.setEnquiryLossNum(0);
        vo.setPaidLossNum(0);
        vo.setPaidLossGoodsNum(0);
        vo.setPaidLossMoney(0.0D);
        vo.setOutStackLossNum(0);
        vo.setOutStackLossGoodsNum(0);
        vo.setOutStackLossMoney(0.0D);
        vo.setOutStackLossOrderNum(0);
        vo.setToOrderedPaidNumToday(0);
        vo.setToOrderedPaidGoodsToday(0);
        vo.setToOrderedPaidAmountToday(0.0D);
        vo.setToOrderedPaidNumFinal(0);
        vo.setToOrderedPaidGoodsFinal(0);
        vo.setToOrderedPaidAmountFinal(0.0D);
        vo.setToOrderedNum(0);
        vo.setToOrderedGoodsNum(0);
        vo.setToOrderedAmount(0.0D);
        vo.setToOrderedOrderNum(0);
        vo.setToOrderedPaidGoodsNum(0);
        vo.setToOrderedPaidOrderNum(0);
        vo.setToOrderedPaidNum(0);
        vo.setToOrderedPaidAmount(0.0D);
        vo.setToOrderedNotPaidGoodsNum(0);
        vo.setToOrderedNotPaidOrderNum(0);
        vo.setToOrderedNotPaidNum(0);
        vo.setToOrderedNotPaidAmount(0.0D);
        vo.setToPaidGoodsNum(0);
        vo.setToPaidOrderNum(0);
        vo.setToPaidNum(0);
        vo.setToPaidAmount(0.0D);
        vo.setSilentOrderToPaidGoodsNum(0);
        vo.setSilentOrderToPaidOrderNum(0);
        vo.setSilentOrderToPaidNum(0);
        vo.setSilentOrderToPaidAmount(0.0D);
        vo.setSilentToFolowupGoodsNum(0);
        vo.setSilentToFolowupOrderNum(0);
        vo.setSilentToFolowupNum(0);
        vo.setSilentToFolowupAmount(0.0D);
        vo.setMedalNum(0);
        vo.setEvalReplyNum(0);
        vo.setSatisfactionRate(0.0D);
        vo.setEvaluationRate(0.0D);
        vo.setConsultSessionNum(0);
        vo.setInviteRate(0.0D);
        vo.setReceiveSessionNum(0);
        vo.setDirectReceiveSessionNum(0);
        vo.setForwardInSessionNum(0);
        vo.setForwardOutSessionNum(0);
        vo.setCustConsultSessionNum(0);
        vo.setCsToCustSessionNum(0);
        vo.setChatNum(0);
        vo.setCustChatNum(0);
        vo.setCsChatNum(0);
        vo.setAnswerRatio(0.0D);
        vo.setCsWordNum(0);
        vo.setAvgCsMsgSessionNum(0.0D);
        vo.setMaxReceiveSessionNum(0);
        vo.setNonReplySessionNum(0);
        vo.setResponseRate(0.0D);
        vo.setLeaveMsgSessionNum(0);
        vo.setLeaveMsgReceiveSessionNum(0);
        vo.setLeaveMsgResponseRate(0.0D);
        vo.setAvgRespTime(0.0D);
        vo.setAvgRespTimeFirst(0.0D);
        vo.setAvgSessionDurationTime(0.0D);
        vo.setSlowRespSessionNum(0);
        vo.setLongRespSessionNum(0);
        vo.setWorkDay(0);
        vo.setRceiveDurationTime(0L);
        vo.setAvgFirstOnlineDateTime(null);
        vo.setAvgLastOfflineDateTime(null);
        vo.setFirstOnlineDateTime(null);
        vo.setLastOfflineDateTime(null);
        vo.setLoginTimesNum(0);
        vo.setAvgLoginTimesNum(0D);
        vo.setLoginDurationTime(0L);
        vo.setAvgLoginDurationTime(0D);
        vo.setAvgRceiveDurationTime(0D);
        vo.setHangupDurationTime(0L);
        vo.setAvgHangupDurationTime(0D);
        vo.setRceiveTimeRate(0.0D);
        vo.setOfflineDurationTime(0L);
        vo.setHour0(0);
        vo.setHour1(0);
        vo.setHour2(0);
        vo.setHour3(0);
        vo.setHour4(0);
        vo.setHour5(0);
        vo.setHour6(0);
        vo.setHour7(0);
        vo.setHour8(0);
        vo.setHour9(0);
        vo.setHour10(0);
        vo.setHour11(0);
        vo.setHour12(0);
        vo.setHour13(0);
        vo.setHour14(0);
        vo.setHour15(0);
        vo.setHour16(0);
        vo.setHour17(0);
        vo.setHour18(0);
        vo.setHour19(0);
        vo.setHour20(0);
        vo.setHour21(0);
        vo.setHour22(0);
        vo.setHour23(0);
        vo.setAssitOrderCreateNum(0);
        vo.setAssitOrderCreateAmount(0.0D);
        vo.setAssitOrderPayNum(0);
        vo.setAssitOrderPayAmount(0.0D);
        vo.setAssitOrderFollowupNum(0);
        vo.setAssitOrderFollowupAmount(0.0D);
        vo.setOutStockOrderBuyerNumFinal(0);
        vo.setToOrderedOutStockNum(0);
        vo.setToOrderedOutStockGoodsNum(0);
        vo.setToOrderedOutStockAmount(0.0D);
        vo.setToOrderedOutStockOrderNum(0);


        return vo;
    }


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

    @Property(value = "询单→最终付款转化率", direct = true)
    private Double queryToFinalPaid;

    @Property(value = "销售客单价（元/件）", direct = true)
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

    @Property(value = "下单→最终付款转化率", direct = true)
    private Double orderedToPaidFinal;


    // ============================================================================
    @Table(TRANSFORM_INQUIRY_TO_ORDERED)
    @Property(value = "询单→当日下单转化率", direct = true)
    private Double queryToOrderedToday;

    @Property(value = "询单→最终下单转化率", direct = true)
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

    public static List<String> getFls(String table){
        Map<String,List<String>> tableFls = new HashMap<>();

        /**
         * @see #completedRefundAmount
         * @see #completedRefundProductNum
         */
        tableFls.put(REFUND,Arrays.asList(
                "completedRefundAmount","completedRefundProductNum"
        ));

        /**
         * @see #receiveSessionNum
         */
        tableFls.put(SATISFACTION,Arrays.asList(
                "receiveSessionNum"
        ));

        /**
         * @see #saleGuestAvgAmount
         * @see #toOrderedOutStockNum
         * @see #toOrderedOutStockGoodsNum
         * @see #toOrderedOutStockAmount
         * @see #outStockGuestAvgAmount
         * @see #saleAmount
         * @see #saleGoodsNum
         * @see #saleBuyerNum
         */
        tableFls.put(CUSTOMER_AVG,Arrays.asList(
                "saleGuestAvgAmount","toOrderedOutStockNum","toOrderedOutStockGoodsNum"
                ,"toOrderedOutStockAmount","outStockGuestAvgAmount", "saleBuyerNum","saleAmount","saleGoodsNum"
        ));

        /**
         * @see #enquiryNum
         */
        tableFls.put(INQUIRY_TO_ORDERED,Arrays.asList(
            "enquiryNum"
        ));

        /**
         * @see #enquiryNum
         * @see #orderedNumToday
         * @see #orderedNumFinal
         */
        tableFls.put(TRANSFORM_INQUIRY_TO_ORDERED,Arrays.asList(
                "enquiryNum","orderedNumToday","orderedNumFinal"
        ));
        /**
         * @see #toOrderedNum
         * @see #toOrderedGoodsNum
         * @see #toOrderedAmount
         * @see #toOrderedOrderNum
         */
        tableFls.put(ORDER_TO_OUT_STOCK,Arrays.asList(
                "toOrderedNum","toOrderedGoodsNum","toOrderedAmount","toOrderedOrderNum"
        ));
        /**
         * @see #enquiryNum
         */
        tableFls.put(TRANSFORM_INQUIRY_TO_OUT_STOCK,Arrays.asList(
                "enquiryNum"
        ));
        /**
         * @see #enquiryNum
         * @see #queryToFinalPaid
         */
        tableFls.put(TRANSFORM_INQUIRY_TO_PAY,Arrays.asList(
                "enquiryNum","queryToFinalPaid"
        ));
        /**
         * @see #toOrderedNum
         * @see #toOrderedPaidNumToday
         * @see #toOrderedPaidNumFinal
         */
        tableFls.put(TRANSFORM_ORDERED_TO_PAY,Arrays.asList(
                "toOrderedNum","toOrderedPaidNumToday","toOrderedPaidNumFinal"
        ));

        /**
         * @see #avgRespTimeFirst
         * @see #avgRespTime
         */
        tableFls.put(WORKLOAD,Arrays.asList(
                "avgRespTime","avgRespTimeFirst"
        ));
        return tableFls.getOrDefault(table,Collections.emptyList());
    }



    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface Done{}


    @Done
    @Property("接待时长")
    private Double receiveSessionDurationTime;

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


    public Integer getAvgRespInQuickTime() {
        return avgRespInQuickTime;
    }

    public void setAvgRespInQuickTime(Integer avgRespInQuickTime) {
        this.avgRespInQuickTime = avgRespInQuickTime;
    }

    public Integer getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(Integer sessionNum) {
        this.sessionNum = sessionNum;
    }

    public Double getReceiveSessionDurationTime() {
        return receiveSessionDurationTime;
    }

    public void setReceiveSessionDurationTime(Double receiveSessionDurationTime) {
        this.receiveSessionDurationTime = receiveSessionDurationTime;
    }

    public Integer getAllDay() {
        return allDay;
    }

    public void setAllDay(Integer allDay) {
        this.allDay = allDay;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getCsNick() {
        return csNick;
    }

    public void setCsNick(String csNick) {
        this.csNick = csNick;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTransactionsNum() {
        return transactionsNum;
    }

    public void setTransactionsNum(Integer transactionsNum) {
        this.transactionsNum = transactionsNum;
    }

    public Double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Double getSaleAmountPercent() {
        return saleAmountPercent;
    }

    public void setSaleAmountPercent(Double saleAmountPercent) {
        this.saleAmountPercent = saleAmountPercent;
    }

    public Integer getSaleGoodsNum() {
        return saleGoodsNum;
    }

    public void setSaleGoodsNum(Integer saleGoodsNum) {
        this.saleGoodsNum = saleGoodsNum;
    }

    public Integer getSaleBuyerNum() {
        return saleBuyerNum;
    }

    public void setSaleBuyerNum(Integer saleBuyerNum) {
        this.saleBuyerNum = saleBuyerNum;
    }

    public Double getTeamSaleAmount() {
        return teamSaleAmount;
    }

    public void setTeamSaleAmount(Double teamSaleAmount) {
        this.teamSaleAmount = teamSaleAmount;
    }

    public Integer getSaleOrderNum() {
        return saleOrderNum;
    }

    public void setSaleOrderNum(Integer saleOrderNum) {
        this.saleOrderNum = saleOrderNum;
    }

    public Integer getEnquiryNum() {
        return enquiryNum;
    }

    public void setEnquiryNum(Integer enquiryNum) {
        this.enquiryNum = enquiryNum;
    }

    public Double getPostFee() {
        return postFee;
    }

    public void setPostFee(Double postFee) {
        this.postFee = postFee;
    }

    public Double getSaleGuestAvgAmount() {
        return saleGuestAvgAmount;
    }

    public void setSaleGuestAvgAmount(Double saleGuestAvgAmount) {
        this.saleGuestAvgAmount = saleGuestAvgAmount;
    }

    public Double getSaleGuestAvgGoods() {
        return saleGuestAvgGoods;
    }

    public void setSaleGuestAvgGoods(Double saleGuestAvgGoods) {
        this.saleGuestAvgGoods = saleGuestAvgGoods;
    }

    public Double getSaleGoodsAvgAmount() {
        return saleGoodsAvgAmount;
    }

    public void setSaleGoodsAvgAmount(Double saleGoodsAvgAmount) {
        this.saleGoodsAvgAmount = saleGoodsAvgAmount;
    }

    public Double getOutStockGuestAvgAmount() {
        return outStockGuestAvgAmount;
    }

    public void setOutStockGuestAvgAmount(Double outStockGuestAvgAmount) {
        this.outStockGuestAvgAmount = outStockGuestAvgAmount;
    }

    public Integer getOutStockNum() {
        return outStockNum;
    }

    public void setOutStockNum(Integer outStockNum) {
        this.outStockNum = outStockNum;
    }

    public Double getOutStockAmount() {
        return outStockAmount;
    }

    public void setOutStockAmount(Double outStockAmount) {
        this.outStockAmount = outStockAmount;
    }

    public Integer getOutStockGoodsNum() {
        return outStockGoodsNum;
    }

    public void setOutStockGoodsNum(Integer outStockGoodsNum) {
        this.outStockGoodsNum = outStockGoodsNum;
    }

    public Integer getOutStockOrderNum() {
        return outStockOrderNum;
    }

    public void setOutStockOrderNum(Integer outStockOrderNum) {
        this.outStockOrderNum = outStockOrderNum;
    }

    public Double getOutStockGuestItemNum() {
        return outStockGuestItemNum;
    }

    public void setOutStockGuestItemNum(Double outStockGuestItemNum) {
        this.outStockGuestItemNum = outStockGuestItemNum;
    }

    public Double getOutStockItemAvgAmount() {
        return outStockItemAvgAmount;
    }

    public void setOutStockItemAvgAmount(Double outStockItemAvgAmount) {
        this.outStockItemAvgAmount = outStockItemAvgAmount;
    }

    public Double getOrderItemAvgAmount() {
        return orderItemAvgAmount;
    }

    public void setOrderItemAvgAmount(Double orderItemAvgAmount) {
        this.orderItemAvgAmount = orderItemAvgAmount;
    }

    public Integer getOrderedNumToday() {
        return orderedNumToday;
    }

    public void setOrderedNumToday(Integer orderedNumToday) {
        this.orderedNumToday = orderedNumToday;
    }

    public Integer getInviteNum() {
        return inviteNum;
    }

    public void setInviteNum(Integer inviteNum) {
        this.inviteNum = inviteNum;
    }

    public Double getOrderedAmountToday() {
        return orderedAmountToday;
    }

    public void setOrderedAmountToday(Double orderedAmountToday) {
        this.orderedAmountToday = orderedAmountToday;
    }

    public Integer getOrderedGoodsNumToday() {
        return orderedGoodsNumToday;
    }

    public void setOrderedGoodsNumToday(Integer orderedGoodsNumToday) {
        this.orderedGoodsNumToday = orderedGoodsNumToday;
    }

    public Double getOrderedGuestAvgPrice() {
        return orderedGuestAvgPrice;
    }

    public void setOrderedGuestAvgPrice(Double orderedGuestAvgPrice) {
        this.orderedGuestAvgPrice = orderedGuestAvgPrice;
    }

    public Double getOrderedGuestAvgAmount() {
        return orderedGuestAvgAmount;
    }

    public void setOrderedGuestAvgAmount(Double orderedGuestAvgAmount) {
        this.orderedGuestAvgAmount = orderedGuestAvgAmount;
    }

    public Double getQueryToTomorrow() {
        return queryToTomorrow;
    }

    public void setQueryToTomorrow(Double queryToTomorrow) {
        this.queryToTomorrow = queryToTomorrow;
    }

    public Integer getPaidNumTodayNext() {
        return paidNumTodayNext;
    }

    public void setPaidNumTodayNext(Integer paidNumTodayNext) {
        this.paidNumTodayNext = paidNumTodayNext;
    }

    public Double getPaidAmountFinal() {
        return paidAmountFinal;
    }

    public void setPaidAmountFinal(Double paidAmountFinal) {
        this.paidAmountFinal = paidAmountFinal;
    }

    public Integer getPaidNumFinal() {
        return paidNumFinal;
    }

    public void setPaidNumFinal(Integer paidNumFinal) {
        this.paidNumFinal = paidNumFinal;
    }

    public Double getQueryToFinalPaid() {
        return queryToFinalPaid;
    }

    public void setQueryToFinalPaid(Double queryToFinalPaid) {
        this.queryToFinalPaid = queryToFinalPaid;
    }

    public Double getQueryToOrderedToday() {
        return queryToOrderedToday;
    }

    public void setQueryToOrderedToday(Double queryToOrderedToday) {
        this.queryToOrderedToday = queryToOrderedToday;
    }

    public Integer getOrderedNumFinal() {
        return orderedNumFinal;
    }

    public void setOrderedNumFinal(Integer orderedNumFinal) {
        this.orderedNumFinal = orderedNumFinal;
    }

    public Double getOrderedToPaid() {
        return orderedToPaid;
    }

    public void setOrderedToPaid(Double orderedToPaid) {
        this.orderedToPaid = orderedToPaid;
    }

    public Double getOrderedToPaidFinal() {
        return orderedToPaidFinal;
    }

    public void setOrderedToPaidFinal(Double orderedToPaidFinal) {
        this.orderedToPaidFinal = orderedToPaidFinal;
    }

    public Integer getPaidNumToday() {
        return paidNumToday;
    }

    public void setPaidNumToday(Integer paidNumToday) {
        this.paidNumToday = paidNumToday;
    }

    public Double getQueryToFinalOrdered() {
        return queryToFinalOrdered;
    }

    public void setQueryToFinalOrdered(Double queryToFinalOrdered) {
        this.queryToFinalOrdered = queryToFinalOrdered;
    }

    public Double getQueryToOutStock() {
        return queryToOutStock;
    }

    public void setQueryToOutStock(Double queryToOutStock) {
        this.queryToOutStock = queryToOutStock;
    }

    public Double getOrderedAmountFinal() {
        return orderedAmountFinal;
    }

    public void setOrderedAmountFinal(Double orderedAmountFinal) {
        this.orderedAmountFinal = orderedAmountFinal;
    }

    public Integer getPaidGoodsNumToday() {
        return paidGoodsNumToday;
    }

    public void setPaidGoodsNumToday(Integer paidGoodsNumToday) {
        this.paidGoodsNumToday = paidGoodsNumToday;
    }

    public Integer getConsultNum() {
        return consultNum;
    }

    public void setConsultNum(Integer consultNum) {
        this.consultNum = consultNum;
    }

    public Integer getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Integer receiveNum) {
        this.receiveNum = receiveNum;
    }

    public Double getRapidAnswerRate() {
        return rapidAnswerRate;
    }

    public void setRapidAnswerRate(Double rapidAnswerRate) {
        this.rapidAnswerRate = rapidAnswerRate;
    }

    public Double getPersonalOutStockAmountPercent() {
        return personalOutStockAmountPercent;
    }

    public void setPersonalOutStockAmountPercent(Double personalOutStockAmountPercent) {
        this.personalOutStockAmountPercent = personalOutStockAmountPercent;
    }

    public Integer getGoodEvaluateNumPreSale() {
        return goodEvaluateNumPreSale;
    }

    public void setGoodEvaluateNumPreSale(Integer goodEvaluateNumPreSale) {
        this.goodEvaluateNumPreSale = goodEvaluateNumPreSale;
    }

    public Integer getNeutralEvaluateNumPreSale() {
        return neutralEvaluateNumPreSale;
    }

    public void setNeutralEvaluateNumPreSale(Integer neutralEvaluateNumPreSale) {
        this.neutralEvaluateNumPreSale = neutralEvaluateNumPreSale;
    }

    public Integer getBadEvaluateNumPreSale() {
        return badEvaluateNumPreSale;
    }

    public void setBadEvaluateNumPreSale(Integer badEvaluateNumPreSale) {
        this.badEvaluateNumPreSale = badEvaluateNumPreSale;
    }

    public Integer getGoodEvaluateNumBetSale() {
        return goodEvaluateNumBetSale;
    }

    public void setGoodEvaluateNumBetSale(Integer goodEvaluateNumBetSale) {
        this.goodEvaluateNumBetSale = goodEvaluateNumBetSale;
    }

    public Integer getNeutralEvaluateNumBetSale() {
        return neutralEvaluateNumBetSale;
    }

    public void setNeutralEvaluateNumBetSale(Integer neutralEvaluateNumBetSale) {
        this.neutralEvaluateNumBetSale = neutralEvaluateNumBetSale;
    }

    public Integer getBadEvaluateNumBetSale() {
        return badEvaluateNumBetSale;
    }

    public void setBadEvaluateNumBetSale(Integer badEvaluateNumBetSale) {
        this.badEvaluateNumBetSale = badEvaluateNumBetSale;
    }

    public Integer getGoodEvaluateNumAfterSale() {
        return goodEvaluateNumAfterSale;
    }

    public void setGoodEvaluateNumAfterSale(Integer goodEvaluateNumAfterSale) {
        this.goodEvaluateNumAfterSale = goodEvaluateNumAfterSale;
    }

    public Integer getNeutralEvaluateNumAfterSale() {
        return neutralEvaluateNumAfterSale;
    }

    public void setNeutralEvaluateNumAfterSale(Integer neutralEvaluateNumAfterSale) {
        this.neutralEvaluateNumAfterSale = neutralEvaluateNumAfterSale;
    }

    public Integer getBadEvaluateNumAfterSale() {
        return badEvaluateNumAfterSale;
    }

    public void setBadEvaluateNumAfterSale(Integer badEvaluateNumAfterSale) {
        this.badEvaluateNumAfterSale = badEvaluateNumAfterSale;
    }

    public Integer getGoodEvaluateNumTotal() {
        return goodEvaluateNumTotal;
    }

    public void setGoodEvaluateNumTotal(Integer goodEvaluateNumTotal) {
        this.goodEvaluateNumTotal = goodEvaluateNumTotal;
    }

    public Integer getNeutralEvaluateNumTotal() {
        return neutralEvaluateNumTotal;
    }

    public void setNeutralEvaluateNumTotal(Integer neutralEvaluateNumTotal) {
        this.neutralEvaluateNumTotal = neutralEvaluateNumTotal;
    }

    public Integer getBadEvaluateNumTotal() {
        return badEvaluateNumTotal;
    }

    public void setBadEvaluateNumTotal(Integer badEvaluateNumTotal) {
        this.badEvaluateNumTotal = badEvaluateNumTotal;
    }

    public Integer getVerySatisfiedNum() {
        return verySatisfiedNum;
    }

    public void setVerySatisfiedNum(Integer verySatisfiedNum) {
        this.verySatisfiedNum = verySatisfiedNum;
    }

    public Integer getSatisfiedNum() {
        return satisfiedNum;
    }

    public void setSatisfiedNum(Integer satisfiedNum) {
        this.satisfiedNum = satisfiedNum;
    }

    public Integer getGeneralNum() {
        return generalNum;
    }

    public void setGeneralNum(Integer generalNum) {
        this.generalNum = generalNum;
    }

    public Integer getDissatisfiedNum() {
        return dissatisfiedNum;
    }

    public void setDissatisfiedNum(Integer dissatisfiedNum) {
        this.dissatisfiedNum = dissatisfiedNum;
    }

    public Integer getVeryDissatisfiedNum() {
        return veryDissatisfiedNum;
    }

    public void setVeryDissatisfiedNum(Integer veryDissatisfiedNum) {
        this.veryDissatisfiedNum = veryDissatisfiedNum;
    }

    public Integer getApplyRefundNum() {
        return applyRefundNum;
    }

    public void setApplyRefundNum(Integer applyRefundNum) {
        this.applyRefundNum = applyRefundNum;
    }

    public Integer getApplyRefundProductNum() {
        return applyRefundProductNum;
    }

    public void setApplyRefundProductNum(Integer applyRefundProductNum) {
        this.applyRefundProductNum = applyRefundProductNum;
    }

    public Integer getApplyRefundBuyerNum() {
        return applyRefundBuyerNum;
    }

    public void setApplyRefundBuyerNum(Integer applyRefundBuyerNum) {
        this.applyRefundBuyerNum = applyRefundBuyerNum;
    }

    public Double getApplyRefundAmount() {
        return applyRefundAmount;
    }

    public void setApplyRefundAmount(Double applyRefundAmount) {
        this.applyRefundAmount = applyRefundAmount;
    }

    public Integer getCompletedRefundNum() {
        return completedRefundNum;
    }

    public void setCompletedRefundNum(Integer completedRefundNum) {
        this.completedRefundNum = completedRefundNum;
    }

    public Integer getCompletedRefundProductNum() {
        return completedRefundProductNum;
    }

    public void setCompletedRefundProductNum(Integer completedRefundProductNum) {
        this.completedRefundProductNum = completedRefundProductNum;
    }

    public Integer getCompletedRefundBuyerNum() {
        return completedRefundBuyerNum;
    }

    public void setCompletedRefundBuyerNum(Integer completedRefundBuyerNum) {
        this.completedRefundBuyerNum = completedRefundBuyerNum;
    }

    public Double getCompletedRefundAmount() {
        return completedRefundAmount;
    }

    public void setCompletedRefundAmount(Double completedRefundAmount) {
        this.completedRefundAmount = completedRefundAmount;
    }

    public Integer getRefundProductNum() {
        return refundProductNum;
    }

    public void setRefundProductNum(Integer refundProductNum) {
        this.refundProductNum = refundProductNum;
    }

    public Integer getSaleOrderSkuNum() {
        return saleOrderSkuNum;
    }

    public void setSaleOrderSkuNum(Integer saleOrderSkuNum) {
        this.saleOrderSkuNum = saleOrderSkuNum;
    }

    public Double getRefundPercent() {
        return refundPercent;
    }

    public void setRefundPercent(Double refundPercent) {
        this.refundPercent = refundPercent;
    }

    public Integer getEnquiryLossNum() {
        return enquiryLossNum;
    }

    public void setEnquiryLossNum(Integer enquiryLossNum) {
        this.enquiryLossNum = enquiryLossNum;
    }

    public Integer getPaidLossNum() {
        return paidLossNum;
    }

    public void setPaidLossNum(Integer paidLossNum) {
        this.paidLossNum = paidLossNum;
    }

    public Integer getPaidLossGoodsNum() {
        return paidLossGoodsNum;
    }

    public void setPaidLossGoodsNum(Integer paidLossGoodsNum) {
        this.paidLossGoodsNum = paidLossGoodsNum;
    }

    public Double getPaidLossMoney() {
        return paidLossMoney;
    }

    public void setPaidLossMoney(Double paidLossMoney) {
        this.paidLossMoney = paidLossMoney;
    }

    public Integer getOutStackLossNum() {
        return outStackLossNum;
    }

    public void setOutStackLossNum(Integer outStackLossNum) {
        this.outStackLossNum = outStackLossNum;
    }

    public Integer getOutStackLossGoodsNum() {
        return outStackLossGoodsNum;
    }

    public void setOutStackLossGoodsNum(Integer outStackLossGoodsNum) {
        this.outStackLossGoodsNum = outStackLossGoodsNum;
    }

    public Double getOutStackLossMoney() {
        return outStackLossMoney;
    }

    public void setOutStackLossMoney(Double outStackLossMoney) {
        this.outStackLossMoney = outStackLossMoney;
    }

    public Integer getOutStackLossOrderNum() {
        return outStackLossOrderNum;
    }

    public void setOutStackLossOrderNum(Integer outStackLossOrderNum) {
        this.outStackLossOrderNum = outStackLossOrderNum;
    }

    public Integer getToOrderedPaidNumToday() {
        return toOrderedPaidNumToday;
    }

    public void setToOrderedPaidNumToday(Integer toOrderedPaidNumToday) {
        this.toOrderedPaidNumToday = toOrderedPaidNumToday;
    }

    public Integer getToOrderedPaidGoodsToday() {
        return toOrderedPaidGoodsToday;
    }

    public void setToOrderedPaidGoodsToday(Integer toOrderedPaidGoodsToday) {
        this.toOrderedPaidGoodsToday = toOrderedPaidGoodsToday;
    }

    public Double getToOrderedPaidAmountToday() {
        return toOrderedPaidAmountToday;
    }

    public void setToOrderedPaidAmountToday(Double toOrderedPaidAmountToday) {
        this.toOrderedPaidAmountToday = toOrderedPaidAmountToday;
    }

    public Integer getToOrderedPaidNumFinal() {
        return toOrderedPaidNumFinal;
    }

    public void setToOrderedPaidNumFinal(Integer toOrderedPaidNumFinal) {
        this.toOrderedPaidNumFinal = toOrderedPaidNumFinal;
    }

    public Integer getToOrderedPaidGoodsFinal() {
        return toOrderedPaidGoodsFinal;
    }

    public void setToOrderedPaidGoodsFinal(Integer toOrderedPaidGoodsFinal) {
        this.toOrderedPaidGoodsFinal = toOrderedPaidGoodsFinal;
    }

    public Double getToOrderedPaidAmountFinal() {
        return toOrderedPaidAmountFinal;
    }

    public void setToOrderedPaidAmountFinal(Double toOrderedPaidAmountFinal) {
        this.toOrderedPaidAmountFinal = toOrderedPaidAmountFinal;
    }

    public Integer getToOrderedNum() {
        return toOrderedNum;
    }

    public void setToOrderedNum(Integer toOrderedNum) {
        this.toOrderedNum = toOrderedNum;
    }

    public Integer getToOrderedGoodsNum() {
        return toOrderedGoodsNum;
    }

    public void setToOrderedGoodsNum(Integer toOrderedGoodsNum) {
        this.toOrderedGoodsNum = toOrderedGoodsNum;
    }

    public Double getToOrderedAmount() {
        return toOrderedAmount;
    }

    public void setToOrderedAmount(Double toOrderedAmount) {
        this.toOrderedAmount = toOrderedAmount;
    }

    public Integer getToOrderedOrderNum() {
        return toOrderedOrderNum;
    }

    public void setToOrderedOrderNum(Integer toOrderedOrderNum) {
        this.toOrderedOrderNum = toOrderedOrderNum;
    }

    public Integer getToOrderedPaidGoodsNum() {
        return toOrderedPaidGoodsNum;
    }

    public void setToOrderedPaidGoodsNum(Integer toOrderedPaidGoodsNum) {
        this.toOrderedPaidGoodsNum = toOrderedPaidGoodsNum;
    }

    public Integer getToOrderedPaidOrderNum() {
        return toOrderedPaidOrderNum;
    }

    public void setToOrderedPaidOrderNum(Integer toOrderedPaidOrderNum) {
        this.toOrderedPaidOrderNum = toOrderedPaidOrderNum;
    }

    public Integer getToOrderedPaidNum() {
        return toOrderedPaidNum;
    }

    public void setToOrderedPaidNum(Integer toOrderedPaidNum) {
        this.toOrderedPaidNum = toOrderedPaidNum;
    }

    public Double getToOrderedPaidAmount() {
        return toOrderedPaidAmount;
    }

    public void setToOrderedPaidAmount(Double toOrderedPaidAmount) {
        this.toOrderedPaidAmount = toOrderedPaidAmount;
    }

    public Integer getToOrderedNotPaidGoodsNum() {
        return toOrderedNotPaidGoodsNum;
    }

    public void setToOrderedNotPaidGoodsNum(Integer toOrderedNotPaidGoodsNum) {
        this.toOrderedNotPaidGoodsNum = toOrderedNotPaidGoodsNum;
    }

    public Integer getToOrderedNotPaidOrderNum() {
        return toOrderedNotPaidOrderNum;
    }

    public void setToOrderedNotPaidOrderNum(Integer toOrderedNotPaidOrderNum) {
        this.toOrderedNotPaidOrderNum = toOrderedNotPaidOrderNum;
    }

    public Integer getToOrderedNotPaidNum() {
        return toOrderedNotPaidNum;
    }

    public void setToOrderedNotPaidNum(Integer toOrderedNotPaidNum) {
        this.toOrderedNotPaidNum = toOrderedNotPaidNum;
    }

    public Double getToOrderedNotPaidAmount() {
        return toOrderedNotPaidAmount;
    }

    public void setToOrderedNotPaidAmount(Double toOrderedNotPaidAmount) {
        this.toOrderedNotPaidAmount = toOrderedNotPaidAmount;
    }

    public Integer getToPaidGoodsNum() {
        return toPaidGoodsNum;
    }

    public void setToPaidGoodsNum(Integer toPaidGoodsNum) {
        this.toPaidGoodsNum = toPaidGoodsNum;
    }

    public Integer getToPaidOrderNum() {
        return toPaidOrderNum;
    }

    public void setToPaidOrderNum(Integer toPaidOrderNum) {
        this.toPaidOrderNum = toPaidOrderNum;
    }

    public Integer getToPaidNum() {
        return toPaidNum;
    }

    public void setToPaidNum(Integer toPaidNum) {
        this.toPaidNum = toPaidNum;
    }

    public Double getToPaidAmount() {
        return toPaidAmount;
    }

    public void setToPaidAmount(Double toPaidAmount) {
        this.toPaidAmount = toPaidAmount;
    }

    public Integer getSilentOrderToPaidGoodsNum() {
        return silentOrderToPaidGoodsNum;
    }

    public void setSilentOrderToPaidGoodsNum(Integer silentOrderToPaidGoodsNum) {
        this.silentOrderToPaidGoodsNum = silentOrderToPaidGoodsNum;
    }

    public Integer getSilentOrderToPaidOrderNum() {
        return silentOrderToPaidOrderNum;
    }

    public void setSilentOrderToPaidOrderNum(Integer silentOrderToPaidOrderNum) {
        this.silentOrderToPaidOrderNum = silentOrderToPaidOrderNum;
    }

    public Integer getSilentOrderToPaidNum() {
        return silentOrderToPaidNum;
    }

    public void setSilentOrderToPaidNum(Integer silentOrderToPaidNum) {
        this.silentOrderToPaidNum = silentOrderToPaidNum;
    }

    public Double getSilentOrderToPaidAmount() {
        return silentOrderToPaidAmount;
    }

    public void setSilentOrderToPaidAmount(Double silentOrderToPaidAmount) {
        this.silentOrderToPaidAmount = silentOrderToPaidAmount;
    }

    public Integer getSilentToFolowupGoodsNum() {
        return silentToFolowupGoodsNum;
    }

    public void setSilentToFolowupGoodsNum(Integer silentToFolowupGoodsNum) {
        this.silentToFolowupGoodsNum = silentToFolowupGoodsNum;
    }

    public Integer getSilentToFolowupOrderNum() {
        return silentToFolowupOrderNum;
    }

    public void setSilentToFolowupOrderNum(Integer silentToFolowupOrderNum) {
        this.silentToFolowupOrderNum = silentToFolowupOrderNum;
    }

    public Integer getSilentToFolowupNum() {
        return silentToFolowupNum;
    }

    public void setSilentToFolowupNum(Integer silentToFolowupNum) {
        this.silentToFolowupNum = silentToFolowupNum;
    }

    public Double getSilentToFolowupAmount() {
        return silentToFolowupAmount;
    }

    public void setSilentToFolowupAmount(Double silentToFolowupAmount) {
        this.silentToFolowupAmount = silentToFolowupAmount;
    }

    public Integer getMedalNum() {
        return medalNum;
    }

    public void setMedalNum(Integer medalNum) {
        this.medalNum = medalNum;
    }

    public Integer getEvalReplyNum() {
        return evalReplyNum;
    }

    public void setEvalReplyNum(Integer evalReplyNum) {
        this.evalReplyNum = evalReplyNum;
    }

    public Double getSatisfactionRate() {
        return satisfactionRate;
    }

    public void setSatisfactionRate(Double satisfactionRate) {
        this.satisfactionRate = satisfactionRate;
    }

    public Double getEvaluationRate() {
        return evaluationRate;
    }

    public void setEvaluationRate(Double evaluationRate) {
        this.evaluationRate = evaluationRate;
    }

    public Integer getConsultSessionNum() {
        return consultSessionNum;
    }

    public void setConsultSessionNum(Integer consultSessionNum) {
        this.consultSessionNum = consultSessionNum;
    }

    public Double getInviteRate() {
        return inviteRate;
    }

    public void setInviteRate(Double inviteRate) {
        this.inviteRate = inviteRate;
    }

    public Integer getReceiveSessionNum() {
        return receiveSessionNum;
    }

    public void setReceiveSessionNum(Integer receiveSessionNum) {
        this.receiveSessionNum = receiveSessionNum;
    }

    public Integer getDirectReceiveSessionNum() {
        return directReceiveSessionNum;
    }

    public void setDirectReceiveSessionNum(Integer directReceiveSessionNum) {
        this.directReceiveSessionNum = directReceiveSessionNum;
    }

    public Integer getForwardInSessionNum() {
        return forwardInSessionNum;
    }

    public void setForwardInSessionNum(Integer forwardInSessionNum) {
        this.forwardInSessionNum = forwardInSessionNum;
    }

    public Integer getForwardOutSessionNum() {
        return forwardOutSessionNum;
    }

    public void setForwardOutSessionNum(Integer forwardOutSessionNum) {
        this.forwardOutSessionNum = forwardOutSessionNum;
    }

    public Integer getCustConsultSessionNum() {
        return custConsultSessionNum;
    }

    public void setCustConsultSessionNum(Integer custConsultSessionNum) {
        this.custConsultSessionNum = custConsultSessionNum;
    }

    public Integer getCsToCustSessionNum() {
        return csToCustSessionNum;
    }

    public void setCsToCustSessionNum(Integer csToCustSessionNum) {
        this.csToCustSessionNum = csToCustSessionNum;
    }

    public Integer getChatNum() {
        return chatNum;
    }

    public void setChatNum(Integer chatNum) {
        this.chatNum = chatNum;
    }

    public Integer getCustChatNum() {
        return custChatNum;
    }

    public void setCustChatNum(Integer custChatNum) {
        this.custChatNum = custChatNum;
    }

    public Integer getCsChatNum() {
        return csChatNum;
    }

    public void setCsChatNum(Integer csChatNum) {
        this.csChatNum = csChatNum;
    }

    public Double getAnswerRatio() {
        return answerRatio;
    }

    public void setAnswerRatio(Double answerRatio) {
        this.answerRatio = answerRatio;
    }

    public Integer getCsWordNum() {
        return csWordNum;
    }

    public void setCsWordNum(Integer csWordNum) {
        this.csWordNum = csWordNum;
    }

    public Double getAvgCsMsgSessionNum() {
        return avgCsMsgSessionNum;
    }

    public void setAvgCsMsgSessionNum(Double avgCsMsgSessionNum) {
        this.avgCsMsgSessionNum = avgCsMsgSessionNum;
    }

    public Integer getMaxReceiveSessionNum() {
        return maxReceiveSessionNum;
    }

    public void setMaxReceiveSessionNum(Integer maxReceiveSessionNum) {
        this.maxReceiveSessionNum = maxReceiveSessionNum;
    }

    public Integer getNonReplySessionNum() {
        return nonReplySessionNum;
    }

    public void setNonReplySessionNum(Integer nonReplySessionNum) {
        this.nonReplySessionNum = nonReplySessionNum;
    }

    public Double getResponseRate() {
        return responseRate;
    }

    public void setResponseRate(Double responseRate) {
        this.responseRate = responseRate;
    }

    public Integer getLeaveMsgSessionNum() {
        return leaveMsgSessionNum;
    }

    public void setLeaveMsgSessionNum(Integer leaveMsgSessionNum) {
        this.leaveMsgSessionNum = leaveMsgSessionNum;
    }

    public Integer getLeaveMsgReceiveSessionNum() {
        return leaveMsgReceiveSessionNum;
    }

    public void setLeaveMsgReceiveSessionNum(Integer leaveMsgReceiveSessionNum) {
        this.leaveMsgReceiveSessionNum = leaveMsgReceiveSessionNum;
    }

    public Double getLeaveMsgResponseRate() {
        return leaveMsgResponseRate;
    }

    public void setLeaveMsgResponseRate(Double leaveMsgResponseRate) {
        this.leaveMsgResponseRate = leaveMsgResponseRate;
    }

    public Double getAvgRespTime() {
        return avgRespTime;
    }

    public void setAvgRespTime(Double avgRespTime) {
        this.avgRespTime = avgRespTime;
    }

    public Double getAvgRespTimeFirst() {
        return avgRespTimeFirst;
    }

    public void setAvgRespTimeFirst(Double avgRespTimeFirst) {
        this.avgRespTimeFirst = avgRespTimeFirst;
    }

    public Double getAvgSessionDurationTime() {
        return avgSessionDurationTime;
    }

    public void setAvgSessionDurationTime(Double avgSessionDurationTime) {
        this.avgSessionDurationTime = avgSessionDurationTime;
    }

    public Integer getSlowRespSessionNum() {
        return slowRespSessionNum;
    }

    public void setSlowRespSessionNum(Integer slowRespSessionNum) {
        this.slowRespSessionNum = slowRespSessionNum;
    }

    public Integer getLongRespSessionNum() {
        return longRespSessionNum;
    }

    public void setLongRespSessionNum(Integer longRespSessionNum) {
        this.longRespSessionNum = longRespSessionNum;
    }

    public Integer getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Integer workDay) {
        this.workDay = workDay;
    }

    public Long getRceiveDurationTime() {
        return rceiveDurationTime;
    }

    public void setRceiveDurationTime(Long rceiveDurationTime) {
        this.rceiveDurationTime = rceiveDurationTime;
    }

    public LocalTime getAvgFirstOnlineDateTime() {
        return avgFirstOnlineDateTime;
    }

    public void setAvgFirstOnlineDateTime(LocalTime avgFirstOnlineDateTime) {
        this.avgFirstOnlineDateTime = avgFirstOnlineDateTime;
    }

    public LocalTime getAvgLastOfflineDateTime() {
        return avgLastOfflineDateTime;
    }

    public void setAvgLastOfflineDateTime(LocalTime avgLastOfflineDateTime) {
        this.avgLastOfflineDateTime = avgLastOfflineDateTime;
    }

    public LocalTime getFirstOnlineDateTime() {
        return firstOnlineDateTime;
    }

    public void setFirstOnlineDateTime(LocalTime firstOnlineDateTime) {
        this.firstOnlineDateTime = firstOnlineDateTime;
    }

    public LocalTime getLastOfflineDateTime() {
        return lastOfflineDateTime;
    }

    public void setLastOfflineDateTime(LocalTime lastOfflineDateTime) {
        this.lastOfflineDateTime = lastOfflineDateTime;
    }

    public Integer getLoginTimesNum() {
        return loginTimesNum;
    }

    public void setLoginTimesNum(Integer loginTimesNum) {
        this.loginTimesNum = loginTimesNum;
    }

    public Double getAvgLoginTimesNum() {
        return avgLoginTimesNum;
    }

    public void setAvgLoginTimesNum(Double avgLoginTimesNum) {
        this.avgLoginTimesNum = avgLoginTimesNum;
    }

    public Long getLoginDurationTime() {
        return loginDurationTime;
    }

    public void setLoginDurationTime(Long loginDurationTime) {
        this.loginDurationTime = loginDurationTime;
    }

    public Double getAvgLoginDurationTime() {
        return avgLoginDurationTime;
    }

    public void setAvgLoginDurationTime(Double avgLoginDurationTime) {
        this.avgLoginDurationTime = avgLoginDurationTime;
    }

    public Double getAvgRceiveDurationTime() {
        return avgRceiveDurationTime;
    }

    public void setAvgRceiveDurationTime(Double avgRceiveDurationTime) {
        this.avgRceiveDurationTime = avgRceiveDurationTime;
    }

    public Long getHangupDurationTime() {
        return hangupDurationTime;
    }

    public void setHangupDurationTime(Long hangupDurationTime) {
        this.hangupDurationTime = hangupDurationTime;
    }

    public Double getAvgHangupDurationTime() {
        return avgHangupDurationTime;
    }

    public void setAvgHangupDurationTime(Double avgHangupDurationTime) {
        this.avgHangupDurationTime = avgHangupDurationTime;
    }

    public Double getRceiveTimeRate() {
        return rceiveTimeRate;
    }

    public void setRceiveTimeRate(Double rceiveTimeRate) {
        this.rceiveTimeRate = rceiveTimeRate;
    }

    public Long getOfflineDurationTime() {
        return offlineDurationTime;
    }

    public void setOfflineDurationTime(Long offlineDurationTime) {
        this.offlineDurationTime = offlineDurationTime;
    }

    public Integer getHour0() {
        return hour0;
    }

    public void setHour0(Integer hour0) {
        this.hour0 = hour0;
    }

    public Integer getHour1() {
        return hour1;
    }

    public void setHour1(Integer hour1) {
        this.hour1 = hour1;
    }

    public Integer getHour2() {
        return hour2;
    }

    public void setHour2(Integer hour2) {
        this.hour2 = hour2;
    }

    public Integer getHour3() {
        return hour3;
    }

    public void setHour3(Integer hour3) {
        this.hour3 = hour3;
    }

    public Integer getHour4() {
        return hour4;
    }

    public void setHour4(Integer hour4) {
        this.hour4 = hour4;
    }

    public Integer getHour5() {
        return hour5;
    }

    public void setHour5(Integer hour5) {
        this.hour5 = hour5;
    }

    public Integer getHour6() {
        return hour6;
    }

    public void setHour6(Integer hour6) {
        this.hour6 = hour6;
    }

    public Integer getHour7() {
        return hour7;
    }

    public void setHour7(Integer hour7) {
        this.hour7 = hour7;
    }

    public Integer getHour8() {
        return hour8;
    }

    public void setHour8(Integer hour8) {
        this.hour8 = hour8;
    }

    public Integer getHour9() {
        return hour9;
    }

    public void setHour9(Integer hour9) {
        this.hour9 = hour9;
    }

    public Integer getHour10() {
        return hour10;
    }

    public void setHour10(Integer hour10) {
        this.hour10 = hour10;
    }

    public Integer getHour11() {
        return hour11;
    }

    public void setHour11(Integer hour11) {
        this.hour11 = hour11;
    }

    public Integer getHour12() {
        return hour12;
    }

    public void setHour12(Integer hour12) {
        this.hour12 = hour12;
    }

    public Integer getHour13() {
        return hour13;
    }

    public void setHour13(Integer hour13) {
        this.hour13 = hour13;
    }

    public Integer getHour14() {
        return hour14;
    }

    public void setHour14(Integer hour14) {
        this.hour14 = hour14;
    }

    public Integer getHour15() {
        return hour15;
    }

    public void setHour15(Integer hour15) {
        this.hour15 = hour15;
    }

    public Integer getHour16() {
        return hour16;
    }

    public void setHour16(Integer hour16) {
        this.hour16 = hour16;
    }

    public Integer getHour17() {
        return hour17;
    }

    public void setHour17(Integer hour17) {
        this.hour17 = hour17;
    }

    public Integer getHour18() {
        return hour18;
    }

    public void setHour18(Integer hour18) {
        this.hour18 = hour18;
    }

    public Integer getHour19() {
        return hour19;
    }

    public void setHour19(Integer hour19) {
        this.hour19 = hour19;
    }

    public Integer getHour20() {
        return hour20;
    }

    public void setHour20(Integer hour20) {
        this.hour20 = hour20;
    }

    public Integer getHour21() {
        return hour21;
    }

    public void setHour21(Integer hour21) {
        this.hour21 = hour21;
    }

    public Integer getHour22() {
        return hour22;
    }

    public void setHour22(Integer hour22) {
        this.hour22 = hour22;
    }

    public Integer getHour23() {
        return hour23;
    }

    public void setHour23(Integer hour23) {
        this.hour23 = hour23;
    }

    public Integer getAssitOrderCreateNum() {
        return assitOrderCreateNum;
    }

    public void setAssitOrderCreateNum(Integer assitOrderCreateNum) {
        this.assitOrderCreateNum = assitOrderCreateNum;
    }

    public Double getAssitOrderCreateAmount() {
        return assitOrderCreateAmount;
    }

    public void setAssitOrderCreateAmount(Double assitOrderCreateAmount) {
        this.assitOrderCreateAmount = assitOrderCreateAmount;
    }

    public Integer getAssitOrderPayNum() {
        return assitOrderPayNum;
    }

    public void setAssitOrderPayNum(Integer assitOrderPayNum) {
        this.assitOrderPayNum = assitOrderPayNum;
    }

    public Double getAssitOrderPayAmount() {
        return assitOrderPayAmount;
    }

    public void setAssitOrderPayAmount(Double assitOrderPayAmount) {
        this.assitOrderPayAmount = assitOrderPayAmount;
    }

    public Integer getAssitOrderFollowupNum() {
        return assitOrderFollowupNum;
    }

    public void setAssitOrderFollowupNum(Integer assitOrderFollowupNum) {
        this.assitOrderFollowupNum = assitOrderFollowupNum;
    }

    public Double getAssitOrderFollowupAmount() {
        return assitOrderFollowupAmount;
    }

    public void setAssitOrderFollowupAmount(Double assitOrderFollowupAmount) {
        this.assitOrderFollowupAmount = assitOrderFollowupAmount;
    }

    public Integer getOutStockOrderBuyerNumFinal() {
        return outStockOrderBuyerNumFinal;
    }

    public void setOutStockOrderBuyerNumFinal(Integer outStockOrderBuyerNumFinal) {
        this.outStockOrderBuyerNumFinal = outStockOrderBuyerNumFinal;
    }

    public Integer getToOrderedOutStockNum() {
        return toOrderedOutStockNum;
    }

    public void setToOrderedOutStockNum(Integer toOrderedOutStockNum) {
        this.toOrderedOutStockNum = toOrderedOutStockNum;
    }

    public Integer getToOrderedOutStockGoodsNum() {
        return toOrderedOutStockGoodsNum;
    }

    public void setToOrderedOutStockGoodsNum(Integer toOrderedOutStockGoodsNum) {
        this.toOrderedOutStockGoodsNum = toOrderedOutStockGoodsNum;
    }

    public Double getToOrderedOutStockAmount() {
        return toOrderedOutStockAmount;
    }

    public void setToOrderedOutStockAmount(Double toOrderedOutStockAmount) {
        this.toOrderedOutStockAmount = toOrderedOutStockAmount;
    }

    public Integer getToOrderedOutStockOrderNum() {
        return toOrderedOutStockOrderNum;
    }

    public void setToOrderedOutStockOrderNum(Integer toOrderedOutStockOrderNum) {
        this.toOrderedOutStockOrderNum = toOrderedOutStockOrderNum;
    }

    /**
     *  打印文档
     */
    @SuppressWarnings("Duplicates")
    public static void printDoc(){
        Field[] declaredFields = CsPerformanceVo.class.getDeclaredFields();
        final String template = "|%s|%s|%s|";
        StringBuilder sb = new StringBuilder(1000);
        for (Field declaredField : declaredFields) {
            ReflectionUtils.makeAccessible(declaredField);
            String name = declaredField.getName();
            if (declaredField.getAnnotation(Property.class)!=null) {
                sb.append(String.format(template, name
                        , declaredField.getType().getSimpleName(), declaredField.getAnnotation(Property.class).value()));
                sb.append("\n");
            }else{
                sb.append(String.format(template, name
                        , declaredField.getType().getSimpleName(),getExplain(name)));
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

    }

    /**
     *  打印每个字段属于哪个 表格的
     */
    public static void printTable(){
        String tmp1 = "## %s";
        String tmp2 = " %s | %s ";
        final Field[] declaredFields = CsPerformanceVo.class.getDeclaredFields();
        final Map<String, Field> nField = Arrays.stream(declaredFields).collect(Collectors.toMap(
                Field::getName, v -> v
        ));
        process(tmp1, tmp2, declaredFields, nField, true);
    }

    private static void process(String tmp1, String tmp2, Field[] declaredFields, Map<String, Field> nField, boolean tableValid) {
        for (Field field : declaredFields) {
            if(field.getAnnotationsByType(Done.class).length != 0){
                return;
            }
            final Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            final String name = field.getName();
            for (Annotation declaredAnnotation : declaredAnnotations) {

                final Class<? extends Annotation> aClass = declaredAnnotation.annotationType();
                if (aClass == Table.class && tableValid){
                    final String tableName = field.getDeclaredAnnotation(Table.class).value();
                    System.out.println(String.format(tmp1, tableName));
                    System.out.println("名称     |     字段     ");
                    System.out.println("------------ | -------------");
                    final List<String> fls = getFls(tableName);
                    List<Field> ar = new ArrayList<>();
                    for (String fl : fls) {
                        final Field fd = nField.get(fl);
                        ar.add(fd);
                    }
                    process(tmp1,tmp2,ar.toArray(new Field[0]),nField, false);
                }
                if (aClass == Property.class){
                    final Property an = field.getDeclaredAnnotation(Property.class);
                    System.out.println(
                            String.format(tmp2,an.value(),name)
                    );
                }
            }
            if (name.startsWith("hour")){
                System.out.println(
                        String.format(tmp2,getExplain(name),name)
                );
            }
        }
    }

    /**
     *  生成AVG
     */
    public static void generatorAvg(){
        Set<String> ignore = new HashSet<>();
        ignore.add("csNick");
        ignore.add("date");
        ignore.add("shopId");
        Arrays.stream(CsPerformanceVo.class.getDeclaredFields()).filter(k->!k.getName().endsWith("Str")).forEach(e->{
            if (!ignore.contains(e.getName())) {
                Property annotation = e.getAnnotation(Property.class);
                Class<?> type = e.getType();
                final boolean isNumber = Number.class.isAssignableFrom(type);
                final boolean isLocalTime = type.equals(LocalTime.class);
                if ((isNumber||isLocalTime)){
                    if (annotation != null) {
                        if (!annotation.direct()) {
                            System.out.println("    @Property(value = \"" + annotation.value() + "\", direct = true)");
                        } else {
                            System.out.println("    @Property(value = \"" + annotation.value() + "\")");
                        }
                    }
                    if (isNumber) {
                        System.out.println("    private  Double " + e.getName() + ";\n");
                    } else {

                        if (isLocalTime) {
                            System.out.println("    private  LocalTime " + e.getName() + ";\n");
                        }else {
                        }
                    }
                }
            }
        });
    }

    private static Object getExplain(String name) {
        if (name.startsWith("hour")){
            return "分时接待量第"+name.substring("hour".length())+"小时";
        }
        return name;
    }

}
