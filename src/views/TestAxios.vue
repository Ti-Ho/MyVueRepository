<template>
    <div>
      <button @click="queryInfo">点我发送ajax</button>
      接收到后端的数据：{{ getdata }}
      <br>
      my_data: {{ my_data }}
    </div>
</template>

<style>
</style>

<script>
export default {
  name: 'TestAxios',
  data () {
    return {
      getdata: '',
      myip: 'http://localhost:8080/',
      my_data: '',
      timer: null
    }
  },
  mounted () {
    this.queryInfo()
    this.timer = setInterval(() => {
      setTimeout(this.queryInfo, 0)
    }, 1000)
  },
  methods: {
    queryInfo () {
      this.$http.get(this.myip + 'linechart').then(
        res => {
          console.log(res.data)
          this.getdata = res.data
          this.my_data = this.getdata.data.records
          var length = this.getdata.data.records.length
          for (var i = 0; i < length; i++) {
            console.log(this.my_data[i])
          }
        }
      )
    }
  },
  beforeDestroy () {
    clearInterval(this.timer)
    this.timer = null
  }
}
</script>
