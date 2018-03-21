package com.wangsd.web.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "department")
public class Department {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 部门编号
     */
    private String code;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 顶级服务商id
     */
    private Byte serviceId;

    /**
     * 直接上级id
     */
    private Byte pid;

    /**
     * 区域
     */
    private String region;

    /**
     * 联系人
     */
    private String contactPeople;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 联系地址
     */
    private String contactAddress;

    private Date createTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取部门编号
     *
     * @return code - 部门编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置部门编号
     *
     * @param code 部门编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取部门名称
     *
     * @return deptName - 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取顶级服务商id
     *
     * @return serviceId - 顶级服务商id
     */
    public Byte getServiceId() {
        return serviceId;
    }

    /**
     * 设置顶级服务商id
     *
     * @param serviceId 顶级服务商id
     */
    public void setServiceId(Byte serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 获取直接上级id
     *
     * @return pid - 直接上级id
     */
    public Byte getPid() {
        return pid;
    }

    /**
     * 设置直接上级id
     *
     * @param pid 直接上级id
     */
    public void setPid(Byte pid) {
        this.pid = pid;
    }

    /**
     * 获取区域
     *
     * @return region - 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区域
     *
     * @param region 区域
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 获取联系人
     *
     * @return contactPeople - 联系人
     */
    public String getContactPeople() {
        return contactPeople;
    }

    /**
     * 设置联系人
     *
     * @param contactPeople 联系人
     */
    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople == null ? null : contactPeople.trim();
    }

    /**
     * 获取联系电话
     *
     * @return contactPhone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取联系地址
     *
     * @return contactAddress - 联系地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置联系地址
     *
     * @param contactAddress 联系地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}