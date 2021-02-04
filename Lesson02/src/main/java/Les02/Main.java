package Les02;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		UserDao userDao = new UserDao(ConnectionUtils.connection());
		
		
		
		List<User> UsersList = new ArrayList<>();
		
		userDao.readAll().forEach(System.out::println);
		System.out.println("...................................................................................................../n");
		
//		UsersList.add(new User("Yaroslav", "Mudryi", 33, "mudryi@gmail.com"));
//		UsersList.add(new User("Valentine", "Rudyk", 20, "rudyk@gmail.com"));
//		UsersList.add(new User("Bob", "Fat", 65, "b.fat@gmail.com"));
//		UsersList.add(new User("Andriy", "Gavryluk", 40, "gavryluk@gmail.com"));
//		UsersList.add(new User("Oleksiy", "Navalnyi", 25, "navalnyi@gmail.com"));
//		UsersList.add(new User("Anton", "Miistruk", 20, "miistruk@gmail.com"));
//		UsersList.add(new User("Ludmila", "Zabuzhko", 38, "zabuzhko@gmail.com"));
		
		UsersList .forEach(user ->{
			try {
				userDao.insert(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		User user = userDao.read(5);
		System.out.println(user);
		System.out.println("...................................................................................................../n");
		
		user.setUser_firstname(user.getUser_firstname() + "rov");
		userDao.update(user);
		
		userDao.readAll().forEach(System.out::println);
		System.out.println("...................................................................................................../n");

		userDao.delete(1);
		
		userDao.readAll().forEach(System.out::println);
		System.out.println("...................................................................................................../n");
		System.out.println("...................................................................................................../n");
		System.out.println("...................................................................................................../n");
		
		MagazineDao magazineDao = new MagazineDao(ConnectionUtils.connection());
		List<Magazine> magazineList = new ArrayList<Magazine>();
		
		magazineDao.readAll().forEach(System.out::println);
		
//		magazineList.add(new Magazine("Murzilka", 50, 50.30));
//		magazineList.add(new Magazine("ABBA", 60, 100.2));
//		magazineList.add(new Magazine("Forbs", 120, 500));
//		magazineList.add(new Magazine("Kolhoznica", 45, 30.50));
		
		magazineList.forEach(magazine -> {
			try {
				magazineDao.insert(magazine);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Magazine magazine = magazineDao.read(1);
		System.out.println(magazine);
		System.out.println("...................................................................................................../n");
		magazineDao.readAll().forEach(System.out::println);

	}
}
