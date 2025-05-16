class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> start = new HashSet<>();
        for (List<String> path : paths) {
            start.add(path.get(0));
        }

        for (List<String> path : paths) {
            String destination = path.get(1);
            if (start.add(destination))
                return destination;
        }
        return "";
    }
}