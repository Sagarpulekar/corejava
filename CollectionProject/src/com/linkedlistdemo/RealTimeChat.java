package com.linkedlistdemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class RealTimeChat {

	private static class Message {
		String sender;
		String content;
		Date timestamp;

		Message(String sender, String content) {
			this.sender = sender;
			this.content = content;
			this.timestamp = new Date();
		}

		public String toString() {
			return "" + timestamp.toString() + " " + sender + ": " + content;
		}
	}

	private static class ChatHistory {
		LinkedList<Message> messages = new LinkedList<>();

		void addMessage(Message message) {
			messages.add(message);
			if (messages.size() > 10) {
				messages.removeFirst();
			}
		}

		List<Message> getMessages() {
			return new ArrayList<>(messages);
		}
	}

	private static class ChatClient {
		String name;
		ChatHistory history = new ChatHistory();

		ChatClient(String name) {
			this.name = name;
		}

		void sendMessage(String content, ChatServer server) {
			server.broadcastMessage(new Message(name, content));
		}

		void receiveMessage(Message message) {
			history.addMessage(message);
			System.out.println(message.toString());
		}

		List<Message> getChatHistory() {
			return history.getMessages();
		}
	}

	private static class ChatServer {
		LinkedList<ChatClient> clients = new LinkedList<>();

		void registerClient(ChatClient client) {
			clients.add(client);
		}

		void unregisterClient(ChatClient client) {
			clients.remove(client);
		}

		void broadcastMessage(Message message) {
			for (ChatClient client : clients) {
				client.receiveMessage(message);
			}
		}
	}

	public static void main(String[] args) {
		ChatServer server = new ChatServer();

		ChatClient alice = new ChatClient("Alice");
		server.registerClient(alice);

		ChatClient bob = new ChatClient("Bob");
		server.registerClient(bob);

		ChatClient charlie = new ChatClient("Charlie");
		server.registerClient(charlie);

		alice.sendMessage("Hello, world!", server);
		bob.sendMessage("Hi, Alice!", server);
		charlie.sendMessage("Hey guys, what's up?", server);

		List<Message> aliceHistory = alice.getChatHistory();
		System.out.println("Alice's chat history:");
		for (Message message : aliceHistory) {
			System.out.println(message.toString());
		}

		List<Message> bobHistory = bob.getChatHistory();
		System.out.println("Bob's chat history:");
		for (Message message : bobHistory) {
			System.out.println(message.toString());
		}

		List<Message> charlieHistory = charlie.getChatHistory();
		System.out.println("Charlie's chat history:");
		for (Message message : charlieHistory) {
			System.out.println(message.toString());
		}
	}
}
