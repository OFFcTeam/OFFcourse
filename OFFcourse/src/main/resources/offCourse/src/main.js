import Vue from 'vue'
import App from './App.vue'
import router from './router'
import OffC from './components/OffCourse'

Vue.component('OffC', OffC);
Vue.config.productionTip = false;

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
