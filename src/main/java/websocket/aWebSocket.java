package websocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/awebsocket")
public class aWebSocket {
    private int counter;

    @OnMessage
    public String onMessage(String message) {
        counter++;
        return "("+counter+") Hello "+message+"";
    }

    @OnOpen
    public void onConnect(Session session) {
        counter = 0;
    }

    @OnClose
    public void myOnClose (CloseReason reason) {
        if (reason.getCloseCode() == CloseReason.CloseCodes.NORMAL_CLOSURE) {
            System.out.println("Web Socket normal closure.");
        } else {
            System.out.println("Web Socket other closure.");
        }
    }
}
