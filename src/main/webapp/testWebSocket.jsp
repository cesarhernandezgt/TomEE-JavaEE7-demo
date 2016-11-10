<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello WebSocket with Apache TomEE</title>

    <script language="javascript" type="text/javascript">
        var wsUri = "ws://localhost:8080/javaee-tomee-demo-1.0.0/awebsocket";
        var websocket = new WebSocket(wsUri);
        websocket.onopen = function(evt) { onOpen(evt) };
        websocket.onmessage = function(evt) { onMessage(evt) };
        websocket.onerror = function(evt) { onError(evt) };

        function init() {
            output = document.getElementById("output");
        }

        function onOpen(evt) {
            writeToScreen('<span style="color: darkgreen;">CONNECTED</span> ');
        }

        function say_hello() {
            websocket.send(nameField.value);
            writeToScreen("SENT: " + nameField.value);
        }

        function onMessage(evt) {
            writeToScreen('<span style="color: darkblue;">RECEIVED:</span> ' + evt.data);
        }

        function close_connection(){
            writeToScreen("CONNECTION CLOSED. ");
            websocket.close();
        }

        function onError(evt) {
            writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
        }

        function writeToScreen(message) {
            var pre = document.createElement("p");
            pre.style.wordWrap = "break-word";
            pre.innerHTML = message;
            output.appendChild(pre);
        }

        window.addEventListener("load", init, false);
    </script>
</head>
<body>
<h1>Getting Started with WebSocket on Apache TomEE!!</h1>

<div style="text-align: left;">
    <form action="">
        Enter a name:
        <input id="nameField" name="name" value="" type="text">
        <input onclick="say_hello()" value="Say Hello" type="button">
        <br>
        <input onclick="close_connection()" value="Close Websocket Connection" type="button">
    </form>
</div>
<div id="output"></div>
</body>
</html>
