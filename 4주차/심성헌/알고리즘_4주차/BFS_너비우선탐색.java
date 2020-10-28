package 심성헌.알고리즘_4주차;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_너비우선탐색 {

	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void dfs(int[][] graph, int start, boolean[] visited) {
		queue.offer(start);
		visited[start] = true;

		while (queue.size() != 0) {
			int save = queue.poll();
			System.out.print(save + " ");
			for (int i = 0; i < graph[save].length; i++) {
				if (!visited[graph[save][i]]) {
					queue.offer(graph[save][i]);
					visited[graph[save][i]] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[][] graph = { {}, { 2, 3, 8 }, { 1, 7 }, { 1, 4, 5 }, { 3, 5 }, { 3, 4 }, { 7 }, { 2, 6, 8 }, { 1, 7 } };
		boolean[] visited = new boolean[graph.length + 1];
		for (int i = 1; i < visited.length; i++) {
			visited[i] = false;
		}
		dfs(graph, 1, visited);
	}

}
