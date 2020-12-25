<template>
  <div class="screen-container">
    <el-container>
      <el-header>
        <div>数据看板</div>
        <div class="head-right">
          <img src="/static/img/qiehuan_dark.png" @click="handleChangeTheme">
        </div>
        <el-divider></el-divider>
      </el-header>
      <el-container>
        <el-main>
          <el-row style="height: 100%;">
            <el-col :span="7" style="height: 100%;">
              <!-- 折线/堆叠图 -->
              <div style="height: 47%; padding: 1%; position: relative;" :class="[fullScreenStatus.line ? 'fullscreen' : '']">
                <linegraph ref="line"></linegraph>
                <div class="resize">
                  <span @click="changeSize('line')" :class="['iconfont', fullScreenStatus.line ? 'icon-compress-alt' : 'icon-expand-alt']"></span>
                </div>
              </div>
              <!-- 柱状图 -->
              <div style="height: 48%; padding: 1%; position: relative;" :class="[fullScreenStatus.bar ? 'fullscreen' : '']">
                <bardemo ref="bar"></bardemo>
                <div class="resize">
                  <span @click="changeSize('bar')" :class="['iconfont', fullScreenStatus.bar ? 'icon-compress-alt' : 'icon-expand-alt']"></span>
                </div>
              </div>
            </el-col>
            <el-col :span="10" style="height: 100%;">
              <!-- 折线 + 柱状图 -->
              <div style="height: 58%; padding: 1%; position: relative;" :class="[fullScreenStatus.barline ? 'fullscreen' : '']">
                <barlinegraph ref="barline"></barlinegraph>
                <div class="resize">
                  <span @click="changeSize('barline')" :class="['iconfont', fullScreenStatus.barline ? 'icon-compress-alt' : 'icon-expand-alt']"></span>
                </div>
              </div>
              <!-- 表格 -->
              <div style="height: 35%; padding: 1%;">
                <tabledemo></tabledemo>
              </div>
            </el-col>
            <el-col :span="7" style="height: 100%;">
              <!-- 饼图 -->
              <div style="height: 47%; padding: 1%; position: relative;" :class="[fullScreenStatus.pie ? 'fullscreen' : '']">
                <piegraph ref="pie"></piegraph>
                <div class="resize">
                  <span @click="changeSize('pie')" :class="['iconfont', fullScreenStatus.pie ? 'icon-compress-alt' : 'icon-expand-alt']"></span>
                </div>
              </div>
              <!-- 散点图 -->
              <div style="height: 48%; padding: 1%; position: relative;" :class="[fullScreenStatus.scatter ? 'fullscreen' : '']">
                <scattergraph ref="scatter"></scattergraph>
                <div class="resize">
                  <span @click="changeSize('scatter')" :class="['iconfont', fullScreenStatus.scatter ? 'icon-compress-alt' : 'icon-expand-alt']"></span>
                </div>
              </div>
            </el-col>
          </el-row>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style lang="less" scoped>
  // 全屏样式的定义
  .fullscreen {
    position: fixed!important;
    top: 0 !important;
    left: 0 !important;
    width: 100% !important;
    height: 100% !important;
    margin: 0 !important;
    padding: 0 !important;
    z-index: 100;
  }
  .el-header{
    font-size: x-large;
    color: white;
    text-align: center;
    line-height: 40px;
    border-radius: 10px;
    letter-spacing: 10px;
    height: 40px !important;
  }
  .el-container {
    padding-left: 0;
    padding-right: 0
  }
  .el-main {
    padding: 0px !important;
  }
  .el-container {
    height: 100% !important;
  }
  .el-col {
    border-radius: 4px;
  }
  .el-divider {
    height: 3px;
    background-color: #003366;
    margin-top: 0px !important;
    margin-bottom: 0px !important;
  }
  .title {
    position: absolute;
    left: 50%;
    top: 50%;
    font-size: 20px;
  }
  .screen-container {
    width: 100%;
    height: 100%;
    padding: 0 15px;
    background-color: #161522;
    color: #fff;
    box-sizing: border-box;
  }
  .resize {
    position: absolute;
    right: 15px;
    top: 30px;
    cursor: pointer;
  }
  .head-right {
    position: absolute;
    right: 50px;
    cursor: pointer;
    top: 5px;
  }
</style>

<script>
import { getThemeValue } from '@/utils/theme_utils'
import { mapState } from 'vuex'
import LineGraph from '../components/LineGraph'
import BarAndLineGraph from '../components/BarAndLineGraph'
import PieGraph from '../components/PieGraph'
import TableDemo from '../components/TableDemo'
import ScatterGraph from '../components/ScatterGraph'
import BarDemo from '../components/BarDemo'
export default {
  name: 'HomePage',
  data () {
    return {
      // 定义每一个图表的全屏状态
      fullScreenStatus: {
        line: false,
        bar: false,
        barline: false,
        pie: false,
        scatter: false
      }
    }
  },
  computed: {
    logoSrc () {
      return '/static/img/' + getThemeValue(this.theme).logoSrc
    },
    headerSrc () {
      return '/static/img/' + getThemeValue(this.theme).headerBorderSrc
    },
    themeSrc () {
      return '/static/img/' + getThemeValue(this.theme).themeSrc
    },
    containerStyle () {
      return {
        backgroundColor: getThemeValue(this.theme).backgroundColor,
        color: getThemeValue(this.theme).titleColor
      }
    },
    ...mapState(['theme'])
  },
  components: {
    linegraph: LineGraph,
    barlinegraph: BarAndLineGraph,
    piegraph: PieGraph,
    tabledemo: TableDemo,
    scattergraph: ScatterGraph,
    bardemo: BarDemo
  },
  methods: {
    changeSize (chartName) {
      // 1.改变fullScreenStatus的数据
      this.fullScreenStatus[chartName] = !this.fullScreenStatus[chartName]
      // 2.需要调用每一个图表组件的screenAdapter的方法
      this.$nextTick(() => {
        this.$refs[chartName].screenAdapter()
      })
    },
    handleChangeTheme () {
      // 修改VueX中数据
      this.$store.commit('changeTheme')
      // console.log(this.$store.state.theme)
    }
  }
}
</script>
