package Test.socket;

import java.net.ServerSocket;

public class SocketTest {
	public static void main(String[] args){
		try{
			// 8080ポートを使ってサーバソケットを作成
			ServerSocket  sarver = new ServerSocket(8080);

			System.out.println("Flashからの接続を待っています…");

			// Flashからの接続待ち（接続があるまでここで止まる
			sarver.accept();

			System.out.println("接続されました。");
			sarver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}