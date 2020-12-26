package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.BarchartDao;
import com.kai.entity.Barchart;
import com.kai.service.BarchartService;
import org.springframework.stereotype.Service;

/**
 * (Barchart)表服务实现类
 *
 * @author kai
 * @since 2020-12-22 22:38:16
 */
@Service("barchartService")
public class BarchartServiceImpl extends ServiceImpl<BarchartDao, Barchart> implements BarchartService {

}