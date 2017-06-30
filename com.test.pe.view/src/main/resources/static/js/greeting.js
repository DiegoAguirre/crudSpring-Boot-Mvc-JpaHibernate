$("#btnGrabar").click(function(e) {
			e.preventDefault();
			$("#idEmployee").val($("#shop").val());
			$("#idShop").val($("#employee").val());
			$("#dateRegistry").val($("#dtRegistry").val());
			$.ajax({
				type : "POST",
				url : "/main/save",
				data : $("#frmRegister").serialize(),
				success : function(data, textStatus, jqXHR) {
					$('#frmRegister')[0].reset();
					$("#frmTest").html(jqXHR.responseText);
				}
			});

		});