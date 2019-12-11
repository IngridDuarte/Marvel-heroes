import Vue from 'vue'
import Vuex from 'vuex'
import state from './state'
import mutations from './mutations'
import Category from '../modules/Category/state'

Vue.use(Vuex)

export default new Vuex.Store({
    state,
    mutations,
    modules: { Category }
})