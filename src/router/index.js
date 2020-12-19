import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import LinePage from '../views/LinePage'
import TestAxios from '../views/TestAxios'

Vue.use(VueRouter)

const routes = [
  {
    path: '/dataview',
    component: DataView
  }, {
    path: '/linepage',
    component: LinePage
  }, {
    path: '/testaxios',
    component: TestAxios
  }
]

const router = new VueRouter({
  routes
})

export default router
