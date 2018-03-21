package com.wangsd.web.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 1代表服务商，2代表物业，3代表小区,99管理员
     */
    private Integer roleType;

    /**
     * 状态
     */
    private Boolean roleState;

    /**
     * 创建时间
     */
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
     * 获取角色名称
     *
     * @return roleName - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取角色描述
     *
     * @return roleDesc - 角色描述
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * 设置角色描述
     *
     * @param roleDesc 角色描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * 获取1代表服务商，2代表物业，3代表小区,99管理员
     *
     * @return roleType - 1代表服务商，2代表物业，3代表小区,99管理员
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * 设置1代表服务商，2代表物业，3代表小区,99管理员
     *
     * @param roleType 1代表服务商，2代表物业，3代表小区,99管理员
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取状态
     *
     * @return roleState - 状态
     */
    public Boolean getRoleState() {
        return roleState;
    }

    /**
     * 设置状态
     *
     * @param roleState 状态
     */
    public void setRoleState(Boolean roleState) {
        this.roleState = roleState;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}