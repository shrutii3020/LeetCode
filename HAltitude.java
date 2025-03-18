class HAltitude {
    public int largestAltitude(int[] gain) {
      int ans = 0;
      int curr = 0;
      for(int i = 0; i<gain.length; i++) {
        curr += gain[i];
        ans = Math.max(ans, curr);
      }
      return ans;
    }
  
        public static void main(String[] args) {
      HAltitude solution = new HAltitude();
      int[] gain1 = {-5, 1, 5, 0, -7};
      int[] gain2 = {4, -2, 3, -1};
  
      System.out.println("Largest Altitude (Test 1): " + solution.largestAltitude(gain1)); 
      System.out.println("Largest Altitude (Test 2): " + solution.largestAltitude(gain2)); 
    }
  }