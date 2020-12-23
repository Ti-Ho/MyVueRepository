<template>
  <div class="com-container">
    <div class="com-chart" ref="barline_ref"></div>
  </div>
</template>

<script>
export default {
  name: 'BarAndLineGraph',
  data () {
    return {
      chartInstance: null,
      allData: null, // 服务器返回的数据
      timerGetDataId: null, // 定时器的标识
      titleFontSize: null,
      legendData: ['蒸发量', '降水量', '平均温度']
    }
  },
  mounted () {
    this.initChart()
    this.getData()
    // 定时从数据库刷新数据 15s 取一次
    this.timerGetDataId = setInterval(() => {
      setTimeout(this.getData, 0)
    }, 1000 * 15)
    window.addEventListener('resize', this.screenAdapter)
    this.screenAdapter()
  },
  destroyed () {
    clearInterval(this.timerGetDataId)
    this.timerGetDataId = null
    // 在组件销毁的时候, 需要将监听器取消掉
    window.removeEventListener('resize', this.screenAdapter)
  },
  methods: {
    // 初始化echartsInstance对象
    initChart () {
      this.chartInstance = this.$echarts.init(this.$refs.barline_ref, 'chalk')
      const initOption = {
        title: {
          text: '▎ 热销商品的占比',
          left: 20,
          top: 20
        },
        grid: {
          left: '3%',
          top: '25%',
          right: '4%',
          bottom: '5%',
          containLabel: true
        },
        legend: {
          top: '15%'
        },
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'cross',
            crossStyle: {
              color: '#999'
            }
          }
        },
        toolbox: {
          feature: {
            dataView: { show: true, readOnly: false },
            magicType: { show: true, type: ['line', 'bar'] },
            restore: { show: true },
            saveAsImage: { show: true }
          }
        },
        xAxis: [
          {
            type: 'category',
            axisPointer: {
              type: 'shadow'
            }
          }
        ],
        yAxis: [
          {
            type: 'value',
            name: '水量',
            min: 0,
            max: 250,
            interval: 50,
            axisLabel: {
              formatter: '{value} ml'
            }
          },
          {
            type: 'value',
            name: '温度',
            min: 0,
            max: 25,
            interval: 5,
            axisLabel: {
              formatter: '{value} °C'
            }
          }
        ]
      }
      this.chartInstance.setOption(initOption)
    },
    // 获取服务器的数据
    async getData () {
      const { data: ret } = await this.$http.get('barlinechart')
      this.allData = ret.data.records
      console.log(this.allData)
      this.updateChart()
    },
    // 更新图表
    updateChart () {
      const dataOption = {
        legend: {
          data: this.legendData
        },
        series: [
          {
            name: '蒸发量',
            type: 'bar',
            data: this.allData.map(item => { return item.y1 })
          },
          {
            name: '降水量',
            type: 'bar',
            data: this.allData.map(item => { return item.y2 })
          },
          {
            name: '平均温度',
            type: 'line',
            yAxisIndex: 1,
            data: this.allData.map(item => { return item.y3 })
          }
        ],
        xAxis: {
          data: this.allData.map(item => { return item.x })
        }
      }
      this.chartInstance.setOption(dataOption)
    },
    screenAdapter () {
      this.titleFontSize = this.$refs.barline_ref.offsetWidth / 100 * 3.6
      const adapterOption = {
        toolbox: {
          itemSize: this.titleFontSize / 2
        },
        title: {
          textStyle: {
            fontSize: this.titleFontSize
          }
        },
        legend: {
          itemWidth: this.titleFontSize,
          itemHeight: this.titleFontSize / 2,
          itemGap: this.titleFontSize,
          textStyle: {
            fontSize: this.titleFontSize / 2
          }
        }
      }
      this.chartInstance.setOption(adapterOption)
      this.chartInstance.resize()
    }
  }
}
</script>

<style scoped lang="less">
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
