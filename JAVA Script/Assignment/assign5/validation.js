 document.getElementById("errorPassword").style.visibility = "hidden";
 document.getElementById("errorUser").style.visibility = "hidden";
document.getElementById("button1").disabled = true;

 let password = document.getElementById("paswd");
 let username = document.getElementById("username");

function showPassword() {
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }


  function validation(){
   
    let len1 = username.value.length;
    let len2 =password.value.length;
    if(len1 > 5 && len2 > 6)
    document.getElementById("button1").disabled = false;
    else
    document.getElementById("button1").disabled = true;
    
    }
    
function validation(){
   
let len1 = username.value.length;
let len2 =password.value.length;
if(len1 > 5 && len2 > 6 )
document.getElementById("button1").disabled = false;
else
document.getElementById("button1").disabled = true;
}

function validation1(){
    if(username.value!="Sanmathi" )
    document.getElementById("errorUser").style.visibility = "visible";
    else
    document.getElementById("errorUser").style.visibility = "hidden";
  
    if(password.value!=123456789 )
    document.getElementById("errorPassword").style.visibility = "visible";
    else
    document.getElementById("errorPassword").style.visibility = "hidden";
    

}
