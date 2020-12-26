package com.kai.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * (Tabledata)表实体类
 *
 * @author kai
 * @since 2020-12-25 16:43:39
 */
@SuppressWarnings("serial")
public class Tabledata extends Model<Tabledata> {
    @TableId(type = IdType.AUTO)
    
    private String date;
    
    private String name;
    
    private String address;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}