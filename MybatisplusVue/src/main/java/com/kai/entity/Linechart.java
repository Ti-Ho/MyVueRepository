package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Linechart)表实体类
 *
 * @author kai
 * @since 2020-12-16 15:13:38
 */
@SuppressWarnings("serial")
public class Linechart extends Model<Linechart> {
    @TableId(type = IdType.AUTO)
    
    private String x;
    
    private Integer y1;
    
    private Integer y2;
    
    private Integer y3;
    
    private Integer y4;
    
    private Integer y5;


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    public Integer getY3() {
        return y3;
    }

    public void setY3(Integer y3) {
        this.y3 = y3;
    }

    public Integer getY4() {
        return y4;
    }

    public void setY4(Integer y4) {
        this.y4 = y4;
    }

    public Integer getY5() {
        return y5;
    }

    public void setY5(Integer y5) {
        this.y5 = y5;
    }


}