<template>
    <div class="man">
        <header>
            <div class="container0">
                <a href="#" id="logo" target="_blank">offcourse</a>
                <label for="toggle-1" class="toggle-menu"><ul><li></li> <li></li> <li></li></ul></label>
                <input type="checkbox" id="toggle-1">
                <nav>
                    <ul>
                        <li><a href="#main" >Главная</a></li>
                        <li><a href="#about" >О компании</a></li>
                        <li><a href="#services" >Услуги</a></li>
                        <li><a href="#portfolio" >Портфолио</a></li>
                        <li><a href="#contact" >Контакты</a></li>
                        <li><a href="http://localhost:8080/OffCourse">Аккаунт</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <section class="container backgr-img">
            <a class="anchor" id="main"></a>
            <div class="content">
                <h1>offcourse</h1>
                <p>dknskdnon klnglkdnlg enrlggnln knlkgk klgln elrgkn nfjns s kkvnr nfnn sfs</p>
                <a href="#about" class="btn1">account</a>
            </div>
        </section>

        <section class="sec2" style="position: relative;">
            <a class="anchor" id="about"></a>
            <div class="content2">
                <h2 class="section-heading1">We've got what you need!</h2>
                <p class="text-faded">OFFcourse has everything you need for you to try yourself as a programmer or barista! Hundreds of courses are available to you in order to learn new things as soon as possible. Companies are looking for employees, they are ready to train you in real conditions!</p>
                <a href="#services">Get Started!</a>
            </div>
        </section>
        <section class="sec2 otherColor" style="position: relative;">
            <a class="anchor" id="services"></a>
            <div class="content2">
                <h2 class="section-heading2">At Your Service</h2>
                <div class="elems">
                    <div class="element">
                        <img src="../../public/img/icons/clock.png">
                        <p>test mess dvdv dg sdfs sdfs  sfsdssd sfssgr</p>
                    </div>
                    <div class="element">
                        <img src="../../public/img/icons/lamp.png">
                        <p>test mess dvdv dg sdfs sdfs  sfsdssd sfssgr</p>
                    </div>
                    <div class="element">
                        <img src="../../public/img/icons/users.png">
                        <p>test mess dvdv dg sdfs sdfs  sfsdssd sfssgr</p>
                    </div>
                    <div class="element">
                        <img src="../../public/img/icons/doc.png">
                        <p>test mess dvdv dg sdfs sdfs  sfsdssd sfssgr</p>
                    </div>
                </div>
            </div>
        </section>
        <section class="sec2 otherColor2" style="position: relative;">
            <a class="anchor" id="portfolio"></a>

            <div class="content2 nullIndentation">

                <div class="elems courses" >
                    <div id="firstCourse" class="course" >

                    </div>
                    <div id="secondCourse" class="course">


                    </div>
                    <div id="thirdCourse" class="course">


                    </div>
                    <div id="fourthCourse" class="course">


                    </div>
                    <div id="fifthCourse" class="course">

                    </div>
                    <div id="sixthCourse" class="course">

                    </div>
                </div>
            </div>
        </section>
        <section class="sec2 otherColor2">
            <div class="content2">
                <h2 class="section-heading1">Хватит смотреть, давай уже делай чо нить</h2>
                <a href="#services">Найти курс</a>
            </div>
        </section>
        <footer class="sec2" style="position: relative;">
            <a class="anchor" id="contact"></a>

            <div class="connect">
                <h2 class="section-heading1">Let's Get In Touch!</h2>
                <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>
                <div class="phone" >
                    <p>Номерочек</p>
                    <img src="../../public/img/icons/call.png">
                </div>
                <div class="email">
                    <img src="../../public/img/icons/write.png">
                    <p>Почточка</p>
                </div>
            </div>
        </footer>
    </div>
</template>
<script>

export default {
        name: "Test"
    }
</script>

<style scoped>
    /*_______START__HEADER_______*/
    header{
        width:100%;
        background-color:#fffce0;
        position: fixed;
        z-index: 9999;
        margin: 0;
        padding: 0;
    }
    .container0{
        width:100%;
    }
    #logo{
        float:left;
        font-size:1.7rem;
        text-transform:uppercase;
        text-decoration:none;
        padding: 15px 0;
        margin-left: 15px;
        color:#302f2e;
        font-weight: bold;
    }
    nav{
        float:right;
        margin-top:7px;

    }
    nav ul{
        float:right;
        margin:0;
        padding:0;
    }
    nav ul li{
        display: inline;
        list-style-type:none;

    }
    nav ul li a{
        color:#302f2e;
        font-weight: bold;
        font-size:20px;
        padding: 10px 5px 10px 5px;
        margin-right: 10px;
        display:inline-block;
        text-decoration:none;
    }
    nav ul li a:hover{
        background-color:#000;
        border-radius: 8px;
        opacity: 0.7; /* Полупрозрачный фон */
        filter: alpha(Opacity=70);
        color:#fffce0;
    }
    .toggle-menu ul{
        width:31px;
        padding-left:0;
        margin:5px
    }
    .toggle-menu ul li{
        width:100%;
        height:3px;
        background-color:#000;
        margin-bottom:4px;
        list-style:none
    }
    input[type=checkbox],label{
        display:none
    }

    @media only screen and (max-width: 967px) {
        header{
            padding:20px 0
        }
        #logo{
            padding:0
        }
        input[type=checkbox]{
            position:absolute;
            top:-7777px;
            left:-7777px;
            background:none
        }
        input[type=checkbox]:focus{
                      background:none
        }
        label{
            float:right;
            display:inline-block;
            cursor:pointer;
            margin-right:25px
        }
        input[type=checkbox]:checked ~ nav{
            display:block
        }
        nav{
            display:none;
            position:absolute;
            right:0;
            top:64px;
            background-color:#fffce0;
            opacity: 0.8; /* Полупрозрачный фон */
            filter: alpha(Opacity=100);
            padding:0;
            z-index:99
        }
        nav ul{
            width:auto
        }
        nav ul li{
            float:none;
            padding:0;
            width:100vw;
            display:table;
            text-align:  center;
        }
        nav ul li a{
            color:#000;
            font-size: 25px;
            padding-top: 5px;
            display:block;
            border-bottom:1px solid rgba(225,225,225,0.1);
        }
    }
    @media only screen and (max-width: 360px) {
        label{
            padding:5px 0
        }
        #logo{
            font-size:1.1rem
        }
        nav{
            top:47px
        }
    }
    /*_______FINISH__HEADER_______*/








    .container{
        height: 100vh;
        display: flex;
        width: 100%;
        min-height: 300px;
        vertical-align: baseline;
    }

    .backgr-img{
        background:  url("../../public/img/main.jpg") no-repeat center bottom / cover;
    }

    .content{
        margin: auto;
        height: 80%;
        width: 80%;
        overflow:  hidden;
        text-align:  center;
        padding: 50px;
        text-transform: uppercase;
        color: #fffce0;
        text-shadow: #000 1px 1px 0, #000 -1px -1px 0,
        #000 -1px 1px 0, #000 1px -1px 0;

    }
    .content h1{
        padding-top: 100px;
        font-size: 75px;
    }

    .content p {
        padding-top: 0;
        font-size: 40px;
        padding-bottom: 60px;
    }

    .content a{
        font-size: 20px;
        text-decoration: none;
        padding: 13px;
        border-radius: 25px;
        font-weight: bold;
        border: 1px solid #fffce0;
        text-shadow: none;
        background: #000;
        background: rgba(0, 000, 000, 0.6);
        color: #fffce0;
    }
    .content a:hover {
        background: #000; /* Цвет фона при наведении на ссылку курсора */
        color: #fffce0; /* Новый цвет текста */
        opacity: 1; /* Полупрозрачный фон */
        filter: alpha(Opacity=100);
    }

    @media (max-width: 967px) {
        .container{
            height: auto;
        }
        .content h1{
            font-size: 50px;
        }

        .content p {
            padding-top: 0;
            font-size: 40px;
            padding-bottom: 20px;
        }
    }
    /*_________________________________________________________________*/


    .sec2{
        padding: 0;
        margin: 0;
        width: 100%;
        overflow:  hidden;
        background-color: #fffce0;
    }

    .content2{
        margin: auto;
        text-align:  center;
        margin-bottom: 25px;
    }

    .content2 h2{
        font-size: 40px;
    }

    .content2 p{
        margin: 0px 30px 0px 30px;
        font-size: 20px;
        margin-bottom: 40px;
    }

    .content2 a{
        font-size: 20px;
        text-decoration: none;
        padding: 13px;
        border-radius: 25px;
        font-weight: bold;
        border: 1px solid #000;
        text-shadow: none;
        background: #000;
        color: #fffce0;
    }

    .content2 a:hover {
        background: #000; /* Цвет фона при наведении на ссылку курсора */
        color: #fffce0; /* Новый цвет текста */
        opacity: 0.6; /* Полупрозрачный фон */
        filter: alpha(Opacity=100);
    }

    /*_________________________________________________________________*/

    .otherColor{
        background-color: #d5d5d5;
    }

    .elems{
        margin: auto;
        height: auto;
        width: 100%;
    }

    .element{
        height: auto;
        width: auto;
        margin-top: 25px;
        text-align:  center;
        display: inline-block;
        padding: 70px;
        padding-top: 0;
        padding-bottom: 0;

    }

    .element img{
        min-height: 150px;
        min-width: 150px;
    }

    .section-heading2{
        margin: 0;
        padding: 0;
        margin-top: 20px;
    }

    .element p{
        margin: 0;
        max-width: 150px;
    }
    /*_________________________________________*/

    .courses{
        margin: auto;
        height: auto;
        width: 100%;
        padding-bottom: 0;
    }

    .course{
        display: inline-block;
        height: 300px;
        width: 33.3333%; /* Можно задать любую другую ширину блока */
        background: url("../../public/img/main.jpg");
        margin-top: -4px;
        padding: 0;
    }

    #firstCourse{
        background: url("../../public/img/courses/tryMan.jpg") no-repeat center bottom / cover;
    }
    #secondCourse{
        background: url("../../public/img/courses/Teach_6.jpg") no-repeat center bottom / cover;
    }
    #thirdCourse{
        background: url("../../public/img/courses/lesson_1.jpg") no-repeat bottom / cover;
    }
    #fourthCourse{
        background: url("../../public/img/courses/workProcess.webp") no-repeat center bottom / cover;
    }
    #fifthCourse{
        background: url("../../public/img/courses/bartender.jpg") no-repeat center bottom / cover;
    }
    #sixthCourse{
        background: url("../../public/img/courses/barber.jpg") no-repeat center bottom / cover;
    }


    @media (max-width: 967px) {
        .course{
            width: 50%;
        }
    }
    @media (max-width: 600px) {
        .course{
            display: block;
            width: 100%;
        }
    }
    .nullIndentation{
        margin: 0;
        padding: 0;
    }
    .otherColor2{
        background-color: #d5d5d5;
    }
    /*_______________________________________*/
    .connect{
        margin: auto;
        text-align:  center;
    }
    .connect p{
        font-size: 15px;
        text-align: center;

    }
    .phone, .email{
        display: inline-block;
        margin: auto;
        text-align: center;

    }

    .phone p{
        display: inline-block;
        float: left;
        padding: 15px;

    }
    .email p{
        display: inline-block;
        float: right;
        padding: 15px;
    }

    .anchor {
        position: absolute;
        left: 0;
        top: -60px;
    }


</style>