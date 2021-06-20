package com.infinite.life.mybatisgenmvn.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * tb_account_report_month_pre_pay_progress
 */
public class PrePayProgress {
    /**
     * id
     */
    @ApiModelProperty(value = "", required = true)
    private Long id;

    /**
     * 媒体月报表id
     * report_id
     */
    @ApiModelProperty(value = "媒体月报表id", required = true)
    private Long reportId;

    /**
     * 结算单id
     * settlement_id
     */
    @ApiModelProperty(value = "结算单id", required = false)
    private String settlementId;

    /**
     * 月份
     * cur_date
     */
    @ApiModelProperty(value = "月份", required = true)
    private Date curDate;

    /**
     * 媒体用户id
     * media_id
     */
    @ApiModelProperty(value = "媒体用户id", required = true)
    private Long mediaId;

    /**
     * 应用id
     * app_id
     */
    @ApiModelProperty(value = "应用id", required = true)
    private Long appId;

    /**
     * 0-杭推,1-霍推,2-兑捷
     * company_type
     */
    @ApiModelProperty(value = "0-杭推,1-霍推,2-兑捷", required = true)
    private Byte companyType;

    /**
     * 0-未获取结算单,1-已获取结算单
     * statement_gain
     */
    @ApiModelProperty(value = "0-未获取结算单,1-已获取结算单", required = true)
    private Byte statementGain;

    /**
     * 0-未收到结算单,1-已收到结算单
     * statement_receive
     */
    @ApiModelProperty(value = "0-未收到结算单,1-已收到结算单", required = true)
    private Byte statementReceive;

    /**
     * 调账后金额
     * after_adjust_amount
     */
    @ApiModelProperty(value = "调账后金额", required = false)
    private Long afterAdjustAmount;

    /**
     * 记录创建时间
     * gmt_create
     */
    @ApiModelProperty(value = "记录创建时间", required = true)
    private Date gmtCreate;

    /**
     * 记录修改时间
     * gmt_modified
     */
    @ApiModelProperty(value = "记录修改时间", required = true)
    private Date gmtModified;

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for tb_account_report_month_pre_pay_progress.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.report_id
     */
    public Long getReportId() {
        return reportId;
    }

    /**
     * @param reportId the value for tb_account_report_month_pre_pay_progress.report_id
     */
    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.settlement_id
     */
    public String getSettlementId() {
        return settlementId;
    }

    /**
     * @param settlementId the value for tb_account_report_month_pre_pay_progress.settlement_id
     */
    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.cur_date
     */
    public Date getCurDate() {
        return curDate;
    }

    /**
     * @param curDate the value for tb_account_report_month_pre_pay_progress.cur_date
     */
    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.media_id
     */
    public Long getMediaId() {
        return mediaId;
    }

    /**
     * @param mediaId the value for tb_account_report_month_pre_pay_progress.media_id
     */
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.app_id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * @param appId the value for tb_account_report_month_pre_pay_progress.app_id
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.company_type
     */
    public Byte getCompanyType() {
        return companyType;
    }

    /**
     * @param companyType the value for tb_account_report_month_pre_pay_progress.company_type
     */
    public void setCompanyType(Byte companyType) {
        this.companyType = companyType;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.statement_gain
     */
    public Byte getStatementGain() {
        return statementGain;
    }

    /**
     * @param statementGain the value for tb_account_report_month_pre_pay_progress.statement_gain
     */
    public void setStatementGain(Byte statementGain) {
        this.statementGain = statementGain;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.statement_receive
     */
    public Byte getStatementReceive() {
        return statementReceive;
    }

    /**
     * @param statementReceive the value for tb_account_report_month_pre_pay_progress.statement_receive
     */
    public void setStatementReceive(Byte statementReceive) {
        this.statementReceive = statementReceive;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.after_adjust_amount
     */
    public Long getAfterAdjustAmount() {
        return afterAdjustAmount;
    }

    /**
     * @param afterAdjustAmount the value for tb_account_report_month_pre_pay_progress.after_adjust_amount
     */
    public void setAfterAdjustAmount(Long afterAdjustAmount) {
        this.afterAdjustAmount = afterAdjustAmount;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate the value for tb_account_report_month_pre_pay_progress.gmt_create
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return the value of tb_account_report_month_pre_pay_progress.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified the value for tb_account_report_month_pre_pay_progress.gmt_modified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
