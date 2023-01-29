class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        // Iterate over all
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }

        // Return
        return sb.toString();
    }
}