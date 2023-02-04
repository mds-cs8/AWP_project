function validateFeedBack() {
  //validate feedback form
  var decision = true;
  // here we check name must consist 3-50 letters only
  if (
    document.getElementById("name").value.search(/^[A-Za-z'\-\._ ]{3,50}$/) != 0
  ) {
    document.getElementById("name--msg").innerHTML =
      "The name must consist of at least 3 characters to 50 and do not contain symbols or numbers";
    document.getElementById("name--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("name--msg").innerHTML = "";
    document.getElementById("name--msg").style.display = "none";
  }

  // here we check email less than 50
  if (
    document
      .getElementById("email")
      .value.search(
        /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
      ) != 0 ||
    document.getElementById("email").value.length > 50
  ) {
    decision = false;
    document.getElementById("email--msg").innerHTML =
      "ERROR: Provide a correct email address ! most be Less than 50 characters ";
    document.getElementById("email--msg").style.display = "inline";
  } else {
    document.getElementById("email--msg").innerHTML = "";
    document.getElementById("email--msg").style.display = "none";
  }

  // check number eg 05**********
  //0534889865  or   966534889865
  if (
    document
      .getElementById("phone_number")
      .value.search(/^(05\d{8}|9665\d{8})$/) != 0
  ) {
    decision = false;
    document.getElementById("phone--msg").innerHTML =
      "ERROR: Phone number is wrong ! eg:0534889865 or 966534889865";
    document.getElementById("phone--msg").style.display = "inline";
  } else {
    document.getElementById("phone--msg").innerHTML = "";
    document.getElementById("phone--msg").style.display = "none";
  }

  // here we check request must consist 3-50 letters only
  if (
    document
      .getElementById("Request")
      .value.search(/^[A-Za-z'\-\._ ]{3,50}$/) != 0
  ) {
    decision = false;
    document.getElementById("req--msg").innerHTML =
      "The request type must consist of at least 3 characters to 50 and do not contain symbols or numbers";
    document.getElementById("req--msg").style.display = "inline";
  } else {
    document.getElementById("req--msg").innerHTML = "";
    document.getElementById("req--msg").style.display = "none";
  }

  // here we check Subject must consist 3-50 letters only
  if (
    document
      .getElementById("Subject")
      .value.search(/^[A-Za-z'\-\._ ]{3,50}$/) != 0
  ) {
    decision = false;
    document.getElementById("sub--msg").innerHTML =
      "The subject must consist of at least 3 characters to 50 and do not contain symbols or numbers";
    document.getElementById("sub--msg").style.display = "inline";
  } else {
    document.getElementById("sub--msg").innerHTML = "";
    document.getElementById("sub--msg").style.display = "none";
  }

  // here we check feedback must consist 10-255
  if (
    document.getElementById("feedback").value.length < 10 ||
    document.getElementById("feedback").value.length > 255
  ) {
    decision = false;
    document.getElementById("feedback--msg").innerHTML =
      "The message must consist of at least 10 characters to 255 ";
    document.getElementById("feedback--msg").style.display = "inline";
  } else {
    document.getElementById("feedback--msg").innerHTML = "";
    document.getElementById("feedback--msg").style.display = "none";
  }

  if (decision == false) {
    return false; // don't submit the form data to the server because of validation error(s)
  } else {
    return true; // submit the form data to the server because all data looks correct
  }
}

function validateAddItem() {
  // validate Add form

  var decision = true;

  // here we check type must consist 2-50 letters only
  if (
    document.getElementById("type").value.search(/^[A-Za-z'\-\._ ]{2,50}$/) != 0
  ) {
    document.getElementById("type--msg").innerHTML =
      "The type must consist of at least 2 characters to 50 and do not contain symbols or numbers";
    document.getElementById("type--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("type--msg").innerHTML = "";

    document.getElementById("type--msg").style.display = "none";
  }

  // here we check model must consist 2-50
  if (
    document
      .getElementById("model")
      .value.search(/^[A-Za-z0-9'\-\._ ]{2,50}$/) != 0
  ) {
    document.getElementById("model--msg").innerHTML =
      "The model must consist of at least 2 characters to 50";
    document.getElementById("model--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("model--msg").innerHTML = "";

    document.getElementById("model--msg").style.display = "none";
  }

  // here we check year The year must be 2-4 digit
  if (document.getElementById("year").value.search(/^[0-9]{2,4}$/) != 0) {
    document.getElementById("year--msg").innerHTML =
      "The year must be 2-4 digit";
    document.getElementById("year--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("year--msg").innerHTML = "";

    document.getElementById("year--msg").style.display = "none";
  }

  // here we check manufacturer must consist 2-50

  if (
    document
      .getElementById("manufacturer")
      .value.search(/^[A-Za-z0-9'\-\._ ]{2,50}$/) != 0
  ) {
    document.getElementById("manufacturer--msg").innerHTML =
      "The manufacturer must consist of at least 2 characters to 50 ";
    document.getElementById("manufacturer--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("manufacturer--msg").innerHTML = "";

    document.getElementById("manufacturer--msg").style.display = "none";
  }

  if (
    document
      .getElementById("description")
      .value.search(/^[A-Za-z0-9'\-\._ ]{3,255}$/) != 0
  ) {
    document.getElementById("description--msg").innerHTML =
      "The description must consist of at least 3 characters to 255 ";
    document.getElementById("description--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("description--msg").innerHTML = "";

    document.getElementById("description--msg").style.display = "none";
  }

  // here we check count must be digit
  if (document.getElementById("count").value.search(/^[0-9]{1,}$/) != 0) {
    document.getElementById("count--msg").innerHTML = "The count must be digit";
    document.getElementById("count--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("count--msg").innerHTML = "";

    document.getElementById("count--msg").style.display = "none";
  }

  // here we check price must be digit
  if (document.getElementById("price").value.search(/^[0-9]{1,}$/) != 0) {
    document.getElementById("price--msg").innerHTML = "The price must be digit";
    document.getElementById("price--msg").style.display = "inline";
    decision = false;
  } else {
    document.getElementById("price--msg").innerHTML = "";

    document.getElementById("price--msg").style.display = "none";
  }

  if (decision == false) {
    return false; // don't submit the form data to the server because of validation error(s)
  } else {
    return true; // submit the form data to the server because all data looks correct
  }
}
