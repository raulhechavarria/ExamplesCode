package kforce;

/*

Scenario Outline:  Replace the <password> with *

 Given "password" is set to "<password>"

 When method replaceWithAsterisk is run with item "password"

 Then item “password” is equal to "<passwordReplace>"

 Examples:

     | password | passwordReplace |

     |          |                 |

     | hello    | *****           |

     | To*day!  | *******         |

*/

import java.io.*;

class MyCode {

	public static String replaceWithAsterisk(String password) {
		String result = password.replaceAll(".", "*");
		return result;
	}

	public static void main(String[] args) {

		System.out.println(replaceWithAsterisk(""));

		System.out.println(replaceWithAsterisk("hello"));

		System.out.println(replaceWithAsterisk("To*day!"));

	}

}