<template>
    <div>
        <div class="scroll-container">

            <nav>
                <a href="#page-1">1</a>
                <a href="#page-2">2</a>
                <a href="#page-3">3</a>
                <a href="#page-4">4</a>
                <a href="#page-5">5</a>
            </nav>
                <div id="page-1" class="scroll-page">1</div>
                <div id="page-2" class="scroll-page">2</div>
                <div id="page-3" class="scroll-page">3</div>
                <div id="page-4" class="scroll-page">4</div>
                <div id="page-5" class="scroll-page">5</div>

        </div>
    </div>

</template>

<script>
    export default {
        name: "Main"
    }
</script>

<style scoped>
    a {
        width: 50px;
        text-decoration: none;
        margin: 20px;
    }
    nav, scroll-container {
        margin: 0 auto;
        text-align: center;
    }
    nav {
        width: 339px;
        padding: 5px;
        border: 1px solid black;
    }

    .scroll-page {

        height: 100%;
        font-size: 5em;
    }
</style>
