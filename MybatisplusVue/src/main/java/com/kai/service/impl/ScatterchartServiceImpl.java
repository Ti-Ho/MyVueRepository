package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.ScatterchartDao;
import com.kai.entity.Scatterchart;
import com.kai.service.ScatterchartService;
import org.springframework.stereotype.Service;

/**
 * (Scatterchart)表服务实现类
 *
 * @author kai
 * @since 2020-12-24 11:40:10
 */
@Service("scatterchartService")
public class ScatterchartServiceImpl extends ServiceImpl<ScatterchartDao, Scatterchart> implements ScatterchartService {

}