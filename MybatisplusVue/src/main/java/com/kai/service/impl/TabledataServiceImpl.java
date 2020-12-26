package com.kai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kai.dao.TabledataDao;
import com.kai.entity.Tabledata;
import com.kai.service.TabledataService;
import org.springframework.stereotype.Service;

/**
 * (Tabledata)表服务实现类
 *
 * @author kai
 * @since 2020-12-25 16:43:39
 */
@Service("tabledataService")
public class TabledataServiceImpl extends ServiceImpl<TabledataDao, Tabledata> implements TabledataService {

}