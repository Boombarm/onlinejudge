import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static HashMap<String, Set<String>> emailProvider = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int uniqueUsers = 0;
        loop:
        for (int i = 0; i < n; i++) {
            String[] email = br.readLine().split("@");
            String username = email[0].replaceAll("\\.", "");
            String[] usernameArr = username.split("\\+");

            String provider = email[1];
            Set<String> userList = emailProvider.get(provider);
            if (userList == null) {
                userList = new TreeSet<>();
                uniqueUsers++;
                if (usernameArr.length > 0) {
                    userList.add(usernameArr[0]);
                } else {
                    userList.add(username);
                }
                emailProvider.put(provider, userList);
                continue;
            }

            if (userList.contains(username)) {
                continue;
            }

            for (String user : usernameArr) {
                if (userList.contains(user)) {
                    continue loop;
                }
            }
            if (usernameArr.length > 0) {
                userList.add(usernameArr[0]);
            } else {
                userList.add(username);
            }
            uniqueUsers++;
            emailProvider.put(provider, userList);
        }
        System.out.println(uniqueUsers);
    }
