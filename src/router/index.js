import Vue from 'vue'
import VueRouter from 'vue-router'
import SellerPage from '../views/SellerPage'
import DataView from '../views/DataView'

Vue.use(VueRouter)

const routes = [
  {
    path: '/sellerpage',
    component: SellerPage
  },
  {
    path: '/dataview',
    component: DataView
  }
]

const router = new VueRouter({
  routes
})

export default router
