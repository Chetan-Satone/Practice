import java.util.PriorityQueue;

public class LCMGraph {


        public static int minimumCostToConnectGraph(int n) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            boolean[] visited = new boolean[n + 1];
            int totalCost = 0;

            // Add each vertex with its square as the initial cost
            for (int i = 1; i <= n; i++) {
                pq.add(i * i);
            }

            while (!pq.isEmpty()) {
                int cost = pq.poll();
                int vertex = (int) Math.sqrt(cost);  // Extract the vertex from the cost

                if (!visited[vertex]) {
                    visited[vertex] = true;
                    totalCost += cost;

                    for (int neighbor = 1; neighbor <= n; neighbor++) {
                        if (!visited[neighbor]) {
                            int lcm = lcm(vertex, neighbor);
                            pq.add(lcm);
                        }
                    }
                }
            }

            return visited[n] ? totalCost : -1;  // All vertices visited?
        }

        private static int

        lcm(int a, int b)

        {
            return a * b / gcd(a, b);
        }

        private static int gcd(int a, int b)

        {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            int n = 5;  // Example with 5 vertices
            int minCost = minimumCostToConnectGraph(n);
            System.out.println("Minimum cost to connect the LCM graph: " + minCost);
        }

}
