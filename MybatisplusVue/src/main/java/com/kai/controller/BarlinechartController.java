package com.kai.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kai.entity.Barlinechart;
import com.kai.service.BarlinechartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Barlinechart)表控制层
 *
 * @author kai
 * @since 2020-12-23 22:40:24
 */
@RestController
@RequestMapping("barlinechart")
@CrossOrigin // 解决跨域问题
public class BarlinechartController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BarlinechartService barlinechartService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param barlinechart 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R<?> selectAll(Page<Barlinechart> page, Barlinechart barlinechart) {
        return success(this.barlinechartService.page(page, new QueryWrapper<>(barlinechart)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R<?> selectOne(@PathVariable Serializable id) {
        return success(this.barlinechartService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param barlinechart 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R<?> insert(@RequestBody Barlinechart barlinechart) {
        return success(this.barlinechartService.save(barlinechart));
    }

    /**
     * 修改数据
     *
     * @param barlinechart 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R<?> update(@RequestBody Barlinechart barlinechart) {
        return success(this.barlinechartService.updateById(barlinechart));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R<?> delete(@RequestParam("idList") List<Long> idList) {
        return success(this.barlinechartService.removeByIds(idList));
    }
}
