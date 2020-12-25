<template>
  <div class="com-container">
    <div class="com-chart" ref="chart_ref">
      <el-table
        :data="tableData"
        height="100%"
        style="width: 100%"
        :style="comStyle"
        :row-style="getRowStyle"
        :header-cell-style="getHeaderStyle">
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
import { mapState } from 'vuex'
import { getThemeValue } from '@/utils/theme_utils'
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
  },
  computed: {
    getRowStyle () {
      return {
        background: getThemeValue(this.theme).tableRowBackColor,
        color: getThemeValue(this.theme).tableRowColor
      }
    },
    getHeaderStyle () {
      return {
        background: getThemeValue(this.theme).tableHeaderBackColor,
        color: getThemeValue(this.theme).tableHeaderColor
      }
    },
    ...mapState(['theme'])
  },
  watch: {
    theme () {
      // this.chartInstance.dispose() // 销毁当前的图表
      // this.initChart() // 重新以最新的主题名称初始化图表对象
      // this.screenAdapter() // 完成屏幕的适配
      // this.updateChart() // 更新图表的展示
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
