<template>
    <div class="com-page">
      <bardemo></bardemo>
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
import BarDemo from '../components/BarDemo'
export default {
  name: 'BarPage',
  data () {
    return {}
  },
  methods: {},
  components: {
    bardemo: BarDemo
  }
}
</script>
