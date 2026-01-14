package chapter14.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		Message lee = new Message("SendMail", "이호준");
		messageQueue.offer(lee); //enqueue
		messageQueue.offer(new Message("SendSNS", "김지영"));
		messageQueue.offer(new Message("SendKaKaoTalk", "김민주"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();//dequeue
			
			switch (message.command) {
			case "SendMail":
				System.out.println(message.to + "에게 메일 전송");
				break;
			case "SendSNS":
				System.out.println(message.to + "에게 SNS 전송");
				break;
			case "SendKaKaoTalk":
				System.out.println(message.to + "에게 카카오톡 전송");
				break;
			default:
				
			}
		}
		
	}
}
