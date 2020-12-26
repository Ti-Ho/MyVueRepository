package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.PiechartDao;
import com.kai.entity.Piechart;
import com.kai.service.PiechartService;
import org.springframework.stereotype.Service;

/**
 * (Piechart)表服务实现类
 *
 * @author kai
 * @since 2020-12-23 18:25:25
 */
@Service("piechartService")
public class PiechartServiceImpl extends ServiceImpl<PiechartDao, Piechart> implements PiechartService {

}