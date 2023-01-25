package lk.ac.jfn.eng.ec4070;

/**
 * 
 * This programme is a city database implemented using Binary Search Tree (BST)
 * to store the names and the coordinates of cities.
 * 
 * @author 2018/E/073
 *
 */

public class CityDatabase {

	private static node root; // BST root node

	// defining BST
	public static class node {
		node left, right;
		String cityName;
		Double latitude, longitude;

		/**
		 * constructor
		 * 
		 * @param name : name of the city
		 * @param x    : latitude coordinate of the city
		 * @param y    : longitude coordinate of the city
		 */
		public node(String name, Double x, Double y) {
			left = null;
			right = null;
			cityName = name;
			latitude = x;
			longitude = y;
		}

	}

	/**
	 * Insertion of cities
	 * 
	 * @param root : root node of considering tree
	 * @param name : name of the insrting city
	 * @param x    : latitude coordinate of the insrting city
	 * @param y    : longitude coordinate of the insrting city
	 * @return node of the inserted city
	 */
	public static node Insrtion(node root, String name, Double x, Double y) {
		// tree empty
		if (root == null) {
			root = new node(name, x, y);
			System.out.println(name + " city inserted to database");
		} else {
			// inserting city name, higher than parent
			if (name.compareTo(root.cityName) > 0) {
				root.right = Insrtion(root.right, name, x, y);
			}
			// inserting city name, smaller than parent
			else if (name.compareTo(root.cityName) < 0) {
				root.left = Insrtion(root.left, name, x, y);
			}
		}
		return root;
	}

	/**
	 * Insert a city to BST
	 * 
	 * @param name : name of the insrting city
	 * @param x    : latitude coordinate of the insrting city
	 * @param y    : longitude coordinate of the insrting city
	 */
	public static void Insert(String name, double x, double y) {
		root = Insrtion(root, name, x, y);
	}

	/**
	 * finds the minimum of a considering tree
	 * 
	 * @param root : considering node root
	 * @return the minimum of considering tree
	 */
	String minimum(node root) {
		String min = root.cityName;
		while (root.left != null) {
			min = root.left.cityName;
			root = root.left;
		}
		return min;
	}

	/**
	 * Deletion of cities by name
	 * 
	 * @param root : root node of considering tree
	 * @param name : name of the deleting city
	 * @return : replacing node
	 */
	public node Deletion(node root, String name) {
		// tree empty
		if (root == null) {
			return null;

		} else {

			// deleting city name, higher than parent
			if (name.compareTo(root.cityName) > 0) {
				root.right = Deletion(root.right, name);
			}
			// deleting city name, smaller than parent
			else if (name.compareTo(root.cityName) < 0) {
				root.left = Deletion(root.left, name);
			}
			// found deleting city node(d)
			else {

				// d has one child
				if (root.left == null) {
					return root.right;
				}
				// d has one child
				else if (root.right == null) {
					return root.left;
				}

				// d has two children
				root.cityName = minimum(root.right); // get and replace inorder successor to deleting node
				root.right = Deletion(root.right, root.cityName);//delete inorder successot
			}
		}

		return root;

	}

	/**
	 * Delete a city name from BST
	 * 
	 * @param name : name of the deleting city
	 */
	public void delete(String name) {
		root = Deletion(root, name);
		System.out.println("\n" + name + " city deleted from database");

	}

	/**
	 * Search a city by name
	 * 
	 * @param root : root of considering tree
	 * @param name : name of the searching city
	 * @return : searched city node
	 */
	public node searchCity(node root, String name) {
		// tree empty
		if (root == null) {
			System.out.println("\n" + name + " city is not in database");
			return root;

		}
		// node found
		if (name.compareTo(root.cityName) == 0) {
			System.out.println("\n" + name + " city location is (" + root.latitude + " , " + root.longitude + ")");
		}
		// deleting city name higher than parent
		else if (name.compareTo(root.cityName) > 0) {
			return searchCity(root.right, name);
		}
		// deleting city name smaller than parent
		else {
			return searchCity(root.left, name); // Value greater than root's key
		}

		return root;
	}

	/**
	 * Search a city name from BST
	 * 
	 * @param name : name of the searching city
	 */
	public void search(String name) {
		searchCity(root, name);
	}

	/**
	 * Print city records assending order
	 * 
	 * @param root : considering node
	 */
	public void inorderAss(node root) {

		if (root != null) {

			inorderAss(root.left);
			System.out.println(root.cityName + " (" + root.latitude + "," + root.longitude + ")");
			inorderAss(root.right);
		} else
			return;

	}

	/**
	 * Print city records assending
	 */
	public void print() {
		System.out.println("\nCurrent database:");
		inorderAss(root);
	}

	/**
	 * Print city records descending order
	 * 
	 * @param root : considering node
	 */
	public void inorderDes(node root) {

		if (root != null) {

			inorderDes(root.right);
			System.out.println(root.cityName + " (" + root.latitude + "," + root.longitude + ")");
			inorderDes(root.left);
		} else
			return;

	}

	/**
	 * Print city records descending
	 */
	public void desPrint() {
		System.out.println("\nCurrent city records in descending order: ");
		inorderDes(root);
	}

	/**
	 * Print all cities within a given distance of a speciﬁed point
	 * 
	 * @param root : considering node
	 * @param r    : given distance
	 */
	public void withinDis(node root, double r) {

		if (root != null) {

			withinDis(root.left, r);
			// calculate the distance
			double dis = Math.sqrt(root.latitude * root.latitude + root.longitude * root.longitude); //distance from (0,0)
			if (dis <= r) {
				System.out.println(root.cityName + " (Distance: " + dis + ")");
			}
			withinDis(root.right, r);
		} else
			return;

	}

	/**
	 * cities within a given distance
	 * 
	 * @param r : given distance
	 */
	public void citiesWithin(double r) {
		System.out.println(r);
		withinDis(root, r);
	}

	/**
	 * Driver code
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		CityDatabase data = new CityDatabase();

		CityDatabase.Insert("Colombo", 6.927079, 79.861244);
		CityDatabase.Insert("Chicago", 41.881832, -87.623177);
		CityDatabase.Insert("Sydney", -33.865143, 151.209900);
		CityDatabase.Insert("Nuwara Eliya", 6.968610, 80.783943);
		CityDatabase.Insert("London", 51.507351, -0.127758);

		data.print();

		data.delete("Colombo");
		data.print();

		data.search("London");
		data.search("Chennai");

		data.desPrint();

		System.out.print("\nCities within a given distance :");
		data.citiesWithin(85);

	}

}
