var todayDate =new Date();
console.log('Todays date',todayDate)

var array=['sun','mon','tue','wed','thu','fri','sat'];
var  day=todayDate.getDay();
console.log('Day',array[day]);

var monthArray=['jan','feb','mar','april','may','june','july','aug','sep','oct','nov','dec'];
var month=todayDate.getMonth();
console.log('month=', monthArray[month]);