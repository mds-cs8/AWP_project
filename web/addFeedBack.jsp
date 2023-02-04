<!--<!--//create webpage by JSP has a form to enter feedback->-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css" />
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300;400;700&display=swap"
              rel="stylesheet">
        <title>Add FeedBack</title>
    </head>
    <body>
        <%@ include file="navBar.jsp" %>

        <div class="form--container">
            <form action="addMsg" method="post" name="feedbackForm " onsubmit="return validateFeedBack();">
                <h1>Add FeedBack</h1>

                <div class="inputplace">
                    <div class="box--msg">
                        <span  class="error" id="name--msg"></span>
                    </div>
                    <div class="box--inp">
                        <label for="name">Name:</label>
                        <input type="text" name="name" id="name" placeholder="enter your name">
                    </div>

                </div>

                <div class="inputplace">
                    <div class="box--msg">
                        <span class="error"  id="email--msg"></span>
                    </div>
                    <div class="box--inp">
                        <label for="email">Email:</label>
                        <input type="email" name="email" id="email" placeholder="xxx@XXX.com">
                    </div>

                </div>

                <div class="inputplace">
                    <div class="box--msg">
                        <span class="error"  id="phone--msg"></span>
                    </div>
                    <div class="box--inp">
                        <label for="phone_number">Phone number:</label>
                        <input type="text" name="phone_number" id="phone_number" placeholder="05********">
                    </div>

                </div>

                <div class="inputplace">
                    <div class="box--msg">
                        <span class="error" id="req--msg"></span>
                    </div>
                    <div class="box--inp">
                        <label for="Request_Type">Request Type</label>
                        <input type="text" name="Request" id="Request" placeholder="eg:suggestion">
                    </div>

                </div>
                <div class="inputplace">
                    <div class="box--msg">
                        <span class="error" id="sub--msg"></span>
                    </div>
                    <div class="box--inp">
                        <label for="Subject">Subject:</label>
                        <input type="text" name="Subject" id="Subject" placeholder="enter the subject">
                    </div>

                </div>
                <div class="inputplace ">
                    <div class="box--msg">
                        <span class="error" id="feedback--msg"></span>
                    </div>
                    <div class="box--inp ">
                        <label for="Message">Message:</label>
                        <textarea class="feedback" name="Message" id="feedback"  rows="4" cols="50">Enter text here...</textarea>
                    </div>

                </div> 


                <button>Add</button>
            </form>
        </div>
        <%@ include file="footer.jsp" %>

        <script src="./script/app.js"></script>

    </body>
</html>
