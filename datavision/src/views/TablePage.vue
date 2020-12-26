<template>
  <div class="com-page">
    <tabledemo></tabledemo>
  </div>
</template>

<style lang="less" scoped>
  .com-page {
    width: 100%;
    height: 100%;
    overflow: hidden;
  }
</style>

<script>
import TableDemo from '../components/TableDemo'
export default {
  name: 'ScatterPage',
  data () {
    return {}
  },
  components: {
    tabledemo: TableDemo
  }
}
</script>
