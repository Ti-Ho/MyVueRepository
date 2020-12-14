import Vue from 'vue'
import VueRouter from 'vue-router'
import DataView from '../views/DataView'
import TablePage from '../views/TablePage'

Vue.use(VueRouter)

const routes = [
  {
    path: '/dataview',
    component: DataView
  },
  {
    path: '/table',
    component: TablePage
  }
]

const router = new VueRouter({
  routes
})

export default router
