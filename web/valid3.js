var roll = document.forms['form']['enroll'];
var namee = document.forms['form']['ename'];
var pass = document.forms['form']['epass'];


var error=document.getElementById('roll-error');
var error1=document.getElementById('name-error');
var error2=document.getElementById('pass-error');


roll.addEventListener('textInput',roll_varify);
namee.addEventListener('textInput',name_varify);
pass.addEventListener('textInput',pass_varify);


function demo3()
{
    if(roll.value.length == 0)
    {
        roll.style.border="2px solid red";
        error.style.opacity="1";
        roll.focus();
        return false;
    }
    if(namee.value.length == 0)
    {
        namee.style.border="2px solid red";
        error1.style.opacity="1";
        namee.focus();
        return false;
    }
    if(pass.value.length<6)
    {
        pass.style.border="2px solid red";
        error2.style.opacity="1";
        pass.focus();
        return false;
    }
} 
function roll_varify()
{
    if(roll.value.length > 0)
    {
        roll.style.border="2px solid silver";
        error.style.opacity="0";
       
        return true;
    }
}  
function name_varify()
{
    if(namee.value.length >=4)
    {
        namee.style.border="2px solid silver";
        error1.style.opacity="0";
      
        return true;
    } 
}
function pass_varify()
{
    if(pass.value.length>=6)
    {
        pass.style.border="2px solid silver";
        error2.style.opacity="0";
     
        return true;
    }
}  



