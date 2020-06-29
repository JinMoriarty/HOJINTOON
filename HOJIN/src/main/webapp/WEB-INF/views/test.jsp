<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<form id="testForm" enctype="multipart/form-data">
	<input type="text" id="name"/>
	<input type="file" id="file"/>
	<button id="button">submit</button>
</form>
<script>
	$(document).ready(function(){
		$("#button").click(function(event){
			event.preventDefault();
			var form = $("#testForm");
			var formData = new FormData(form);
			formData.append("file", $("#file")[0].files[0]);
			$.ajax({
				url: 'test',
				processData: false,
				contentType: false,
				data: formData,
				type: 'POST',
				success: function(data){
					console.log(data);
				}
			});
		});
	});
</script>
</body>
</html>