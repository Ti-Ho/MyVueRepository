import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'

// 请求基准路径的配置
axios.defaults.baseURL = 'http://localhost:8080/'
// 将axios挂载到Vue的原型对象上
Vue.prototype.$http = axios

Vue.prototype.$echarts = window.echarts
Vue.config.productionTip = false

Vue.use(ElementUI)

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
