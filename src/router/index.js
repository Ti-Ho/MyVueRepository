import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import LinePage from '../views/LinePage'
import TestAxios from '../views/TestAxios'
import BarPage from '../views/BarPage'

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
  }
]

const router = new VueRouter({
  routes
})

export default router
