package 모바일리더_코딩테스트_03;

public class question_03 {
	public int solution(String[] bishops) {
		// 여기에 코드를 작성해주세요.

		// 0. 비숍 위치 인덱스 번호로 변환
		int[][] idxTmp = new int[bishops.length][2];
		// 1. 비숍 좌표 방문 설정
		int[][] xy = new int[8][8];

		// 2. 비숍의 현재 위치 방문 체크
		for (int i = 0; i < idxTmp.length; i++) {
			idxTmp[i][0] = bishops[i].charAt(0) - 'A';
			idxTmp[i][1] = bishops[i].charAt(1) - '1';
			xy[idxTmp[i][0]][idxTmp[i][1]] += 1;
		}
		// 4. 비숍 이동 가능 거리 방군 설정 및 개수 세기
		// 4-1. 현재 비숍 위치 위 아래 로 이동하면서 벽에 부딪히는지, 겹치는 비숍 혹은 다른 말은 없는지 확인
		for (int go = 0; go < bishops.length; go++) {
			int x = idxTmp[go][0], y = idxTmp[go][1];
			int i = 0;
			while (i < 8) {
				// x축을 기준으로
				int nx = i + idxTmp[go][0], ny = i + idxTmp[go][1];
				int mx = x - 1, my = y - 1;
				// y축을 기준으로
				int ix = nx, iy = ny - (i * 2);
				int jx = nx - (i * 2), jy = ny;

				// x축 기준 증가하는 영역
				if (nx < 8 && ny < 8 && nx > -1 && ny > -1) {
					xy[nx][ny] = 1;
				}
				// x축 기준 감소하는 영역
				if (mx < 8 && my < 8 && mx > -1 && my > -1) {
					xy[mx][my] = 1;
				}

				// y축 기준 증가하는 영역
				if (ix < 8 && iy < 8 && ix > -1 && iy > -1) {
					xy[ix][iy] = 1;
				}
				// y축 기준 감소하는 영역
				if (jx < 8 && jy < 8 && jx > -1 && jy > -1) {
					xy[jx][jy] = 1;
				}

				x = mx;
				y = my;
				i++;
			}
		}

		int answer = 0;
		for (int i = 0; i < xy.length; i++) {
			for (int k = xy.length - 1; k > -1; k--) {
				System.out.print(xy[i][k] + " ");
				if (xy[i][k] == 0) {
					answer++;
				}
			}
			System.out.println();
		}
		System.out.println("answer = " + answer);
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_03 sol = new question_03();
		String[] bishops1 = { new String("D5") };
		int ret1 = sol.solution(bishops1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
		System.out.println();
		String[] bishops2 = { new String("D5"), new String("E8"), new String("G2") };
		int ret2 = sol.solution(bishops2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
