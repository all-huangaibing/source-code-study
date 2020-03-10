package com.huang.ai.bing.pojo;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 功能：
 *
 * @author huangaibing
 * @date 2019/10/16 14:57
 */
public class BatchResult {
    /**
     * id
     */
    private Long id;

    /**
     * 集团id
     */
    private String groupId;

    /**
     * 处理状态: 0-待处理,1-正在处理,2-处理结束
     */
    private Integer handleStatus;

    /**
     * 总条数
     */
    private Integer total;

    /**
     * 失败总条数
     */
    private Integer errorTotal;

    /**
     * 原始文件地址
     */
    private String originUrl;

    /**
     * 失败文件地址
     */
    private String errorUrl;

    /**
     * 备注
     */
    private String remark;

    private Date createdAt;


    private Date updatedAt;

    private Date deletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getErrorTotal() {
        return errorTotal;
    }

    public void setErrorTotal(Integer errorTotal) {
        this.errorTotal = errorTotal;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public String getErrorUrl() {
        return errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }


     @Override
     public String toString() {
         return JSON.toJSONString(this);
     }
}
