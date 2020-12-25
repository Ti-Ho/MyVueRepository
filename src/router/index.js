import Vue from 'vue'
import VueRouter from 'vue-router'
import LinePage from '../views/LinePage'
import BarPage from '../views/BarPage'
import BarAndLineGraph from '../components/BarAndLineGraph'
import HomePage from '../views/HomePage'
import PiePage from '../views/PiePage'
import ScatterPage from '../views/ScatterPage'
import TableDemo from '../components/TableDemo'

Vue.use(VueRouter)

const routes = [
  {
    path: '/linepage',
    component: LinePage
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
  }, {
    path: '/scatterpage',
    component: ScatterPage
  }, {
    path: '/tabledemo',
    component: TableDemo
  }
]

const router = new VueRouter({
  routes
})

export default router
