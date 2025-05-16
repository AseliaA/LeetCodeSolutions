package AlgorithmsAndDataStructure.week_21;

public class DesignBrowserHistory_1472_Medium {
    public class BrowserHistory{
        public class Node {
            String url;
            Node prev;
            Node next;

            public Node(String url) {
                this.url = url;
                this.prev = prev;
                this.next = next;
            }
        }

        private Node current;

        public BrowserHistory(String homepage) {
            current = new Node(homepage);
        }

        public void visit(String url) {
            Node newUrl = new Node(url);
            current.next = newUrl;
            newUrl.prev = current;
            current = newUrl;
        }

        public String back(int steps) {
            for (int i = steps; current.prev != null && i > 0; i--) {
                current = current.prev;
            }
            return current.url;
        }

        public String forward(int steps) {
            for (int i = steps; current.next != null && i > 0; i--) {
                current = current.next;
            }
            return current.url;
        }
    }
}