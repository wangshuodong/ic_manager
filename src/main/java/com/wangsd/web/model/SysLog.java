package com.wangsd.web.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_log")
public class SysLog {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户
     */
    private String loginName;

    /**
     * 日志
     */
    private String title;

    /**
     * 地址
     */
    private String url;

    /**
     * 客户端ip
     */
    private String clientIp;

    /**
     * 日志时间
     */
    private Date createTime;

    /**
     * 参数
     */
    private String params;

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
     * 获取用户
     *
     * @return loginName - 用户
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置用户
     *
     * @param loginName 用户
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 获取日志
     *
     * @return title - 日志
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置日志
     *
     * @param title 日志
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取地址
     *
     * @return url - 地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置地址
     *
     * @param url 地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取客户端ip
     *
     * @return clientIp - 客户端ip
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * 设置客户端ip
     *
     * @param clientIp 客户端ip
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    /**
     * 获取日志时间
     *
     * @return createTime - 日志时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置日志时间
     *
     * @param createTime 日志时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取参数
     *
     * @return params - 参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置参数
     *
     * @param params 参数
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }
}