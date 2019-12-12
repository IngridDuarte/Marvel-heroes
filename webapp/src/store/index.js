import Vue from 'vue'
import Vuex from 'vuex'
import state from './state'
import mutations from './mutations'
import History from '../modules/History/state'

Vue.use(Vuex)

export default new Vuex.Store({
    state,
    mutations,
    modules: { History }
})