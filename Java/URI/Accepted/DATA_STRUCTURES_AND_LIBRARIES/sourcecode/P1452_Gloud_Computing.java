package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1452 - Gloud Computing
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1452
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 8/28/18, 12:26:07 PM
 * @Runtime: 0.288s
 * @Solution: MAP
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


public class P1452_Gloud_Computing {

    /**
     * key = client reqeust
     */
    HashMap<String, Set<Application>> service;

    /**
     * key = client , application
     */
    HashMap<String, Connection> connection;


    static class Client {
        int clientId;

        public Client(int clientId) {
            this.clientId = clientId;
        }
    }

    static class Application {
        int applitionId;

        public Application(int applitionId) {
            this.applitionId = applitionId;
        }
    }

    static class Connection {
        Application application;
        Client client;

        public Connection(Client client, Application application) {
            this.application = application;
            this.client = client;
        }
    }

    public P1452_Gloud_Computing() throws IOException {
//        URL path = P1452_Gloud_Computing.class.getResource("input/P1452_input.txt");
//        File f = new File(path.getFile());
//        BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine().trim()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            Application[] applications = new Application[n];
            Client[] client = new Client[m];

            service = new HashMap<>();
            connection = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                applications[i - 1] = new Application(i);
                st = br.readLine().split(" ");
                int size = st.length;
                for (int j = 1; j < size; j++) {
                    Set<Application> set = service.get(st[j]);
                    if (set == null) {
                        set = new HashSet();
                        set.add(applications[i - 1]);
                        service.put(st[j], set);
                    } else {
                        set.add(applications[i - 1]);
                        service.put(st[j], set);
                    }
                }
            }

            int totalConnetion = 0;
            for (int i = 1; i <= m; i++) {
                Client c = new Client(i);
                st = br.readLine().split(" ");
                int[] connected = new int[n];
                int size = st.length;
                for (int j = 1; j < size; j++) {
                    Set<Application> apps = findServiceApplication(st[j]);
                    if (apps != null) {
                        for (Application a : apps) {
                            if (connected[a.applitionId - 1] != 1
                                    && isNoConnection(c.clientId, a.applitionId)
                                    ) {
                                Connection conn = new Connection(c, a);
                                connection.put(c.clientId + " " + a.applitionId, conn);
                                connected[a.applitionId - 1] = 1;
                                totalConnetion++;
                            }
                        }
                    }
                }

            }
            bw.append(totalConnetion + "\n");
        }
        bw.flush();
    }

    Set<Application> findServiceApplication(String request) {
        return service.get(request);
    }

    boolean isNoConnection(int clientId, int applictionId) {
        return connection.get(clientId + " " + applictionId) == null ? true : false;
    }


}
