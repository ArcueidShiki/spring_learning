package cn.tedu.mybatis.pojo;

import java.time.LocalDateTime;

public class Permission {
    private Long id;//bigint unsigned auto_increment,
    private String name;// varchar(50) default null comment '名称',
    private String value;// varchar(255) default null comment '值',
    private String description;// varchar(255) default null comment '描述',
    private Integer sort;// tinyint unsigned default 0 comment '自定义排序序号',
    private LocalDateTime gmtCreate;// datetime default null comment '数据创建时间',
    private LocalDateTime gmtModified;// datetime default null comment '数据最后修改时间',

    @Override
    public String toString() {
        return "Permission{" +
                "  \nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nvalue='" + value + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \nsort=" + sort +
                ", \ngmtCreate=" + gmtCreate +
                ", \ngmtModified=" + gmtModified +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}
