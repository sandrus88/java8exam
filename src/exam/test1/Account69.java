package exam.test1;

/**
Which of the following options can be inserted in PremiumAccount independent of each other?
1) static String getId(){   
   return "1111"; 
  };
2) String getId();
3) default String getId(){   
   return "1111"; 
  }; 
4) abstract static String getName(); 
5) static String getName(); 
6) default String getName();
 */

interface Account69 {
	public default String getId() {
		return "0000";
	}
}

interface PremiumAccount extends Account69 {
	// INSERT CODE HERE

}
