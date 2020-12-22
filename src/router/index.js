import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import LinePage from '../views/LinePage'
import TestAxios from '../views/TestAxios'
import BarPage from '../views/BarPage'
import BarAndLineGraph from '../components/BarAndLineGraph'

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
  }, {
    path: '/barpage',
    component: BarPage
  }, {
    path: '/barandline',
    component: BarAndLineGraph
  }
]

const router = new VueRouter({
  routes
})

export default router
