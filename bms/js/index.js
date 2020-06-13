let firstpage = document.getElementById("firstpage");
let baseinfo = document.getElementById("baseinfo");
let books = document.getElementById("books");
let bookbox = document.getElementById("bookbox");
let chat = document.getElementById("chat");

let pageone = document.getElementById("pageone");
let pagetwo = document.getElementById("pagetwo");
let pagethree = document.getElementById("pagethree");
let pagefour = document.getElementById("pagefour");
let pagefive = document.getElementById("pagefive");

let username = document.getElementById("username-");
let sex = document.getElementById("sex-");
let email = document.getElementById("email-");

function changeone(){
    firstpage.style.background = "gray";
    baseinfo.style.background = "dimgray";
    books.style.background = "dimgray";
    bookbox.style.background = "dimgray";
    chat.style.background = "dimgray";

    pageone.style.display = "block";
    pagetwo.style.display = "none";
    pagethree.style.display = "none";
    pagefour.style.display = "none";
    pagefive.style.display = "none";
}

function changetwo(){
    firstpage.style.background = "dimgray";
    baseinfo.style.background = "gray";
    books.style.background = "dimgray";
    bookbox.style.background = "dimgray";
    chat.style.background = "dimgray";
    baseinfo.style.background = "gray";

    pageone.style.display = "none";
    pagetwo.style.display = "block";
    pagethree.style.display = "none";
    pagefour.style.display = "none";
    pagefive.style.display = "none";
}

function changethree(){
    firstpage.style.background = "dimgray";
    baseinfo.style.background = "dimgray";
    books.style.background = "gray";
    bookbox.style.background = "dimgray";
    chat.style.background = "dimgray";

    pageone.style.display = "none";
    pagetwo.style.display = "none";
    pagethree.style.display = "block";
    pagefour.style.display = "none";
    pagefive.style.display = "none";
}
function changefour(){
    firstpage.style.background = "dimgray";
    baseinfo.style.background = "dimgray";
    books.style.background = "dimgray";
    bookbox.style.background = "gray";
    chat.style.background = "dimgray";

    pageone.style.display = "none";
    pagetwo.style.display = "none";
    pagethree.style.display = "none";
    pagefour.style.display = "block";
    pagefive.style.display = "none";
}
function changefive(){
    firstpage.style.background = "dimgray";
    baseinfo.style.background = "dimgray";
    books.style.background = "dimgray";
    bookbox.style.background = "dimgray";
    chat.style.background = "gray";

    pageone.style.display = "none";
    pagetwo.style.display = "none";
    pagethree.style.display = "none";
    pagefour.style.display = "none";
    pagefive.style.display = "block";
}

function changetorw(){
    username.setAttribute("readOnly",false);
    sex.setAttribute("readOnly",false);
    email.setAttribute("readOnly",false);
}

function revise(){
    username.readOnly = false;
    sex.readOnly = false;
    email.readOnly = false;
    alert("可以修改了!");
}

function save(){
    username.readOnly = true;
    sex.readOnly = true;
    email.readOnly = true;
    alert("保存成功!");
}