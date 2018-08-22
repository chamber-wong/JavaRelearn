package wang.chamber.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 记录一个程序的使用次数，超过5次提示去注册
 * @author 弄风
 *
 */
public class HomeWork1 {
	public static void main(String[] args) {
		try {
			File file = new File("Serializable.txt");
			if (!file.exists()) {
				Game game = new Game();
				writeFile(file, game);
			}
			Game game = readFile(file);
			if (game.getNum() < 5) {
				game.setNum(game.getNum()+1);
			}else {
				System.out.println("您已经使用本软件5次,请注册!!");
			}
			game.play();
			writeFile(file, game);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writeFile(File file, Game game) throws FileNotFoundException, IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(game);
		objectOutputStream.close();
	}

	public static Game readFile(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		Game game;
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(file));
			Object object = objectInputStream.readObject();
			game = (Game) object;
		} finally {
			objectInputStream.close();
		}
		return game;
	}
}

class Game implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;

	public void play() {
		System.out.println("玩个鸡毛游戏!");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}