package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Piechart)表实体类
 *
 * @author kai
 * @since 2020-12-23 18:25:25
 */
@SuppressWarnings("serial")
public class Piechart extends Model<Piechart> {
    @TableId(type = IdType.AUTO)
    
    private String name;
    
    private Integer value;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}