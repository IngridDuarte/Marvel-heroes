<template>
  <div>
    <h3>Pessoas</h3>
    <p>{{ message }}</p>
  </div>
</template>

<script>
export default {
  name: 'Pessoas',
  data: () => ({ 
    message: 'Hello World'  
  }),
}
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
</style>
