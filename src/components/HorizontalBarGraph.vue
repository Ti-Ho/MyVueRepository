<template>
  <div>
    <el-container>
      <el-header>HorizontalBarGraph Header</el-header>
      <el-main>
        <div style="width: 100%; height: 280px; background-color: white" ref="hbar_ref"></div>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: 'HorizontalBarGraph',
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
      this.chartInstance = this.$echarts.init(this.$refs.hbar_ref)
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
          text: '世界人口总量',
          subtext: '数据来自网络'
        },
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'shadow'
          }
        },
        legend: {
          data: ['2011年', '2012年']
        },
        grid: {
          left: '3%',
          right: '4%',
          bottom: '3%',
          containLabel: true
        },
        xAxis: {
          type: 'value',
          boundaryGap: [0, 0.01]
        },
        yAxis: {
          type: 'category',
          data: ['巴西', '印尼', '美国', '印度', '中国', '世界人口(万)']
        },
        series: [
          {
            name: '2011年',
            type: 'bar',
            data: [18203, 23489, 29034, 104970, 131744, 630230]
          },
          {
            name: '2012年',
            type: 'bar',
            data: [19325, 23438, 31000, 121594, 134141, 681807]
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
