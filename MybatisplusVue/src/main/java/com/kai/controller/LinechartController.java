package com.kai.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kai.entity.Linechart;
import com.kai.service.LinechartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Linechart)表控制层
 *
 * @author kai
 * @since 2020-12-16 15:13:44
 */
@RestController
@RequestMapping("linechart")
@CrossOrigin // 解决跨域问题
public class LinechartController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private LinechartService linechartService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param linechart 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R<?> selectAll(Page<Linechart> page, Linechart linechart) {
        return success(this.linechartService.page(page, new QueryWrapper<>(linechart)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R<?> selectOne(@PathVariable Serializable id) {
        return success(this.linechartService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param linechart 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R<?> insert(@RequestBody Linechart linechart) {
        return success(this.linechartService.save(linechart));
    }

    /**
     * 修改数据
     *
     * @param linechart 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R<?> update(@RequestBody Linechart linechart) {
        return success(this.linechartService.updateById(linechart));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R<?> delete(@RequestParam("idList") List<Long> idList) {
        return success(this.linechartService.removeByIds(idList));
    }
}
