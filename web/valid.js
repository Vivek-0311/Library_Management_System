var name1 = document.forms['form']['en'];
var pass = document.forms['form']['ep'];

var error1=document.getElementById('name-error');
var error2=document.getElementById('pass-error');

name1.addEventListener('textInput',name_varify);
pass.addEventListener('textInput',pass_varify);

function demo()
{
    if(name1.value.length == 0)
    {
        name1.style.border="2px solid red";
        error1.style.display="block";
        name1.focus();
        return false;
    }
    if(pass.value.length<6)
    {
        pass.style.border="2px solid red";
        error2.style.display="block";
        pass.focus();
        return false;
    }
} 
function name_varify()
{
    if(name1.value.length >=4)
    {
        name1.style.border="2px solid silver";
        error1.style.display="none";
        name1.focus();
        return true;
    } 
}
function pass_varify()
{
    if(pass.value.length>=6)
    {
        pass.style.border="2px solid silver";
        error2.style.display="none";
        pass.focus();
        return true;
    }
}  
