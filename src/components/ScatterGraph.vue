<template>
  <div class="com-container">
    <div class="com-chart" ref="scatter_ref"></div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'ScatterGraph',
  data () {
    return {
      chartInstance: null,
      allData: null, // 服务器返回的数据
      timerGetDataId: null, // 定时器的标识
      titleFontSize: null,
      markLineOpt: {
        animation: false,
        label: {
          formatter: 'y = 0.5 * x + 3',
          align: 'right'
        },
        lineStyle: {
          type: 'solid'
        },
        tooltip: {
          formatter: 'y = 0.5 * x + 3'
        },
        data: [[{
          coord: [0, 3],
          symbol: 'none'
        }, {
          coord: [20, 13],
          symbol: 'none'
        }]]
      }
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
      this.chartInstance = this.$echarts.init(this.$refs.scatter_ref, this.theme)
      const initOption = {
        title: {
          text: '▎ 热销商品的占比',
          left: 20,
          top: 20
        },
        grid: [
          { top: '13%', x: '7%', y: '7%', width: '38%', height: '38%', containLabel: true },
          { top: '13%', x2: '7%', y: '7%', width: '38%', height: '38%', containLabel: true },
          { x: '7%', y2: '3%', width: '38%', height: '38%', containLabel: true },
          { x2: '7%', y2: '3%', width: '38%', height: '38%', containLabel: true }
        ],
        tooltip: {
          formatter: 'Group {a}: ({c})'
        },
        xAxis: [
          { gridIndex: 0, min: 0, max: 20 },
          { gridIndex: 1, min: 0, max: 20 },
          { gridIndex: 2, min: 0, max: 20 },
          { gridIndex: 3, min: 0, max: 20 }
        ],
        yAxis: [
          { gridIndex: 0, min: 0, max: 15 },
          { gridIndex: 1, min: 0, max: 15 },
          { gridIndex: 2, min: 0, max: 15 },
          { gridIndex: 3, min: 0, max: 15 }
        ]
      }
      this.chartInstance.setOption(initOption)
    },
    // 获取服务器的数据
    async getData () {
      const { data: ret } = await this.$http.get('scatterchart')
      this.allData = ret.data.records
      // console.log(this.allData)
      this.updateChart()
    },
    // 更新图表
    updateChart () {
      // eslint-disable-next-line no-unused-vars
      var pointData = [[]]
      var k = 0
      for (var i = 0; i < this.allData.length; ++i) {
        if (i === 0 || this.allData[i].pos !== this.allData[i - 1].pos) {
          pointData[this.allData[i].pos - 1] = []
          k = 0
        }
        pointData[this.allData[i].pos - 1][k++] = [this.allData[i].x, this.allData[i].y]
        // console.log(this.allData[i])
      }
      // console.log(pointData)
      const dataOption = {
        series: [
          {
            name: 'I',
            type: 'scatter',
            xAxisIndex: 0,
            yAxisIndex: 0,
            data: pointData[0],
            markLine: this.markLineOpt
          },
          {
            name: 'II',
            type: 'scatter',
            xAxisIndex: 1,
            yAxisIndex: 1,
            data: pointData[1],
            markLine: this.markLineOpt
          },
          {
            name: 'III',
            type: 'scatter',
            xAxisIndex: 2,
            yAxisIndex: 2,
            data: pointData[2],
            markLine: this.markLineOpt
          },
          {
            name: 'IV',
            type: 'scatter',
            xAxisIndex: 3,
            yAxisIndex: 3,
            data: pointData[3],
            markLine: this.markLineOpt
          }
        ]
      }
      this.chartInstance.setOption(dataOption)
    },
    screenAdapter () {
      this.titleFontSize = this.$refs.scatter_ref.offsetWidth / 100 * 3.6
      const adapterOption = {
        title: {
          textStyle: {
            fontSize: this.titleFontSize
          }
        }
      }
      this.chartInstance.setOption(adapterOption)
      this.chartInstance.resize()
    }
  },
  computed: {
    ...mapState(['theme'])
  },
  watch: {
    theme () {
      this.chartInstance.dispose() // 销毁当前的图表
      this.initChart() // 重新以最新的主题名称初始化图表对象
      this.screenAdapter() // 完成屏幕的适配
      this.updateChart() // 更新图表的展示
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
