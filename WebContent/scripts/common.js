function mandatoryCheck(id) {
	var obj = document.getElementById(id);
	if (obj != null) {
		if (obj.value == '' || obj.value == null) {
			return false;
		}
		return true;
	}
}

function validateAuthorReg() {
	var inputs = document.getElementsByTagName("input");
	for (var i = 0; i < inputs.length; i++) {
		if (inputs[i].type == 'text') {
			if (!mandatoryCheck(inputs[i].id)) {
				alert('Please provide '
						+ inputs[i].id.substring(
								inputs[i].id.lastIndexOf(":") + 1,
								inputs[i].id.length).replace('_', ' '));
				return false;
			}
		}

	}
	var selects = document.getElementsByTagName("select");
	for (var i = 0; i < inputs.length; i++) {
		if (!mandatoryCheck(selects[i].id)) {
			alert('Please select '
					+ selects[i].id.substring(
							selects[i].id.lastIndexOf(":") + 1,
							selects[i].id.length).replace('_', ' '));
			return false;
		}
	}
}