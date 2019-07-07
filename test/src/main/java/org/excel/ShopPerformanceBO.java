package org.excel;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 店铺绩效BO
 *
 * @author wenhui
 * @create 2019-01-23 10:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopPerformanceBO {

    /*-------------------销售数据----------------------*/
    @Property(value = "店铺销售额、是否扣除退款、是否扣除邮费", direct = true)
    private Double shopSaleAmount;//店铺销售额

    @Property(value = "店铺销售量、是否扣除退款件数", direct = true)
    private Integer shopSaleGoodsNum;//店铺销售量

    @Property(value = "店铺销售人数", direct = true)
    private Integer shopSaleBuyerNum;//店铺销售人数

    @Property(value = "店铺销售订单数", direct = true)
    private Integer shopSaleOrderNum;//店铺销售订单数

    @Property(value = "客服销售额、是否扣除退款、是否扣除邮费", direct = true)
    private Double csSaleAmount;//客服销售额

    @Property(value = "客服销售量、是否扣除退款件数", direct = true)
    private Integer csSaleGoodsNum;//客服销售量

    @Property(value = "客服销售人数", direct = true)
    private Integer csSaleBuyerNum;//客服销售人数

    @Property(value = "客服销售订单数", direct = true)
    private Integer csSaleOrderNum;//客服销售订单数

    @Property(value = "客服销售额占比", direct = true)
    private Double csSaleAmountPercent;//客服销售额占比

    @Property(value = "客服成交件数", direct = true)
    private Integer csTransactionsNum;

    //@Property(value = "客服成交笔数", direct = true)
    //private Integer csSaleOrderSkuNum;//客服成交笔数

    @Property(value = "静默销售额、是否扣除退款、是否扣除邮费", direct = true)
    private Double silenceSaleAmount;//静默销售额

    @Property(value = "静默销售量、是否扣除退款件数", direct = true)
    private Integer silenceSaleGoodsNum;//静默销售量

    @Property(value = "静默销售人数", direct = true)
    private Integer silenceSaleBuyerNum;//静默销售人数

    @Property(value = "静默销售订单数", direct = true)
    private Integer silenceSaleOrderNum;//静默销售订单数

    @Property(value = "静默销售额占比", direct = true)
    private Double silenceSaleAmountPercent;//静默销售额占比


    /*-------------------顾客数据----------------------*/


    @Property(value = "浏览量(PV)", direct = true)
    private Long pvNum;//浏览量(PV)
    @Property(value = "访客数(UV)", direct = true)
    private Long uvNum;//访客数(UV)
    @Property(value = "咨询人数", direct = true)
    private Integer consultNum;//咨询人数
    @Property(value = "咨询量", direct = true)
    private Integer consultSessionNum;//咨询量
    @Property(value = "接待人数", direct = true)
    private Integer receiveNum;//接待人数
    @Property(value = "接待量", direct = true)
    private Integer receiveSessionNum;//接待量
    @Property(value = "询单人数", direct = true)
    private Integer enquiryNum;//询单人数
    @Property(value = "咨询率", direct = true)
    private Double consultPercent;//咨询率

    /*-------------------客单价----------------------*/


    @Property(value = "店铺销售客单价（元/人）", direct = true)
    private Double shopSaleGuestAvgAmount;//店铺销售客单价（元/人）

    @Property(value = "店铺销售客件数（件/人）", direct = true)
    private Double shopSaleGuestAvgGoods;//店铺销售客件数（件/人）

    @Property(value = "店铺销售件均价（元/件）", direct = true)
    private Double shopSaleGoodsAvgAmount;//店铺销售件均价（元/件）

    @Property(value = "店铺出库客单价（元/人）", direct = true)
    private Double shopOutStockGuestAvgAmount;//店铺出库客单价（元/人）

    @Property(value = "店铺出库客件数（件/人）", direct = true)
    private Double shopOutStockGuestItemNum;//店铺出库客件数（件/人）

    @Property(value = "店铺出库件均价（元/件）", direct = true)
    private Double shopOutStockItemAvgAmount;//店铺出库件均价（元/件）

    @Property(value = "客服销售客单价（元/人）", direct = true)
    private Double csSaleGuestAvgAmount;//客服销售客单价（元/人）

    @Property(value = "客服销售客件数（件/人）", direct = true)
    private Double csSaleGuestAvgGoods;//客服销售客件数（件/人）

    @Property(value = "客服销售件均价（元/件）", direct = true)
    private Double csSaleGoodsAvgAmount;//客服销售件均价（元/件）

    @Property(value = "客服出库客单价（元/人）", direct = true)
    private Double csOutStockGuestAvgAmount;//客服出库客单价（元/件）

    @Property(value = "客服出库客件数（件/人）", direct = true)
    private Double csOutStockGuestItemNum;//客服出库客件数（件/人）

    @Property(value = "客服出库件均价（元/件）", direct = true)
    private Double csOutStockItemAvgAmount;//客服出库件均价（元/件）

    @Property(value = "静默销售客单价（元/人）", direct = true)
    private Double silenceSaleGuestAvgAmount;//静默销售客单价（元/人）

    @Property(value = "静默销售客件数（件/人）", direct = true)
    private Double silenceSaleGuestAvgGoods;//静默销售客件数（件/人）

    @Property(value = "静默销售件均价（元/件）", direct = true)
    private Double silenceSaleGoodsAvgAmount;//静默销售件均价（元/件）

    @Property(value = "静默出库客单价（元/人）", direct = true)
    private Double silenceOutStockGuestAvgAmount;//静默出库客单价（元/件）

    @Property(value = "静默出库客件数（件/人）", direct = true)
    private Double silenceOutStockGuestItemNum;//静默出库客件数（件/人）

    @Property(value = "静默出库件均价（元/件）", direct = true)
    private Double silenceOutStockItemAvgAmount;//静默出库件均价（元/件）


    /*-------------------转化率----------------------*/

    @Property(value = "全店成交转化率", direct = true)
    private Double shopDealPercent;//全店成交转化率

    @Property(value = "全店出库转化率", direct = true)
    private Double shopOutStockPercent;//全店出库转化率

    @Property(value = "静默转化率", direct = true)
    private Double silenceDealPercent;//静默转化率


    @Property(value = "询单→次日付款转化率", direct = true)
    private Double queryToTomorrow;//询单→次日付款转化率

    @Property(value = "询单→付款转化率")
    private Double queryToFinalPaid;

    @Property(value = "询单→当日下单转化率")
    private Double queryToOrderedToday;

    @Property(value = "询单→下单转化率")
    private Double queryToFinalOrdered;

    @Property(value = "下单→当日付款转化率")
    private Double orderedToPaid;

    @Property(value = "下单→付款转化率")
    private Double orderedToPaidFinal;

    @Property(value = "询单→出库转化率")
    private Double queryToOutStock;


    /*-------------------询单→下单----------------------*/

    @Property(value = "询单→当日下单人数", direct = true)
    private Integer orderedNumToday;

    @Property(value = "询单→当日下单金额", direct = true)//-
    private Double orderedAmountToday;

    @Property(value = "询单→最终下单金额", direct = true)//-
    private Double orderedAmountFinal;

    @Property(value = "询单→最终下单人数", direct = true)
    private Integer orderedNumFinal;

    @Property(value = "下单件均价（元/件）")//-
    private Double orderItemAvgAmount;

    @Property(value = "下单客单价（元/人）")//-
    private Double orderedGuestAvgPrice;

    @Property(value = "下单客件数（件/人）")//-
    private Double orderedGuestAvgAmount;

    /*-------------------下单→付款----------------------*/

    @Property(value = "下单→当日付款人数", direct = true)
    private Integer orderedPaidNumToday;

    @Property(value = "下单→当日付款件数", direct = true)
    private Integer orderedPaidGoodsToday;

    @Property(value = "下单→当日付款金额", direct = true)
    private Double orderedPaidAmountToday;

    @Property(value = "下单→当日付款订单数", direct = true)
    private Integer orderedPaidOrdersToday;

    @Property(value = "下单→最终付款人数", direct = true)
    private Integer orderedPaidNumFinal;

    @Property(value = "下单→最终付款件数", direct = true)
    private Integer orderedPaidGoodsFinal;

    @Property(value = "下单→最终付款金额", direct = true)
    private Double orderedPaidAmountFinal;

    @Property(value = "下单→最终付款订单数", direct = true)
    private Integer orderedPaidOrdersFinal;


    /*-------------------下单→出库----------------------*/

    @Property(value = "下单→出库人数", direct = true)
    private Integer orderedOutStockNum;

    @Property(value = "下单→出库件数", direct = true)
    private Integer orderedOutStockGoods;

    @Property(value = "下单→出库金额", direct = true)
    private Double orderedOutStockAmount;

    @Property(value = "下单→出库订单数", direct = true)
    private Integer orderedOutStockOrders;

    /*-------------------询单→付款----------------------*/
    @Property(value = "询单→次日付款人数", direct = true)
    private Integer paidNumTodayNext;

    @Property(value = "询单→最终付款人数", direct = true)
    private Integer paidNumFinal;

    /*-------------------客服落实下单----------------------*/

    @Property(value = "客服落实下单人数", direct = true)
    private Integer toOrderedNum;

    @Property(value = "客服落实下单件数", direct = true)
    private Integer toOrderedGoodsNum;

    @Property(value = "客服落实下单金额", direct = true)//-
    private Double toOrderedAmount;

    @Property(value = "客服落实下单订单数", direct = true)
    private Integer toOrderedOrderNum;


    /*-------------------工作量----------------------*/
    @Property(value = "值班客服数", direct = true)
    private Integer dutyCsNum;

    @Property(value = "登录时长")
    private Long loginDurationTime;

    @Property(value = "接待时长")
    private Long rceiveDurationTime;

    @Property(value = "总消息数", direct = true)
    private Integer chatNum;

    @Property(value = "顾客消息数", direct = true)
    private Integer custChatNum;

    @Property(value = "客服消息数", direct = true)
    private Integer csChatNum;

    @Property(value = "平均回复消息数")
    private Double avgReplyMsg;

    @Property(value = "答问比")
    private Double answerRatio;

    @Property(value = "客服字数", direct = true)
    private Integer csWordNum;

    @Property(value = "最大同时接待量", direct = true)
    private Integer maxReceiveSessionNum;

    @Property(value = "未回复量", direct = true)
    private Integer nonReplySessionNum;


    @Property(value = "回复率")
    private Double responseRate;


    @Property(value = "慢响应量")
    private Integer slowRespSessionNum;

    @Property(value = "长接待量")
    private Integer longRespSessionNum;

    @Property(value = "快速应答率")
    private Double quickResponseRate;

    @Property(value = "首次平均响应（s）")
    private Double avgRespTimeFirst;

    @Property(value = "平均响应（s）")
    private Double avgRespTime;

    @Property(value = "平均会话时长")
    private Double avgSessionDurationTime;

    @Property(value = "留言咨询量")
    private Integer advisoryMessageNum;

    @Property(value = "留言分配量")
    private Integer leaveMsgSessionNum;

    @Property(value = "留言接待量")
    private Integer leaveMsgReceiveSessionNum;

    @Property(value = "留言回复率")
    private Double leaveMsgReplyRate;

    @Property(value = "留言响应率")
    private Double leaveMsgResponseRate;

    /*-------------------协助服务----------------------*/
    @Property("协助下单人数")
    private Integer aidOrderNum;

    @Property("协助下单金额")
    private Double aidOrderAmount;//-

    @Property("协助跟进人数")
    private Integer aidFollowNum;

    @Property("协助跟进金额")
    private Double aidFollowAmount;//-

    @Property("协助付款人数")
    private Integer aidPayNum;

    @Property("协助付款金额")
    private Double aidPayAmount;
    /*-------------------出库数据----------------------*/

    @Property(value = "店铺出库金额", direct = true)
    private Double shopOutStockAmount;//店铺出库的金额

    @Property(value = "店铺出库件数", direct = true)
    private Integer shopOutStockGoodsNum;//店铺出库件数

    @Property(value = "店铺出库人数", direct = true)
    private Integer shopOutStockNum;//店铺出库的人数

    @Property(value = "店铺出库订单数", direct = true)
    private Integer shopOutStockOrderNum;//店铺出库订单数

    @Property(value = "客服出库金额", direct = true)
    private Double csOutStockAmount;//客服出库的金额

    @Property(value = "客服出库件数", direct = true)
    private Integer csOutStockGoodsNum;//客服出库件数

    @Property(value = "客服出库人数", direct = true)
    private Integer csOutStockNum;//客服出库的人数

    @Property(value = "客服出库订单数", direct = true)
    private Integer csOutStockOrderNum;//客服出库订单数

    @Property(value = "客服出库金额占比", direct = true)
    private Double csOutStockAmountPercent;//客服出库金额占比

    @Property(value = "静默出库金额", direct = true)
    private Double silenceOutStockAmount;//静默出库的金额

    @Property(value = "静默出库件数", direct = true)
    private Integer silenceOutStockGoodsNum;//静默出库件数

    @Property(value = "静默出库人数", direct = true)
    private Integer silenceOutStockNum;//静默出库的人数

    @Property(value = "静默出库订单数", direct = true)
    private Integer silenceOutStockOrderNum;//静默出库订单数

    @Property(value = "静默出库金额占比", direct = true)
    private Double silenceOutStockAmountPercent;//静默出库金额占比


    @Property(value = "客服最终出库人数", direct = true)
    private Integer csOutStockBuyerNumFinal;


    /*-------------------中差评----------------------*/

    @Property(value = "中评数", direct = true)
    private Integer shopNeutralEvaluateNum;

    @Property(value = "差评数", direct = true)
    private Integer shopBadEvaluateNum;

    @Property(value = "中差评总数", direct = true)
    private Integer shopNeutralBadEvaluateNumTotal;


    @Property(value = "客服中评数", direct = true)
    private Integer csNeutralEvaluateNum;

    @Property(value = "客服差评数", direct = true)
    private Integer csBadEvaluateNum;

    @Property(value = "客服中差评总数", direct = true)
    private Integer csNeutralBadEvaluateNumTotal;


    @Property(value = "静默中评数", direct = true)
    private Integer silenceNeutralEvaluateNum;

    @Property(value = "静默差评数", direct = true)
    private Integer silenceBadEvaluateNum;

    @Property(value = "静默中差评总数", direct = true)
    private Integer silenceNeutralBadEvaluateNumTotal;


    /*-------------------满意率----------------------*/

    @Property(value = "邀评量", direct = true)
    private Integer inviteEvaluateNum;

    @Property(value = "评价量")
    private Integer evaluateNum;

    @Property(value = "满意度-非常满意", direct = true)
    private Integer verySatisfiedNum;

    @Property(value = "满意度-满意", direct = true)
    private Integer satisfiedNum;

    @Property(value = "满意度-一般", direct = true)
    private Integer generalNum;

    @Property(value = "满意度-不满意", direct = true)
    private Integer dissatisfiedNum;

    @Property(value = "满意度-非常不满意", direct = true)
    private Integer veryDissatisfiedNum;

    @Property(value = "邀评率", direct = true)
    private Double inviteEvaluateRate;

    @Property(value = "评价率")
    private Double evaluateRate;

    @Property(value = "满意率")
    private Double satisfactionRate;

    /*-------------------退款数据----------------------*/

    @Property(value = "店铺退款笔数")
    private Integer shopRefundNum;
    @Property(value = "店铺退款人数")
    private Integer shopRefundBuyerNum;
    @Property(value = "店铺退款件数")
    private Integer shopRefundProductNum;
    @Property(value = "店铺退款金额", direct = true)
    private Double shopRefundAmount;

    @Property(value = "客服退款笔数")
    private Integer csRefundNum;
    @Property(value = "客服退款人数")
    private Integer csRefundBuyerNum;
    @Property(value = "客服退款件数")
    private Integer csRefundProductNum;
    @Property(value = "客服退款金额", direct = true)
    private Double csRefundAmount;
    @Property(value = "客服退款率")
    private Double csRefundPercent;

    @Property(value = "静默退款笔数")
    private Integer silenceRefundNum;
    @Property(value = "静默退款人数")
    private Integer silenceRefundBuyerNum;
    @Property(value = "静默退款件数")
    private Integer silenceRefundProductNum;
    @Property(value = "静默退款金额", direct = true)
    private Double silenceRefundAmount;

    /*-------------------流失数据----------------------*/

    @Property(value = "询单流失人数")
    private Integer enquiryLossNum;

    @Property(value = "客服落实下单未付款人数")
    private Integer csPracticalOrderedUnpaidPeople;
    @Property(value = "客服落实下单未付款件数")
    private Integer csPracticalOrderedUnpaidItemNum;
    @Property(value = "客服落实下单未付款金额")
    private Double csPracticalOrderedUnpaidAmount;
    @Property(value = "客服落实下单未付款订单数")
    private Integer csPracticalOrderedUnpaidOrderedNum;

    @Property(value = "客服落实下单未出库人数")
    private Integer csPracticalOrderedUnoutStockPeople;
    @Property(value = "客服落实下单未出库件数")
    private Integer csPracticalOrderedUnoutStockItemNum;
    @Property(value = "客服落实下单未出库金额")
    private Double csPracticalOrderedUnoutStockAmount;
    @Property(value = "客服落实下单未出库订单数")
    private Integer csPracticalOrderedUnoutStockOrderedNum;


    /*-------------------其他----------------------*/
    @Property(value = "店铺邮费 ", direct = true)
    private Double shopPostFee;
    @Property(value = "静默邮费", direct = true)
    private Double silencePostFee;
    @Property(value = "客服邮费", direct = true)
    private Double csPostFee;

    @Property(value = "商品评价DSR", direct = true)
    private Double productEvaluationDSR;
    @Property(value = "服务态度DSR", direct = true)
    private Double serviceAttitudeDSR;

    @Property(value = "物流速度DSR", direct = true)
    private Double logisticsSpeedDSR;

    private Integer sessionNum;//总会话数
    private Integer avgRespInQuickTime;//平均响应时间在快速应答时间中的会话数

    public Double getShopSaleAmount() {
        return shopSaleAmount;
    }

    public void setShopSaleAmount(Double shopSaleAmount) {
        this.shopSaleAmount = shopSaleAmount;
    }

    public Integer getShopSaleGoodsNum() {
        return shopSaleGoodsNum;
    }

    public void setShopSaleGoodsNum(Integer shopSaleGoodsNum) {
        this.shopSaleGoodsNum = shopSaleGoodsNum;
    }

    public Integer getShopSaleBuyerNum() {
        return shopSaleBuyerNum;
    }

    public void setShopSaleBuyerNum(Integer shopSaleBuyerNum) {
        this.shopSaleBuyerNum = shopSaleBuyerNum;
    }

    public Integer getShopSaleOrderNum() {
        return shopSaleOrderNum;
    }

    public void setShopSaleOrderNum(Integer shopSaleOrderNum) {
        this.shopSaleOrderNum = shopSaleOrderNum;
    }

    public Double getCsSaleAmount() {
        return csSaleAmount;
    }

    public void setCsSaleAmount(Double csSaleAmount) {
        this.csSaleAmount = csSaleAmount;
    }

    public Integer getCsSaleGoodsNum() {
        return csSaleGoodsNum;
    }

    public void setCsSaleGoodsNum(Integer csSaleGoodsNum) {
        this.csSaleGoodsNum = csSaleGoodsNum;
    }

    public Integer getCsSaleBuyerNum() {
        return csSaleBuyerNum;
    }

    public void setCsSaleBuyerNum(Integer csSaleBuyerNum) {
        this.csSaleBuyerNum = csSaleBuyerNum;
    }

    public Integer getCsSaleOrderNum() {
        return csSaleOrderNum;
    }

    public void setCsSaleOrderNum(Integer csSaleOrderNum) {
        this.csSaleOrderNum = csSaleOrderNum;
    }

    public Double getCsSaleAmountPercent() {
        return csSaleAmountPercent;
    }

    public void setCsSaleAmountPercent(Double csSaleAmountPercent) {
        this.csSaleAmountPercent = csSaleAmountPercent;
    }

    public Integer getCsTransactionsNum() {
        return csTransactionsNum;
    }

    public void setCsTransactionsNum(Integer csTransactionsNum) {
        this.csTransactionsNum = csTransactionsNum;
    }

    public Double getSilenceSaleAmount() {
        return silenceSaleAmount;
    }

    public void setSilenceSaleAmount(Double silenceSaleAmount) {
        this.silenceSaleAmount = silenceSaleAmount;
    }

    public Integer getSilenceSaleGoodsNum() {
        return silenceSaleGoodsNum;
    }

    public void setSilenceSaleGoodsNum(Integer silenceSaleGoodsNum) {
        this.silenceSaleGoodsNum = silenceSaleGoodsNum;
    }

    public Integer getSilenceSaleBuyerNum() {
        return silenceSaleBuyerNum;
    }

    public void setSilenceSaleBuyerNum(Integer silenceSaleBuyerNum) {
        this.silenceSaleBuyerNum = silenceSaleBuyerNum;
    }

    public Integer getSilenceSaleOrderNum() {
        return silenceSaleOrderNum;
    }

    public void setSilenceSaleOrderNum(Integer silenceSaleOrderNum) {
        this.silenceSaleOrderNum = silenceSaleOrderNum;
    }

    public Double getSilenceSaleAmountPercent() {
        return silenceSaleAmountPercent;
    }

    public void setSilenceSaleAmountPercent(Double silenceSaleAmountPercent) {
        this.silenceSaleAmountPercent = silenceSaleAmountPercent;
    }

    public Long getPvNum() {
        return pvNum;
    }

    public void setPvNum(Long pvNum) {
        this.pvNum = pvNum;
    }

    public Long getUvNum() {
        return uvNum;
    }

    public void setUvNum(Long uvNum) {
        this.uvNum = uvNum;
    }

    public Integer getConsultNum() {
        return consultNum;
    }

    public void setConsultNum(Integer consultNum) {
        this.consultNum = consultNum;
    }

    public Integer getConsultSessionNum() {
        return consultSessionNum;
    }

    public void setConsultSessionNum(Integer consultSessionNum) {
        this.consultSessionNum = consultSessionNum;
    }

    public Integer getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Integer receiveNum) {
        this.receiveNum = receiveNum;
    }

    public Integer getReceiveSessionNum() {
        return receiveSessionNum;
    }

    public void setReceiveSessionNum(Integer receiveSessionNum) {
        this.receiveSessionNum = receiveSessionNum;
    }

    public Integer getEnquiryNum() {
        return enquiryNum;
    }

    public void setEnquiryNum(Integer enquiryNum) {
        this.enquiryNum = enquiryNum;
    }

    public Double getConsultPercent() {
        return consultPercent;
    }

    public void setConsultPercent(Double consultPercent) {
        this.consultPercent = consultPercent;
    }

    public Double getShopSaleGuestAvgAmount() {
        return shopSaleGuestAvgAmount;
    }

    public void setShopSaleGuestAvgAmount(Double shopSaleGuestAvgAmount) {
        this.shopSaleGuestAvgAmount = shopSaleGuestAvgAmount;
    }

    public Double getShopSaleGuestAvgGoods() {
        return shopSaleGuestAvgGoods;
    }

    public void setShopSaleGuestAvgGoods(Double shopSaleGuestAvgGoods) {
        this.shopSaleGuestAvgGoods = shopSaleGuestAvgGoods;
    }

    public Double getShopSaleGoodsAvgAmount() {
        return shopSaleGoodsAvgAmount;
    }

    public void setShopSaleGoodsAvgAmount(Double shopSaleGoodsAvgAmount) {
        this.shopSaleGoodsAvgAmount = shopSaleGoodsAvgAmount;
    }

    public Double getShopOutStockGuestAvgAmount() {
        return shopOutStockGuestAvgAmount;
    }

    public void setShopOutStockGuestAvgAmount(Double shopOutStockGuestAvgAmount) {
        this.shopOutStockGuestAvgAmount = shopOutStockGuestAvgAmount;
    }

    public Double getShopOutStockGuestItemNum() {
        return shopOutStockGuestItemNum;
    }

    public void setShopOutStockGuestItemNum(Double shopOutStockGuestItemNum) {
        this.shopOutStockGuestItemNum = shopOutStockGuestItemNum;
    }

    public Double getShopOutStockItemAvgAmount() {
        return shopOutStockItemAvgAmount;
    }

    public void setShopOutStockItemAvgAmount(Double shopOutStockItemAvgAmount) {
        this.shopOutStockItemAvgAmount = shopOutStockItemAvgAmount;
    }

    public Double getCsSaleGuestAvgAmount() {
        return csSaleGuestAvgAmount;
    }

    public void setCsSaleGuestAvgAmount(Double csSaleGuestAvgAmount) {
        this.csSaleGuestAvgAmount = csSaleGuestAvgAmount;
    }

    public Double getCsSaleGuestAvgGoods() {
        return csSaleGuestAvgGoods;
    }

    public void setCsSaleGuestAvgGoods(Double csSaleGuestAvgGoods) {
        this.csSaleGuestAvgGoods = csSaleGuestAvgGoods;
    }

    public Double getCsSaleGoodsAvgAmount() {
        return csSaleGoodsAvgAmount;
    }

    public void setCsSaleGoodsAvgAmount(Double csSaleGoodsAvgAmount) {
        this.csSaleGoodsAvgAmount = csSaleGoodsAvgAmount;
    }

    public Double getCsOutStockGuestAvgAmount() {
        return csOutStockGuestAvgAmount;
    }

    public void setCsOutStockGuestAvgAmount(Double csOutStockGuestAvgAmount) {
        this.csOutStockGuestAvgAmount = csOutStockGuestAvgAmount;
    }

    public Double getCsOutStockGuestItemNum() {
        return csOutStockGuestItemNum;
    }

    public void setCsOutStockGuestItemNum(Double csOutStockGuestItemNum) {
        this.csOutStockGuestItemNum = csOutStockGuestItemNum;
    }

    public Double getCsOutStockItemAvgAmount() {
        return csOutStockItemAvgAmount;
    }

    public void setCsOutStockItemAvgAmount(Double csOutStockItemAvgAmount) {
        this.csOutStockItemAvgAmount = csOutStockItemAvgAmount;
    }

    public Double getSilenceSaleGuestAvgAmount() {
        return silenceSaleGuestAvgAmount;
    }

    public void setSilenceSaleGuestAvgAmount(Double silenceSaleGuestAvgAmount) {
        this.silenceSaleGuestAvgAmount = silenceSaleGuestAvgAmount;
    }

    public Double getSilenceSaleGuestAvgGoods() {
        return silenceSaleGuestAvgGoods;
    }

    public void setSilenceSaleGuestAvgGoods(Double silenceSaleGuestAvgGoods) {
        this.silenceSaleGuestAvgGoods = silenceSaleGuestAvgGoods;
    }

    public Double getSilenceSaleGoodsAvgAmount() {
        return silenceSaleGoodsAvgAmount;
    }

    public void setSilenceSaleGoodsAvgAmount(Double silenceSaleGoodsAvgAmount) {
        this.silenceSaleGoodsAvgAmount = silenceSaleGoodsAvgAmount;
    }

    public Double getSilenceOutStockGuestAvgAmount() {
        return silenceOutStockGuestAvgAmount;
    }

    public void setSilenceOutStockGuestAvgAmount(Double silenceOutStockGuestAvgAmount) {
        this.silenceOutStockGuestAvgAmount = silenceOutStockGuestAvgAmount;
    }

    public Double getSilenceOutStockGuestItemNum() {
        return silenceOutStockGuestItemNum;
    }

    public void setSilenceOutStockGuestItemNum(Double silenceOutStockGuestItemNum) {
        this.silenceOutStockGuestItemNum = silenceOutStockGuestItemNum;
    }

    public Double getSilenceOutStockItemAvgAmount() {
        return silenceOutStockItemAvgAmount;
    }

    public void setSilenceOutStockItemAvgAmount(Double silenceOutStockItemAvgAmount) {
        this.silenceOutStockItemAvgAmount = silenceOutStockItemAvgAmount;
    }

    public Double getShopDealPercent() {
        return shopDealPercent;
    }

    public void setShopDealPercent(Double shopDealPercent) {
        this.shopDealPercent = shopDealPercent;
    }

    public Double getShopOutStockPercent() {
        return shopOutStockPercent;
    }

    public void setShopOutStockPercent(Double shopOutStockPercent) {
        this.shopOutStockPercent = shopOutStockPercent;
    }

    public Double getSilenceDealPercent() {
        return silenceDealPercent;
    }

    public void setSilenceDealPercent(Double silenceDealPercent) {
        this.silenceDealPercent = silenceDealPercent;
    }

    public Double getQueryToTomorrow() {
        return queryToTomorrow;
    }

    public void setQueryToTomorrow(Double queryToTomorrow) {
        this.queryToTomorrow = queryToTomorrow;
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

    public Double getQueryToFinalOrdered() {
        return queryToFinalOrdered;
    }

    public void setQueryToFinalOrdered(Double queryToFinalOrdered) {
        this.queryToFinalOrdered = queryToFinalOrdered;
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

    public Double getQueryToOutStock() {
        return queryToOutStock;
    }

    public void setQueryToOutStock(Double queryToOutStock) {
        this.queryToOutStock = queryToOutStock;
    }

    public Integer getOrderedNumToday() {
        return orderedNumToday;
    }

    public void setOrderedNumToday(Integer orderedNumToday) {
        this.orderedNumToday = orderedNumToday;
    }

    public Double getOrderedAmountToday() {
        return orderedAmountToday;
    }

    public void setOrderedAmountToday(Double orderedAmountToday) {
        this.orderedAmountToday = orderedAmountToday;
    }

    public Double getOrderedAmountFinal() {
        return orderedAmountFinal;
    }

    public void setOrderedAmountFinal(Double orderedAmountFinal) {
        this.orderedAmountFinal = orderedAmountFinal;
    }

    public Integer getOrderedNumFinal() {
        return orderedNumFinal;
    }

    public void setOrderedNumFinal(Integer orderedNumFinal) {
        this.orderedNumFinal = orderedNumFinal;
    }

    public Double getOrderItemAvgAmount() {
        return orderItemAvgAmount;
    }

    public void setOrderItemAvgAmount(Double orderItemAvgAmount) {
        this.orderItemAvgAmount = orderItemAvgAmount;
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

    public Integer getOrderedPaidNumToday() {
        return orderedPaidNumToday;
    }

    public void setOrderedPaidNumToday(Integer orderedPaidNumToday) {
        this.orderedPaidNumToday = orderedPaidNumToday;
    }

    public Integer getOrderedPaidGoodsToday() {
        return orderedPaidGoodsToday;
    }

    public void setOrderedPaidGoodsToday(Integer orderedPaidGoodsToday) {
        this.orderedPaidGoodsToday = orderedPaidGoodsToday;
    }

    public Double getOrderedPaidAmountToday() {
        return orderedPaidAmountToday;
    }

    public void setOrderedPaidAmountToday(Double orderedPaidAmountToday) {
        this.orderedPaidAmountToday = orderedPaidAmountToday;
    }

    public Integer getOrderedPaidOrdersToday() {
        return orderedPaidOrdersToday;
    }

    public void setOrderedPaidOrdersToday(Integer orderedPaidOrdersToday) {
        this.orderedPaidOrdersToday = orderedPaidOrdersToday;
    }

    public Integer getOrderedPaidNumFinal() {
        return orderedPaidNumFinal;
    }

    public void setOrderedPaidNumFinal(Integer orderedPaidNumFinal) {
        this.orderedPaidNumFinal = orderedPaidNumFinal;
    }

    public Integer getOrderedPaidGoodsFinal() {
        return orderedPaidGoodsFinal;
    }

    public void setOrderedPaidGoodsFinal(Integer orderedPaidGoodsFinal) {
        this.orderedPaidGoodsFinal = orderedPaidGoodsFinal;
    }

    public Double getOrderedPaidAmountFinal() {
        return orderedPaidAmountFinal;
    }

    public void setOrderedPaidAmountFinal(Double orderedPaidAmountFinal) {
        this.orderedPaidAmountFinal = orderedPaidAmountFinal;
    }

    public Integer getOrderedPaidOrdersFinal() {
        return orderedPaidOrdersFinal;
    }

    public void setOrderedPaidOrdersFinal(Integer orderedPaidOrdersFinal) {
        this.orderedPaidOrdersFinal = orderedPaidOrdersFinal;
    }

    public Integer getOrderedOutStockNum() {
        return orderedOutStockNum;
    }

    public void setOrderedOutStockNum(Integer orderedOutStockNum) {
        this.orderedOutStockNum = orderedOutStockNum;
    }

    public Integer getOrderedOutStockGoods() {
        return orderedOutStockGoods;
    }

    public void setOrderedOutStockGoods(Integer orderedOutStockGoods) {
        this.orderedOutStockGoods = orderedOutStockGoods;
    }

    public Double getOrderedOutStockAmount() {
        return orderedOutStockAmount;
    }

    public void setOrderedOutStockAmount(Double orderedOutStockAmount) {
        this.orderedOutStockAmount = orderedOutStockAmount;
    }

    public Integer getOrderedOutStockOrders() {
        return orderedOutStockOrders;
    }

    public void setOrderedOutStockOrders(Integer orderedOutStockOrders) {
        this.orderedOutStockOrders = orderedOutStockOrders;
    }

    public Integer getPaidNumTodayNext() {
        return paidNumTodayNext;
    }

    public void setPaidNumTodayNext(Integer paidNumTodayNext) {
        this.paidNumTodayNext = paidNumTodayNext;
    }

    public Integer getPaidNumFinal() {
        return paidNumFinal;
    }

    public void setPaidNumFinal(Integer paidNumFinal) {
        this.paidNumFinal = paidNumFinal;
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

    public Integer getDutyCsNum() {
        return dutyCsNum;
    }

    public void setDutyCsNum(Integer dutyCsNum) {
        this.dutyCsNum = dutyCsNum;
    }

    public Long getLoginDurationTime() {
        return loginDurationTime;
    }

    public void setLoginDurationTime(Long loginDurationTime) {
        this.loginDurationTime = loginDurationTime;
    }

    public Long getRceiveDurationTime() {
        return rceiveDurationTime;
    }

    public void setRceiveDurationTime(Long rceiveDurationTime) {
        this.rceiveDurationTime = rceiveDurationTime;
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

    public Double getAvgReplyMsg() {
        return avgReplyMsg;
    }

    public void setAvgReplyMsg(Double avgReplyMsg) {
        this.avgReplyMsg = avgReplyMsg;
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

    public Double getQuickResponseRate() {
        return quickResponseRate;
    }

    public void setQuickResponseRate(Double quickResponseRate) {
        this.quickResponseRate = quickResponseRate;
    }

    public Double getAvgRespTimeFirst() {
        return avgRespTimeFirst;
    }

    public void setAvgRespTimeFirst(Double avgRespTimeFirst) {
        this.avgRespTimeFirst = avgRespTimeFirst;
    }

    public Double getAvgRespTime() {
        return avgRespTime;
    }

    public void setAvgRespTime(Double avgRespTime) {
        this.avgRespTime = avgRespTime;
    }

    public Double getAvgSessionDurationTime() {
        return avgSessionDurationTime;
    }

    public void setAvgSessionDurationTime(Double avgSessionDurationTime) {
        this.avgSessionDurationTime = avgSessionDurationTime;
    }

    public Integer getAdvisoryMessageNum() {
        return advisoryMessageNum;
    }

    public void setAdvisoryMessageNum(Integer advisoryMessageNum) {
        this.advisoryMessageNum = advisoryMessageNum;
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

    public Double getLeaveMsgReplyRate() {
        return leaveMsgReplyRate;
    }

    public void setLeaveMsgReplyRate(Double leaveMsgReplyRate) {
        this.leaveMsgReplyRate = leaveMsgReplyRate;
    }

    public Double getLeaveMsgResponseRate() {
        return leaveMsgResponseRate;
    }

    public void setLeaveMsgResponseRate(Double leaveMsgResponseRate) {
        this.leaveMsgResponseRate = leaveMsgResponseRate;
    }

    public Integer getAidOrderNum() {
        return aidOrderNum;
    }

    public void setAidOrderNum(Integer aidOrderNum) {
        this.aidOrderNum = aidOrderNum;
    }

    public Double getAidOrderAmount() {
        return aidOrderAmount;
    }

    public void setAidOrderAmount(Double aidOrderAmount) {
        this.aidOrderAmount = aidOrderAmount;
    }

    public Integer getAidFollowNum() {
        return aidFollowNum;
    }

    public void setAidFollowNum(Integer aidFollowNum) {
        this.aidFollowNum = aidFollowNum;
    }

    public Double getAidFollowAmount() {
        return aidFollowAmount;
    }

    public void setAidFollowAmount(Double aidFollowAmount) {
        this.aidFollowAmount = aidFollowAmount;
    }

    public Integer getAidPayNum() {
        return aidPayNum;
    }

    public void setAidPayNum(Integer aidPayNum) {
        this.aidPayNum = aidPayNum;
    }

    public Double getAidPayAmount() {
        return aidPayAmount;
    }

    public void setAidPayAmount(Double aidPayAmount) {
        this.aidPayAmount = aidPayAmount;
    }

    public Double getShopOutStockAmount() {
        return shopOutStockAmount;
    }

    public void setShopOutStockAmount(Double shopOutStockAmount) {
        this.shopOutStockAmount = shopOutStockAmount;
    }

    public Integer getShopOutStockGoodsNum() {
        return shopOutStockGoodsNum;
    }

    public void setShopOutStockGoodsNum(Integer shopOutStockGoodsNum) {
        this.shopOutStockGoodsNum = shopOutStockGoodsNum;
    }

    public Integer getShopOutStockNum() {
        return shopOutStockNum;
    }

    public void setShopOutStockNum(Integer shopOutStockNum) {
        this.shopOutStockNum = shopOutStockNum;
    }

    public Integer getShopOutStockOrderNum() {
        return shopOutStockOrderNum;
    }

    public void setShopOutStockOrderNum(Integer shopOutStockOrderNum) {
        this.shopOutStockOrderNum = shopOutStockOrderNum;
    }

    public Double getCsOutStockAmount() {
        return csOutStockAmount;
    }

    public void setCsOutStockAmount(Double csOutStockAmount) {
        this.csOutStockAmount = csOutStockAmount;
    }

    public Integer getCsOutStockGoodsNum() {
        return csOutStockGoodsNum;
    }

    public void setCsOutStockGoodsNum(Integer csOutStockGoodsNum) {
        this.csOutStockGoodsNum = csOutStockGoodsNum;
    }

    public Integer getCsOutStockNum() {
        return csOutStockNum;
    }

    public void setCsOutStockNum(Integer csOutStockNum) {
        this.csOutStockNum = csOutStockNum;
    }

    public Integer getCsOutStockOrderNum() {
        return csOutStockOrderNum;
    }

    public void setCsOutStockOrderNum(Integer csOutStockOrderNum) {
        this.csOutStockOrderNum = csOutStockOrderNum;
    }

    public Double getCsOutStockAmountPercent() {
        return csOutStockAmountPercent;
    }

    public void setCsOutStockAmountPercent(Double csOutStockAmountPercent) {
        this.csOutStockAmountPercent = csOutStockAmountPercent;
    }

    public Double getSilenceOutStockAmount() {
        return silenceOutStockAmount;
    }

    public void setSilenceOutStockAmount(Double silenceOutStockAmount) {
        this.silenceOutStockAmount = silenceOutStockAmount;
    }

    public Integer getSilenceOutStockGoodsNum() {
        return silenceOutStockGoodsNum;
    }

    public void setSilenceOutStockGoodsNum(Integer silenceOutStockGoodsNum) {
        this.silenceOutStockGoodsNum = silenceOutStockGoodsNum;
    }

    public Integer getSilenceOutStockNum() {
        return silenceOutStockNum;
    }

    public void setSilenceOutStockNum(Integer silenceOutStockNum) {
        this.silenceOutStockNum = silenceOutStockNum;
    }

    public Integer getSilenceOutStockOrderNum() {
        return silenceOutStockOrderNum;
    }

    public void setSilenceOutStockOrderNum(Integer silenceOutStockOrderNum) {
        this.silenceOutStockOrderNum = silenceOutStockOrderNum;
    }

    public Double getSilenceOutStockAmountPercent() {
        return silenceOutStockAmountPercent;
    }

    public void setSilenceOutStockAmountPercent(Double silenceOutStockAmountPercent) {
        this.silenceOutStockAmountPercent = silenceOutStockAmountPercent;
    }

    public Integer getCsOutStockBuyerNumFinal() {
        return csOutStockBuyerNumFinal;
    }

    public void setCsOutStockBuyerNumFinal(Integer csOutStockBuyerNumFinal) {
        this.csOutStockBuyerNumFinal = csOutStockBuyerNumFinal;
    }

    public Integer getShopNeutralEvaluateNum() {
        return shopNeutralEvaluateNum;
    }

    public void setShopNeutralEvaluateNum(Integer shopNeutralEvaluateNum) {
        this.shopNeutralEvaluateNum = shopNeutralEvaluateNum;
    }

    public Integer getShopBadEvaluateNum() {
        return shopBadEvaluateNum;
    }

    public void setShopBadEvaluateNum(Integer shopBadEvaluateNum) {
        this.shopBadEvaluateNum = shopBadEvaluateNum;
    }

    public Integer getShopNeutralBadEvaluateNumTotal() {
        return shopNeutralBadEvaluateNumTotal;
    }

    public void setShopNeutralBadEvaluateNumTotal(Integer shopNeutralBadEvaluateNumTotal) {
        this.shopNeutralBadEvaluateNumTotal = shopNeutralBadEvaluateNumTotal;
    }

    public Integer getCsNeutralEvaluateNum() {
        return csNeutralEvaluateNum;
    }

    public void setCsNeutralEvaluateNum(Integer csNeutralEvaluateNum) {
        this.csNeutralEvaluateNum = csNeutralEvaluateNum;
    }

    public Integer getCsBadEvaluateNum() {
        return csBadEvaluateNum;
    }

    public void setCsBadEvaluateNum(Integer csBadEvaluateNum) {
        this.csBadEvaluateNum = csBadEvaluateNum;
    }

    public Integer getCsNeutralBadEvaluateNumTotal() {
        return csNeutralBadEvaluateNumTotal;
    }

    public void setCsNeutralBadEvaluateNumTotal(Integer csNeutralBadEvaluateNumTotal) {
        this.csNeutralBadEvaluateNumTotal = csNeutralBadEvaluateNumTotal;
    }

    public Integer getSilenceNeutralEvaluateNum() {
        return silenceNeutralEvaluateNum;
    }

    public void setSilenceNeutralEvaluateNum(Integer silenceNeutralEvaluateNum) {
        this.silenceNeutralEvaluateNum = silenceNeutralEvaluateNum;
    }

    public Integer getSilenceBadEvaluateNum() {
        return silenceBadEvaluateNum;
    }

    public void setSilenceBadEvaluateNum(Integer silenceBadEvaluateNum) {
        this.silenceBadEvaluateNum = silenceBadEvaluateNum;
    }

    public Integer getSilenceNeutralBadEvaluateNumTotal() {
        return silenceNeutralBadEvaluateNumTotal;
    }

    public void setSilenceNeutralBadEvaluateNumTotal(Integer silenceNeutralBadEvaluateNumTotal) {
        this.silenceNeutralBadEvaluateNumTotal = silenceNeutralBadEvaluateNumTotal;
    }

    public Integer getInviteEvaluateNum() {
        return inviteEvaluateNum;
    }

    public void setInviteEvaluateNum(Integer inviteEvaluateNum) {
        this.inviteEvaluateNum = inviteEvaluateNum;
    }

    public Integer getEvaluateNum() {
        return evaluateNum;
    }

    public void setEvaluateNum(Integer evaluateNum) {
        this.evaluateNum = evaluateNum;
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

    public Double getInviteEvaluateRate() {
        return inviteEvaluateRate;
    }

    public void setInviteEvaluateRate(Double inviteEvaluateRate) {
        this.inviteEvaluateRate = inviteEvaluateRate;
    }

    public Double getEvaluateRate() {
        return evaluateRate;
    }

    public void setEvaluateRate(Double evaluateRate) {
        this.evaluateRate = evaluateRate;
    }

    public Double getSatisfactionRate() {
        return satisfactionRate;
    }

    public void setSatisfactionRate(Double satisfactionRate) {
        this.satisfactionRate = satisfactionRate;
    }

    public Integer getShopRefundNum() {
        return shopRefundNum;
    }

    public void setShopRefundNum(Integer shopRefundNum) {
        this.shopRefundNum = shopRefundNum;
    }

    public Integer getShopRefundBuyerNum() {
        return shopRefundBuyerNum;
    }

    public void setShopRefundBuyerNum(Integer shopRefundBuyerNum) {
        this.shopRefundBuyerNum = shopRefundBuyerNum;
    }

    public Integer getShopRefundProductNum() {
        return shopRefundProductNum;
    }

    public void setShopRefundProductNum(Integer shopRefundProductNum) {
        this.shopRefundProductNum = shopRefundProductNum;
    }

    public Double getShopRefundAmount() {
        return shopRefundAmount;
    }

    public void setShopRefundAmount(Double shopRefundAmount) {
        this.shopRefundAmount = shopRefundAmount;
    }

    public Integer getCsRefundNum() {
        return csRefundNum;
    }

    public void setCsRefundNum(Integer csRefundNum) {
        this.csRefundNum = csRefundNum;
    }

    public Integer getCsRefundBuyerNum() {
        return csRefundBuyerNum;
    }

    public void setCsRefundBuyerNum(Integer csRefundBuyerNum) {
        this.csRefundBuyerNum = csRefundBuyerNum;
    }

    public Integer getCsRefundProductNum() {
        return csRefundProductNum;
    }

    public void setCsRefundProductNum(Integer csRefundProductNum) {
        this.csRefundProductNum = csRefundProductNum;
    }

    public Double getCsRefundAmount() {
        return csRefundAmount;
    }

    public void setCsRefundAmount(Double csRefundAmount) {
        this.csRefundAmount = csRefundAmount;
    }

    public Double getCsRefundPercent() {
        return csRefundPercent;
    }

    public void setCsRefundPercent(Double csRefundPercent) {
        this.csRefundPercent = csRefundPercent;
    }

    public Integer getSilenceRefundNum() {
        return silenceRefundNum;
    }

    public void setSilenceRefundNum(Integer silenceRefundNum) {
        this.silenceRefundNum = silenceRefundNum;
    }

    public Integer getSilenceRefundBuyerNum() {
        return silenceRefundBuyerNum;
    }

    public void setSilenceRefundBuyerNum(Integer silenceRefundBuyerNum) {
        this.silenceRefundBuyerNum = silenceRefundBuyerNum;
    }

    public Integer getSilenceRefundProductNum() {
        return silenceRefundProductNum;
    }

    public void setSilenceRefundProductNum(Integer silenceRefundProductNum) {
        this.silenceRefundProductNum = silenceRefundProductNum;
    }

    public Double getSilenceRefundAmount() {
        return silenceRefundAmount;
    }

    public void setSilenceRefundAmount(Double silenceRefundAmount) {
        this.silenceRefundAmount = silenceRefundAmount;
    }

    public Integer getEnquiryLossNum() {
        return enquiryLossNum;
    }

    public void setEnquiryLossNum(Integer enquiryLossNum) {
        this.enquiryLossNum = enquiryLossNum;
    }

    public Integer getCsPracticalOrderedUnpaidPeople() {
        return csPracticalOrderedUnpaidPeople;
    }

    public void setCsPracticalOrderedUnpaidPeople(Integer csPracticalOrderedUnpaidPeople) {
        this.csPracticalOrderedUnpaidPeople = csPracticalOrderedUnpaidPeople;
    }

    public Integer getCsPracticalOrderedUnpaidItemNum() {
        return csPracticalOrderedUnpaidItemNum;
    }

    public void setCsPracticalOrderedUnpaidItemNum(Integer csPracticalOrderedUnpaidItemNum) {
        this.csPracticalOrderedUnpaidItemNum = csPracticalOrderedUnpaidItemNum;
    }

    public Double getCsPracticalOrderedUnpaidAmount() {
        return csPracticalOrderedUnpaidAmount;
    }

    public void setCsPracticalOrderedUnpaidAmount(Double csPracticalOrderedUnpaidAmount) {
        this.csPracticalOrderedUnpaidAmount = csPracticalOrderedUnpaidAmount;
    }

    public Integer getCsPracticalOrderedUnpaidOrderedNum() {
        return csPracticalOrderedUnpaidOrderedNum;
    }

    public void setCsPracticalOrderedUnpaidOrderedNum(Integer csPracticalOrderedUnpaidOrderedNum) {
        this.csPracticalOrderedUnpaidOrderedNum = csPracticalOrderedUnpaidOrderedNum;
    }

    public Integer getCsPracticalOrderedUnoutStockPeople() {
        return csPracticalOrderedUnoutStockPeople;
    }

    public void setCsPracticalOrderedUnoutStockPeople(Integer csPracticalOrderedUnoutStockPeople) {
        this.csPracticalOrderedUnoutStockPeople = csPracticalOrderedUnoutStockPeople;
    }

    public Integer getCsPracticalOrderedUnoutStockItemNum() {
        return csPracticalOrderedUnoutStockItemNum;
    }

    public void setCsPracticalOrderedUnoutStockItemNum(Integer csPracticalOrderedUnoutStockItemNum) {
        this.csPracticalOrderedUnoutStockItemNum = csPracticalOrderedUnoutStockItemNum;
    }

    public Double getCsPracticalOrderedUnoutStockAmount() {
        return csPracticalOrderedUnoutStockAmount;
    }

    public void setCsPracticalOrderedUnoutStockAmount(Double csPracticalOrderedUnoutStockAmount) {
        this.csPracticalOrderedUnoutStockAmount = csPracticalOrderedUnoutStockAmount;
    }

    public Integer getCsPracticalOrderedUnoutStockOrderedNum() {
        return csPracticalOrderedUnoutStockOrderedNum;
    }

    public void setCsPracticalOrderedUnoutStockOrderedNum(Integer csPracticalOrderedUnoutStockOrderedNum) {
        this.csPracticalOrderedUnoutStockOrderedNum = csPracticalOrderedUnoutStockOrderedNum;
    }

    public Double getShopPostFee() {
        return shopPostFee;
    }

    public void setShopPostFee(Double shopPostFee) {
        this.shopPostFee = shopPostFee;
    }

    public Double getSilencePostFee() {
        return silencePostFee;
    }

    public void setSilencePostFee(Double silencePostFee) {
        this.silencePostFee = silencePostFee;
    }

    public Double getCsPostFee() {
        return csPostFee;
    }

    public void setCsPostFee(Double csPostFee) {
        this.csPostFee = csPostFee;
    }

    public Double getProductEvaluationDSR() {
        return productEvaluationDSR;
    }

    public void setProductEvaluationDSR(Double productEvaluationDSR) {
        this.productEvaluationDSR = productEvaluationDSR;
    }

    public Double getServiceAttitudeDSR() {
        return serviceAttitudeDSR;
    }

    public void setServiceAttitudeDSR(Double serviceAttitudeDSR) {
        this.serviceAttitudeDSR = serviceAttitudeDSR;
    }

    public Double getLogisticsSpeedDSR() {
        return logisticsSpeedDSR;
    }

    public void setLogisticsSpeedDSR(Double logisticsSpeedDSR) {
        this.logisticsSpeedDSR = logisticsSpeedDSR;
    }


    public Integer getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(Integer sessionNum) {
        this.sessionNum = sessionNum;
    }

    public Integer getAvgRespInQuickTime() {
        return avgRespInQuickTime;
    }

    public void setAvgRespInQuickTime(Integer avgRespInQuickTime) {
        this.avgRespInQuickTime = avgRespInQuickTime;
    }
}
