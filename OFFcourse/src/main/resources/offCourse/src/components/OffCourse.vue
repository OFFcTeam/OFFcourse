<template>
    <div class="main">
    <section class="container backgr-img">
        <div class="content">
            <h1>Welcome to OFFCurse</h1>
            <div class="form">
                <p class="tittle">LogIn</p>
                <input class="field" type="email" placeholder="Username" v-model="username"/>
                <br>
                <input class="field" type="password" placeholder="Password" v-model="password"/>
                <br>
                <input class="btn" type="button" value="Login" v-on:click="login"/>
                <br>
                <input class="btn" type="button"  value="Registration" v-on:click="changeForm"/>
            </div>
        </div>

    </section>
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "OffCourse",
        data(){
            return{
                seen: false,
                username: "",
                password: "",
                token: localStorage.token,
            }
        },
        methods: {
            login(){
                axios.post('http://localhost:8082/register',{
                    'login' : this.$data.username,
                    'password' : this.$data.password
                }).then(response => {
                    this.token = response.data;
                    alert(this.token.value);

                    /*axios.get('http://localhost:8880/user?Authorization=Bearer ' +  this.token,)
                        .then(

                        )*/
                })
            },
            changeForm(){

            }
        }
    }
</script>

<style scoped>

    .container{
        height: 100vh;
        display: flex;
        width: 100%;
        min-height: 300px;
        vertical-align: baseline;
    }

    .backgr-img{
        background:  url("../../public/img/woodBoard.jpg") no-repeat center bottom / cover;
    }

    .content{
        margin: auto;
        height: 80%;
        width: 80%;
        overflow:  hidden;
        text-align:  center;
        padding: 50px;
        text-transform: uppercase;
        color: #8090e0;
        text-shadow: #000 1px 1px 0, #000 -1px -1px 0,
        #000 -1px 1px 0, #000 1px -1px 0;

    }

    .form{
        width: auto;
        margin: auto;
        max-width: 400px;
        background-color: #8090e0;
        padding: 30px;
        padding-top: 15px;
        text-align: center;
        border-radius: 25px;
        border: 2px solid #fff;
        opacity: 0.8;
        filter: alpha(Opacity=70);
        margin-top: 50px;
    }
    .field{
        margin: auto;
        height: 35px;
        width: 250px;
    }
    .form input{
        margin: 10px;
        opacity: 1;
        filter: alpha(Opacity=100);
        border-radius: 10px;
        border: 1px solid #000;

    }

    .btn{
        padding: 5px;
    }

    h1{
        font-size: 50px;
    }

    p{
        font-size: 30px;
    }


</style>