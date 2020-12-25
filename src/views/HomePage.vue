<template>
  <div class="screen-container">
    <el-container>
      <el-header>
        <div>数据看板</div>
        <el-divider></el-divider>
      </el-header>
      <el-container>
        <el-main>
          <el-row style="height: 100%;">
            <el-col :span="7" style="height: 100%;">
              <div style="height: 47%; padding: 1%; position: relative;">
                <linegraph></linegraph>
<!--                <span class="iconfont icon-expand-alt"></span>-->
              </div>
              <div style="height: 48%; padding: 1%"><bardemo></bardemo></div>
            </el-col>
            <el-col :span="10" style="height: 100%;">
              <div style="height: 58%; padding: 1%"><barlinegraph></barlinegraph></div>
              <div style="height: 35%; padding: 1%"><tabledemo></tabledemo></div>
            </el-col>
            <el-col :span="7" style="height: 100%;">
              <div style="height: 47%; padding: 1%"><piegraph></piegraph></div>
              <div style="height: 48%; padding: 1%"><scattergraph></scattergraph></div>
            </el-col>
          </el-row>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style lang="less" scoped>
  .el-header{
    font-size: x-large;
    color: white;
    text-align: center;
    line-height: 40px;
    border-radius: 10px;
    /*font-weight:bold;*/
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

  .el-row {
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
    right: 20px;
    top: 20px;
    cursor: pointer;
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
    return { msg: 'vue模板页' }
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
  }
}
</script>
