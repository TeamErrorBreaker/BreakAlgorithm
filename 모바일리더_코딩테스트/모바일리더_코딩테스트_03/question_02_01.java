package 모바일리더_코딩테스트_03;

import java.util.*;

public class question_02_01 {

	public int solution(String s, int idx) {
		List<String> save = new ArrayList<String>();

		// 0. 문자열을 char 단위로 쪼개어 배열로 만든다.
		char[] tmp = new char[s.length()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = s.charAt(i);
		}

		// 1. 현 위치의 문자열이 다른 인덱스에 존재하는지 확인한다.
		for (int i = 0; i < tmp.length - 1; i++) {
			int k;
			boolean check = false;
			for (k = i + 1; k < tmp.length; k++) {
				if (tmp[i] == tmp[k]) {
					System.out.println("i = " + i + " / k = " + k + " / (i + k + 1) % 2 = " + (i + k + 1) % 2);
					int kk = k - 1;
					if ((i + k + 1) % 2 != 0) {
						// 홀수일 때
						if (k - i == 2) {
							check = true;
						} else {
							check = false;
						}
						for (int o = i + 1; o <= k / 2; o++, kk--) {
							System.out.println(
									"o = " + o + " / kk = " + kk + " / tmp[o] = " + tmp[o] + " / tmp[kk] = " + tmp[kk]);
							if (tmp[o] == tmp[kk]) {
								check = true;
							} else {
								check = false;
								break;
							}
						}
					} else {
						// 짝수일 때
						if (tmp[i + 1] == tmp[k - 1]) {
							check = true;
						} else {
							check = false;
						}
						for (int o = i + 1; o < k / 2 + 1; o++, kk--) {
							System.out.println(
									"o = " + o + " / kk = " + kk + " / tmp[o] = " + tmp[o] + " / tmp[kk] = " + tmp[kk]);
							if (tmp[o] == tmp[kk]) {
								check = true;
							} else {
								check = false;
								break;
							}
						}
					}
					if (check) {
						save.add(s.substring(i, k + 1));
						System.out.println();
					}
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < save.size() - 1; i++) {
			System.out.println("save[" + i + "] = " + save.get(i));
			answer = Math.max(save.get(i).length(), save.get(i + 1).length());
		}
		return answer;
	}

	public int solution(String s) {

		char[] chr = s.toCharArray();

		for (int leng = s.length(); leng > 1; leng--) {
			for (int start = 0; start + leng <= s.length(); start++) {
				boolean check = true;
				for (int i = 0; i < leng / 2; i++) {
					if (chr[start + i] != chr[start + leng - i - 1]) {
						check = false;
						break;
					}
				}
				if (check)
					return leng;
			}
		}

		// 매개변수 문자열에 펠렌드롬이 없을 경우, 각 문자 한 개가 펠렌드롬이니 최대 길이는 1이다.
		return 1;
	}

	public static void main(String[] args) {
		question_02_01 sol = new question_02_01();
		String s = "abbcbdd";
		int k = 4;
		int result = sol.solution(s, k);

		System.out.println(result);
		System.out.println(sol.solution(s));
	}
}
