<template>
  <div>
    <div>TestTestTestTestTestTestTest</div>
    <div>TestTestTestTestTestTestTest</div>
    <div style="width: 400px; height: 400px;background-color: green" ref="seller_ref"></div>
  </div>
</template>

<script>
export default {
  name: 'Seller',
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
      this.chartInstance = this.$echarts.init(this.$refs.seller_ref)
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
        xAxis: {
          type: 'value'
        },
        yAxis: {
          type: 'category',
          data: ['小明', '小红', '小王']
        },
        series: [
          {
            type: 'bar',
            data: [70, 92, 87]
          }
        ]
      }
      this.chartInstance.setOption(option)
    }
  }
}
</script>

<style scoped>

</style>
