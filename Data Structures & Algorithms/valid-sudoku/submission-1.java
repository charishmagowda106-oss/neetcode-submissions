class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for (int r = 0; r < 9; r++) {

            for (int c = 0; c < 9; c++) {

                char value = board[r][c];

                if (value == '.') {
                    continue;
                }

                int box = (r / 3) * 3 + (c / 3);

                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());
                boxes.putIfAbsent(box, new HashSet<>());

                if (rows.get(r).contains(value) ||
                    cols.get(c).contains(value) ||
                    boxes.get(box).contains(value)) {

                    return false;
                }

                rows.get(r).add(value);
                cols.get(c).add(value);
                boxes.get(box).add(value);
            }
        }

        return true;
    }
}
    

