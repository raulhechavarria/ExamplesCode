package codesignal.interviewpractice;

import java.util.HashMap;
import java.util.Map;

public class HashTables {

	public static void main(String[] args) {
		String[] strings = { "jjifcszs", "iha", "iha", "zmkxu", "jjifcszs", "jjifcszs", "zmkxu", "iha", "zmkxu", "iha",
				"lthj", "zmkxu", "pxozlvou", "rkrarq", "sgsqycvh", "dujwkmt", "iha", "iha", "y", "jniefoqxd",
				"spvpvscn", "lthj", "iha", "iha", "lthj", "msdifyw", "y", "dkpebg", "oryzwgegor", "wqeafivkur",
				"pgugbm", "rywrhxgbzk", "pgugbm", "pmvcypsyib", "jjifcszs", "iha", "vgiv", "zmkxu", "upfx",
				"wqeafivkur", "qqswfnytir", "y", "iha", "w", "vgiv", "dllokuax", "wqeafivkur", "cvsskyft", "sixl",
				"gzgat", "iha", "p", "teclm", "axtapru", "xdqltvk", "xrztea", "gzgat", "jjifcszs", "wbuapmju", "lthj",
				"zmkxu", "oryzwgegor", "iha", "bpvgmdwjg", "k", "oryzwgegor", "oghh", "l", "oryzwgegor", "vgiv", "vgiv",
				"qwmxo", "gldfao", "sixl", "een", "lkcsapegzs", "upeatmatwh", "l", "oryzwgegor", "axtapru",
				"upeatmatwh", "wtyigqsb", "iha", "swrjbq", "os", "xwgxene", "bz", "zmkxu", "lthj", "wvgshc", "aer", "p",
				"keu", "xg", "vgiv", "dllokuax", "vwsrosmia", "pmvcypsyib", "wpdsqrjkqq", "gajhcrsc" };
		String[] patterns = { "ibbtxd", "dwb", "dwb", "bo", "ibbtxd", "ibbtxd", "bo", "dwb", "bo", "dwb", "qyk", "bo",
				"xtm", "pdyhwmd", "gqhm", "kr", "dwb", "dwb", "lcef", "wduxfcgfus", "zryfec", "qyk", "dwb", "dwb",
				"qyk", "ftxkmi", "lcef", "lwrxeuy", "cwexkdzbis", "assmst", "dsyqkkcz", "zbbv", "dsyqkkcz", "kubcqmcdq",
				"ibbtxd", "dwb", "dy", "bo", "aglrr", "assmst", "twxfzhnax", "lcef", "dwb", "qhksl", "dy", "pfjd",
				"assmst", "nxb", "hs", "yuvlygyrw", "dwb", "fxntjnr", "djxhclccb", "s", "dfxhfmwkf", "eqjvc",
				"yuvlygyrw", "ibbtxd", "invugvqw", "qyk", "bo", "cwexkdzbis", "dwb", "hvr", "mrhagrsbl", "cwexkdzbis",
				"mvo", "jiww", "cwexkdzbis", "dy", "dy", "zeektf", "vsktnyj", "hs", "jwq", "sczbfqva", "kceobt", "jiww",
				"cwexkdzbis", "s", "kceobt", "wjgm", "dwb", "aeq", "sjngvbfse", "ifjcior", "wkgyesrn", "bo", "qyk", "y",
				"tmjpytyoz", "fxntjnr", "frdefa", "wlrujxbpwr", "dy", "pfjd", "jd", "kubcqmcdq", "gmni", "pf" };
		// System.out.print(areFollowingPatterns(strings, patterns));
		int[] nums = { 0, 1, 2, 3, 5, 2 };
		int k = 2;
		System.out.print(containsCloseNums(nums, k));

	}

	static Boolean areFollowingPatterns(String[] strings, String[] patterns) {

		Map<String, Integer> m1 = new HashMap<>();
		for (int i = 0; i < strings.length; ++i) {
			m1.put(strings[i], i);
		}

		Map<String, Integer> m2 = new HashMap<>();
		for (int i = 0; i < patterns.length; ++i) {
			m2.put(patterns[i], i);
		}

		for (int i = 0; i < strings.length; ++i) {
			if (m1.get(strings[i]) != m2.get(patterns[i])) {
				return false;
			}
		}
		return true;

	}

	static  boolean containsCloseNums(int[] nums, int k) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if ((j - i) <= k) {
						return true;
					}
				}
			}
		}

		return false;

	}
}
