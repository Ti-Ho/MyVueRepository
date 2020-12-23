import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import LinePage from '../views/LinePage'
import TestAxios from '../views/TestAxios'
import BarPage from '../views/BarPage'
import BarAndLineGraph from '../components/BarAndLineGraph'
import HomePage from '../views/HomePage'
import PiePage from '../views/PiePage'

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
    path: '/piepage',
    component: PiePage
  }, {
    path: '/barandline',
    component: BarAndLineGraph
  }, {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    component: HomePage
  }
]

const router = new VueRouter({
  routes
})

export default router
