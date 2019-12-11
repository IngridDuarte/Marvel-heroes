import http from '../utils/http'
const handle = (promise) => {
   return promise
     .then(data => ([data, undefined]))
     .catch(error => Promise.resolve([undefined, error]));
 }
export default {
   getAll : async () => {
      let [categories, Err] = await handle(http.get('categories'));
      if(Err) throw new Error('Could not fetch categories', Err);
      return categories;
   },
   get  : (id) => http.get(`categories/${id}`)

}

