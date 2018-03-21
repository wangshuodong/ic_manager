package com.wangsd.web.model;

import javax.persistence.*;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色主键
     */
    private Long roleId;

    /**
     * 菜单主键
     */
    private Long menuId;

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
     * 获取角色主键
     *
     * @return roleId - 角色主键
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色主键
     *
     * @param roleId 角色主键
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单主键
     *
     * @return menuId - 菜单主键
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单主键
     *
     * @param menuId 菜单主键
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}