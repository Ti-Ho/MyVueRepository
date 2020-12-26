package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.BarlinechartDao;
import com.kai.entity.Barlinechart;
import com.kai.service.BarlinechartService;
import org.springframework.stereotype.Service;

/**
 * (Barlinechart)表服务实现类
 *
 * @author kai
 * @since 2020-12-23 22:40:24
 */
@Service("barlinechartService")
public class BarlinechartServiceImpl extends ServiceImpl<BarlinechartDao, Barlinechart> implements BarlinechartService {

}