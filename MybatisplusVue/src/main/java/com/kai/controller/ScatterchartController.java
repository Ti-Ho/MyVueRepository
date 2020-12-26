package com.kai.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kai.entity.Scatterchart;
import com.kai.service.ScatterchartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Scatterchart)表控制层
 *
 * @author kai
 * @since 2020-12-24 11:40:10
 */
@RestController
@RequestMapping("scatterchart")
@CrossOrigin // 解决跨域问题
public class ScatterchartController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ScatterchartService scatterchartService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param scatterchart 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R<?> selectAll(Page<Scatterchart> page, Scatterchart scatterchart) {
        return success(this.scatterchartService.page(page, new QueryWrapper<>(scatterchart)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R<?> selectOne(@PathVariable Serializable id) {
        return success(this.scatterchartService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param scatterchart 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R<?> insert(@RequestBody Scatterchart scatterchart) {
        return success(this.scatterchartService.save(scatterchart));
    }

    /**
     * 修改数据
     *
     * @param scatterchart 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R<?> update(@RequestBody Scatterchart scatterchart) {
        return success(this.scatterchartService.updateById(scatterchart));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R<?> delete(@RequestParam("idList") List<Long> idList) {
        return success(this.scatterchartService.removeByIds(idList));
    }
}
