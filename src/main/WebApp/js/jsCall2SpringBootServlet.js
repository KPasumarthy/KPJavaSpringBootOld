/**
 *	KP : jsCall2SpringBootServlet.js file  
 */

//index.html 
$(document).ready(function() {
	//get2SpringBootServlet();
	//post2SpringBootServlet();
});


function get2SpringBootServlet() {

	alert("KP : 'jsCall2SpringBootServlet.js' : get2SpringBootServlet() : " );

	$.get('Servlet2CallKPWebAPIs', function(data, status, something) {
		//alert(status);
		alert("Status : " + status + "\nData : " + data); //KP : Display data from KPWebAPIs 		
		displayKPWebAPIsData(data);
	});
}


function post2SpringBootServlet() {
	//alert("KP : 'jsCall2ServletKPWebAPIs.js' : callServlet4KPWebAPIs() ");
	alert("KP : 'jsCall2ServletKPWebAPIs.js' : callServlet4KPWebAPIs() : " );

	$.post('Servlet2CallKPWebAPIs', {

	}, function(data, status) {
		//alert(status);
		alert("Status : " + status + "\nData : " + data); //KP : Display data from KPWebAPIs 		
		displayKPWebAPIsData(data);
	});
}


function callServlet2PostKPWebAPIs() {
	//alert("KP : 'jsCall2ServletKPWebAPIs.js' : callServlet2PostKPWebAPIs() ");
	alert("KP : 'jsCall2ServletKPWebAPIs.js' : callServlet2PostKPWebAPIs() : " );

	$.post('Servlet2CallKPWebAPIs', {

	}, function(data, status) {
		//alert(status);
		alert("Status : " + status + "\nData : " + data); //KP : Display data from KPWebAPIs 		
		displayKPWebAPIsData(data);
	});
}


/**
 * @param data
 * @returns
 */
function displayKPWebAPIsData(data) {

	alert(data); //KP : Display Item Locator Data
	
	var outputString = "";
	outputString = outputString
			+ "<div class='container' style='margin-top:10px;'>"
	outputString = outputString + "<div class='row'>" + data + "</div></div>";
	
	$('#contentFirst').html(outputString);

	if ($('#contentFirst').hasClass("showClass")) {
		$('#contentFirst').html(outputString);
		$('#contentFirst').removeClass("showClass");
		$('#contentSecond').addClass("showClass");
	} else if ($('#contentSecond').hasClass("showClass")) {
		$('#contentSecond').html(outputString);
		$('#contentFirst').addClass("showClass");
		$('#contentSecond').removeClass("showClass");
	} else {
		$('#contentSecond').html(outputString);
		$('#contentFirst').addClass("showClass");
	}

	$(".et-wrapper").css({
		"height" : "150vh"
	});
	$(".et-wrapper").trigger("click");

}
