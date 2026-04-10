class Solution {
public:
    string interpret(string command) {
        int n = command.size();
        string ans ="";
        for(int i=0;i<n;)
        {
            if(command[i] == 'G')
            {
                ans += 'G';
                i++;
            }
            else if(command[i] == '(' && command[i+1]==')')
            {
                ans = ans+'o';
                i=i+2;
            }
            else
            {
                ans = ans+"al";
                i=i+4;
            }
        }
        return ans;
    }
};