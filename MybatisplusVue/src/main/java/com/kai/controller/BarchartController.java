package com.kai.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kai.entity.Barchart;
import com.kai.service.BarchartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Barchart)表控制层
 *
 * @author kai
 * @since 2020-12-22 22:38:16
 */
@RestController
@RequestMapping("barchart")
@CrossOrigin // 解决跨域问题
public class BarchartController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BarchartService barchartService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param barchart 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R<?> selectAll(Page<Barchart> page, Barchart barchart) {
        return success(this.barchartService.page(page, new QueryWrapper<>(barchart)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R<?> selectOne(@PathVariable Serializable id) {
        return success(this.barchartService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param barchart 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R<?> insert(@RequestBody Barchart barchart) {
        return success(this.barchartService.save(barchart));
    }

    /**
     * 修改数据
     *
     * @param barchart 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R<?> update(@RequestBody Barchart barchart) {
        return success(this.barchartService.updateById(barchart));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R<?> delete(@RequestParam("idList") List<Long> idList) {
        return success(this.barchartService.removeByIds(idList));
    }
}
