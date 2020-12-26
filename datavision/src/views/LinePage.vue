<template>
  <div class="com-page">
    <linegraph></linegraph>
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
import LineGraph from '../components/LineGraph'
export default {
  name: 'LinePage',
  data () {
    return {}
  },
  components: {
    linegraph: LineGraph
  }
}
</script>
