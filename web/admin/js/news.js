/**
 * Created by lsc on 2017/1/13.
 */
function checkDel(msg) {
    if (window.confirm(msg)){
        event.returnValue = true;
    }else {
        event.returnValue = false;
    }
}

function checkSubmit() {
    if (document.getElementById("typename").value==""){
        alert("输入不能为空");
        document.getElementById("typename").focus();
        return false;
    }else {
        return true;
    }
}