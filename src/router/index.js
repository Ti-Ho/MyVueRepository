import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import LinePage from '../views/LinePage'

Vue.use(VueRouter)

const routes = [
  {
    path: '/dataview',
    component: DataView
  }, {
    path: '/linepage',
    component: LinePage
  }
]

const router = new VueRouter({
  routes
})

export default router
