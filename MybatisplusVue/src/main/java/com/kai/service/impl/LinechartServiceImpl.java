package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.LinechartDao;
import com.kai.entity.Linechart;
import com.kai.service.LinechartService;
import org.springframework.stereotype.Service;

/**
 * (Linechart)表服务实现类
 *
 * @author kai
 * @since 2020-12-16 15:13:44
 */
@Service("linechartService")
public class LinechartServiceImpl extends ServiceImpl<LinechartDao, Linechart> implements LinechartService {

}