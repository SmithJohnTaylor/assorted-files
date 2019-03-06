var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear()+1;

if(dd<10) {
    dd = '0'+dd
}
if(mm<10) {
    mm = '0'+mm
}

today = dd + '/' + mm + '/' + yyyy;
var todayString = today.toString();
var props = new Array(1);
props["review:expirationDate"] = todayString;
document.addAspect("review:expirationDate", props);
