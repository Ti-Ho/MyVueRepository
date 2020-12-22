<template>
  <div class="com-page">
    <barandline></barandline>
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
import BarAndLineGraph from '../components/BarAndLineGraph'
export default {
  name: 'BarPage',
  data () {
    return {}
  },
  components: {
    barandline: BarAndLineGraph
  }
}
</script>
