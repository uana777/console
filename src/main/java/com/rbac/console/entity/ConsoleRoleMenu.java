package com.rbac.console.entity;

public class ConsoleRoleMenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.MENU_ID
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.ISCHILDREN_LIKES
     *
     * @mbggenerated
     */
    private String ischildrenLikes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CONSOLE_ROLE_MENU.ISSHOW
     *
     * @mbggenerated
     */
    private String isshow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.ID
     *
     * @return the value of CONSOLE_ROLE_MENU.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.ID
     *
     * @param id the value for CONSOLE_ROLE_MENU.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.ROLE_ID
     *
     * @return the value of CONSOLE_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.ROLE_ID
     *
     * @param roleId the value for CONSOLE_ROLE_MENU.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.MENU_ID
     *
     * @return the value of CONSOLE_ROLE_MENU.MENU_ID
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.MENU_ID
     *
     * @param menuId the value for CONSOLE_ROLE_MENU.MENU_ID
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.TYPE
     *
     * @return the value of CONSOLE_ROLE_MENU.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.TYPE
     *
     * @param type the value for CONSOLE_ROLE_MENU.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.ISCHILDREN_LIKES
     *
     * @return the value of CONSOLE_ROLE_MENU.ISCHILDREN_LIKES
     *
     * @mbggenerated
     */
    public String getIschildrenLikes() {
        return ischildrenLikes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.ISCHILDREN_LIKES
     *
     * @param ischildrenLikes the value for CONSOLE_ROLE_MENU.ISCHILDREN_LIKES
     *
     * @mbggenerated
     */
    public void setIschildrenLikes(String ischildrenLikes) {
        this.ischildrenLikes = ischildrenLikes == null ? null : ischildrenLikes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CONSOLE_ROLE_MENU.ISSHOW
     *
     * @return the value of CONSOLE_ROLE_MENU.ISSHOW
     *
     * @mbggenerated
     */
    public String getIsshow() {
        return isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CONSOLE_ROLE_MENU.ISSHOW
     *
     * @param isshow the value for CONSOLE_ROLE_MENU.ISSHOW
     *
     * @mbggenerated
     */
    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }
}