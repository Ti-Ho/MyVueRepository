<template>
  <div class="com-page">
    <piegraph></piegraph>
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
import PieGraph from '../components/PieGraph'
export default {
  name: 'PiePage',
  data () {
    return {}
  },
  components: {
    piegraph: PieGraph
  }
}
</script>
