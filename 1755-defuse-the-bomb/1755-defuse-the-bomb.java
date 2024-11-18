class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] decryptedCode = new int[n]; 
        if(k > 0)
            decryptedCode = findDecryptedCode(code,k);
        else if(k < 0)
        {
            for(int i = 0 ; i < code.length / 2 ; i++)
            {
                int temp = code[i];
                code[i] = code[n - i - 1];
                code[n - i - 1] = temp; 
            }
            k = -k;
            decryptedCode = findDecryptedCode(code,k);
            for(int i = 0 ; i < decryptedCode.length / 2 ; i++)
            {
                int temp = decryptedCode[i];
                decryptedCode[i] = decryptedCode[n - i - 1];
                decryptedCode[n - i - 1] = temp; 
            }
        }
        return decryptedCode;
    }
    int[] findDecryptedCode(int[] code , int k)
    {
        int n = code.length;
        int[] decryptedCode = new int[n];
        for(int i = 1 ; i <= k ; i++)
        {
            decryptedCode[0] += code[i];
        }
        for(int i = 1 ; i < n ; i++)
        {
            decryptedCode[i] = decryptedCode[i - 1] - code[i] + code[(i + k) % n];
        }
        return decryptedCode;
    }
}