<template>
<!--    <div>-->
<!--      <el-container>-->
<!--        <el-header>Header</el-header>-->
<!--        <el-container>-->

<!--          <el-aside width="140px" style="background-color: rgb(238, 241, 246)">-->
<!--            <el-menu>-->
<!--              <el-menu-item-group>-->
<!--                <el-menu-item index="1-1">选项1</el-menu-item>-->
<!--                <el-menu-item index="1-2">选项2</el-menu-item>-->
<!--                <el-menu-item index="1-3">选项3</el-menu-item>-->
<!--                <el-menu-item index="1-4">选项4</el-menu-item>-->
<!--              </el-menu-item-group>-->
<!--            </el-menu>-->
<!--          </el-aside>-->
<!--          <el-main>-->
<!--            <el-row>-->
<!--              <el-col :span="12"><el-table-->
<!--                :data="tableData"-->
<!--                style="width: 100%">-->
<!--                <el-table-column-->
<!--                  prop="date"-->
<!--                  label="日期"-->
<!--                  width="180">-->
<!--                </el-table-column>-->
<!--                <el-table-column-->
<!--                  prop="name"-->
<!--                  label="姓名"-->
<!--                  width="180">-->
<!--                </el-table-column>-->
<!--                <el-table-column-->
<!--                  prop="address"-->
<!--                  label="地址">-->
<!--                </el-table-column>-->
<!--              </el-table></el-col>-->
<!--              <el-col :span="12"><div class="grid-content bg-purple-light"></div></el-col>-->
<!--            </el-row>-->

<!--            <el-row>-->
<!--              <el-col :span="12"><div class="grid-content bg-purple"></div></el-col>-->
<!--              <el-col :span="12"><div class="grid-content bg-purple-light"></div></el-col>-->
<!--            </el-row>-->

<!--            <el-row>-->
<!--              <el-col :span="12"><div class="grid-content bg-purple"></div></el-col>-->
<!--              <el-col :span="12"><div class="grid-content bg-purple-light"></div></el-col>-->
<!--            </el-row>-->
<!--          </el-main>-->
<!--        </el-container>-->
<!--      </el-container>-->
<!--    </div>-->
  <el-container style="height: 500px; border: 1px solid #eee">
    <el-aside width="200px" style="background-color: rgb(238, 241, 246)"></el-aside>
    <el-container>
      <el-header style="text-align: right; font-size: 12px"></el-header>

      <el-main>
        <el-row>
          <el-table :data="tableData">
            <el-table-column prop="date" label="日期" width="140">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址">
            </el-table-column>
          </el-table>
        </el-row>
      </el-main>
    </el-container>
  </el-container>
</template>

<style lang="less" scoped>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: #333;
  }
  /*.el-header{*/
  /*  height: 40px !important;*/
  /*  background-color: #B3C0D1;*/
  /*  color: #333;*/
  /*  text-align: center;*/
  /*  line-height: 30px;*/
  /*}*/
  /*.el-aside {*/
  /*  background-color: #D3DCE6;*/
  /*  color: #333;*/
  /*  text-align: center;*/
  /*  line-height: 610px;*/
  /*}*/
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    /*line-height: 610px;*/
    padding: 0px !important;
  }
  /*body > .el-container {*/
  /*  margin-bottom: 40px;*/
  /*}*/
  .el-row {
    margin-bottom: 0px;
  &:last-child {
     margin-bottom: 0;
   }
  }
  /*.el-col {*/
  /*  border-radius: 4px;*/
  /*  padding: 3px;*/
  /*}*/
  /*.bg-purple-dark {*/
  /*  background: #99a9bf;*/
  /*}*/
  /*.bg-purple {*/
  /*  background: #d3dce6;*/
  /*}*/
  /*.bg-purple-light {*/
  /*  background: #e5e9f2;*/
  /*}*/
  /*.grid-content {*/
  /*  border-radius: 4px;*/
  /*  min-height: 36px;*/
  /*}*/
  /*.row-bg {*/
  /*  padding: 10px 0;*/
  /*  background-color: #f9fafc;*/
  /*}*/
</style>

<script>
export default {
  data () {
    const item = {
      date: '2016-05-02',
      name: '王小虎',
      address: '上海市普陀区金沙江路 1518 弄'
    }
    return {
      tableData: Array(20).fill(item)
    }
  }
}
</script>
