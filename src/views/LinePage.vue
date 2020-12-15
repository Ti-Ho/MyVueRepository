<template>
  <div style="width: 100%; height: 1000px;">
    <linegraph></linegraph>
  </div>
</template>

<style>
</style>

<script>
import LineGraph from '../components/LineGraph'
export default {
  name: 'LinePage',
  data () {
    return { }
  },
  components: {
    linegraph: LineGraph
  }
}
</script>
