<template>
  <div class="com-page">
    <scattergraph></scattergraph>
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
import ScatterGraph from '../components/ScatterGraph'
export default {
  name: 'ScatterPage',
  data () {
    return {}
  },
  components: {
    scattergraph: ScatterGraph
  }
}
</script>
