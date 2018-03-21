package com.wangsd.web.model;

import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父级菜单ID
     */
    private Long pid;

    /**
     * 连接地址
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 菜单状态
     */
    private Boolean menuState;

    /**
     * 资源名称
     */
    private String resource;

    /**
     * 深度
     */
    private Integer deep;

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
     * 获取菜单名称
     *
     * @return menuName - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取父级菜单ID
     *
     * @return pid - 父级菜单ID
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父级菜单ID
     *
     * @param pid 父级菜单ID
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取连接地址
     *
     * @return url - 连接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置连接地址
     *
     * @param url 连接地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取菜单状态
     *
     * @return menuState - 菜单状态
     */
    public Boolean getMenuState() {
        return menuState;
    }

    /**
     * 设置菜单状态
     *
     * @param menuState 菜单状态
     */
    public void setMenuState(Boolean menuState) {
        this.menuState = menuState;
    }

    /**
     * 获取资源名称
     *
     * @return resource - 资源名称
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置资源名称
     *
     * @param resource 资源名称
     */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    /**
     * 获取深度
     *
     * @return deep - 深度
     */
    public Integer getDeep() {
        return deep;
    }

    /**
     * 设置深度
     *
     * @param deep 深度
     */
    public void setDeep(Integer deep) {
        this.deep = deep;
    }
}