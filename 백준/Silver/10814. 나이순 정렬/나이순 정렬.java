import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i] = new Person(Integer.parseInt(input[0]), input[1]);
        }

        Arrays.stream(arr).sorted(Comparator.comparingInt(Person::getAge))
                .forEach(p -> System.out.println(p.getAge() + " " + p.getName()));

        br.close();
    }

    public static class Person {
        int age;
        String name;

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
