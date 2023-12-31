package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			do {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					votes.put(name, vote + votes.get(name));
				} else {
					votes.put(name, vote);
				}
				line = br.readLine();

			} while (line != null);
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

		finally {
			sc.close();
		}

	}
}
