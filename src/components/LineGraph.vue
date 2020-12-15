<template>
  <div style="height: 100%">
    <el-container style="height: 100%">
      <el-header>
        LineGraph Header
        <el-button type="primary" icon="el-icon-full-screen">查看</el-button>
      </el-header>
      <!-- modified -->
      <el-main>
        <div style="width: 100%; height: 100%; background-color: white" ref="line_ref"></div>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: 'LineGraph',
  data () {
    return {
      chartInstance: null
    }
  },
  mounted () {
    this.initChart()
    this.getData()
  },
  methods: {
    // 初始化echartsInstance对象
    initChart () {
      this.chartInstance = this.$echarts.init(this.$refs.line_ref)
    },
    // 获取服务器的数据
    getData () {
      // 访问后端数据
      // this.allData = 获取的数据
      this.updateChart()
    },
    // 更新图表
    updateChart () {
      const option = {
        title: {
          text: '堆叠区域图'
        },
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'cross',
            label: {
              backgroundColor: '#6a7985'
            }
          }
        },
        legend: {
          data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']
        },
        toolbox: {
          feature: {
            saveAsImage: {}
          }
        },
        grid: {
          left: '3%',
          right: '4%',
          bottom: '3%',
          containLabel: true
        },
        xAxis: [
          {
            type: 'category',
            boundaryGap: false,
            data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
          }
        ],
        yAxis: [
          {
            type: 'value'
          }
        ],
        series: [
          {
            name: '邮件营销',
            type: 'line',
            stack: '总量',
            areaStyle: {},
            data: [120, 132, 101, 134, 90, 230, 210]
          },
          {
            name: '联盟广告',
            type: 'line',
            stack: '总量',
            areaStyle: {},
            data: [220, 182, 191, 234, 290, 330, 310]
          },
          {
            name: '视频广告',
            type: 'line',
            stack: '总量',
            areaStyle: {},
            data: [150, 232, 201, 154, 190, 330, 410]
          },
          {
            name: '直接访问',
            type: 'line',
            stack: '总量',
            areaStyle: {},
            data: [320, 332, 301, 334, 390, 330, 320]
          },
          {
            name: '搜索引擎',
            type: 'line',
            stack: '总量',
            label: {
              normal: {
                show: true,
                position: 'top'
              }
            },
            areaStyle: {},
            data: [820, 932, 901, 934, 1290, 1330, 1320]
          }
        ]
      }
      this.chartInstance.setOption(option)
    }
  }
}
</script>

<style scoped>
  .el-header{
    font-size: large;
    height: 40px !important;
    background-color: #777777;
    color: white;
    text-align: center;
    line-height: 40px;
    border-radius: 10px;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 250px;
    padding: 0px !important;
  }

  body > .el-container {
    margin-bottom: 40px;
  }
</style>
