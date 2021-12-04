<template>
<h1>
{{msg}}

</h1>
</template>

<script>
//import CustomerDataService from '../services/CustomerDataService'

export default {
  name: 'HelloWorld',
  data(){
    return{
      msg:null,
 /*     customer: {
        id: null,
        firstName: "Aaa",
        lastName: "Aaa",
        email: "",
        phone: ""
      } */
    }
  },

  mounted() {


  //      .then(data => (this.postId = data.id));

    fetch("/getUser")
        .then((response)=>response.json())
        .then((data)=>{
      this.msg = data;
    })
    const postData = {
      firstName: "dasdsa",
      lastName: "qwewq",
    };
    const requestOptions = {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(postData)
      //  body: JSON.stringify({ title: "Vue POST Request Example" })
    };
    fetch("/setUser", requestOptions)
        .then(response => response.json())
//    fetch("/setUser").then((value => req))

 /*   var data = {
      firstName: this.customer.firstName,
      lastName: this.customer.lastName,
      email: this.customer.email
    }
    console.log(data)*/
  /*  CustomerDataService.set(this.customer)
        .then(response => {
          this.customer.id = response.data.id
        })
        .catch( e => {
          alert(e)
        })
*/
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
