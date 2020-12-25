<template>
  <div class="com-container">
    <div class="com-chart" ref="chart_ref">
      <el-table
        :data="tableData"
        height="100%"
        style="width: 100%"
        :row-style="{background:'#222733',color:'#888'}"
        :header-cell-style="{background:'#222733',color:'#999'}">
        <el-table-column
          prop="date"
          label="日期"
          width="180">
        </el-table-column>
        <el-table-column
          prop="name"
          label="姓名"
          width="180">
        </el-table-column>
        <el-table-column
          prop="address"
          label="地址">
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
export default {
  name: 'TableDemo',
  data () {
    return {
      tableData: null
    }
  },
  mounted () {
    this.getData()
    // 定时从数据库刷新数据 15s 取一次
    this.timerGetDataId = setInterval(() => {
      setTimeout(this.getData, 0)
    }, 1000 * 15)
  },
  destroyed () {
    clearInterval(this.timerGetDataId)
    this.timerGetDataId = null
  },
  methods: {
    // 获取服务器的数据
    async getData () {
      const { data: ret } = await this.$http.get('tabledata')
      this.tableData = ret.data.records
    }
  }
}
</script>

<style scoped>
  .com-container {
    width: 100%;
    height: 100%;
    overflow: hidden;
  }
  .com-chart {
    width: 100%;
    height: 100%;
    overflow: hidden;
    border-radius: 20px;
  }
</style>
