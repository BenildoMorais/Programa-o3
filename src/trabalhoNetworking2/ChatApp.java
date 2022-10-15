package trabalhoNetworking2;

//import clientside.ChatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ChatApp extends JFrame implements Runnable, ActionListener {

    private JButton sendBtn;
    private JTextField msgField;
    private JTextArea msgArea;
    private JScrollPane pane;
    ChatClient client;

    public ChatApp() {

        initComponents();
    }

    private void initComponents(){
        this.setTitle("Chat Application");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new Thread(this).start();


        sendBtn = new JButton("Enviar");
        msgField = new JTextField(15);
        msgArea = new JTextArea(10, 22);
        msgArea.setEditable(false);
        pane = new JScrollPane(msgArea);


        msgField.addActionListener(this);
        sendBtn.addActionListener(this);

        this.add(pane);
        this.add(msgField);
        this.add(sendBtn);
    }

    private void startClient() {
        client = new ChatClient(this);

        try {
            client.start();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            System.exit(1);
        }
    }

    public void showMsg(String msg){
        this.msgArea.setText(msgArea.getText().concat("\n".concat(msg)));
    }
    @Override
    public void run() {
        startClient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sendBtn || e.getSource() == msgField){
            String msg = msgField.getText();
            client.sendMsg(msg);
            this.msgArea.setText(msgArea.getText().concat("\n".concat(msg)));
            msgField.setText("");
        }
    }

    public static void main(String[] args) {
        new ChatApp().setVisible(true);
    }



}
