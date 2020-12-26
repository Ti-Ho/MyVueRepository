package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Barchart)表实体类
 *
 * @author kai
 * @since 2020-12-22 22:38:15
 */
@SuppressWarnings("serial")
public class Barchart extends Model<Barchart> {
    @TableId(type = IdType.AUTO)
    
    private String x;
    
    private Integer y;


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }


}