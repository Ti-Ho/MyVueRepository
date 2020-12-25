<template>
  <div class="com-container">
    <div class="com-chart" ref="pie_ref"></div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'PieGraph',
  data () {
    return {
      chartInstance: null,
      allData: null, // 服务器返回的数据
      timerGetDataId: null, // 定时器的标识
      titleFontSize: null
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
      this.chartInstance = this.$echarts.init(this.$refs.pie_ref, this.theme)
      const initOption = {
        title: {
          text: '▎饼图',
          left: 20,
          top: 20
        },
        tooltip: {
          trigger: 'item',
          formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
          top: '10%',
          icon: 'circle'
        },
        series: [
          {
            name: '访问来源',
            type: 'pie',
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
      this.chartInstance.setOption(initOption)
    },
    // 获取服务器的数据
    async getData () {
      const { data: ret } = await this.$http.get('piechart')
      this.allData = ret.data.records
      // console.log(this.allData)
      this.updateChart()
    },
    // 更新图表
    updateChart () {
      // 处理图表需要的数据
      const legendData = this.allData.map(item => {
        return item.name
      })
      const seriesData = this.allData.map(item => {
        return {
          name: item.name,
          value: item.value
        }
      })
      const dataOption = {
        legend: {
          data: legendData
        },
        series: [
          {
            data: seriesData
          }
        ]
      }
      this.chartInstance.setOption(dataOption)
    },
    screenAdapter () {
      this.titleFontSize = this.$refs.pie_ref.offsetWidth / 100 * 3.6
      const adapterOption = {
        title: {
          textStyle: {
            fontSize: this.titleFontSize
          }
        },
        legend: {
          itemWidth: this.titleFontSize,
          itemHeight: this.titleFontSize,
          itemGap: this.titleFontSize / 2,
          textStyle: {
            fontSize: this.titleFontSize / 2
          }
        },
        series: [
          {
            radius: this.titleFontSize * 4.4,
            center: ['50%', '60%']
          }
        ]
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
