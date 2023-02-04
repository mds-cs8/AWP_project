
<!--we create this jsp to reduce duplicated code and reuse code-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>navBar</title>
    </head>
    <body>
        <nav>
            <div class="container nav">
                <img class="logo" src="./image/logo1.png" alt="logo" />
                <ul class="nav--list">
                 <li><a href="./index.html">Home</a></li>
                <li><a href="addAppliance">Add Appliance</a></li>
                <li><a href="showRecord">Show All Appliances</a></li>
                <li><a href="addFeedBack">Add Feedback</a></li>

                </ul>
            </div>

        </nav>
    </body>
</html>
