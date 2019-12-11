import axios from 'axios';
const client = axios.create({
    baseURL: process.env.NODE_ENV=== 'production' ? '' : 'http://localhost:3000/',
    timeout: 5000});
export default client;
