<template>
<h1>
{{msg.firstName}}
{{msg.lastName}}
</h1>
</template>

<script>
export default {
  name: 'HelloWorld',
  data(){
    return{
      msg:null
    }
  },
  mounted() {
    fetch("/getUser")
        .then((response)=>response.json())
        .then((data)=>{
      this.msg = data;
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
