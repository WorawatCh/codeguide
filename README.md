# codeguide
## Avoid Deep Nesting
Too many levels of nesting can make code harder to read and follow.
Instead of this
```
public void DoSomething(int value){
    if (someCondition){
           if(someOtherCondition){
                if(yetAnotherCondition){
                       //Finally execute some code
                }
           }
    }
} 
```
Try to do like this
```
public void DoSomething(int value){
    if(!(someCondition && someOtherCondition && yetAnotherCondition)){
        return;
        //Maybe throw exception if all preconditions must be true
    }
    //All preconditions are safe execute code
}
```
It look better right?.It is easy way to het your code better to look and find the error
Exercise : https://github.com/WorawatCh/codeguide/blob/master/src/Greatnumber.java <br />
Reference: https://code.tutsplus.com/tutorials/top-15-best-practices-for-writing-super-readable-code--net-8118

## Use meaningful variable names
Always use descriptive variable & method names:<br />
Good: gameBoard, player, piece, moveTo( Piece, x, y)<br />
Bad:   b,  play, pc, mv( Piece, x, y)
```
     public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Name :");
		String n = input.nextLine();
		System.out.print("Your Faculty :");
		String m = input.nextLine();
		System.out.print("Your Major :");
		String x = input.nextLine();
```
You can rewrite a variable name to suitable to the code like this
```
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Name :");
		String name = input.nextLine();
		System.out.print("Your Faculty :");
		String faculty = input.nextLine();
		System.out.print("Your Major :");
		String major = input.nextLine();
```
Exercise : https://github.com/WorawatCh/codeguide/blob/master/src/SphereVolumeCalculator.java<br />
Reference: https://bitbucket.org/skeoop/oop/src/47ffbac7eee8b3215370bde0b17f12e599aff768/week5/Coding-Guidelines.ppt?at=master&fileviewer=file-view-default
