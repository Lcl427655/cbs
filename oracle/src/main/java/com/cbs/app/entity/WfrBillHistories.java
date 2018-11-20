package com.cbs.app.entity;

import java.util.Date;

public class WfrBillHistories {
    private Long wfHistoriesId;

    private Date lastUpdateDate;

    private Long lastUpdatedBy;

    private Date creationDate;

    private Long createdBy;

    private Long lastUpdateLogin;

    private String enabledFlag;

    private String memo;

    private Long boeHeaderId;

    private Long wfDefiniensId;

    private Long preNodeId;

    private Long preHierarchyId;

    private String preWorkflowStatus;

    private Long nextNodeId;

    private Long nextHierarchyId;

    private String nextWorkflowStatus;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attributeCategory;

    private Long taskId;

    public Long getWfHistoriesId() {
        return wfHistoriesId;
    }

    public void setWfHistoriesId(Long wfHistoriesId) {
        this.wfHistoriesId = wfHistoriesId;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag == null ? null : enabledFlag.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getBoeHeaderId() {
        return boeHeaderId;
    }

    public void setBoeHeaderId(Long boeHeaderId) {
        this.boeHeaderId = boeHeaderId;
    }

    public Long getWfDefiniensId() {
        return wfDefiniensId;
    }

    public void setWfDefiniensId(Long wfDefiniensId) {
        this.wfDefiniensId = wfDefiniensId;
    }

    public Long getPreNodeId() {
        return preNodeId;
    }

    public void setPreNodeId(Long preNodeId) {
        this.preNodeId = preNodeId;
    }

    public Long getPreHierarchyId() {
        return preHierarchyId;
    }

    public void setPreHierarchyId(Long preHierarchyId) {
        this.preHierarchyId = preHierarchyId;
    }

    public String getPreWorkflowStatus() {
        return preWorkflowStatus;
    }

    public void setPreWorkflowStatus(String preWorkflowStatus) {
        this.preWorkflowStatus = preWorkflowStatus == null ? null : preWorkflowStatus.trim();
    }

    public Long getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(Long nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

    public Long getNextHierarchyId() {
        return nextHierarchyId;
    }

    public void setNextHierarchyId(Long nextHierarchyId) {
        this.nextHierarchyId = nextHierarchyId;
    }

    public String getNextWorkflowStatus() {
        return nextWorkflowStatus;
    }

    public void setNextWorkflowStatus(String nextWorkflowStatus) {
        this.nextWorkflowStatus = nextWorkflowStatus == null ? null : nextWorkflowStatus.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory == null ? null : attributeCategory.trim();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}