package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Barlinechart)表实体类
 *
 * @author kai
 * @since 2020-12-23 22:40:24
 */
@SuppressWarnings("serial")
public class Barlinechart extends Model<Barlinechart> {
    @TableId(type = IdType.AUTO)
    
    private String x;
    
    private Double y1;
    
    private Double y2;
    
    private Double y3;


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public Double getY3() {
        return y3;
    }

    public void setY3(Double y3) {
        this.y3 = y3;
    }


}