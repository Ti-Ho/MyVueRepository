<template>
  <div class="com-page">
    <el-container>
      <el-header>数据看板</el-header>
<!--      <el-divider></el-divider>-->
      <el-container>
        <el-main>
          el - main
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style lang="less" scoped>
  .com-page {
    width: 100%;
    height: 100%;
    overflow: hidden;
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
    margin-bottom: 10px;
    &:last-child {
      margin-bottom: 0;
    }
  }
  .el-col {
    border-radius: 4px;
    /*padding: 5px;*/
    padding-left: 5px;
    padding-right: 5px;
  }
  .el-divider {
    margin-top: 0px !important;
    margin-bottom: 10px !important;
  }
</style>

<script>
export default {
  name: 'HomePage',
  data () {
    return { msg: 'vue模板页' }
  }
}
</script>
