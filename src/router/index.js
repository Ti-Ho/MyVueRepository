import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'

Vue.use(VueRouter)

const routes = [
  {
    path: '/dataview',
    component: DataView
  }
]

const router = new VueRouter({
  routes
})

export default router
