/**
 * 
 */

// Make file with Js extension
// chnage labelAdd2Cart to id label element
// change http://localhost:5050/cart.do to cart servlet url
// change data: prodName, quan,price




$(document).ready(function() {
$("#addtocart").click(
function(){
$.ajax({
url: 'http://localhost:8888/cart',
type: 'post',
data: {
	pname:$("#pname").val(),
	qty:$("#qty").val(),
	pp:$("#pp").val()
},
context: this,
success: function (data) {
console.log("success");
},
errorfunction (data) {
console.log("failure");
}
});
}
);

    });
