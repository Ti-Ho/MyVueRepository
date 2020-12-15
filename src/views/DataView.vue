<template>
    <div>
      <el-container>
        <el-header>Header</el-header>
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
              <el-col :span="12"><linegraph></linegraph></el-col>
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
  .el-header{
    height: 40px !important;
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 30px;
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
    padding: 2px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
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
