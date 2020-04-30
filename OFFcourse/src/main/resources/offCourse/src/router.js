import Vue from 'vue'
import Router from 'vue-router'
import Main from './components/Main.vue'
import OffCourse from './components/OffCourse.vue'
import Test from './components/Test.vue'
Vue.use(Router);

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'Main',
            component: Main
        },
        {
            path: '/OffCourse',
            name: 'OffCourse',
            component: OffCourse
        },
        {
            path: '/test',
            name: 'Test',
            component: Test
        }
    ]
})