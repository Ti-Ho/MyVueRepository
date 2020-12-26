package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Scatterchart)表实体类
 *
 * @author kai
 * @since 2020-12-24 11:40:10
 */
@SuppressWarnings("serial")
public class Scatterchart extends Model<Scatterchart> {
    @TableId(type = IdType.AUTO)
    
    private Double x;
    
    private Double y;
    
    private Integer pos;


    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }


}