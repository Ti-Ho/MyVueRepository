<template>
  <div>
    <el-container>
      <el-header>PieGraph Header</el-header>
      <el-main>
        <el-col :span="12"><div style="width: 100%; height: 260px;background-color: white" ref="pie_ref"></div></el-col>
        <el-col :span="12"><div style="width: 100%; height: 260px;background-color: white" ref="pie2_ref"></div></el-col>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: 'PieGraph',
  data () {
    return {
      chartInstance: null,
      chartInstance2: null
    }
  },
  mounted () {
    this.initChart()
    this.getData()
  },
  methods: {
    // 初始化echartsInstance对象
    initChart () {
      this.chartInstance = this.$echarts.init(this.$refs.pie_ref)
      this.chartInstance2 = this.$echarts.init(this.$refs.pie2_ref)
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
        tooltip: {
          trigger: 'item',
          formatter: '{a} <br/>{b}: {c} ({d}%)'
        },
        legend: {
          top: '5%',
          left: 'center'
        },
        series: [
          {
            name: '访问来源',
            type: 'pie',
            radius: ['40%', '70%'],
            avoidLabelOverlap: false,
            itemStyle: {
              borderRadius: 10,
              borderColor: '#fff',
              borderWidth: 2
            },
            label: {
              show: false,
              position: 'center'
            },
            emphasis: {
              label: {
                show: true,
                fontSize: '15',
                fontWeight: 'bold'
              }
            },
            labelLine: {
              show: false
            },
            data: [
              { value: 1048, name: '搜索引擎' },
              { value: 735, name: '直接访问' },
              { value: 580, name: '邮件营销' },
              { value: 484, name: '联盟广告' },
              { value: 300, name: '视频广告' }
            ]
          }
        ]
      }
      const option2 = {
        tooltip: {
          trigger: 'item',
          formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
          orient: 'vertical',
          left: 'left'
        },
        series: [
          {
            name: '访问来源',
            type: 'pie',
            radius: '50%',
            data: [
              { value: 1048, name: '搜索引擎' },
              { value: 735, name: '直接访问' },
              { value: 580, name: '邮件营销' },
              { value: 484, name: '联盟广告' },
              { value: 300, name: '视频广告' }
            ],
            emphasis: {
              itemStyle: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
              }
            }
          }
        ]
      }
      this.chartInstance.setOption(option)
      this.chartInstance2.setOption(option2)
    }
  }
}
</script>

<style scoped>
  .el-header{
    font-size: large;
    height: 30px !important;
    background-color: #777777;
    color: white;
    text-align: center;
    line-height: 30px;
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
