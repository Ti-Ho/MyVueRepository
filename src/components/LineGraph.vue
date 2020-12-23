<template>
  <div class="com-container">
    <div class="com-chart" ref="line_ref"></div>
  </div>
</template>

<script>
export default {
  name: 'LineGraph',
  data () {
    return {
      chartInstance: null,
      allData: null, // 服务器返回的数据
      timerGetDataId: null, // 定时器的标识,
      datakind: ['女装', '手机数码', '男装', '大家电', '美妆护肤'],
      titleFontSize: null,
      MyItemSize: null
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
      this.chartInstance = this.$echarts.init(this.$refs.line_ref, 'chalk')
      const initOption = {
        title: {
          text: '▎堆叠区域图',
          left: 20,
          top: 20
        },
        grid: {
          top: '35%',
          left: '3%',
          right: '4%',
          bottom: '2%',
          containLabel: true // 距离是包含坐标轴上的文字
        },
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'cross'
          }
        },
        legend: {
          left: 20,
          top: '17%',
          icon: 'circle'
        },
        toolbox: {
          itemSize: 20,
          feature: {
            saveAsImage: {}
          }
        },
        xAxis: {
          type: 'category',
          boundaryGap: false
        },
        yAxis: {
          type: 'value'
        }
      }
      this.chartInstance.setOption(initOption)
    },
    // 获取服务器的数据
    async getData () {
      const { data: ret } = await this.$http.get('linechart')
      this.allData = ret.data.records
      this.updateChart()
    },
    // 更新图表
    updateChart () {
      // 半透明的颜色值
      const colorArr1 = ['rgba(11, 168, 44, 0.5)', 'rgba(44, 110, 255, 0.5)', 'rgba(22, 242, 217, 0.5)', 'rgba(254, 33, 30, 0.5)', 'rgba(250, 105, 0, 0.5)']
      // 全透明的颜色值
      const colorArr2 = ['rgba(11, 168, 44, 0)', 'rgba(44, 110, 255, 0)', 'rgba(22, 242, 217, 0)', 'rgba(254, 33, 30, 0)', 'rgba(250, 105, 0, 0)']
      // 解析出xAxis的数据
      const timeArr = this.allData.map((item) => {
        return item.x
      })
      // 解析y轴Series的数据
      const ylength = this.datakind.length
      var yData = new Array([ylength])
      yData[0] = this.allData.map((item) => { return item.y1 })
      yData[1] = this.allData.map((item) => { return item.y2 })
      yData[2] = this.allData.map((item) => { return item.y3 })
      yData[3] = this.allData.map((item) => { return item.y4 })
      yData[4] = this.allData.map((item) => { return item.y5 })
      const seriesArr = this.datakind.map((item, index) => {
        return {
          name: this.datakind[index],
          type: 'line',
          data: yData[index],
          stack: '总量',
          areaStyle: {
            color: new this.$echarts.graphic.LinearGradient(0, 0, 0, 1, [
              {
                offset: 0,
                color: colorArr1[index]
              }, // %0的颜色值
              {
                offset: 1,
                color: colorArr2[index]
              } // 100%的颜色值
            ])
          }
        }
      })
      const dataOption = {
        xAxis: {
          data: timeArr
        },
        legend: {
          data: this.datakind
        },
        series: seriesArr
      }
      this.chartInstance.setOption(dataOption)
    },
    screenAdapter () {
      // console.log(this.$refs.line_ref.offsetWidth)
      this.titleFontSize = this.$refs.line_ref.offsetWidth / 100 * 3.6
      this.MyItemSize = Math.floor(this.titleFontSize)
      const adapterOption = {
        title: {
          textStyle: {
            fontSize: this.titleFontSize
          }
        },
        legend: {
          itemWidth: this.titleFontSize,
          itemHeight: this.titleFontSize,
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
  .el-row {
    margin-bottom: 0px;
  &:last-child {
     margin-bottom: 0;
   }
  }
  .el-col {
    border-radius: 4px;
  }
</style>
