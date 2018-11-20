package com.cbs.app.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class FbpEmployees implements Serializable {
    private Long employeeId;

    private Date lastUpdateDate;

    private Long lastUpdatedBy;

    private Date creationDate;

    private Long createdBy;

    private Long lastUpdateLogin;

    private String employeeNumber;

    private Long deptId;

    private Long jobId;

    private String checkUnit;

    private Long prodProjectId;

    private Long costDeptId;

    private Short currentCredit;

    private String password;

    private String positionLevel;

    private String employeeType;

    private String sourceSystem;

    private String shortName;

    private String exchangePersonFlag;

    private String employeeGuid;

    private String synchFlag;

    private String useOaFlag;

    private String useEmailFlag;

    private String useSmsFlag;

    private String rejectSmsFlag;

    private String monNoticeFlag;

    private String tueNoticeFlag;

    private String wedNoticeFlag;

    private String thuNoticeFlag;

    private String friNoticeFlag;

    private String satNoticeFlag;

    private String sunNoticeFlag;

    private Short startHour;

    private Short startMin;

    private Short endHour;

    private Short endMin;

    private String oaAddress;

    private String phone;

    private String mobilePhone;

    private String emailAddress;

    private String attributeCategory;

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

    private String isSynchRequired;

    private String enabledFlag;

    private String sourceType;

    private String sourceReference;

    private Date sysnceDate;

    private String idCard;

    private String approveOaFlag;

    private String approveEmailFlag;

    private String approveSmsFlag;

    private String amonNoticeFlag;

    private String atueNoticeFlag;

    private String awedNoticeFlag;

    private String athuNoticeFlag;

    private String afriNoticeFlag;

    private String asatNoticeFlag;

    private String asunNoticeFlag;

    private Short astartHour;

    private Short astartMin;

    private Short aendHour;

    private Short aendMin;

    private String otherOaFlag;

    private String otherEmailFlag;

    private String otherSmsFlag;

    private String omonNoticeFlag;

    private String otueNoticeFlag;

    private String owedNoticeFlag;

    private String othuNoticeFlag;

    private String ofriNoticeFlag;

    private String osatNoticeFlag;

    private String osunNoticeFlag;

    private Short ostartHour;

    private Short ostartMin;

    private Short oendHour;

    private Short oendMin;

    private String passwordOaFlag;

    private String passwordEmailFlag;

    private String passwordSmsFlag;

    private String boeOaFlag;

    private String boeEmailFlag;

    private String boeSmsFlag;

    private Date lockDate;

    private String feeTypeIds;

    private String feeTypeNames;

    private String tempFlag;

    private String memo;

    @Override
    public String toString() {
        return "FbpEmployees{" +
                "employeeId=" + employeeId +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", lastUpdateLogin=" + lastUpdateLogin +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", deptId=" + deptId +
                ", jobId=" + jobId +
                ", checkUnit='" + checkUnit + '\'' +
                ", prodProjectId=" + prodProjectId +
                ", costDeptId=" + costDeptId +
                ", currentCredit=" + currentCredit +
                ", password='" + password + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", sourceSystem='" + sourceSystem + '\'' +
                ", shortName='" + shortName + '\'' +
                ", exchangePersonFlag='" + exchangePersonFlag + '\'' +
                ", employeeGuid='" + employeeGuid + '\'' +
                ", synchFlag='" + synchFlag + '\'' +
                ", useOaFlag='" + useOaFlag + '\'' +
                ", useEmailFlag='" + useEmailFlag + '\'' +
                ", useSmsFlag='" + useSmsFlag + '\'' +
                ", rejectSmsFlag='" + rejectSmsFlag + '\'' +
                ", monNoticeFlag='" + monNoticeFlag + '\'' +
                ", tueNoticeFlag='" + tueNoticeFlag + '\'' +
                ", wedNoticeFlag='" + wedNoticeFlag + '\'' +
                ", thuNoticeFlag='" + thuNoticeFlag + '\'' +
                ", friNoticeFlag='" + friNoticeFlag + '\'' +
                ", satNoticeFlag='" + satNoticeFlag + '\'' +
                ", sunNoticeFlag='" + sunNoticeFlag + '\'' +
                ", startHour=" + startHour +
                ", startMin=" + startMin +
                ", endHour=" + endHour +
                ", endMin=" + endMin +
                ", oaAddress='" + oaAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", attributeCategory='" + attributeCategory + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                ", isSynchRequired='" + isSynchRequired + '\'' +
                ", enabledFlag='" + enabledFlag + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", sourceReference='" + sourceReference + '\'' +
                ", sysnceDate=" + sysnceDate +
                ", idCard='" + idCard + '\'' +
                ", approveOaFlag='" + approveOaFlag + '\'' +
                ", approveEmailFlag='" + approveEmailFlag + '\'' +
                ", approveSmsFlag='" + approveSmsFlag + '\'' +
                ", amonNoticeFlag='" + amonNoticeFlag + '\'' +
                ", atueNoticeFlag='" + atueNoticeFlag + '\'' +
                ", awedNoticeFlag='" + awedNoticeFlag + '\'' +
                ", athuNoticeFlag='" + athuNoticeFlag + '\'' +
                ", afriNoticeFlag='" + afriNoticeFlag + '\'' +
                ", asatNoticeFlag='" + asatNoticeFlag + '\'' +
                ", asunNoticeFlag='" + asunNoticeFlag + '\'' +
                ", astartHour=" + astartHour +
                ", astartMin=" + astartMin +
                ", aendHour=" + aendHour +
                ", aendMin=" + aendMin +
                ", otherOaFlag='" + otherOaFlag + '\'' +
                ", otherEmailFlag='" + otherEmailFlag + '\'' +
                ", otherSmsFlag='" + otherSmsFlag + '\'' +
                ", omonNoticeFlag='" + omonNoticeFlag + '\'' +
                ", otueNoticeFlag='" + otueNoticeFlag + '\'' +
                ", owedNoticeFlag='" + owedNoticeFlag + '\'' +
                ", othuNoticeFlag='" + othuNoticeFlag + '\'' +
                ", ofriNoticeFlag='" + ofriNoticeFlag + '\'' +
                ", osatNoticeFlag='" + osatNoticeFlag + '\'' +
                ", osunNoticeFlag='" + osunNoticeFlag + '\'' +
                ", ostartHour=" + ostartHour +
                ", ostartMin=" + ostartMin +
                ", oendHour=" + oendHour +
                ", oendMin=" + oendMin +
                ", passwordOaFlag='" + passwordOaFlag + '\'' +
                ", passwordEmailFlag='" + passwordEmailFlag + '\'' +
                ", passwordSmsFlag='" + passwordSmsFlag + '\'' +
                ", boeOaFlag='" + boeOaFlag + '\'' +
                ", boeEmailFlag='" + boeEmailFlag + '\'' +
                ", boeSmsFlag='" + boeSmsFlag + '\'' +
                ", lockDate=" + lockDate +
                ", feeTypeIds='" + feeTypeIds + '\'' +
                ", feeTypeNames='" + feeTypeNames + '\'' +
                ", tempFlag='" + tempFlag + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}