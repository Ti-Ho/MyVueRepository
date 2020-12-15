<template>
    <div id = "datapage">
      <el-container>
        <el-header>数据看板</el-header>
        <el-divider></el-divider>
        <el-container>
          <el-aside width="140px" style="background-color: rgb(238, 241, 246)">
            <el-menu>
              <el-menu-item-group>
                <el-menu-item index="1-1">选项1</el-menu-item>
                <el-menu-item index="1-2">选项2</el-menu-item>
                <el-menu-item index="1-3">选项3</el-menu-item>
                <el-menu-item index="1-4">选项4</el-menu-item>
              </el-menu-item-group>
            </el-menu>
          </el-aside>
          <el-main>
            <el-row>
              <el-col :span="12">
<!--             修改：   <div style="width: 100%; height: 260px; background-color: white">-->
                  <linegraph></linegraph>
<!--                </div>-->
              </el-col>
              <el-col :span="12"><piegraph></piegraph></el-col>
            </el-row>

            <el-row>
              <el-col :span="12"><barlinegraph></barlinegraph></el-col>
              <el-col :span="12"><hbar></hbar></el-col>
            </el-row>

            <el-row>
              <el-col :span="12"><scattergraph></scattergraph></el-col>
              <el-col :span="12"><tabledemo></tabledemo></el-col>
            </el-row>
          </el-main>
        </el-container>
      </el-container>
    </div>
</template>

<style lang="less" scoped>
  #datapage {
    font-family: Avenir, Helvetica, Arial, sans-serif;
  }
  .el-header{
    font-size: x-large;
    height: 40px !important;
    background-color: #333333;
    color: white;
    text-align: center;
    line-height: 40px;
    border-radius: 10px;
    font-weight:bold;
    letter-spacing: 10px
  }

  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 610px;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    /*line-height: 610px;*/
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
    padding: 5px;
  }
  .el-divider {
    margin-top: 0px !important;
    margin-bottom: 10px !important;
  }
</style>

<script>
import LineGraph from '../components/LineGraph'
import BarAndLineGraph from '../components/BarAndLineGraph'
import PieGraph from '../components/PieGraph'
import TableDemo from '../components/TableDemo'
import ScatterGraph from '../components/ScatterGraph'
import HorizontalBarGraph from '../components/HorizontalBarGraph'

export default {
  name: 'DataView',
  data () {
    return { }
  },
  components: {
    linegraph: LineGraph,
    barlinegraph: BarAndLineGraph,
    piegraph: PieGraph,
    tabledemo: TableDemo,
    scattergraph: ScatterGraph,
    hbar: HorizontalBarGraph
  }
}
</script>
