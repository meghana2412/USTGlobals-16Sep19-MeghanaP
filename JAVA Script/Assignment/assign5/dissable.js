// function validateForm(){
//     let formData = document.forms[0];
//     // console.log(formData.uname.value);
//     let userName = formData.uname.value;
//     if(userName.length>4){
//         console.log('Success');
//         formData.uname.style.border ='3px solid green';
//     }
//     else{
//         formData.uname.style.border = '2px solid red';
//     }
// }

//     function validateForm1(){
//         let formData = document.forms[0];
//     let password = formData.password.value;
//     if(password.length>7){
//         console.log('Success')
//         formData.password.style.border = '3px solid green';
//     }
//     else{
//         formData.password.style.border ='2px solid red';

//     }
// }
function validateForm(){
let formData = document.forms[0];
// console.log(formData.uname.value);
let userName = formData.uname.value;
let password = formData.password.value;
if(userName.length>4 && password.length>7){
    formData.uname.style.border ='3px solid green';
    formData.password.style.border = '3px solid green';
    formData.loginSubmit.disabled = false;
}
else{
    formData.uname.style.border = '2px solid red';
    formData.password.style.border ='2px solid red';
    formData.loginSubmit.disabled = true;
}
}

