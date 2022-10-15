package trabalhoNetworking2;

//import serverside.ChatServer;
//import util.ClientSocket;
//import view.ChatApp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    private final String HOST = "127.0.0.1";
    private ClientSocket clientSocket;
    private Scanner sc;
    private ChatApp chatApp;

    {
        sc = new Scanner(System.in);
    }

    public ChatClient(){

    }

    public ChatClient(ChatApp chatApp) {
        this.chatApp = chatApp;
    }


    public void start() throws IOException {
        clientSocket = new ClientSocket(new Socket(HOST, ChatServer.PORT));
        new Thread(() -> {
            String msg;
            while ((msg = clientSocket.getMessage()) != null){
                chatApp.showMsg(msg);
            }
        }).start();
       // msgLoop();
    }

    public void sendMsg(String msg){
        clientSocket.sendMeg(msg);
    }

    public void msgLoop(){
        String msg;
        do {
            msg = sc.nextLine();
            clientSocket.sendMeg(msg);
        } while (!(msg.equalsIgnoreCase("Sair")));
    }



    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        try {
            client.start();
        } catch (IOException e){
            System.out.println("Erro!");
        }
    }
}
