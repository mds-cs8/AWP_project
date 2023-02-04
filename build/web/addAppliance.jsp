<!--//create webpage by JSP has a form to enter new item data-->

<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/style.css" />
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300;400;700&display=swap"
            rel="stylesheet">
        <title>Add Appliance</title>
    </head>

    <body>
        <%@ include file="navBar.jsp" %>
            <div class="form--container">
                <form action="addItem" method="post" onsubmit="return validateAddItem();">
                    <h1>Add new Appliances</h1>

                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="type--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="type">Type:</label>
                            <input type="text" name="type" id="type" placeholder="enter the type of product">
                        </div>

                    </div>

                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="model--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="model">Model:</label>
                            <input type="text" name="model" id="model" placeholder="enter model name">
                        </div>

                    </div>

                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="year--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="year">Year:</label>
                            <input type="text" name="year" id="year" placeholder="enter the year of manufacture ">
                        </div>

                    </div>

                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="manufacturer--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="Manufacturer">Manufacturer:</label>
                            <input type="text" name="manufacturer" id="manufacturer"
                                placeholder="enter the name of the manufacturer">
                        </div>

                    </div>
                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="description--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="Description">Description:</label>
                            <input type="text" name="description" id="description" placeholder="describe the product">
                        </div>

                    </div>
                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="count--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="Count">Count:</label>
                            <input type="number" name="count" id="count" placeholder="enter the quantity">
                        </div>

                    </div>
                    <div class="inputplace">
                        <div class="box--msg">
                            <span class="error" id="price--msg"></span>
                        </div>
                        <div class="box--inp">
                            <label for="Price_per_Unit">Price per Unit:</label>
                            <input type="number" name="price" id="price" placeholder="enter the price">
                        </div>

                    </div>

                    <button>Add</button>
                </form>
            </div>
                    <%@ include file="footer.jsp" %>
            <script src="./script/app.js"></script>
    </body>

    </html>