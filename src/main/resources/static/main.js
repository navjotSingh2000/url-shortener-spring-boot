$(document).ready(function() {
    var url="https://ns-sb.herokuapp.com";
  //  var url="http://localhost:8080";
  $("#send").click(function() {
       if($("#url_input").val().length > 0) {
             $.ajax({
                	type : 'POST',
                	url : url + '/shorten',
                	data : JSON.stringify({
                		"full_url" : $("#url_input").val()
                	}),
                	contentType : "application/json; charset=utf-8",
                	success : function(data) {
                		$("#shorten_url").val(data.shorten_url);
                		allowCopy();
                	}
                });
             }
       });
});

function allowCopy()
{
    var copy_fa = document.getElementById("copy_fafa");
    var val_short_url = document.getElementById("shorten_url").value;

    copy_fa.onclick = function() {
      document.execCommand("copy");
    }

    copy_fa.addEventListener("copy", function(event) {
      event.preventDefault();
      if (event.clipboardData) {
        event.clipboardData.setData("text/plain", val_short_url);
      }
    });
}