var roll = document.forms['form']['eroll'];
var ename = document.forms['form']['ename'];

var eemail = document.forms['form']['email'];
var enu = document.forms['form']['num'];
var epass = document.forms['form']['pass'];

var rollerror=document.getElementById('roll-error');
var nameerror=document.getElementById('ename-error');

var emailerror=document.getElementById('email-error');
var numerror=document.getElementById('num-error');
var passerror=document.getElementById('epass-error');

roll.addEventListener('textInput',roll_varify);
ename.addEventListener('textInput',name_varify);
eemail.addEventListener('textInput',email_varify);
enu.addEventListener('textInput',num_varify);
epass.addEventListener('textInput',pass_varify);

function demo2()
{
    if(roll.value.length == 0)
    {
        roll.style.border="2px solid red";
        rollerror.style.opacity="1";
        roll.focus();
        return false;
    }
    if(ename.value.length == 0)
    {
        ename.style.border="2px solid red";
        nameerror.style.opacity="1";
        ename.focus();
        return false;
    }
   
    if(eemail.value.length == 0)
    {
      eemail.style.border="2px solid red";
      emailerror.style.opacity="1";
        eemail.focus();
        return false;
    }
    if(enu.value.length == 0)
    {
        enu.style.border="2px solid red";
        numerror.style.opacity="1";
        enu.focus();
        return false;
    }
    if(epass.value.length == 0)
    {
        epass.style.border="2px solid red";
        passerror.style.opacity="1";
        epass.focus();
        return false;
    }

} 
function roll_varify()
{
    if(roll.value.length > 0)
    {
        roll.style.border="2px solid silver";
        rollerror.style.opacity="0";
       
        return true;
    }
}  
function name_varify()
{
    if(ename.value.length > 0)
    {
        ename.style.border="2px solid silver";
        nameerror.style.opacity="0";
       
        return true;
    }
}  
function email_varify()
{
    if(eemail.value.length > 0)
    {
        eemail.style.border="2px solid silver";
        emailerror.style.opacity="0";
       
        return true;
    }
}  
function num_varify()
{
    if(enu.value.length > 0)
    {
        enu.style.border="2px solid silver";
        numerror.style.opacity="0";
       
        return true;
    }
}  
function pass_varify()
{
    if(epass.value.length > 0)
    {
        epass.style.border="2px solid silver";
        passerror.style.opacity="0";
       
        return true;
    }
}  
